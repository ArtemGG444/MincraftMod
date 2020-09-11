package net.mcreator.mechacraft.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;

import net.mcreator.mechacraft.MechacraftModElements;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

@MechacraftModElements.ModElement.Tag
public class CopperEnergBatteryUpdateTickProcedure extends MechacraftModElements.ModElement {
	public CopperEnergBatteryUpdateTickProcedure(MechacraftModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure CopperEnergBatteryUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure CopperEnergBatteryUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure CopperEnergBatteryUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure CopperEnergBatteryUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double Down = 0;
		double North = 0;
		double West = 0;
		double South = 0;
		double East = 0;
		if ((new Object() {
			public boolean canReceiveEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
			Down = (double) (new Object() {
				public int extractEnergySimulate(BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(new BlockPos((int) x, (int) y, (int) z), (int) 1000));
			Down = (double) (new Object() {
				public int receiveEnergySimulate(BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(new BlockPos((int) x, (int) (y + 1), (int) z), (int) (Down)));
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) (Down);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) (y + 1), (int) z));
				int _amount = (int) (Down);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if ((new Object() {
			public boolean canReceiveEnergy(BlockPos pos) {
				AtomicBoolean _retval = new AtomicBoolean(false);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN).ifPresent(capability -> _retval.set(capability.canReceive()));
				return _retval.get();
			}
		}.canReceiveEnergy(new BlockPos((int) x, (int) (y + 1), (int) z)))) {
			East = (double) (new Object() {
				public int extractEnergySimulate(BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, null)
								.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
					return _retval.get();
				}
			}.extractEnergySimulate(new BlockPos((int) x, (int) y, (int) z), (int) 1000));
			East = (double) (new Object() {
				public int receiveEnergySimulate(BlockPos pos, int _amount) {
					AtomicInteger _retval = new AtomicInteger(0);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null)
						_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN)
								.ifPresent(capability -> _retval.set(capability.receiveEnergy(_amount, true)));
					return _retval.get();
				}
			}.receiveEnergySimulate(new BlockPos((int) x, (int) (y + 1), (int) z), (int) (East)));
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) (East);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) (y + 1), (int) z));
				int _amount = (int) (East);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.DOWN).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}
