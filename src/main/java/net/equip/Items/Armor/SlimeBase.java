package net.equip.Items.Armor;

import java.util.UUID;

import com.google.common.collect.Multimap;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.equip.glomod;

public class SlimeBase extends ArmorItem {

    double a = 2.0;
    private static final UUID[] MODIFIERS = new UUID[] { UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"),
            UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"),
            UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"),
            UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150") };

    public SlimeBase(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Item.Settings().group(glomod.equip_GROUP));

    }

    public Multimap<String, EntityAttributeModifier> getModifiers(EquipmentSlot equipmentSlot_1) {
        Multimap<String, EntityAttributeModifier> multimap_1 = super.getModifiers(equipmentSlot_1);
        if (equipmentSlot_1 == this.slot) {
            multimap_1.put(EntityAttributes.FOLLOW_RANGE.getId(),
                    new EntityAttributeModifier(MODIFIERS[equipmentSlot_1.getEntitySlotId()], "Slime", (double) this.a,
                            EntityAttributeModifier.Operation.ADDITION));

        }

        return multimap_1;
    }

    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {

        if (slot == 0 & slot == 1 & slot == 2 & slot == 3) {
            StatusEffectInstance str = new StatusEffectInstance(StatusEffect.byRawId(5), 0, 0, false, false);
            LivingEntity bob = (LivingEntity) entity;
            bob.addStatusEffect(str);
        }

    }

}
