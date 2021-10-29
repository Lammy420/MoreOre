
package net.mcreator.moreore.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.moreore.procedures.HehehheProcedure;
import net.mcreator.moreore.itemgroup.MoreOreItemGroup;
import net.mcreator.moreore.MoreOreModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@MoreOreModElements.ModElement.Tag
public class GobletOfTheHeavensItem extends MoreOreModElements.ModElement {
	@ObjectHolder("more_ore:goblet_of_the_heavens")
	public static final Item block = null;
	public GobletOfTheHeavensItem(MoreOreModElements instance) {
		super(instance, 84);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(MoreOreItemGroup.tab).maxStackSize(1).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(20).saturation(4f).setAlwaysEdible().build()));
			setRegistryName("goblet_of_the_heavens");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 100;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.DRINK;
		}

		@Override
		public net.minecraft.util.SoundEvent getEatSound() {
			return net.minecraft.util.SoundEvents.ENTITY_GENERIC_DRINK;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("A combination of all of the gods powers, drinking this may cause immortality"));
			list.add(new StringTextComponent("Legendary Item"));
			list.add(new StringTextComponent("Developer Item"));
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				HehehheProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
