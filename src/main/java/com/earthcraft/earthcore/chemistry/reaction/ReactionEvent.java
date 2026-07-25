package com.earthcraft.earthcore.chemistry.reaction;

import com.earthcraft.earthcore.energy.Energy;
import com.earthcraft.earthcore.universe.entity.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReactionEvent {

    private final ReactionDefinition definition;

    private final long simulationTime;

    private final List<Entity> reactants =
            new ArrayList<>();

    private final List<Entity> products =
            new ArrayList<>();

    private final List<Energy> energyChanges =
            new ArrayList<>();

    public ReactionEvent(
            ReactionDefinition definition,
            long simulationTime
    ) {
        this.definition = definition;
        this.simulationTime = simulationTime;
    }

    public ReactionDefinition definition() {
        return definition;
    }

    public long simulationTime() {
        return simulationTime;
    }

    public List<Entity> reactants() {
        return Collections.unmodifiableList(reactants);
    }

    public List<Entity> products() {
        return Collections.unmodifiableList(products);
    }

    public List<Energy> energyChanges() {
        return Collections.unmodifiableList(energyChanges);
    }

    public void addReactant(Entity entity) {
        reactants.add(entity);
    }

    public void addProduct(Entity entity) {
        products.add(entity);
    }

    public void addEnergy(Energy energy) {
        energyChanges.add(energy);
    }

}