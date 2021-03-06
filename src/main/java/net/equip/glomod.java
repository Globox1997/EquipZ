package net.equip;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.equip.Items.ArmorItems;
import net.equip.Items.SwordItems;
import net.equip.Items.Stuff.*;

public class glomod implements ModInitializer {

        public static final coalingot COALINGOT = new coalingot(new Item.Settings());
        public static final lapisingot LAPISINGOT = new lapisingot(new Item.Settings());
        public static final redstoneingot REDSTONEINGOT = new redstoneingot(new Item.Settings());
        public static final obsidianingot OBSIDIANINGOT = new obsidianingot(new Item.Settings());
        public static final purplediamond PURPLEDIAMOND = new purplediamond(new Item.Settings());
        public static final bluerod BLUEROD = new bluerod(new Item.Settings());
        public static final boneingot BONEINGOT = new boneingot(new Item.Settings());
        public static final coralbow CORALBOW = new coralbow(new Item.Settings().maxDamage(658));
        public static final coralrod CORALROD = new coralrod(new Item.Settings());
        public static final coalrod COALROD = new coalrod(new Item.Settings());
        public static final heavyrod HEAVYROD = new heavyrod(new Item.Settings());
        public static final newdia NEWDIA = new newdia(new Item.Settings());
        public static final newbow NEWBOW = new newbow(new Item.Settings().maxDamage(438));

        public static final ItemGroup equip_GROUP = FabricItemGroupBuilder.create(new Identifier("equip", "glomod"))
                        .icon(() -> new ItemStack(ArmorItems.obsidian_chestplate)).appendItems(stacks -> {
                                stacks.add(new ItemStack(SwordItems.AxeDark));
                                stacks.add(new ItemStack(SwordItems.AxeRed));
                                stacks.add(new ItemStack(SwordItems.AxeNormal));
                                stacks.add(new ItemStack(SwordItems.Ender));
                                stacks.add(new ItemStack(SwordItems.Rapier));
                                stacks.add(new ItemStack(SwordItems.Blue));
                                stacks.add(new ItemStack(SwordItems.Flow));
                                stacks.add(new ItemStack(SwordItems.Knighter));
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(new ItemStack(glomod.CORALBOW));
                                stacks.add(new ItemStack(glomod.NEWBOW));
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(new ItemStack(ArmorItems.slime_helmet));
                                stacks.add(new ItemStack(ArmorItems.slime_chestplate));
                                stacks.add(new ItemStack(ArmorItems.slime_leggings));
                                stacks.add(new ItemStack(ArmorItems.slime_boots));
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(new ItemStack(ArmorItems.emerald1_helmet));
                                stacks.add(new ItemStack(ArmorItems.emerald1_chestplate));
                                stacks.add(new ItemStack(ArmorItems.emerald1_leggings));
                                stacks.add(new ItemStack(ArmorItems.emerald1_boots));
                                stacks.add(new ItemStack(ArmorItems.obsidian_helmet));
                                stacks.add(new ItemStack(ArmorItems.obsidian_chestplate));
                                stacks.add(new ItemStack(ArmorItems.obsidian_leggings));
                                stacks.add(new ItemStack(ArmorItems.obsidian_boots));
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(new ItemStack(ArmorItems.coal_helmet));
                                stacks.add(new ItemStack(ArmorItems.coal_chestplate));
                                stacks.add(new ItemStack(ArmorItems.coal_leggings));
                                stacks.add(new ItemStack(ArmorItems.coal_boots));
                                stacks.add(new ItemStack(ArmorItems.lapis1_helmet));
                                stacks.add(new ItemStack(ArmorItems.lapis1_chestplate));
                                stacks.add(new ItemStack(ArmorItems.lapis1_leggings));
                                stacks.add(new ItemStack(ArmorItems.lapis1_boots));
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(new ItemStack(ArmorItems.redstone_helmet));
                                stacks.add(new ItemStack(ArmorItems.redstone_chestplate));
                                stacks.add(new ItemStack(ArmorItems.redstone_leggings));
                                stacks.add(new ItemStack(ArmorItems.redstone_boots));
                                stacks.add(new ItemStack(glomod.COALINGOT));
                                stacks.add(new ItemStack(glomod.LAPISINGOT));
                                stacks.add(new ItemStack(glomod.REDSTONEINGOT));
                                stacks.add(new ItemStack(glomod.OBSIDIANINGOT));
                                stacks.add(new ItemStack(glomod.BONEINGOT));
                                stacks.add(new ItemStack(glomod.NEWDIA));
                                stacks.add(new ItemStack(glomod.PURPLEDIAMOND));
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(ItemStack.EMPTY);
                                stacks.add(new ItemStack(glomod.BLUEROD));
                                stacks.add(new ItemStack(glomod.CORALROD));
                                stacks.add(new ItemStack(glomod.COALROD));
                                stacks.add(new ItemStack(glomod.HEAVYROD));
                        }).build();

        @Override
        public void onInitialize() {
                Registry.register(Registry.ITEM, new Identifier("equip", "coal_ingot"), COALINGOT);
                Registry.register(Registry.ITEM, new Identifier("equip", "lapis_ingot"), LAPISINGOT);
                Registry.register(Registry.ITEM, new Identifier("equip", "redstone_ingot"), REDSTONEINGOT);
                Registry.register(Registry.ITEM, new Identifier("equip", "obsidian_ingot"), OBSIDIANINGOT);
                Registry.register(Registry.ITEM, new Identifier("equip", "purplediamond"), PURPLEDIAMOND);
                Registry.register(Registry.ITEM, new Identifier("equip", "bluerod"), BLUEROD);
                Registry.register(Registry.ITEM, new Identifier("equip", "bone_ingot"), BONEINGOT);
                Registry.register(Registry.ITEM, new Identifier("equip", "coralbow"), CORALBOW);
                Registry.register(Registry.ITEM, new Identifier("equip", "coralrod"), CORALROD);
                Registry.register(Registry.ITEM, new Identifier("equip", "newdia"), NEWDIA);
                Registry.register(Registry.ITEM, new Identifier("equip", "coalrod"), COALROD);
                Registry.register(Registry.ITEM, new Identifier("equip", "heavyrod"), HEAVYROD);
                Registry.register(Registry.ITEM, new Identifier("equip", "newbow"), NEWBOW);
                SwordItems.init();
                ArmorItems.init();
                eloot.init();

        }
}

// You are LOVED!!!
// Jesus loves you unconditional!