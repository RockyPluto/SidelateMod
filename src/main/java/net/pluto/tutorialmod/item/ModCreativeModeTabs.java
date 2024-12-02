package net.pluto.tutorialmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pluto.tutorialmod.TutorialMod;
import net.pluto.tutorialmod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_ITEMS = CREATIVE_MODE_TABS.register("mod_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SIDELATE.get()))
                    .title(Component.translatable("creativetab.tutorialmod.mod_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SIDELATE.get());
                        output.accept(ModItems.SIDELATE_AXE.get());
                        output.accept(ModItems.SIDELATE_HOE.get());
                        output.accept(ModItems.SIDELATE_PICKAXE.get());
                        output.accept(ModItems.SIDELATE_SHOVEL.get());
                        output.accept(ModItems.SIDELATE_SWORD.get());
                        output.accept(ModItems.RAW_SIDELATE.get());
                    }).build());

    public static final RegistryObject<CreativeModeTab> MOD_BLOCKS = CREATIVE_MODE_TABS.register("mod_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SIDELATE_BLOCK.get()))
                    .withTabsBefore(MOD_ITEMS.getId())
                    .title(Component.translatable("creativetab.tutorialmod.mod_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.SIDELATE_BLOCK.get());
                        output.accept(ModBlocks.SIDELATE_ORE.get());
                        output.accept(ModBlocks.SIDELATE_BRICKS.get());
                        output.accept(ModBlocks.CHISELED_SIDELATE_BRICKS.get());
                        output.accept(ModBlocks.SIDELATE_DEEPSLATE_ORE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
