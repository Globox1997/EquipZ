package net.equip.Items;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import net.equip.Items.Sword.*;

public class SwordItems {

    public static final ToolMaterial AXEMATERIAL = new AxeMaterial();
    public static final ToolMaterial ENDERMATERIAL = new EnderMaterial();
    public static final ToolMaterial BLUEMATERIAL = new BlueMaterial();
    public static final ToolMaterial KNIGHTERMATERIAL = new KnighterMaterial();

    public static final Item AxeDark = register("axedark", new AxeDark((AXEMATERIAL)));
    public static final Item AxeRed = register("axered", new AxeRed((AXEMATERIAL)));
    public static final Item Ender = register("ender", new Ender((ENDERMATERIAL)));
    public static final Item Rapier = register("rapier", new Rapier((ENDERMATERIAL)));
    public static final Item Flow = register("flow", new Flow((BLUEMATERIAL)));
    public static final Item Blue = register("blue", new Blue((BLUEMATERIAL)));
    public static final Item Knighter = register("knighter", new Knighter((KNIGHTERMATERIAL)));

    private static Item register(String id, Item item) {
        return register(new Identifier("equip", id), item);
    }

    private static Item register(Identifier id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem) item).appendBlocks(Item.BLOCK_ITEMS, item);
        }

        return Registry.register(Registry.ITEM, id, item);
    }

    public static void init() {
    }
}