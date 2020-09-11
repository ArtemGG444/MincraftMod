package net.mcreator.mechacraft.procedures;

import net.mcreator.mechacraft.MechacraftModElements;

import java.util.Map;

@MechacraftModElements.ModElement.Tag
public class MechaFurnaceUpdateTickProcedure extends MechacraftModElements.ModElement {
	public MechaFurnaceUpdateTickProcedure(MechacraftModElements instance) {
		super(instance, 50);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
	}
}
