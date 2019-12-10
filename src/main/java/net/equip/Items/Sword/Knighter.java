package net.equip.Items.Sword;

import net.equip.glomod;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class Knighter extends SwordItem {
    public Knighter(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 1, -2.4f, new Item.Settings().group(glomod.equip_GROUP));
    }



}