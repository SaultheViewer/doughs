package net.voltaire.gingerdoughs.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.voltaire.gingerdoughs.Doughs_Mod;
import net.voltaire.gingerdoughs.blocks.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Doughs_Mod.MODID);

    public static final RegistryObject<CreativeModeTab> COOKIE_ITEMS_TAB = CREATIVE_MODE_TABS.register("cooike_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CCC.get()))
                    .title(Component.translatable("creativetab.cooike_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.CCC.get());
                        pOutput.accept(ModItems.ICC.get());
                        pOutput.accept(ModItems.GCC.get());
                        pOutput.accept(ModItems.DCC.get());
                        pOutput.accept(ModItems.NCC.get());

                        pOutput.accept(ModBlocks.SUGAR_BLOCK.get());

                        pOutput.accept(Items.SUGAR);
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
