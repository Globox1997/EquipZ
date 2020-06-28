package net.equip.Items.Sword;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AxeNMaterial implements ToolMaterial {
  @Override
  public int getDurability() {
    return 505;
  }

  @Override
  public float getAttackDamage() {
    return 4;
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
    return Ingredient.ofItems(Items.IRON_INGOT);
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return 0;
  }
}