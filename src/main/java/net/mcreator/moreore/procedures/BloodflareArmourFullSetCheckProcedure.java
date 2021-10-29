package net.mcreator.moreore.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.moreore.item.BloodflareArmourItem;
import net.mcreator.moreore.MoreOreMod;

import java.util.Map;

public class BloodflareArmourFullSetCheckProcedure {
	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				MoreOreMod.LOGGER.warn("Failed to load dependency entity for procedure BloodflareArmourFullSetCheck!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == BloodflareArmourItem.helmet)) {
			if ((((entity instanceof LivingEntity)
					? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 2))
					: ItemStack.EMPTY).getItem() == BloodflareArmourItem.body)) {
				if ((((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
						: ItemStack.EMPTY).getItem() == BloodflareArmourItem.legs)) {
					if ((((entity instanceof LivingEntity)
							? ((LivingEntity) entity)
									.getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
							: ItemStack.EMPTY).getItem() == BloodflareArmourItem.boots)) {
						if (entity instanceof LivingEntity)
							((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 60, (int) 1, (false), (false)));
					} else {
						return (false);
					}
				} else {
					return (false);
				}
			} else {
				return (false);
			}
		} else {
			return (false);
		}
		return (false);
	}
}
