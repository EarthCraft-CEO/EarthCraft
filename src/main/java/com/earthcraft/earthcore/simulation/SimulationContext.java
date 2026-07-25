package com.earthcraft.earthcore.simulation;

import com.earthcraft.earthcore.universe.time.SimulationClock;

public class SimulationContext {

    private final SimulationClock clock;

    public SimulationContext(SimulationClock clock) {
        this.clock = clock;
    }

    public SimulationClock clock() {
        return clock;
    }

}