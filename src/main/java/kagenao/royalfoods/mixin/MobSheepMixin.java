package kagenao.royalfoods.mixin;

import kagenao.royalfoods.RoyalFoods;
import net.minecraft.core.entity.animal.MobAnimal;
import net.minecraft.core.entity.animal.MobSheep;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(value = MobSheep.class, remap = false)
public class MobSheepMixin extends MobAnimal {
	public MobSheepMixin(World world) {
		super(world);
	}

	@Inject(method = "dropDeathItems", at = @At(value = "INVOKE", target = "Lnet/minecraft/core/entity/animal/MobAnimal;dropDeathItems()V", shift = At.Shift.AFTER))
	private void dropDeathItems(CallbackInfo ci) {
		Random rand = new Random();
		float f = rand.nextFloat();

		if (f < 0.7) {
			ItemStack is = RoyalFoods.raw_mutton.getDefaultStack();
			dropItem(is, 0.0f);
		}

	}
}
