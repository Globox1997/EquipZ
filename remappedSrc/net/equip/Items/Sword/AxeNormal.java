package net.equip.Items.Sword;

import net.equip.glomod;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class AxeNormal extends SwordItem {
  public AxeNormal(ToolMaterial toolMaterial_1) {
    super(toolMaterial_1, 3, -2.9f, new Item.Settings().group(glomod.equip_GROUP));
  }
}