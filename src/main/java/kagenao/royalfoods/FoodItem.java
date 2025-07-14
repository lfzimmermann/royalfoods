package kagenao.royalfoods;

import net.minecraft.core.item.ItemFood;

public class FoodItem extends ItemFood {
	public FoodItem(String translationKey, String namespaceId, int id, int healAmount, int ticksPerHeal, boolean favouriteWolfMeat, int maxStackSize){
		super(translationKey, namespaceId, id, healAmount, ticksPerHeal, favouriteWolfMeat, maxStackSize);
	}

}
