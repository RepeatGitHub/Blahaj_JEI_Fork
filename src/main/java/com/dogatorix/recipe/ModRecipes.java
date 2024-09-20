package com.dogatorix.recipe;

import com.dogatorix.Blahaj;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
        DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Blahaj.MOD_ID);

    public static final RegistryObject<RecipeSerializer<YarnSpinningRecipe>> YARN_SPINNING_SERIALIZER =
        SERIALIZERS.register("yarn_spinning", () -> YarnSpinningRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
