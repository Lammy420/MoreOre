
package net.mcreator.moreore.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.moreore.itemgroup.MoreOreItemGroup;
import net.mcreator.moreore.MoreOreModElements;

@MoreOreModElements.ModElement.Tag
public class BloodflareShovelItem extends MoreOreModElements.ModElement {
	@ObjectHolder("more_ore:bloodflare_shovel")
	public static final Item block = null;
	public BloodflareShovelItem(MoreOreModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3056;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 2f;
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
		}, 1, -3f, new Item.Properties().group(MoreOreItemGroup.tab)) {
		}.setRegistryName("bloodflare_shovel"));
	}
}
