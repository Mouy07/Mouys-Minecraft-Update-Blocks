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

public class WarpedWart extends Item {

    public WarpedWart(Settings settings) {
        super(settings);
    }

    public static final Item WARPED_WART = new Item(new FabricItemSettings());

    public static void registerItem() {
        Registry.register(Registries.ITEM, new Identifier(MouysMinecraftUpdateBlocks.MOD_ID, "warped_wart"), WARPED_WART);
        addToItemGroup(WARPED_WART);
    }

    public static void addToItemGroup(Item item) {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> content.addAfter(Items.NETHER_WART, item));
    }

}
