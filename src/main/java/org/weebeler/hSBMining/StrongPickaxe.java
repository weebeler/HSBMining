package org.weebeler.hSBMining.packets;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.weebeler.hSBMining.Pickaxe;

public class StrongPickaxe extends Pickaxe {

    public StrongPickaxe() {
        super(new ItemStack(Material.BLAZE_ROD), "STRONG", 2500, "Strong Pickaxe");
    }
}
