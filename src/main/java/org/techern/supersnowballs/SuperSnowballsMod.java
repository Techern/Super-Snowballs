package org.techern.supersnowballs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(SuperSnowballsMod.MODID)
public class SuperSnowballsMod
{
    public static final String MODID = "supersnowballs";

    public SuperSnowballsMod()
    {
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }
}
