
package net.mcreator.mechacraft.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.mechacraft.itemgroup.MechaCraftItemGroup;
import net.mcreator.mechacraft.MechacraftModElements;

@MechacraftModElements.ModElement.Tag
public class BasicBateryItem extends MechacraftModElements.ModElement {
	@ObjectHolder("mechacraft:basic_batery")
	public static final Item block = null;
	public BasicBateryItem(MechacraftModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MechaCraftItemGroup.tab).maxStackSize(1));
			setRegistryName("basic_batery");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
