package com.dogatorix.recipe;

import java.util.function.Supplier;

import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.world.level.Level;

@ParametersAreNonnullByDefault
public class YarnSpinningRecipe extends ProcessingRecipe<YarnSpinningRecipe.YarnSpinningWrapper> {
    public static class YarnSpinningWrapper extends RecipeWrapper {
  		public YarnSpinningWrapper() {
  			super(new ItemStackHandler(1));
  		}
  	}
}
