package net.xanthian.variantcraftingtables.client;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import net.minecraft.client.renderer.texture.SpriteContents;
import net.minecraft.client.renderer.texture.atlas.SpriteResourceLoader;
import net.minecraft.client.renderer.texture.atlas.SpriteSource;
import net.minecraft.client.resources.metadata.animation.AnimationMetadataSection;
import net.minecraft.client.resources.metadata.animation.FrameSize;
import net.minecraft.resources.Identifier;
import net.minecraft.server.packs.resources.Resource;
import net.minecraft.server.packs.resources.ResourceManager;
import net.xanthian.variantcraftingtables.Initialise;
import net.xanthian.variantcraftingtables.block.DynamicTables;
import org.slf4j.Logger;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/** Runs as part of atlas stitching, so generation and lifetime follow resource reloads. */
public final class CraftingTableSpriteSource implements SpriteSource {
    public static final MapCodec<CraftingTableSpriteSource> CODEC = MapCodec.unit(CraftingTableSpriteSource::new);
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final List<String> FACES = List.of("front", "side", "top", "bottom");

    @Override
    public MapCodec<? extends SpriteSource> codec() {
        return CODEC;
    }

    @Override
    public void run(ResourceManager resources, Output output) {
        for (var variant : DynamicTables.variants()) {
            Identifier table = variant.id();
            for (String face : FACES) {
                Identifier sprite = Identifier.fromNamespaceAndPath(Initialise.MOD_ID,
                        "block/" + table.getPath() + "_" + face);
                // A pack may still supply a hand-drawn texture at the original location.
                var override = resources.getResource(TEXTURE_ID_CONVERTER.idToFile(sprite));
                if (override.isPresent()) {
                    output.add(sprite, override.get());
                } else {
                    output.add(sprite, loader -> generate(resources, loader, sprite, variant.planks(), face));
                }
            }
        }
    }

    private static SpriteContents generate(ResourceManager resources, SpriteResourceLoader loader,
                                           Identifier sprite, Identifier planksId, String face) {
        Identifier templateId = Identifier.withDefaultNamespace("textures/block/"
                + (face.equals("bottom") ? "oak_planks" : "crafting_table_" + face) + ".png");
        try {
            Resource plankResource = PlankTextureResolver.resolve(resources, planksId);
            if (face.equals("bottom")) {
                SpriteContents bottom = loader.loadSprite(sprite, plankResource);
                if (bottom != null) {
                    return bottom;
                }
                throw new IOException("Could not load plank texture for " + planksId);
            }
            // Use the built-in templates and oak palette together: pack authors can change plank
            // palettes freely without accidentally changing which decoration pixels count as wood.
            BufferedImage template = read(builtIn(resources, templateId));
            BufferedImage oak = read(builtIn(resources,
                    Identifier.withDefaultNamespace("textures/block/oak_planks.png")));
            BufferedImage planks = read(plankResource);
            var animation = plankResource.metadata().getSection(AnimationMetadataSection.TYPE);
            FrameSize frame = animation.map(value -> value.calculateFrameSize(planks.getWidth(), planks.getHeight()))
                    .orElseGet(() -> new FrameSize(planks.getWidth(), planks.getHeight()));
            BufferedImage image = CraftingTableTexture.compose(template, oak, planks, frame.width(), frame.height());
            ByteArrayOutputStream bytes = new ByteArrayOutputStream();
            if (!ImageIO.write(image, "PNG", bytes)) {
                throw new IOException("PNG encoder unavailable");
            }
            byte[] png = bytes.toByteArray();
            Resource generated = new Resource(plankResource.source(), () -> new ByteArrayInputStream(png),
                    plankResource::metadata);
            // Let Minecraft validate and load animation and texture metadata normally.
            SpriteContents result = loader.loadSprite(sprite, generated);
            if (result != null) {
                return result;
            }
            LOGGER.warn("Could not load generated texture {}; using the vanilla crafting table", sprite);
        } catch (IOException | RuntimeException exception) {
            LOGGER.warn("Could not generate texture {}; using the vanilla crafting table", sprite, exception);
        }
        return resources.getResource(templateId).map(resource -> loader.loadSprite(sprite, resource)).orElse(null);
    }

    private static Resource builtIn(ResourceManager resources, Identifier id) throws IOException {
        List<Resource> stack = resources.getResourceStack(id);
        if (stack.isEmpty()) {
            throw new IOException("Missing vanilla texture " + id);
        }
        // Resource stacks are ordered from lowest to highest pack priority.
        return stack.getFirst();
    }

    private static BufferedImage read(Resource resource) throws IOException {
        try (InputStream stream = resource.open()) {
            BufferedImage image = ImageIO.read(stream);
            if (image == null) {
                throw new IOException("Invalid image in pack " + resource.sourcePackId());
            }
            return image;
        }
    }
}
