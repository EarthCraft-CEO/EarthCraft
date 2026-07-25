package com.earthcraft.earthcore.process.result;

import com.earthcraft.earthcore.energy.EnergyTransfer;
import com.earthcraft.earthcore.universe.entity.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessResult {

    private final boolean successful;

    private final List<Entity> inputs =
            new ArrayList<>();

    private final List<Entity> outputs =
            new ArrayList<>();

    private final List<Entity> byproducts =
            new ArrayList<>();

    private final List<EnergyTransfer> energyTransfers =
            new ArrayList<>();

    public ProcessResult(boolean successful) {
        this.successful = successful;
    }

    public boolean successful() {
        return successful;
    }

    public List<Entity> inputs() {
        return Collections.unmodifiableList(inputs);
    }

    public List<Entity> outputs() {
        return Collections.unmodifiableList(outputs);
    }

    public List<Entity> byproducts() {
        return Collections.unmodifiableList(byproducts);
    }

    public List<EnergyTransfer> energyTransfers() {
        return Collections.unmodifiableList(energyTransfers);
    }

    public void addInput(Entity entity) {
        inputs.add(entity);
    }

    public void addOutput(Entity entity) {
        outputs.add(entity);
    }

    public void addByproduct(Entity entity) {
        byproducts.add(entity);
    }

    public void addEnergyTransfer(EnergyTransfer transfer) {
        energyTransfers.add(transfer);
    }

}