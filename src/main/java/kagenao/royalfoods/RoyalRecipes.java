package kagenao.royalfoods;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.DataLoader;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryFurnace;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class RoyalRecipes implements RecipeEntrypoint {
	public static RecipeNamespace ROYAL_FOODS = new RecipeNamespace();

	public RoyalRecipes(){};

	@Override
	public void onRecipesReady() {
		RoyalFoods.LOGGER.info("Loading SI recipes...");
		this.load();
	}

	@Override
	public void initNamespaces() {
		RoyalFoods.LOGGER.info("Loading SI recipe namespaces...");
		this.resetGroups();
		this.registerNamespaces();
	}

	public void load(){
		RoyalFoods.LOGGER.info("load...");
		DataLoader.loadRecipesFromFile("/assets/royalfoods/recipes/furnace.json");
		RoyalFoods.LOGGER.info("finished loading...");
		RoyalFoods.LOGGER.info("{} recipes in {} groups.", ROYAL_FOODS.getAllRecipes().size(), ROYAL_FOODS.size());

	}

	public void registerNamespaces() {
		Registries.RECIPES.register("royalfoods", ROYAL_FOODS);
		(new RecipeGroup<>(new RecipeEntryFurnace().getInput()).
	}

	public void resetGroups() {
		Registries.RECIPES.unregister("royalfoods");
		ROYAL_FOODS = new RecipeNamespace();
	}

}
