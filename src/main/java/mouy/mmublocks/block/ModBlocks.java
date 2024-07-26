package mouy.mmublocks.block;

import mouy.mmublocks.MouysMinecraftUpdateBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

public class ModBlocks {

    // Blocks
    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks", new Block(FabricBlockSettings.create().mapColor(MapColor.DARK_AQUA).instrument(Instrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F).sounds(BlockSoundGroup.NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks", new Block(FabricBlockSettings.copyOf(ModBlocks.BLUE_NETHER_BRICKS)));
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks", new Block(FabricBlockSettings.copyOf(ModBlocks.BLUE_NETHER_BRICKS)));

    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks", new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)));
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks", new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS)));

    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block CRACKED_ANDESITE_BRICKS = registerBlock("cracked_andesite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));
    public static final Block MOSSY_ANDESITE_BRICKS = registerBlock("mossy_andesite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_ANDESITE)));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
    public static final Block CRACKED_DIORITE_BRICKS = registerBlock("cracked_diorite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));
    public static final Block MOSSY_DIORITE_BRICKS = registerBlock("mossy_diorite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_DIORITE)));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
    public static final Block CRACKED_GRANITE_BRICKS = registerBlock("cracked_granite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));
    public static final Block MOSSY_GRANITE_BRICKS = registerBlock("mossy_granite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.POLISHED_GRANITE)));

    public static final Block POLISHED_CALCITE = registerBlock("polished_calcite", new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block CALCITE_BRICKS = registerBlock("calcite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block CRACKED_CALCITE_BRICKS = registerBlock("cracked_calcite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));
    public static final Block MOSSY_CALCITE_BRICKS = registerBlock("mossy_calcite_bricks", new Block(FabricBlockSettings.copyOf(Blocks.CALCITE)));

    /* 1.21
    public static final Block CRACKED_TUFF_BRICKS = registerBlock("cracked_tuff_bricks", new Block(FabricBlockSettings.copyOf(Blocks.TUFF_BRICKS)));
    public static final Block MOSSY_TUFF_BRICKS = registerBlock("mossy_tuff_bricks", new Block(FabricBlockSettings.copyOf(Blocks.TUFF_BRICKS)));
     */

    public static final Block POLISHED_MUD = registerBlock("polished_mud", new Block(FabricBlockSettings.copyOf(Blocks.MUD_BRICKS)));

    public static final Block POLISHED_END_STONE = registerBlock("polished_end_stone", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));
    public static final Block CRACKED_END_STONE_BRICKS = registerBlock("cracked_end_stone_bricks", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE_BRICKS)));

    public static final Block WARPED_WART = registerBlock("warped_wart", new WarpedWartCropBlock(FabricBlockSettings.copyOf(Blocks.NETHER_WART)));

    // Stairs
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs", new StairsBlock(ModBlocks.BLUE_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.BLUE_NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICK_STAIRS = registerBlock("cracked_blue_nether_brick_stairs", new StairsBlock(ModBlocks.CRACKED_BLUE_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.CRACKED_BLUE_NETHER_BRICKS)));

    public static final Block CRACKED_RED_NETHER_BRICK_STAIRS = registerBlock("cracked_red_nether_brick_stairs", new StairsBlock(ModBlocks.CRACKED_RED_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.CRACKED_RED_NETHER_BRICKS)));

    public static final Block ANDESITE_BRICK_STAIRS = registerBlock("andesite_brick_stairs", new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.ANDESITE_BRICKS)));
    public static final Block CALCITE_BRICK_STAIRS = registerBlock("calcite_brick_stairs", new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.CALCITE_BRICKS)));
    public static final Block DIORITE_BRICK_STAIRS = registerBlock("diorite_brick_stairs", new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.DIORITE_BRICKS)));
    public static final Block GRANITE_BRICK_STAIRS = registerBlock("granite_brick_stairs", new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.GRANITE_BRICKS)));

    public static final Block POLISHED_CALCITE_STAIRS = registerBlock("polished_calcite_stairs", new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.POLISHED_CALCITE)));
    public static final Block POLISHED_MUD_STAIRS = registerBlock("polished_mud_stairs", new StairsBlock(ModBlocks.POLISHED_MUD.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.POLISHED_MUD)));

    // Slabs
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.BLUE_NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICK_SLAB = registerBlock("cracked_blue_nether_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CRACKED_BLUE_NETHER_BRICKS)));

    public static final Block CRACKED_RED_NETHER_BRICK_SLAB = registerBlock("cracked_red_nether_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CRACKED_RED_NETHER_BRICKS)));

    public static final Block ANDESITE_BRICK_SLAB = registerBlock("andesite_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.ANDESITE_BRICKS)));
    public static final Block CALCITE_BRICK_SLAB = registerBlock("calcite_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.CALCITE_BRICKS)));
    public static final Block DIORITE_BRICK_SLAB = registerBlock("diorite_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.DIORITE_BRICKS)));
    public static final Block GRANITE_BRICK_SLAB = registerBlock("granite_brick_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.GRANITE_BRICKS)));

    public static final Block POLISHED_CALCITE_SLAB = registerBlock("polished_calcite_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_CALCITE)));
    public static final Block POLISHED_MUD_SLAB = registerBlock("polished_mud_slab", new SlabBlock(FabricBlockSettings.copyOf(ModBlocks.POLISHED_MUD)));

    // Walls
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall", new StairsBlock(ModBlocks.BLUE_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.BLUE_NETHER_BRICKS)));
    public static final Block CRACKED_BLUE_NETHER_BRICK_WALL = registerBlock("cracked_blue_nether_brick_wall", new StairsBlock(ModBlocks.CRACKED_BLUE_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.CRACKED_BLUE_NETHER_BRICKS)));

    public static final Block CRACKED_RED_NETHER_BRICK_WALL = registerBlock("cracked_red_nether_brick_wall", new StairsBlock(ModBlocks.CRACKED_RED_NETHER_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.CRACKED_RED_NETHER_BRICKS)));

    public static final Block ANDESITE_BRICK_WALL = registerBlock("andesite_brick_wall", new StairsBlock(ModBlocks.ANDESITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.ANDESITE_BRICKS)));
    public static final Block CALCITE_BRICK_WALL = registerBlock("calcite_brick_wall", new StairsBlock(ModBlocks.CALCITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.CALCITE_BRICKS)));
    public static final Block DIORITE_BRICK_WALL = registerBlock("diorite_brick_wall", new StairsBlock(ModBlocks.DIORITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.DIORITE_BRICKS)));
    public static final Block GRANITE_BRICK_WALL = registerBlock("granite_brick_wall", new StairsBlock(ModBlocks.GRANITE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.GRANITE_BRICKS)));

    public static final Block POLISHED_CALCITE_WALL = registerBlock("polished_calcite_wall", new StairsBlock(ModBlocks.POLISHED_CALCITE.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.POLISHED_CALCITE)));
    public static final Block POLISHED_MUD_WALL = registerBlock("polished_mud_wall", new StairsBlock(ModBlocks.POLISHED_MUD.getDefaultState(), FabricBlockSettings.copyOf(ModBlocks.POLISHED_MUD)));

    // Fences

    // Doors

    // Trapdoors

    // Pressure Plates

    // Buttons

    @NotNull
    private static Block registerBlock(String blockID, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, blockID), block);
    }

    public static void init() {
        MouysMinecraftUpdateBlocks.LOGGER.info("Registering items for " + MouysMinecraftUpdateBlocks.MOD_ID);
    }
}
