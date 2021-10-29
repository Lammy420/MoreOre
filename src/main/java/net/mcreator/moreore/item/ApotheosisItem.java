
package net.mcreator.moreore.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.moreore.procedures.ApotheosisRightClickedOnBlockProcedure;
import net.mcreator.moreore.itemgroup.MoreOreItemGroup;
import net.mcreator.moreore.MoreOreModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@MoreOreModElements.ModElement.Tag
public class ApotheosisItem extends MoreOreModElements.ModElement {
	@ObjectHolder("more_ore:apotheosis")
	public static final Item block = null;
	public ApotheosisItem(MoreOreModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 25000;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 96f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 500;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, 0.8f, new Item.Properties().group(MoreOreItemGroup.tab).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u00A72\u00A7oA sword fallen from the heavens,"));
				list.add(new StringTextComponent("\u00A72\u00A7oforged in the divine power of Hope"));
				list.add(new StringTextComponent("Legendary Drop"));
				list.add(new StringTextComponent("Developer Item"));
			}

			@Override
			public ActionResultType onItemUse(ItemUseContext context) {
				ActionResultType retval = super.onItemUse(context);
				World world = context.getWorld();
				BlockPos pos = context.getPos();
				PlayerEntity entity = context.getPlayer();
				Direction direction = context.getFace();
				BlockState blockstate = world.getBlockState(pos);
				int x = pos.getX();
				int y = pos.getY();
				int z = pos.getZ();
				ItemStack itemstack = context.getItem();
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					$_dependencies.put("x", x);
					$_dependencies.put("y", y);
					$_dependencies.put("z", z);
					$_dependencies.put("world", world);
					ApotheosisRightClickedOnBlockProcedure.executeProcedure($_dependencies);
				}
				return retval;
			}

			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("apotheosis"));
	}
}
