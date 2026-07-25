package com.earthcraft.earthcore.process;

import com.earthcraft.earthcore.energy.Energy;
import com.earthcraft.earthcore.energy.EnergyType;
import com.earthcraft.earthcore.process.result.ProcessResult;
import com.earthcraft.earthcore.simulation.SimulationContext;

public class HeatTransferProcess implements Process {

    @Override
    public String name() {
        return "Heat Transfer";
    }

    @Override
    public boolean canRun(SimulationContext context) {
        return true;
    }

    @Override
    public ProcessResult update(
            SimulationContext context,
            long seconds
    ) {

        ProcessResult result = new ProcessResult(true);

        Energy thermalEnergy = new Energy(
                EnergyType.THERMAL,
                0.0
        );

        result.addInput(thermalEnergy);

        return result;
    }

}