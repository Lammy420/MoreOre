package net.mcreator.moreore.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreore.MoreOreMod;

import java.util.Map;

public class MeteoriteOreEntityCollidesInTheBlockProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoreOreMod.LOGGER.warn("Failed to load dependency entity for procedure MeteoriteOreEntityCollidesInTheBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).attackEntityFrom(new DamageSource("melting").setDamageBypassesArmor(), (float) 1);
		}
	}
}
