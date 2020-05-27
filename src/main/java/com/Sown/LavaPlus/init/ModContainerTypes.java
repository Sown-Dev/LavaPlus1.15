package com.Sown.LavaPlus.init;

import com.Sown.LavaPlus.LavaPlus;
import com.Sown.LavaPlus.blocks.WoodenCrate;
import com.Sown.LavaPlus.container.WoodenCrateContainer;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Item;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

    public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, LavaPlus.MOD_ID);

    public static final RegistryObject<ContainerType<WoodenCrateContainer>> WOODEN_CRATE = CONTAINER_TYPES.register("wooden_crate", () -> IForgeContainerType.create(WoodenCrateContainer::new));


}
