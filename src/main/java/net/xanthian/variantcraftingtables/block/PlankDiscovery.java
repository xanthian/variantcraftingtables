package net.xanthian.variantcraftingtables.block;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.Identifier;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/** Reads shipped tag declarations before world tags exist; never depends on a client's resource packs. */
public final class PlankDiscovery {
    private final List<Path> roots;

    public PlankDiscovery(List<Path> roots) {
        this.roots = List.copyOf(roots);
    }

    public static boolean hasPlankName(Identifier id) {
        String path = id.getPath();
        return path.endsWith("_planks") || path.equals("planks") || path.endsWith("/planks");
    }

    public Set<Identifier> entries(String registry, Identifier tag) {
        Set<Identifier> entries = new HashSet<>();
        collect(registry, tag, new HashSet<>(), entries);
        return Set.copyOf(entries);
    }

    private void collect(String registry, Identifier tag, Set<Identifier> visited, Set<Identifier> result) {
        if (!visited.add(tag)) {
            return;
        }
        for (Path root : roots) {
            Path path = root.resolve("data/" + tag.getNamespace() + "/tags/" + registry + "/" + tag.getPath() + ".json");
            if (!Files.isRegularFile(path)) {
                continue;
            }
            try (Reader reader = Files.newBufferedReader(path)) {
                var json = JsonParser.parseReader(reader).getAsJsonObject();
                for (JsonElement value : json.getAsJsonArray("values")) {
                    String name = value.isJsonObject() ? value.getAsJsonObject().get("id").getAsString() : value.getAsString();
                    if (name.startsWith("#")) {
                        collect(registry, Identifier.parse(name.substring(1)), visited, result);
                    } else {
                        result.add(Identifier.parse(name));
                    }
                }
            } catch (IOException | RuntimeException exception) {
                LogUtils.getLogger().warn("Could not read plank discovery tag {}", path, exception);
            }
        }
    }
}
