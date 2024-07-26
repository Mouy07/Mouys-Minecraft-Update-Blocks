package mouy.mmublocks.datagen;

import mouy.mmublocks.block.ModBlocks;
import mouy.mmublocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANDESITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_NETHER_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CALCITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIORITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GRANITE_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_CALCITE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_MUD);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.BLUE_NETHER_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_NETHER_BRICK, Models.GENERATED);
        itemModelGenerator.register(ModItems.WARPED_WART, Models.GENERATED);

    }
}
