package com.earthcraft.earthcore.simulation;

import com.earthcraft.earthcore.bootstrap.EarthCoreBootstrap;
import com.earthcraft.earthcore.process.Process;
import com.earthcraft.earthcore.process.registry.ProcessRegistry;
import com.earthcraft.earthcore.simulation.history.SimulationHistory;
import com.earthcraft.earthcore.universe.time.SimulationClock;

public class SimulationEngine {

    private final SimulationClock clock =
            new SimulationClock();

    private final SimulationContext context =
            new SimulationContext(clock);

    private final ProcessRegistry registry =
            new ProcessRegistry();

    private final SimulationHistory history =
            new SimulationHistory();

    public SimulationEngine() {

        EarthCoreBootstrap.initialize(registry);

    }

    public void registerProcess(Process process) {
        registry.register(process);
    }

    public void update(long seconds) {

        clock.tick(seconds);

        for (Process process : registry.processes()) {

            if (process.canRun(context)) {

                history.record(
                        process.update(context, seconds)
                );

            }

        }

    }

    public SimulationContext context() {
        return context;
    }

    public ProcessRegistry registry() {
        return registry;
    }

    public SimulationHistory history() {
        return history;
    }

}