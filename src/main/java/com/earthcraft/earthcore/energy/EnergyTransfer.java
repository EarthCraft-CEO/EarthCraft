package com.earthcraft.earthcore.energy;

public class EnergyTransfer {

    private final Energy source;
    private final Energy destination;

    public EnergyTransfer(
            Energy source,
            Energy destination
    ) {
        this.source = source;
        this.destination = destination;
    }

    public Energy source() {
        return source;
    }

    public Energy destination() {
        return destination;
    }

}