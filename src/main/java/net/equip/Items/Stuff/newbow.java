package net.equip.Items.Stuff;

import java.util.List;

import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class newbow extends BowItem {
  public newbow(Settings settings) {
    super(settings);
    FabricModelPredicateProviderRegistry.register(new Identifier("pull"), (stack, world, entity) -> {
      if (entity == null) {
        return 0.0F;
      } else {
        return entity.getActiveItem().getItem() != this ? 0.0F
            : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
      }
    });
    FabricModelPredicateProviderRegistry.register(new Identifier("pulling"), (stack, world, entity) -> {
      return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });
  }

  @Override
  public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
    tooltip.add(new TranslatableText("item.equip.newbow.tooltip"));
  }

}
