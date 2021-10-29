
package net.mcreator.moreore.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.moreore.itemgroup.MoreOreItemGroup;
import net.mcreator.moreore.MoreOreModElements;

@MoreOreModElements.ModElement.Tag
public class ChlorophyllAxeItem extends MoreOreModElements.ModElement {
	@ObjectHolder("more_ore:chlorophyll_axe")
	public static final Item block = null;
	public ChlorophyllAxeItem(MoreOreModElements instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2056;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ChlorophyllIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(MoreOreItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("chlorophyll_axe"));
	}
}
