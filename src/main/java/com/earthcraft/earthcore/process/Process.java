package com.earthcraft.earthcore.process;

import com.earthcraft.earthcore.process.result.ProcessResult;
import com.earthcraft.earthcore.simulation.SimulationContext;

public interface Process {

    String name();

    boolean canRun(SimulationContext context);

    ProcessResult update(SimulationContext context, long seconds);

}