package mouy.mmublocks.item;

import mouy.mmublocks.MouysMinecraftUpdateBlocks;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class RedNetherBrick extends Item {

    public RedNetherBrick(Settings settings) {
        super(settings);
    }

    public static final Item RED_NETHER_BRICK = new Item(new FabricItemSettings());

    public static void registerItem() {
        Registry.register(Registries.ITEM, new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, "red_nether_brick"), RED_NETHER_BRICK);
        addToItemGroup(RED_NETHER_BRICK);
    }

    public static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> content.addAfter(Items.NETHER_BRICK, item));
    }

}
