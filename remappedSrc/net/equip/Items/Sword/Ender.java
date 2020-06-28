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

public class Ender extends SwordItem {
    public Ender(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 2, -2.7f, new Item.Settings());
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.equip.ender.tooltip"));
        tooltip.add(new TranslatableText("item.equip.ender.tooltip2"));
    }

    public boolean postHit(ItemStack itemStack_1, LivingEntity livingEntity_1, LivingEntity livingEntity_2) {
        Random random = new Random();
        int randomNumber = random.nextInt() % 2;
        StatusEffectInstance glow1 = new StatusEffectInstance(StatusEffect.byRawId(24), 100, 0, false, false, false);
        StatusEffectInstance lev = new StatusEffectInstance(StatusEffect.byRawId(25), 30, 0, false, false, false);
        StatusEffectInstance glow2 = new StatusEffectInstance(StatusEffect.byRawId(24), 100, 0, false, false, false);
        StatusEffectInstance glow3 = new StatusEffectInstance(StatusEffect.byRawId(24), 100, 0, false, false, false);
        itemStack_1.damage(1, livingEntity_2, (p) -> p.sendToolBreakStatus(p.getActiveHand()));

        switch (randomNumber) {
            case 0:
                livingEntity_1.addStatusEffect(glow1);
                livingEntity_1.addStatusEffect(lev);
                return true;
            case 1:
                livingEntity_1.addStatusEffect(glow2);
                return true;
            case 2:
                livingEntity_1.addStatusEffect(glow3);
                return true;
            default:
                return true;
        }

    }

}