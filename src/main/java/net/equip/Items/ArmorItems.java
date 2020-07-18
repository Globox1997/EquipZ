package net.equip.Items;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.equip.Items.Armor.SlimeBase;
import net.equip.Items.Armor.*;

public class ArmorItems {

        public static final ArmorMaterial SlimeAppare = new SlimeArmorMaterial();
        public static final ArmorMaterial EmeraldAppare = new EmeraldArmorMaterial();
        public static final ArmorMaterial ObsidianAppare = new ObsidianArmorMaterial();
        public static final ArmorMaterial LapisAppare = new LapisArmorMaterial();
        public static final ArmorMaterial RedstoneAppare = new RedstoneArmorMaterial();
        public static final ArmorMaterial CoalAppare = new CoalArmorMaterial();

        public static final Item slime_helmet = register("slime_helmet",
                        new SlimeBase(SlimeAppare, EquipmentSlot.HEAD));
        public static final Item slime_chestplate = register("slime_chestplate",
                        new SlimeBase(SlimeAppare, EquipmentSlot.CHEST));
        public static final Item slime_leggings = register("slime_leggings",
                        new SlimeBase(SlimeAppare, EquipmentSlot.LEGS));
        public static final Item slime_boots = register("slime_boots", new SlimeBase(SlimeAppare, EquipmentSlot.FEET));

        public static final Item emerald1_helmet = register("emerald1_helmet",
                        new EmeraldBase(EmeraldAppare, EquipmentSlot.HEAD));
        public static final Item emerald1_chestplate = register("emerald1_chestplate",
                        new EmeraldBase(EmeraldAppare, EquipmentSlot.CHEST));
        public static final Item emerald1_leggings = register("emerald1_leggings",
                        new EmeraldBase(EmeraldAppare, EquipmentSlot.LEGS));
        public static final Item emerald1_boots = register("emerald1_boots",
                        new EmeraldBase(EmeraldAppare, EquipmentSlot.FEET));

        public static final Item obsidian_helmet = register("obsidian_helmet",
                        new ObsidianBase(ObsidianAppare, EquipmentSlot.HEAD));
        public static final Item obsidian_chestplate = register("obsidian_chestplate",
                        new ObsidianBase(ObsidianAppare, EquipmentSlot.CHEST));
        public static final Item obsidian_leggings = register("obsidian_leggings",
                        new ObsidianBase(ObsidianAppare, EquipmentSlot.LEGS));
        public static final Item obsidian_boots = register("obsidian_boots",
                        new ObsidianBase(ObsidianAppare, EquipmentSlot.FEET));

        public static final Item lapis1_helmet = register("lapis1_helmet",
                        new LapisBase(LapisAppare, EquipmentSlot.HEAD));
        public static final Item lapis1_chestplate = register("lapis1_chestplate",
                        new LapisBase(LapisAppare, EquipmentSlot.CHEST));
        public static final Item lapis1_leggings = register("lapis1_leggings",
                        new LapisBase(LapisAppare, EquipmentSlot.LEGS));
        public static final Item lapis1_boots = register("lapis1_boots",
                        new LapisBase(LapisAppare, EquipmentSlot.FEET));

        public static final Item coal_helmet = register("coal_helmet", new CoalBase(CoalAppare, EquipmentSlot.HEAD));
        public static final Item coal_chestplate = register("coal_chestplate",
                        new CoalBase(CoalAppare, EquipmentSlot.CHEST));
        public static final Item coal_leggings = register("coal_leggings",
                        new CoalBase(CoalAppare, EquipmentSlot.LEGS));
        public static final Item coal_boots = register("coal_boots", new CoalBase(CoalAppare, EquipmentSlot.FEET));

        public static final Item redstone_helmet = register("redstone_helmet",
                        new RedstoneBase(RedstoneAppare, EquipmentSlot.HEAD));
        public static final Item redstone_chestplate = register("redstone_chestplate",
                        new RedstoneBase(RedstoneAppare, EquipmentSlot.CHEST));
        public static final Item redstone_leggings = register("redstone_leggings",
                        new RedstoneBase(RedstoneAppare, EquipmentSlot.LEGS));
        public static final Item redstone_boots = register("redstone_boots",
                        new RedstoneBase(RedstoneAppare, EquipmentSlot.FEET));

        private static Item register(String id, Item item) {
                return register(new Identifier("equip", id), item);
        }

        private static Item register(Identifier id, Item item) {
                return Registry.register(Registry.ITEM, id, item);
        }

        public static void init() {
        }
}