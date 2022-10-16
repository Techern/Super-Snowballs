package org.techern.supersnowballs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SnowballItem;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(SuperSnowballsMod.MODID)
public class SuperSnowballsMod
{
    public static final String MODID = "supersnowballs";

    /**
     * The {@link DeferredRegister<Item>} of additional {@link Item}s added by this mod
     *
     * @since 0.9
     */
    public static final DeferredRegister<Item> ADDITIONAL_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    /**
     * The {@link DeferredRegister<Item>} of {@link Item}s replacing those in vanilla Minecraft
     *
     * @since 0.9
     */
    private static final DeferredRegister<Item> VANILLA_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "minecraft");

    /**
     * A vanilla {@link SnowballItem}
     *
     * @since 0.9
     */
    private static final RegistryObject<Item> VANILLA_SNOWBALL = VANILLA_ITEMS.register("snowball", () -> new SnowballItem(new Item.Properties().stacksTo(64).tab(CreativeModeTab.TAB_MISC)));

    public SuperSnowballsMod()
    {
        VANILLA_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ADDITIONAL_ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
