package com.earthcraft.earthcore.chemistry.reaction;

import com.earthcraft.earthcore.simulation.SimulationContext;

public class TemperatureCondition implements ReactionCondition {

    private final double minimumTemperature;

    public TemperatureCondition(double minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    @Override
    public boolean isSatisfied(SimulationContext context) {

        // Placeholder until the environment temperature
        // system is connected.

        return true;
    }

    @Override
    public String description() {
        return "Temperature >= " + minimumTemperature + " K";
    }

    public double minimumTemperature() {
        return minimumTemperature;
    }

}