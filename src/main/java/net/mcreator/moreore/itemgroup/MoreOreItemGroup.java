
package net.mcreator.moreore.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.moreore.item.GleamingGemItem;
import net.mcreator.moreore.MoreOreModElements;

@MoreOreModElements.ModElement.Tag
public class MoreOreItemGroup extends MoreOreModElements.ModElement {
	public MoreOreItemGroup(MoreOreModElements instance) {
		super(instance, 81);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmore_ore") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GleamingGemItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
