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

public class GraniteBricks extends Block {

    public GraniteBricks(Settings settings) {
        super(settings);
    }

    static final String BLOCK_ID = "granite_bricks";
    public static final Block GRANITE_BRICKS = new Block(FabricBlockSettings.copyOf(Blocks.GRANITE));

    public static void registerBlock() {
        Registry.register(Registries.BLOCK, new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, BLOCK_ID), GRANITE_BRICKS);
        registerBlockItem(GRANITE_BRICKS);
    }

    public static void registerBlockItem(Block block) {
        Item blockItem = new BlockItem(block, new Item.Settings());
        Registry.register(Registries.ITEM, new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, BLOCK_ID), blockItem);
        addToItemGroup(blockItem);
    }

    public static void addToItemGroup(Item blockItem) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> content.addAfter(Items.POLISHED_GRANITE_SLAB, blockItem));
    }
}
