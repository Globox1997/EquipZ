package net.equip;

import net.equip.Items.SwordItems;
import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.BinomialLootTableRange;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.util.Identifier;

public class eloot {

    public static final Identifier[] LONE = new Identifier[] { LootTables.SIMPLE_DUNGEON_CHEST,
            LootTables.SHIPWRECK_SUPPLY_CHEST, LootTables.STRONGHOLD_CORRIDOR_CHEST };
    public static final Identifier[] LTWO = new Identifier[] { LootTables.HERO_OF_THE_VILLAGE_TOOLSMITH_GIFT_GAMEPLAY };
    public static final Identifier[] LTHREE = new Identifier[] { LootTables.BURIED_TREASURE_CHEST };

    private static boolean isone(Identifier lootTable) {
        for (Identifier id : LONE) {
            if (id.equals(lootTable)) {
                return true;
            }
        }
        return false;
    }

    private static boolean istwo(Identifier lootTable) {
        for (Identifier id : LTWO) {
            if (id.equals(lootTable)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isthree(Identifier lootTable) {
        for (Identifier id : LTHREE) {
            if (id.equals(lootTable)) {
                return true;
            }
        }
        return false;
    }

    public static void init() {

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (isone(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(new BinomialLootTableRange(5, 0.3f)).with(ItemEntry.builder(glomod.OBSIDIANINGOT));

                supplier.pool(poolBuilder);
            }
        });

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (isone(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(new BinomialLootTableRange(1, 0.3f)).with(ItemEntry.builder(glomod.PURPLEDIAMOND));

                supplier.pool(poolBuilder);
            }
        });

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (isone(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(new BinomialLootTableRange(1, 0.2f)).with(ItemEntry.builder(glomod.NEWDIA));

                supplier.pool(poolBuilder);
            }
        });

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (istwo(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(new BinomialLootTableRange(1, 0.05f)).with(ItemEntry.builder(SwordItems.Knighter));

                supplier.pool(poolBuilder);
            }
        });

        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, supplier, setter) -> {
            if (isthree(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(new BinomialLootTableRange(1, 0.3f)).with(ItemEntry.builder(SwordItems.Flow));

                supplier.pool(poolBuilder);
            }
        });

    }
}