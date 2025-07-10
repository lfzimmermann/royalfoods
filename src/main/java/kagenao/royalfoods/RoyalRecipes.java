package kagenao.royalfoods;

import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.List;

import static kagenao.royalfoods.RoyalFoods.LOGGER;

public class RoyalRecipes implements RecipeEntrypoint {
	public static RecipeNamespace ROYAL_FOODS = new RecipeNamespace();

	public RoyalRecipes(){};

	@Override
	public void onRecipesReady() {
		LOGGER.info("Loading SI recipes...");
		this.initializeRecipes();
	}

	@Override
	public void initNamespaces() {
		LOGGER.info("Loading SI recipe namespaces...");
		RecipeBuilder.initNameSpace("royalfoods");
		RecipeBuilder.getRecipeNamespace("royalfoods");
		// listItemGroups();
		Registries.ITEM_GROUPS.register("royalfoods:item/food", Registries.stackListOf(RoyalFoods.raw_mutton, RoyalFoods.cooked_mutton));
		LOGGER.info("SI recipe namespaces initialized.");
	}

	private static void listItemGroups() {
		for (List<ItemStack> is : Registries.ITEM_GROUPS){
			LOGGER.info(Registries.ITEM_GROUPS.getKey(is));
		}
	}

	public void initializeRecipes(){
		RecipeBuilder.Furnace("royalfoods")
			.setInput(RoyalFoods.raw_mutton)
			.create("raw_mutton_to_cooked_mutton", RoyalFoods.cooked_mutton.getDefaultStack());

		LOGGER.info("Initialized recipes.");
	}

	public void registerNamespaces() {
	}

	public void resetGroups() {
	}

}
