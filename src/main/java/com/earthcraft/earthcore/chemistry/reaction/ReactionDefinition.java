package com.earthcraft.earthcore.chemistry.reaction;

import com.earthcraft.earthcore.energy.Energy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReactionDefinition {

    private final String name;

    private final List<String> reactants =
            new ArrayList<>();

    private final List<String> products =
            new ArrayList<>();

    private final List<ReactionCondition> conditions =
            new ArrayList<>();

    private final List<Energy> energyChanges =
            new ArrayList<>();

    public ReactionDefinition(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public List<String> reactants() {
        return Collections.unmodifiableList(reactants);
    }

    public List<String> products() {
        return Collections.unmodifiableList(products);
    }

    public List<ReactionCondition> conditions() {
        return Collections.unmodifiableList(conditions);
    }

    public List<Energy> energyChanges() {
        return Collections.unmodifiableList(energyChanges);
    }

    public void addReactant(String reactant) {
        reactants.add(reactant);
    }

    public void addProduct(String product) {
        products.add(product);
    }

    public void addCondition(ReactionCondition condition) {
        conditions.add(condition);
    }

    public void addEnergy(Energy energy) {
        energyChanges.add(energy);
    }

}