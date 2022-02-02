package net.xanthian.variantcraftingtables;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "variantcraftingtables";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Block SPRUCE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block BIRCH_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block JUNGLE_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block ACACIA_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block DARK_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block CRIMSON_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block WARPED_CRAFTING_TABLE = new CraftingTableBlock();
    //Tech Reborn
    public static final Block RUBBER_CRAFTING_TABLE = new CraftingTableBlock();
    //Blockus
    public static final Block BAMBOO_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block CHARRED_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block LEGACY_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block WHITE_OAK_CRAFTING_TABLE = new CraftingTableBlock();
    //Promenade
    public static final Block DARK_AMARANTH_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block PALM_CRAFTING_TABLE = new CraftingTableBlock();
    public static final Block CHERRY_OAK_CRAFTING_TABLE = new CraftingTableBlock();



    @Override
    public void onInitialize() {

        // Vanilla
        registerCraftingTable(SPRUCE_CRAFTING_TABLE, "spruce_crafting_table", true);
        registerCraftingTable(BIRCH_CRAFTING_TABLE, "birch_crafting_table", true);
        registerCraftingTable(JUNGLE_CRAFTING_TABLE, "jungle_crafting_table", true);
        registerCraftingTable(ACACIA_CRAFTING_TABLE, "acacia_crafting_table", true);
        registerCraftingTable(DARK_OAK_CRAFTING_TABLE, "dark_oak_crafting_table", true);

        // Disable Nether Wood when Better Nether is loaded
       // if (!FabricLoader.getInstance().isModLoaded("betternether")) {
            registerCraftingTable(CRIMSON_CRAFTING_TABLE, "crimson_crafting_table", false);
            registerCraftingTable(WARPED_CRAFTING_TABLE, "warped_crafting_table", false);
            //LOGGER.info("Better Nether detected, removing Crafting Tables from Varied Crafting Tables");
        //}

        // Tech Reborn Items
        if (FabricLoader.getInstance().isModLoaded("techreborn")) {
            registerCraftingTable(RUBBER_CRAFTING_TABLE, "rubber_crafting_table", true);
            LOGGER.info("Tech Reborn detected, creating Crafting Tables from Tech Reborn Planks");
            }

        // Blockus Items
        if (FabricLoader.getInstance().isModLoaded("blockus")) {
            registerCraftingTable(BAMBOO_CRAFTING_TABLE, "bamboo_crafting_table", true);
            registerCraftingTable(CHARRED_CRAFTING_TABLE, "charred_crafting_table", true);
            registerCraftingTable(LEGACY_CRAFTING_TABLE, "legacy_crafting_table", true);
            registerCraftingTable(WHITE_OAK_CRAFTING_TABLE, "white_oak_crafting_table", true);
            LOGGER.info("Blockus detected, creating Crafting Tables from Blockus Planks");
        }

        // Promenade Items
        if (FabricLoader.getInstance().isModLoaded("promenade")) {
            registerCraftingTable(DARK_AMARANTH_CRAFTING_TABLE, "dark_amaranth_crafting_table", true);
            registerCraftingTable(PALM_CRAFTING_TABLE, "palm_crafting_table", true);
            registerCraftingTable(CHERRY_OAK_CRAFTING_TABLE, "cherry_oak_crafting_table", true);
            LOGGER.info("Promenade detected, creating Crafting Tables from Promenade Planks");
        }
    }

    private void registerCraftingTable(Block craftingTable, String name, boolean canBurn) {

        Identifier id = new Identifier(MOD_ID, name);

        Registry.register(Registry.BLOCK, id,craftingTable);
        Registry.register(Registry.ITEM, id, new BlockItem(craftingTable, new Item.Settings().group(ItemGroup.DECORATIONS)));

        if (canBurn)
            FuelRegistry.INSTANCE.add(craftingTable, 300);

    }
}


