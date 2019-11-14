package net.equip.Items.Armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class LapisArmorMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] { 12, 14, 15, 10 };
    private static final int[] PROTECTION_AMOUNTS = new int[] { 2, 5, 6, 2 };

    @Override
    public int getDurability(EquipmentSlot equipmentSlot) {
        return BASE_DURABILITY[equipmentSlot.getEntitySlotId()] * 25;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot equipmentSlot) {
        return PROTECTION_AMOUNTS[equipmentSlot.getEntitySlotId()];
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.LAPIS_LAZULI);
    }

    @Override
    public String getName() {
        return "lapis";
    }

    @Override
    public float getToughness() {
        return 1;
    }

}