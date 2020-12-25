package epicsquid.traverse.setup;

import epicsquid.traverse.init.ModBlocks;
import net.minecraft.block.ComposterBlock;
import net.minecraft.item.AxeItem;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("deprecation")
public class ModSetup {
  public static void init(FMLCommonSetupEvent event) {
    event.enqueueWork(() -> {
      AxeItem.BLOCK_STRIPPING_MAP = new HashMap<>(AxeItem.BLOCK_STRIPPING_MAP);
      AxeItem.BLOCK_STRIPPING_MAP.put(ModBlocks.FIR_LOG.get(), ModBlocks.STRIPPED_FIR_LOG.get());
      AxeItem.BLOCK_STRIPPING_MAP.put(ModBlocks.FIR_WOOD.get(), ModBlocks.STRIPPED_FIR_WOOD.get());
      ComposterBlock.CHANCES.put(ModBlocks.BROWN_AUTUMNAL_LEAVES.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.BROWN_AUTUMNAL_SAPLING.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.ORANGE_AUTUMNAL_LEAVES.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.ORANGE_AUTUMNAL_SAPLING.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.RED_AUTUMNAL_LEAVES.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.RED_AUTUMNAL_SAPLING.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.YELLOW_AUTUMNAL_LEAVES.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.YELLOW_AUTUMNAL_SAPLING.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.FIR_LEAVES.get().asItem(), 0.3f);
      ComposterBlock.CHANCES.put(ModBlocks.FIR_SAPLING.get().asItem(), 0.3f);
      TileEntityType.SIGN.validBlocks = new HashSet<>(TileEntityType.SIGN.validBlocks);
      TileEntityType.SIGN.validBlocks.add(ModBlocks.FIR_SIGN.get());
      TileEntityType.SIGN.validBlocks.add(ModBlocks.FIR_WALL_SIGN.get());
    });
  }


}
