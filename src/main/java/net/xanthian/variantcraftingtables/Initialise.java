package net.xanthian.variantcraftingtables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    // Vanilla
    public static final Block ACACIA_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block BIRCH_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block JUNGLE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block SPRUCE_CRAFTING_TABLE = new CraftingTableBlock();
    // Nether
    public static final Block CRIMSON_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block WARPED_CRAFTING_TABLE = new CraftingTableBlock();
    // Tech Reborn
    public static final Block RUBBER_CRAFTING_TABLE = new CraftingTableBlock();
    // Blockus
    public static final Block BAMBOO_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block CHARRED_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block LEGACY_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block WHITE_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    // Promenade
    public static final Block CHERRY_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block DARK_AMARANTH_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block PALM_CRAFTING_TABLE = new CraftingTableBlock();
    // Bewitchment
    public static final Block CYPRESS_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block DRAGONS_BLOOD_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block ELDER_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block JUNIPER_CRAFTING_TABLE = new CraftingTableBlock();
    // Botania
    public static final Block DREAMWOOD_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block LIVINGWOOD_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MOSSY_DREAMWOOD_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MOSSY_LIVINGWOOD_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block SHIMMERWOOD_CRAFTING_TABLE = new CraftingTableBlock();
    // Wilder World
    public static final Block WISTERIA_CRAFTING_TABLE = new CraftingTableBlock();
    // Spectrum
    public static final Block BLACK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block BLUE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block BROWN_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block CYAN_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block GRAY_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block GREEN_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block LIGHT_BLUE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block LIGHT_GRAY_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block LIME_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MAGENTA_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block ORANGE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block PINK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block PURPLE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block RED_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block WHITE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block YELLOW_CRAFTING_TABLE = new CraftingTableBlock();
    // Biome Makeover
    public static final Block ANCIENT_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block BLIGHTED_BALSA_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block SWAMP_CYPRESS_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block WILLOW_CRAFTING_TABLE = new CraftingTableBlock();
    // Simple Mango
    public static final Block MANGO_CRAFTING_TABLE = new CraftingTableBlock();
    // Vanilla Enhanced
    public static final Block BAMBOO_CRAFTING_TABLE_VE = new CraftingTableBlock();
    public static final Block REDWOOD_CRAFTING_TABLE = new CraftingTableBlock();
    // Better Azalea
    public static final Block AZALEA_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block FLOWERING_AZALEA_CRAFTING_TABLE = new CraftingTableBlock();
    // Twigs
    public static final Block STRIPPED_BAMBOO_CRAFTING_TABLE = new CraftingTableBlock();
    // The Wild Mod (TWM)
    public static final Block MANGROVE_CRAFTING_TABLE = new CraftingTableBlock();
    // Tokenable Decoration
    public static final Block MOSSY_ACACIA_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MOSSY_BIRCH_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MOSSY_DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MOSSY_JUNGLE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MOSSY_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block MOSSY_SPRUCE_CRAFTING_TABLE = new CraftingTableBlock();




    @Override
    public void onInitialize() {

        // Vanilla
            registerCraftingTable(ACACIA_CRAFTING_TABLE, "acacia_crafting_table", true);
            registerCraftingTable(BIRCH_CRAFTING_TABLE, "birch_crafting_table", true);
            registerCraftingTable(DARK_OAK_CRAFTING_TABLE, "dark_oak_crafting_table", true);
            registerCraftingTable(JUNGLE_CRAFTING_TABLE, "jungle_crafting_table", true);
            registerCraftingTable(SPRUCE_CRAFTING_TABLE, "spruce_crafting_table", true);
        // Only load Nether Wood variants when Better Nether is NOT loaded
       if (!FabricLoader.getInstance().isModLoaded("betternether")) {
           registerCraftingTable(CRIMSON_CRAFTING_TABLE, "crimson_crafting_table", false);
           registerCraftingTable(WARPED_CRAFTING_TABLE, "warped_crafting_table", false);
       }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            LOGGER.info("Better Nether detected, removing Crafting Tables from Varied Crafting Tables");
        }
        // Tech Reborn
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registerCraftingTable(RUBBER_CRAFTING_TABLE, "rubber_crafting_table", true);
            LOGGER.info("Tech Reborn detected, creating Crafting Tables from Tech Reborn Planks");
            }
        // Blockus
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registerCraftingTable(BAMBOO_CRAFTING_TABLE, "bamboo_crafting_table", true);
            registerCraftingTable(CHARRED_CRAFTING_TABLE, "charred_crafting_table", true);
            registerCraftingTable(LEGACY_CRAFTING_TABLE, "legacy_crafting_table", true);
            registerCraftingTable(WHITE_OAK_CRAFTING_TABLE, "white_oak_crafting_table", true);
            LOGGER.info("Blockus detected, creating Crafting Tables from Blockus Planks");
        }
        // Promenade
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registerCraftingTable(CHERRY_OAK_CRAFTING_TABLE, "cherry_oak_crafting_table", true);
            registerCraftingTable(DARK_AMARANTH_CRAFTING_TABLE, "dark_amaranth_crafting_table", true);
            registerCraftingTable(PALM_CRAFTING_TABLE, "palm_crafting_table", true);
            LOGGER.info("Promenade detected, creating Crafting Tables from Promenade Planks");
        }
        // Bewitchment
        if (FabricLoader.getInstance().isModLoaded("bewitchment")) {
            registerCraftingTable(CYPRESS_CRAFTING_TABLE, "cypress_crafting_table", true);
            registerCraftingTable(DRAGONS_BLOOD_CRAFTING_TABLE, "dragons_blood_crafting_table", true);
            registerCraftingTable(ELDER_CRAFTING_TABLE, "elder_crafting_table", true);
            registerCraftingTable(JUNIPER_CRAFTING_TABLE, "juniper_crafting_table", true);
            LOGGER.info("Bewitchment detected, creating Crafting Tables from Bewitchment Planks");
        }
        // Botania
        if (FabricLoader.getInstance().isModLoaded("botania")) {
            registerCraftingTable(DREAMWOOD_CRAFTING_TABLE, "dreamwood_crafting_table", true);
            registerCraftingTable(LIVINGWOOD_CRAFTING_TABLE, "livingwood_crafting_table", true);
            registerCraftingTable(MOSSY_DREAMWOOD_CRAFTING_TABLE, "mossy_dreamwood_crafting_table", true);
            registerCraftingTable(MOSSY_LIVINGWOOD_CRAFTING_TABLE, "mossy_livingwood_crafting_table", true);
            registerCraftingTable(SHIMMERWOOD_CRAFTING_TABLE, "shimmerwood_crafting_table", true);
            LOGGER.info("Botania detected, creating Crafting Tables from Botania Planks");
        }
        // Spectrum
        if (FabricLoader.getInstance().isModLoaded("spectrum")) {
            registerCraftingTable(BLACK_CRAFTING_TABLE, "black_crafting_table", true);
            registerCraftingTable(BLUE_CRAFTING_TABLE, "blue_crafting_table", true);
            registerCraftingTable(BROWN_CRAFTING_TABLE, "brown_crafting_table", true);
            registerCraftingTable(CYAN_CRAFTING_TABLE, "cyan_crafting_table", true);
            registerCraftingTable(GRAY_CRAFTING_TABLE, "gray_crafting_table", true);
            registerCraftingTable(GREEN_CRAFTING_TABLE, "green_crafting_table", true);
            registerCraftingTable(LIGHT_BLUE_CRAFTING_TABLE, "light_blue_crafting_table", true);
            registerCraftingTable(LIGHT_GRAY_CRAFTING_TABLE, "light_gray_crafting_table", true);
            registerCraftingTable(LIME_CRAFTING_TABLE, "lime_crafting_table", true);
            registerCraftingTable(MAGENTA_CRAFTING_TABLE, "magenta_crafting_table", true);
            registerCraftingTable(ORANGE_CRAFTING_TABLE, "orange_crafting_table", true);
            registerCraftingTable(PINK_CRAFTING_TABLE, "pink_crafting_table", true);
            registerCraftingTable(PURPLE_CRAFTING_TABLE, "purple_crafting_table", true);
            registerCraftingTable(RED_CRAFTING_TABLE, "red_crafting_table", true);
            registerCraftingTable(WHITE_CRAFTING_TABLE, "white_crafting_table", true);
            registerCraftingTable(YELLOW_CRAFTING_TABLE, "yellow_crafting_table", true);
            LOGGER.info("Spectrum detected, creating Crafting Tables from Spectrum Planks");
        }
        // Wilderworld
        if (FabricLoader.getInstance().isModLoaded("wilderworld")) {
            registerCraftingTable(WISTERIA_CRAFTING_TABLE, "wisteria_crafting_table", true);
            LOGGER.info("Wilder World detected, creating Crafting Tables from Wilder World Planks");
        }
        // Biome Makeover
        if (FabricLoader.getInstance().isModLoaded("biomemakeover")) {
            registerCraftingTable(ANCIENT_OAK_CRAFTING_TABLE, "ancient_oak_crafting_table", true);
            registerCraftingTable(BLIGHTED_BALSA_CRAFTING_TABLE, "blighted_balsa_crafting_table", true);
            registerCraftingTable(SWAMP_CYPRESS_CRAFTING_TABLE, "swamp_cypress_crafting_table", true);
            registerCraftingTable(WILLOW_CRAFTING_TABLE, "willow_crafting_table", true);
            LOGGER.info("Biome Makeover detected, creating Crafting Tables from Biome Makeover Planks");
        }
        // Simple Mango
        if (FabricLoader.getInstance().isModLoaded("simplemango")) {
            registerCraftingTable(MANGO_CRAFTING_TABLE, "mango_crafting_table", true);
            LOGGER.info("Simple Mango detected, creating Crafting Tables from Simple Mango Planks");
        }
        // Vanilla Enhanced
        if (FabricLoader.getInstance().isModLoaded("vanillaenhanced")) {
            registerCraftingTable(BAMBOO_CRAFTING_TABLE_VE, "bamboo_crafting_table_ve", true);
            registerCraftingTable(REDWOOD_CRAFTING_TABLE, "redwood_crafting_table", true);
            LOGGER.info("Vanilla Enhanced detected, creating Crafting Tables from Vanilla Enhanced Planks");
        }
        // Better Azalea
        if (FabricLoader.getInstance().isModLoaded("betterazalea")) {
            registerCraftingTable(AZALEA_CRAFTING_TABLE, "azalea_crafting_table", true);
            registerCraftingTable(FLOWERING_AZALEA_CRAFTING_TABLE, "flowering_azalea_crafting_table", true);
            LOGGER.info("Better Azalea detected, creating Crafting Tables from Better Azalea Planks");
        }
        // Twigs
        if (FabricLoader.getInstance().isModLoaded("twigs")) {
            registerCraftingTable(STRIPPED_BAMBOO_CRAFTING_TABLE, "stripped_bamboo_crafting_table", true);
            LOGGER.info("Twigs detected, creating Crafting Tables from Twigs Planks");
        }
        // TWM
        if (FabricLoader.getInstance().isModLoaded("twm")) {
            registerCraftingTable(MANGROVE_CRAFTING_TABLE, "mangrove_crafting_table", true);
            LOGGER.info("TWM detected, creating Crafting Tables from TWM Planks");
        }
        // Tokenable Decoration
        if (FabricLoader.getInstance().isModLoaded("tokenabledecoration")) {
            registerCraftingTable(MOSSY_ACACIA_CRAFTING_TABLE, "mossy_acacia_crafting_table", true);
            registerCraftingTable(MOSSY_BIRCH_CRAFTING_TABLE, "mossy_birch_crafting_table", true);
            registerCraftingTable(MOSSY_DARK_OAK_CRAFTING_TABLE, "mossy_dark_oak_crafting_table", true);
            registerCraftingTable(MOSSY_JUNGLE_CRAFTING_TABLE, "mossy_jungle_crafting_table", true);
            registerCraftingTable(MOSSY_OAK_CRAFTING_TABLE, "mossy_oak_crafting_table", true);
            registerCraftingTable(MOSSY_SPRUCE_CRAFTING_TABLE, "mossy_spruce_crafting_table", true);
            LOGGER.info("Tokenable Decoration detected, creating Crafting Tables from Tokenable Decoration Planks");
        }
    }
    private void registerCraftingTable(Block craftingTable, String name, boolean canBurn) {
        Identifier id = new Identifier(MOD_ID, name);
        Registry.register(Registry.BLOCK, id,craftingTable);
        Registry.register(Registry.ITEM, id, new BlockItem(craftingTable, new Item.Settings().group(Group.VCT)));
        if (canBurn) FuelRegistry.INSTANCE.add(craftingTable, 300);
    }
}