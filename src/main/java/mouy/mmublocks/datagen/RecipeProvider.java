package mouy.mmublocks.datagen;

import mouy.mmublocks.block.ModBlocks;
import mouy.mmublocks.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.function.Consumer;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // Andesite Bricks
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_BRICKS, Blocks.POLISHED_ANDESITE);

        // Blue Nether Brick(s)
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.BLUE_NETHER_BRICK)
                .input(Items.NETHER_BRICK)
                .input(ModItems.WARPED_WART)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHER_BRICK), FabricRecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.BLUE_NETHER_BRICKS, 2)
                .pattern("aa")
                .pattern("aa")
                .input('a', ModItems.BLUE_NETHER_BRICK)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHER_BRICK), FabricRecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter);

        // Calcite Bricks
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_BRICKS, ModBlocks.POLISHED_CALCITE);

        // Diorite Bricks
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_BRICKS, Blocks.POLISHED_DIORITE);

        // Granite Bricks
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_BRICKS, Blocks.POLISHED_GRANITE);

        // Mud Bricks
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, Blocks.PACKED_MUD);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MUD_BRICKS, ModBlocks.POLISHED_MUD);

        // Polished Calcite
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_CALCITE, Blocks.CALCITE);

        // Polished Mud
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MUD, Blocks.PACKED_MUD);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_MUD, Blocks.PACKED_MUD);

        // Red Nether Brick
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_NETHER_BRICK)
                .input(Items.NETHER_BRICK)
                .input(Items.NETHER_WART)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHER_BRICK), FabricRecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter);

        // Warped Wart Block
        offerCompactingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.WARPED_WART_BLOCK, ModItems.WARPED_WART);
    }
}