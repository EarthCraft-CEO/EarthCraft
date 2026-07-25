package com.earthcraft.earthcore.chemistry.manager;

import com.earthcraft.earthcore.chemistry.engine.ReactionEngine;
import com.earthcraft.earthcore.chemistry.reaction.ReactionDefinition;
import com.earthcraft.earthcore.chemistry.reaction.ReactionEvent;
import com.earthcraft.earthcore.chemistry.registry.ReactionRegistry;
import com.earthcraft.earthcore.simulation.SimulationContext;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReactionManager {

    private final ReactionRegistry registry;
    private final ReactionEngine engine;

    public ReactionManager(
            ReactionRegistry registry,
            ReactionEngine engine
    ) {
        this.registry = registry;
        this.engine = engine;
    }

    public List<ReactionEvent> update(
            SimulationContext context
    ) {

        List<ReactionEvent> events =
                new ArrayList<>();

        for (ReactionDefinition definition : registry.reactions()) {

            ReactionEvent event =
                    engine.attemptReaction(
                            definition,
                            context
                    );

            if (event != null) {
                events.add(event);
            }

        }

        return Collections.unmodifiableList(events);

    }

}