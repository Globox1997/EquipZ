package net.equip.Items.Sword;

import java.util.List;
import java.util.Random;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.world.World;

public class Rapier extends SwordItem {
    public Rapier(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -2, -2.0f, new Item.Settings());
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.equip.rapier.tooltip"));
    }

    public boolean postHit(ItemStack itemStack_1, LivingEntity livingEntity_1, LivingEntity livingEntity_2) {
        Random random = new Random();
        int randomNumber = random.nextInt() % 4;
        StatusEffectInstance pois1 = new StatusEffectInstance(StatusEffect.byRawId(19), 20, 0, false, false, false);
        StatusEffectInstance pois2 = new StatusEffectInstance(StatusEffect.byRawId(19), 40, 0, false, false, false);
        StatusEffectInstance pois3 = new StatusEffectInstance(StatusEffect.byRawId(19), 60, 0, false, false, false);
        StatusEffectInstance pois4 = new StatusEffectInstance(StatusEffect.byRawId(19), 80, 0, false, false, false);
        itemStack_1.damage(1, livingEntity_2, (p) -> p.sendToolBreakStatus(p.getActiveHand()));
        switch (randomNumber) {
            case 0:
                livingEntity_1.addStatusEffect(pois1);
                return true;
            case 1:
                livingEntity_1.addStatusEffect(pois2);
                return true;
            case 2:
                livingEntity_1.addStatusEffect(pois3);
                return true;
            case 3:
                livingEntity_1.addStatusEffect(pois4);
                return true;
            default:
                return true;
        }

    }

}