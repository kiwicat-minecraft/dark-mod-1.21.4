package net.dark.kiwi.item;

import net.dark.kiwi.DarkMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item DARK_ORE = registerItem("dark_ore", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(DarkMod.MOD_ID,"dark_ore")))));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(DarkMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        DarkMod.LOGGER.info("Registering Mod Items for " + DarkMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DARK_ORE);
        });
    }
}
