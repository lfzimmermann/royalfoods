package kagenao.royalfoods;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static kagenao.royalfoods.RoyalFoods.*;

@Environment(EnvType.CLIENT)
public class RoyalModels implements ModelEntrypoint {
	public RoyalModels(){

	}

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		LOGGER.info("Initializing Item Models...");
		ModelHelper.setItemModel(raw_mutton, () -> {
			ItemModelStandard model = new ItemModelStandard(raw_mutton, "royalfoods");
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp("royalfoods", "item/raw_mutton"));
			return model;
		});
		ModelHelper.setItemModel(cooked_mutton, () -> {
			ItemModelStandard model = new ItemModelStandard(raw_mutton, "royalfoods");
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp("royalfoods", "item/cooked_mutton"));
			return model;
		});
		LOGGER.info("Initialized Item Models.");
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}




}
