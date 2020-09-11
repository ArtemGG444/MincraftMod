
package net.mcreator.mechacraft.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.mechacraft.item.BasicBateryItem;
import net.mcreator.mechacraft.MechacraftModElements;

@MechacraftModElements.ModElement.Tag
public class MechaCraftItemGroup extends MechacraftModElements.ModElement {
	public MechaCraftItemGroup(MechacraftModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmecha_craft") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BasicBateryItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
