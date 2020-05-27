package com.Sown.LavaPlus.tileentity;

import com.Sown.LavaPlus.init.ModTileEntityTypes;
import com.Sown.LavaPlus.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.fluid.IFluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.ITickableTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public class LavaGeneratorTileEntity extends TileEntity implements ITickableTileEntity {

    public int x, y, z, tick;
    boolean init = false;
    public boolean working= false;
    boolean initialized= false;

    public LavaGeneratorTileEntity(final TileEntityType<?> tileEntityTypeIn) {
        super(tileEntityTypeIn);
    }
    public LavaGeneratorTileEntity() {
        this(ModTileEntityTypes.LAVA_GENERATOR.get());
        init();
    }


    public void tick() {
        if (!initialized)
            init();
        tick++;
        if (tick == 40) {
            tick = 0;
            if (y > 2)
                execute();
        }
    }
    private void init() {
        initialized = true;
        BlockPos below = new BlockPos(this.pos.getX(),this.pos.getY()-1,this.pos.getZ());
        if(world.getBlockState(below).getBlock().toString().equals(RegistryHandler.LAVAGENERATOR_BLOCK.toString())  ){
            working = true;
            destroyBlock(below, true, null);
        }

        tick = 0;
    }
    private void execute() {

    }
    private boolean destroyBlock(BlockPos pos, boolean dropBlock, @Nullable Entity entity) {
        BlockState blockstate = world.getBlockState(pos);
        if (blockstate.isAir(world, pos))
            return false;
        else {
            IFluidState ifluidstate = world.getFluidState(pos);
            world.playEvent(2001, pos, Block.getStateId(blockstate));
            if (dropBlock) {
                TileEntity tileentity = blockstate.hasTileEntity() ? world.getTileEntity(pos) : null;
                Block.spawnDrops(blockstate, world, this.pos.add(0, 1.5, 0), tileentity, entity, ItemStack.EMPTY);
            }
            return world.setBlockState(pos, ifluidstate.getBlockState(), 3);
        }
    }


}
