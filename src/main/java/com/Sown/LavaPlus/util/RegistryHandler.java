package com.Sown.LavaPlus.util;

import com.Sown.LavaPlus.LavaPlus;
import com.Sown.LavaPlus.blocks.*;
import com.Sown.LavaPlus.items.ItemBase;
import com.Sown.LavaPlus.util.enums.ModItemTiers;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new net.minecraftforge.registries.DeferredRegister<>(ForgeRegistries.ITEMS, LavaPlus.MOD_ID);


    public static final DeferredRegister<Block> BLOCKS = new net.minecraftforge.registries.DeferredRegister<>(ForgeRegistries.BLOCKS, LavaPlus.MOD_ID);


    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items
    public static final RegistryObject<Item> LAVABRICK = ITEMS.register("lava_brick",  ItemBase::new);
    public static final RegistryObject<Item> INFERNALSWORD = ITEMS.register("infernal_sword", () -> new SwordItem(ModItemTiers.Base, 8, 1.6f,
            new Item.Properties().group(LavaPlus.TAB)));


    // Blocks
    public static final RegistryObject<Block> LAVABRICKS_BLOCK = BLOCKS.register("lava_bricks",  LavaBricksBlock::new);
    public static final RegistryObject<Block> LAVAFURNACE_BLOCK = BLOCKS.register("lava_furnace",  LavaFurnaceBlock::new);
    public static final RegistryObject<Block> WOODENCRATE_BLOCK = BLOCKS.register("wooden_crate",  WoodenCrate::new);
    public static final RegistryObject<Block> LAVAGENERATOR_BLOCK = BLOCKS.register("lava_generator",  LavaGeneratorBlock::new);

    // Block Items
    public static final RegistryObject<Item> LAVABRICKS_BLOCK_ITEM = ITEMS.register("lava_bricks", () -> new BlockItemBase(LAVABRICKS_BLOCK.get()));
    public static final RegistryObject<Item> LAVAFURNACE_BLOCK_ITEM = ITEMS.register("lava_furnace", () -> new BlockItemBase(LAVAFURNACE_BLOCK.get()));
    public static final RegistryObject<Item> WOODENCRATE_BLOCK_ITEM = ITEMS.register("wooden_crate", () -> new BlockItemBase(WOODENCRATE_BLOCK.get()));
    public static final RegistryObject<Item> LAVAGENERATOR_BLOCK_ITEM = ITEMS.register("lava_generator", () -> new BlockItemBase(LAVAGENERATOR_BLOCK.get()));
}
    public static final Block LAVAGENERATOR = null;

    @SubscribeEvent
    public void registerBlocks(final RegistryEvent.Register<Block> event){
        event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK)).setRegistryName("lavagenerator"));
    }