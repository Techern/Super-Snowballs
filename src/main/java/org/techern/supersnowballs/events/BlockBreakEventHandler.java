package org.techern.supersnowballs.events;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.techern.supersnowballs.SuperSnowballsMod;

/**
 * Handles block breaking events
 *
 * @since 0.9
 */
@Mod.EventBusSubscriber(modid = SuperSnowballsMod.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BlockBreakEventHandler {

    /**
     * Handle {@link net.minecraftforge.event.level.BlockEvent.BreakEvent}s
     *
     * @param event The {@link net.minecraftforge.event.level.BlockEvent.BreakEvent}
     *
     * @since 0.9
     */
    @SubscribeEvent
    public static void handleBlockBreak(BlockEvent.BreakEvent event) {
        if (event.getState().is(Blocks.POWDER_SNOW)) {
            Block.popResource(event.getPlayer().getLevel(), event.getPos(), new ItemStack(Items.SNOWBALL, 9));
        }
    }
}
