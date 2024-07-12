package mouy.mmublocks.item;

import mouy.mmublocks.MouysMinecraftUpdateBlocks;
import mouy.mmublocks.block.ModBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ModItems {

    // Block Items
    public static final Item BLUE_NETHER_BRICKS = registerBlockItem("blue_nether_bricks", ModBlocks.BLUE_NETHER_BRICKS, ItemGroups.BUILDING_BLOCKS, Items.RED_NETHER_BRICK_WALL);
    // Stairs
    // Slab
    // Wall
    // Fence
    public static final Item CRACKED_BLUE_NETHER_BRICKS = registerBlockItem("cracked_blue_nether_bricks", ModBlocks.CRACKED_BLUE_NETHER_BRICKS, ItemGroups.BUILDING_BLOCKS, Items.RED_NETHER_BRICK_WALL);
    // Stairs
    // Slab
    // Wall
    // Fence
    public static final Item CHISELED_BLUE_NETHER_BRICKS = registerBlockItem("chiseled_blue_nether_bricks", ModBlocks.CHISELED_BLUE_NETHER_BRICKS, ItemGroups.BUILDING_BLOCKS, Items.RED_NETHER_BRICK_WALL);

    public static final Item CRACKED_RED_NETHER_BRICKS = registerBlockItem("cracked_red_nether_bricks", ModBlocks.CRACKED_RED_NETHER_BRICKS, ItemGroups.BUILDING_BLOCKS, Items.RED_NETHER_BRICK_WALL);
    // Stairs
    // Slab
    // Wall
    // Fence
    public static final Item CHISELED_RED_NETHER_BRICKS = registerBlockItem("chiseled_red_nether_bricks", ModBlocks.CHISELED_RED_NETHER_BRICKS, ItemGroups.BUILDING_BLOCKS, Items.RED_NETHER_BRICK_WALL);
    // Stairs
    // Slab
    // Wall
    // Fence

    public static final Item ANDESITE_BRICKS = registerBlockItem("andesite_bricks", ModBlocks.ANDESITE_BRICKS, ItemGroups.BUILDING_BLOCKS, Items.POLISHED_ANDESITE_SLAB);
    // Stairs
    // Slab
    // Wall
    // Fence

    public static final Item DIORITE_BRICKS = registerBlockItem("diorite_bricks", ModBlocks.DIORITE_BRICKS, ItemGroups.BUILDING_BLOCKS, Items.POLISHED_DIORITE_SLAB);
    // Stairs
    // Slab
    // Wall
    // Fence

    public static final Item GRANITE_BRICKS = registerBlockItem("granite_bricks", ModBlocks.GRANITE_BRICKS, ItemGroups.BUILDING_BLOCKS, Items.POLISHED_GRANITE_SLAB);
    // Stairs
    // Slab
    // Wall
    // Fence

    public static final Item POLISHED_MUD = registerBlockItem("polished_mud", ModBlocks.POLISHED_MUD, ItemGroups.BUILDING_BLOCKS, Items.PACKED_MUD);
    // Stairs
    // Slab
    // Wall

    public static final Item POLISHED_CALCITE = registerBlockItem("polished_calcite", ModBlocks.POLISHED_CALCITE, ItemGroups.BUILDING_BLOCKS, ModItems.ANDESITE_BRICKS);
    // Stairs
    // Slab
    // Wall

    public static final Item CALCITE_BRICKS = registerBlockItem("calcite_bricks", ModBlocks.CALCITE_BRICKS, ItemGroups.BUILDING_BLOCKS, ModItems.POLISHED_CALCITE);
    // Stairs
    // Slab
    // Wall
    // Fence

    public static final Item WARPED_WART = registerAliasedBlockItem("warped_wart", ModBlocks.WARPED_WART, ItemGroups.INGREDIENTS, Items.NETHER_WART);

    // Items
    public static final Item RED_NETHER_BRICK = registerItem("red_nether_brick", ItemGroups.INGREDIENTS, Items.NETHER_BRICK);
    public static final Item BLUE_NETHER_BRICK = registerItem("blue_nether_brick", ItemGroups.INGREDIENTS, ModItems.RED_NETHER_BRICK);

    @NotNull
    private static Item registerItem(String itemID, RegistryKey<ItemGroup> itemGroup, Item addAfter) {
        Item item = Registry.register(Registries.ITEM,
                new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, itemID),
                new Item(new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.addAfter(addAfter, item));
        return item;
    }

    @NotNull
    private static Item registerBlockItem(String itemID, Block block, RegistryKey<ItemGroup> itemGroup, Item addAfter) {
        Item blockItem = Registry.register(Registries.ITEM,
                new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, itemID),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.addAfter(addAfter, blockItem));
        return blockItem;
    }

    @NotNull
    private static Item registerAliasedBlockItem(String itemID, Block block, RegistryKey<ItemGroup> itemGroup, Item addAfter) {
        Item aliasedBlockItem = Registry.register(Registries.ITEM,
                new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, itemID),
                new AliasedBlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(itemGroup).register(content -> content.addAfter(addAfter, aliasedBlockItem));
        return aliasedBlockItem;
    }

    public static void onInitialize() {
        MouysMinecraftUpdateBlocks.LOGGER.info("Registering blocks for " + MouysMinecraftUpdateBlocks.MOD_ID);
    }
}
