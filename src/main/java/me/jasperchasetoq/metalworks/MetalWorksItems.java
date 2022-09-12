package me.jasperchasetoq.metalworks;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public class MetalWorksItems {
    public static final NestedItemGroup MetalWorks_General = new NestedItemGroup(new NamespacedKey(MetalWorks.getInstance(), "METALWORKS_GENERAL"), new CustomItemStack(Material.ANVIL, "&f金属工艺"));
    public static final SubItemGroup Helmets = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HELMETS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HELMET, "&f金属工艺 - 头盔"));
    public static final SubItemGroup Chestplates = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "CHESTPLATES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_CHESTPLATE, "&f金属工艺 - 胸甲"));
    public static final SubItemGroup Leggings = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "LEGGINGS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_LEGGINGS, "&f金属工艺 - 护腿"));
    public static final SubItemGroup Boots = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "BOOTS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_BOOTS, "&f金属工艺 - 靴子"));
    public static final SubItemGroup Swords = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SWORDS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_SWORD, "&f金属工艺 - 剑"));
    public static final SubItemGroup Pickaxes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "PICKAXES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_PICKAXE, "&f金属工艺 - 镐"));
    public static final SubItemGroup Axes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "AXES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_AXE, "&f金属工艺 - 斧"));
    public static final SubItemGroup Shovels = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SHOVELS"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_SHOVEL, "&f金属工艺 - 锹"));
    public static final SubItemGroup Hoes = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "HOES"), MetalWorks_General, new CustomItemStack(Material.DIAMOND_HOE, "&f金属工艺 - 锄"));
    public static final SubItemGroup Shields = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "SHIELDS"), MetalWorks_General, new CustomItemStack(Material.SHIELD, "&f金属工艺 - 盾"));
    public static final SubItemGroup Bows = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "BOWS"), MetalWorks_General, new CustomItemStack(Material.BOW, "&f金属工艺 - 弓"));
    public static final SubItemGroup Crossbows = new SubItemGroup(new NamespacedKey(MetalWorks.getInstance(), "CROSSBOWS"), MetalWorks_General, new CustomItemStack(Material.CROSSBOW, "&f金属工艺 - 弩"));

    public static final SlimefunItemStack JC_GOLD_4K_HELMET = new SlimefunItemStack("JC_GOLD_4K_HELMET", Material.GOLDEN_HELMET, "&f金头盔 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_CHESTPLATE = new SlimefunItemStack("JC_GOLD_4_CHESTPLATE", Material.GOLDEN_CHESTPLATE, "&f金盔甲 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_LEGGINGS = new SlimefunItemStack("JC_GOLD_4K_LEGGINGS", Material.GOLDEN_LEGGINGS, "&f金护腿 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_BOOTS = new SlimefunItemStack("JC_GOLD_4K_BOOTS", Material.GOLDEN_BOOTS, "&f金靴子 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_SWORD = new SlimefunItemStack("JC_GOLD_4K_SWORDS", Material.GOLDEN_SWORD, "&f金剑 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_PICKAXE = new SlimefunItemStack("JC_GOLD_4K_PICKAXE", Material.GOLDEN_PICKAXE, "&f金镐 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_AXE = new SlimefunItemStack("JC_GOLD_4K_AXE", Material.GOLDEN_AXE, "&f金斧 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_SHOVEL = new SlimefunItemStack("JC_GOLD_4K_SHOVEL", Material.GOLDEN_AXE, "&f金锹 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_HOE = new SlimefunItemStack("JC_GOLD_4K_HOE", Material.GOLDEN_HOE, "&f金锄 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_SHIELD = new SlimefunItemStack("JC_GOLD_4K_SHIELD", Material.SHIELD, "&f金盾 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_BOW = new SlimefunItemStack("JC_GOLD_4K_BOW", Material.BOW, "&f金弓 &7(4克拉)");
    public static final SlimefunItemStack JC_GOLD_4K_CROSSBOW = new SlimefunItemStack("JC_GOLD_4K_CROSSBOW", Material.CROSSBOW, "&f金弩 &7(4克拉)");

}
