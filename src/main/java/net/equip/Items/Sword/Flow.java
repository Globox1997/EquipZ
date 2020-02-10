package net.equip.Items.Sword;

import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

import net.equip.glomod;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.EquipmentSlot;
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

public class Flow extends SwordItem {
    public Flow(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 1, -2.4f, new Item.Settings().group(glomod.equip_GROUP));
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.equip.flow.tooltip"));
    }

    public boolean postHit(ItemStack itemStack_1, LivingEntity livingEntity_1, LivingEntity livingEntity_2) {
        Random random = new Random();
        int randomNumber = random.nextInt() % 2;

        itemStack_1.damage(1, (LivingEntity) livingEntity_2, (Consumer) ((livingEntity_1x) -> {
            ((LivingEntity) livingEntity_1x).sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        }));

        switch (randomNumber) {
        case 0:
            StatusEffectInstance str1 = new StatusEffectInstance(StatusEffect.byRawId(5), 40, 0, false, false, false);
            livingEntity_2.addStatusEffect(str1);
            return true;
        case 1:
            StatusEffectInstance str2 = new StatusEffectInstance(StatusEffect.byRawId(5), 60, 0, false, false, false);
            livingEntity_2.addStatusEffect(str2);
            return true;
        default:
            return true;
        }

    }

}