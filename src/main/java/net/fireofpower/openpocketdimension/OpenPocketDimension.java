package net.fireofpower.openpocketdimension;

import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(net.fireofpower.openpocketdimension.OpenPocketDimension.MODID)
public class OpenPocketDimension {
    public static final String MODID = "openpocketdimension";
    public static final Logger LOGGER = LogUtils.getLogger();

    public OpenPocketDimension(IEventBus modEventBus, ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        //Probably don't need this but ill leave it commented just in case
        //modContainer.registerConfig(ModConfig.Type.SERVER, Config.SPEC, String.format("%s-server.toml", net.fireofpower.openpocketdimension.OpenPocketDimension.MODID));
    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }

    public static ResourceLocation id(@NotNull String path)
    {
        return ResourceLocation.fromNamespaceAndPath(net.fireofpower.openpocketdimension.OpenPocketDimension.MODID, path);
    }
}
