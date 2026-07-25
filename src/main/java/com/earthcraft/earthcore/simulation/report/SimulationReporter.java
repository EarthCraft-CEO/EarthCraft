package com.earthcraft.earthcore.simulation.report;

import com.earthcraft.earthcore.process.result.ProcessResult;
import com.earthcraft.earthcore.simulation.history.SimulationHistory;

public class SimulationReporter {

    private final SimulationHistory history;

    public SimulationReporter(SimulationHistory history) {
        this.history = history;
    }

    public void printReport() {

        for (ProcessResult result : history.results()) {

            System.out.println(
                    "Process Result:"
            );

            System.out.println(
                    "Successful: " + result.successful()
            );

            System.out.println(
                    "Inputs: " + result.inputs()
            );

            System.out.println(
                    "Outputs: " + result.outputs()
            );

            System.out.println(
                    "Byproducts: " + result.byproducts()
            );

            System.out.println(
                    "Energy Transfers: "
                            + result.energyTransfers()
            );

        }

    }

}