package com.earthcraft.earthcore.test;

import com.earthcraft.earthcore.simulation.SimulationEngine;
import com.earthcraft.earthcore.simulation.report.SimulationReporter;

public class SimulationTest {

    public static void main(String[] args) {

        SimulationEngine engine =
                new SimulationEngine();

        engine.update(1);

        SimulationReporter reporter =
                new SimulationReporter(
                        engine.history()
                );

        reporter.printReport();

    }

}