package kagenao.royalfoods;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.item.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;

import java.util.HashMap;


public class RoyalFoods implements ModInitializer, GameStartEntrypoint {
    public static final String MODID = "royalfoods";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static final ItemBuilder itemBuilder = new ItemBuilder(MODID);

	public static Item raw_mutton;
	public static Item cooked_mutton;
    @Override
    public void onInitialize() {
		raw_mutton = itemBuilder.setStackSize(4).build(new FoodItem("raw_mutton", "royalfoods:item/raw_mutton", 19000));
        cooked_mutton = itemBuilder.setStackSize(4).build(new FoodItem("cooked_mutton", "royalfoods:item/cooked_mutton", 19001));
		LOGGER.info("RoyalFoods initialized.");

    }

	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}


}
