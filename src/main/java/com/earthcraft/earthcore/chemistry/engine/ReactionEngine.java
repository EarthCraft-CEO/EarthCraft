package com.earthcraft.earthcore.chemistry.engine;

import com.earthcraft.earthcore.chemistry.reaction.ReactionCondition;
import com.earthcraft.earthcore.chemistry.reaction.ReactionDefinition;
import com.earthcraft.earthcore.chemistry.reaction.ReactionEvent;
import com.earthcraft.earthcore.simulation.SimulationContext;

public class ReactionEngine {

    public ReactionEvent attemptReaction(
            ReactionDefinition definition,
            SimulationContext context
    ) {

        for (ReactionCondition condition : definition.conditions()) {

            if (!condition.isSatisfied(context)) {
                return null;
            }

        }

        return new ReactionEvent(
                definition,
                context.clock().time().seconds()
        );

    }

}