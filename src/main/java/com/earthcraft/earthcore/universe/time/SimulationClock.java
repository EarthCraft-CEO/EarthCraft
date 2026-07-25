package com.earthcraft.earthcore.universe.time;

public class SimulationClock {

    private final SimulationTime time = new SimulationTime();

    public void tick(long seconds) {
        time.advance(seconds);
    }

    public SimulationTime time() {
        return time;
    }
}