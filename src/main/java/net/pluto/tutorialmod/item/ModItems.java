package net.pluto.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pluto.tutorialmod.TutorialMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SIDELATE = ITEMS.register("sidelate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_SIDELATE = ITEMS.register("raw_sidelate",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SIDELATE_SWORD = ITEMS.register("sidelate_sword",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
