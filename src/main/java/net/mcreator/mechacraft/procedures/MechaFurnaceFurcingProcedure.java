package net.mcreator.mechacraft.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.mechacraft.MechacraftModElements;

import java.util.Map;
import java.util.HashMap;

@MechacraftModElements.ModElement.Tag
public class MechaFurnaceFurcingProcedure extends MechacraftModElements.ModElement {
	public MechaFurnaceFurcingProcedure(MechacraftModElements instance) {
		super(instance, 54);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MechaFurnaceFurcing!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MechaFurnaceFurcing!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MechaFurnaceFurcing!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MechaFurnaceFurcing!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			MechaFurnaceUpdateTickProcedure.executeProcedure($_dependencies);
		}
	}
}
