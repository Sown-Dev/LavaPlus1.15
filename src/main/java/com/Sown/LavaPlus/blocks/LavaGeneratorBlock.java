package com.Sown.LavaPlus.blocks;


import com.Sown.LavaPlus.init.ModTileEntityTypes;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;

public class LavaGeneratorBlock extends Block {

    public LavaGeneratorBlock() {
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f, 7.0f)
                .sound(SoundType.METAL)
                .harvestLevel(2)
                .harvestTool(ToolType.PICKAXE));
    }


 /*   @Override
    public boolean hasTileEntity(BlockState state) {
        return true;
    }

    @Override
    public TileEntity createTileEntity(BlockState state, IBlockReader world) {
        return ModTileEntityTypes.LAVA_FURNACE.get().create();

    }*/



}
