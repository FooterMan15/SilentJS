package dev.footer.silentjs.kubejs;

import dev.footer.silentjs.SilentJS;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.registry.RegistryInfo;
import net.minecraft.resources.RegistryOps;
import net.minecraft.resources.ResourceKey;
import net.silentchaos512.gear.api.data.material.MaterialBuilder;
import net.silentchaos512.gear.api.material.IMaterial;
import net.silentchaos512.gear.gear.material.MaterialManager;

public class Plugin extends KubeJSPlugin {
    public static final RegistryInfo<MaterialBuilder> SILENT_MATERIAL = RegistryInfo.of(//TODO: Registry Key
             MaterialBuilderJS.class);

    @Override
    public void init() {
        SILENT_MATERIAL.addType("basic", MaterialBuilderJS.class, MaterialBuilderJS::new);
    }
}

