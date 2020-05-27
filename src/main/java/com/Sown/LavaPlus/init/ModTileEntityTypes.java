package com.Sown.LavaPlus.init;

import com.Sown.LavaPlus.LavaPlus;
import com.Sown.LavaPlus.blocks.*;
import com.Sown.LavaPlus.blocks.WoodenCrate;
//import com.Sown.LavaPlus.tileentity.LavaFurnaceTileEntity;
import com.Sown.LavaPlus.tileentity.WoodenCrateTileEntity;
import com.Sown.LavaPlus.util.RegistryHandler;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

    public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
            ForgeRegistries.TILE_ENTITIES, LavaPlus.MOD_ID);



 /*   public static final RegistryObject<TileEntityType<LavaFurnaceTileEntity>> LAVA_FURNACE = TILE_ENTITY_TYPES.register(
            "lava furnace", () -> TileEntityType.Builder
                    .create(LavaFurnaceTileEntity::new, RegistryHandler.LAVAFURNACE_BLOCK.get() ).build(null));*/

    public static final RegistryObject<TileEntityType<WoodenCrateTileEntity>> WOODEN_CRATE = TILE_ENTITY_TYPES.register(
            "wooden_crate", () -> TileEntityType.Builder
                    .create(WoodenCrateTileEntity::new, RegistryHandler.WOODENCRATE_BLOCK.get() ).build(null));

    public static final RegistryObject<TileEntityType<WoodenCrateTileEntity>> LAVA_GENERATOR = TILE_ENTITY_TYPES.register(
            "lava_generator", () -> TileEntityType.Builder
                    .create(WoodenCrateTileEntity::new, RegistryHandler.LAVAGENERATOR_BLOCK.get() ).build(null));



}
