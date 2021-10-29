
package net.mcreator.moreore.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreore.itemgroup.MoreOreItemGroup;
import net.mcreator.moreore.MoreOreModElements;

@MoreOreModElements.ModElement.Tag
public class ChlorophyllSwordItem extends MoreOreModElements.ModElement {
	@ObjectHolder("more_ore:chlorophyll_sword")
	public static final Item block = null;
	public ChlorophyllSwordItem(MoreOreModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2056;
			}

			public float getEfficiency() {
				return 1f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 22;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ChlorophyllIngotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(MoreOreItemGroup.tab)) {
		}.setRegistryName("chlorophyll_sword"));
	}
}
