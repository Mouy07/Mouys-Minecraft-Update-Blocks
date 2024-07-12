package mouy.mmublocks.datagen;

import mouy.mmublocks.block.ModBlocks;
import mouy.mmublocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class LootTableProvider extends FabricBlockLootTableProvider {
    public LootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ANDESITE_BRICKS, drops(ModItems.ANDESITE_BRICKS));
        addDrop(ModBlocks.BLUE_NETHER_BRICKS, drops(ModItems.BLUE_NETHER_BRICKS));
        addDrop(ModBlocks.CALCITE_BRICKS, drops(ModItems.CALCITE_BRICKS));
        addDrop(ModBlocks.DIORITE_BRICKS, drops(ModItems.DIORITE_BRICKS));
        addDrop(ModBlocks.GRANITE_BRICKS, drops(ModItems.GRANITE_BRICKS));
        addDrop(ModBlocks.POLISHED_CALCITE, drops(ModItems.POLISHED_CALCITE));
        addDrop(ModBlocks.POLISHED_MUD, drops(ModItems.POLISHED_MUD));
    }
}
