package mouy.mmublocks.item;

import mouy.mmublocks.MouysMinecraftUpdateBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlueNetherBrick extends Item {

    public BlueNetherBrick(Settings settings) {
        super(settings);
    }

    public static final Item BLUE_NETHER_BRICK = new Item(new FabricItemSettings());

    public static void registerItem() {
        Registry.register(Registries.ITEM, new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, "blue_nether_brick"), BLUE_NETHER_BRICK);
        addToItemGroup(BLUE_NETHER_BRICK);
    }

    public static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> content.addAfter(RedNetherBrick.RED_NETHER_BRICK, item));
    }

}
