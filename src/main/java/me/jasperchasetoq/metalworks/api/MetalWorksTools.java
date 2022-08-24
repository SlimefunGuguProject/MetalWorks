package me.jasperchasetoq.metalworks.api;

import org.bukkit.Material;


enum MetalWorksTools {

        Wood(
                Material.WOODEN_PICKAXE,
                Material.WOODEN_AXE,
                Material.WOODEN_SHOVEL,
                Material.WOODEN_HOE),

        Stone(
                Material.STONE_PICKAXE,
                Material.STONE_AXE,
                Material.STONE_SHOVEL,
                Material.STONE_HOE),

        Gold(
                Material.GOLDEN_PICKAXE,
                Material.GOLDEN_AXE,
                Material.GOLDEN_SHOVEL,
                Material.GOLDEN_HOE),

        Iron(
                Material.IRON_PICKAXE,
                Material.IRON_AXE,
                Material.IRON_SHOVEL,
                Material.IRON_HOE),

        Diamond(
                Material.DIAMOND_PICKAXE, 
                Material.DIAMOND_AXE,
                Material.DIAMOND_SHOVEL,
                Material.DIAMOND_HOE),

        Netherite(
                Material.NETHERITE_PICKAXE,
                Material.NETHERITE_AXE,
                Material.NETHERITE_SHOVEL,
                Material.NETHERITE_HOE);

        public final Material pickaxe;
        public final Material axe;
        public final Material shovel;
        public final Material hoe;

        MetalWorksTools(Material pickaxe, Material axe, Material shovel, Material hoe) {
            this.pickaxe = pickaxe;
            this.axe = axe;
            this.shovel = shovel;
            this.hoe = hoe;
        }
        public Material GetPickaxe(){
            return pickaxe;
        }
        public Material GetAxe(){
            return axe;
        }
        public Material GetShovel(){
            return shovel;
        }
        public Material GetHoe(){
            return hoe;
        }

    }



