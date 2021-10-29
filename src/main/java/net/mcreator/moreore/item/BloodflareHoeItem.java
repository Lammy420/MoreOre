
package net.mcreator.moreore.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.moreore.itemgroup.MoreOreItemGroup;
import net.mcreator.moreore.MoreOreModElements;

@MoreOreModElements.ModElement.Tag
public class BloodflareHoeItem extends MoreOreModElements.ModElement {
	@ObjectHolder("more_ore:bloodflare_hoe")
	public static final Item block = null;
	public BloodflareHoeItem(MoreOreModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 3056;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 1f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 10;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BloodflareIngotItem.block));
			}
		}, 0, -3f, new Item.Properties().group(MoreOreItemGroup.tab)) {
		}.setRegistryName("bloodflare_hoe"));
	}
}
