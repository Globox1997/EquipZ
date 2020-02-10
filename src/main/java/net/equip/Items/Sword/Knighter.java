package net.equip.Items.Sword;

import net.equip.glomod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;

public class Knighter extends SwordItem {
    public Knighter(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 0, -2.4f, new Item.Settings().group(glomod.equip_GROUP));
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if (selected == true) {
            StatusEffectInstance str = new StatusEffectInstance(StatusEffect.byRawId(5), 0, 0, false, false);
            LivingEntity bob = (LivingEntity) entity;
            bob.addStatusEffect(str);
        }

    }

}