package com.Sown.LavaPlus.items;

import com.Sown.LavaPlus.LavaPlus;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(LavaPlus.TAB));
    }
}
