package com.earthcraft.earthcore.chemistry.reaction;

import com.earthcraft.earthcore.simulation.SimulationContext;

public interface ReactionCondition {

    boolean isSatisfied(
            SimulationContext context
    );

    String description();

}