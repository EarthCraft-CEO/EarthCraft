package com.earthcraft.earthcore.energy;

import com.earthcraft.earthcore.universe.entity.Entity;

public class Energy extends Entity {

    private final EnergyType type;
    private final double amount;

    public Energy(
            EnergyType type,
            double amount
    ) {
        this.type = type;
        this.amount = amount;
    }

    public EnergyType type() {
        return type;
    }

    public double amount() {
        return amount;
    }

}