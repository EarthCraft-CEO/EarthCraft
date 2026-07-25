package com.earthcraft.earthcore.chemistry.reaction;

import com.earthcraft.earthcore.energy.Energy;
import com.earthcraft.earthcore.universe.entity.Entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reaction {

    private final String name;

    private final List<Entity> reactants =
            new ArrayList<>();

    private final List<Entity> products =
            new ArrayList<>();

    private final List<Energy> energyChanges =
            new ArrayList<>();

    public Reaction(String name) {
        this.name = name;
    }

    public String name() {
        return name;
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