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

public class AxeDark extends SwordItem {
    public AxeDark(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, 3, -2.9f, new Item.Settings().group(glomod.equip_GROUP));
    }

    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        tooltip.add(new TranslatableText("item.equip.axedark.tooltip"));
    }

    public boolean postHit(ItemStack itemStack_1, LivingEntity livingEntity_1, LivingEntity livingEntity_2) {
        Random random = new Random();
        int randomNumber = random.nextInt() % 4;
        StatusEffectInstance slow1 = new StatusEffectInstance(StatusEffect.byRawId(2), 40, 0, false, false, false);
        StatusEffectInstance slow2 = new StatusEffectInstance(StatusEffect.byRawId(2), 20, 0, false, false, false);
        StatusEffectInstance slow3 = new StatusEffectInstance(StatusEffect.byRawId(2), 60, 0, false, false, false);
        StatusEffectInstance slow4 = new StatusEffectInstance(StatusEffect.byRawId(2), 80, 0, false, false, false);
        itemStack_1.damage(1, (LivingEntity) livingEntity_2, (Consumer) ((livingEntity_1x) -> {
            ((LivingEntity) livingEntity_1x).sendEquipmentBreakStatus(EquipmentSlot.MAINHAND);
        }));
        switch (randomNumber) {
            case 0:
                livingEntity_1.addStatusEffect(slow1);
                return true;
            case 1:
                livingEntity_1.addStatusEffect(slow2);
                return true;
            case 2:
                livingEntity_1.addStatusEffect(slow3);
                return true;
            case 3:
                livingEntity_1.addStatusEffect(slow4);
                return true;
            default:
                return true;
        }
    }

}