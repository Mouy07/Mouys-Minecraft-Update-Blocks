package mouy.mmublocks.block;

import mouy.mmublocks.MouysMinecraftUpdateBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlueNetherBricks extends Block {

    public BlueNetherBricks(Settings settings) {
        super(settings);
    }

    static final String BLOCK_ID = "blue_nether_bricks";
    public static final Block BLUE_NETHER_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS));

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, BLOCK_ID), BLUE_NETHER_BRICKS);
        registerBlockItem(BLUE_NETHER_BRICKS);
    }

    public static void registerBlockItem(Block block) {
        Item blockItem = new BlockItem(block, new Item.Settings());
        Registry.register(Registries.ITEM, new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, BLOCK_ID), blockItem);
        addToItemGroup(blockItem);
    }

    public static void addToItemGroup(Item blockItem) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.RED_NETHER_BRICK_WALL, blockItem));
    }
}
