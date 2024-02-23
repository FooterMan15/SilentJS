package dev.footer.silentjs.kubejs;

import dev.latvian.mods.kubejs.registry.BuilderBase;
import dev.latvian.mods.kubejs.registry.RegistryInfo;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.silentchaos512.gear.api.data.material.MaterialBuilder;

public class MaterialBuilderJS extends BuilderBase<MaterialBuilder> {
    public transient int tier;
    public transient TagKey<Item> tag;

    public MaterialBuilderJS(ResourceLocation i) {
        super(i);
    }

    @Override
    public RegistryInfo getRegistryType() {
        return Plugin.SILENT_MATERIAL;
    }

    @Override
    public MaterialBuilder createObject() {
        return new MaterialBuilder(id, tier, tag);
    }
}
