package net.equip;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.client.model.FabricModelPredicateProviderRegistry;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)

public class glomodclient implements ClientModInitializer {

  @Override
  public void onInitializeClient() {
    FabricModelPredicateProviderRegistry.register(glomod.CORALBOW, new Identifier("pull"), (stack, world, entity) -> {
      if (entity == null) {
        return 0.0F;
      } else {
        return entity.getActiveItem() != stack ? 0.0F
            : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
      }
    });
    FabricModelPredicateProviderRegistry.register(glomod.CORALBOW, new Identifier("pulling"),
        (stack, world, entity) -> {
          return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
        });
    FabricModelPredicateProviderRegistry.register(glomod.NEWBOW, new Identifier("pull"), (stack, world, entity) -> {
      if (entity == null) {
        return 0.0F;
      } else {
        return entity.getActiveItem() != stack ? 0.0F
            : (float) (stack.getMaxUseTime() - entity.getItemUseTimeLeft()) / 20.0F;
      }
    });
    FabricModelPredicateProviderRegistry.register(glomod.NEWBOW, new Identifier("pulling"), (stack, world, entity) -> {
      return entity != null && entity.isUsingItem() && entity.getActiveItem() == stack ? 1.0F : 0.0F;
    });
  }

}