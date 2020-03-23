package net.equip.Items.Sword;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class KnighterMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 614;
    }

    @Override
    public float getAttackDamage() {
        return 5;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 15;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.EMPTY;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }
}