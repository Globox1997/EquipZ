package net.equip.Items.Sword;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class EnderMaterial implements ToolMaterial {
    @Override
    public int getDurability() {
        return 916;
    }

    @Override
    public float getMiningSpeed() {
        return 1.0F;
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
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.EMPTY;
    }
}