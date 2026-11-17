package net.xanthian.variantcraftingtables.client;

import java.awt.image.BufferedImage;
import java.util.HashSet;
import java.util.Set;

/** Composes vanilla decorations over plank pixels, without keeping per-wood texture files. */
public final class CraftingTableTexture {
    private CraftingTableTexture() {
    }

    public static BufferedImage compose(BufferedImage template, BufferedImage oak,
                                        BufferedImage planks, int frameWidth, int frameHeight) {
        if (frameWidth <= 0 || frameHeight <= 0
                || planks.getWidth() % frameWidth != 0 || planks.getHeight() % frameHeight != 0) {
            throw new IllegalArgumentException("Plank image must contain complete animation frames");
        }

        Set<Integer> oakPalette = new HashSet<>();
        for (int y = 0; y < oak.getHeight(); y++) {
            for (int x = 0; x < oak.getWidth(); x++) {
                oakPalette.add(oak.getRGB(x, y) & 0xFFFFFF);
            }
        }

        boolean[] woodMask = new boolean[template.getWidth() * template.getHeight()];
        for (int y = 0; y < template.getHeight(); y++) {
            for (int x = 0; x < template.getWidth(); x++) {
                woodMask[y * template.getWidth() + x] = isWood(template.getRGB(x, y), oakPalette);
            }
        }

        BufferedImage result = new BufferedImage(planks.getWidth(), planks.getHeight(), BufferedImage.TYPE_INT_ARGB);
        for (int y = 0; y < result.getHeight(); y++) {
            for (int x = 0; x < result.getWidth(); x++) {
                // Restart the decoration UVs for every frame in an animated plank sheet.
                int tx = (x % frameWidth) * template.getWidth() / frameWidth;
                int ty = (y % frameHeight) * template.getHeight() / frameHeight;
                result.setRGB(x, y, woodMask[ty * template.getWidth() + tx]
                        ? planks.getRGB(x, y) : template.getRGB(tx, ty));
            }
        }
        return result;
    }

    private static boolean isWood(int color, Set<Integer> palette) {
        if ((color >>> 24) == 0) {
            return false;
        }
        for (int oak : palette) {
            int r = ((color >> 16) & 255) - ((oak >> 16) & 255);
            int g = ((color >> 8) & 255) - ((oak >> 8) & 255);
            int b = (color & 255) - (oak & 255);
            // The small patches of exposed wood on the top use a slightly different oak shade.
            if (r * r + g * g + b * b <= 16 * 16) {
                return true;
            }
        }
        return false;
    }
}
