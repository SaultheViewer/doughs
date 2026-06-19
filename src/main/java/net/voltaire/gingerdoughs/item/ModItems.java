package net.voltaire.gingerdoughs.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.voltaire.gingerdoughs.Doughs_Mod;
import net.minecraftforge.eventbus.api.IEventBus;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Doughs_Mod.MODID);

    public static final RegistryObject<Item> CCC = ITEMS.register("ccc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ICC = ITEMS.register("icc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GCC = ITEMS.register("gcc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DCC = ITEMS.register("dcc",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NCC = ITEMS.register("ncc",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
