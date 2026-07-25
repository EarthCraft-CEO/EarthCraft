package com.earthcraft.earthcore.chemistry.registry;

import com.earthcraft.earthcore.chemistry.reaction.ReactionDefinition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReactionRegistry {

    private final List<ReactionDefinition> reactions =
            new ArrayList<>();

    public void register(
            ReactionDefinition reaction
    ) {
        reactions.add(reaction);
    }

    public List<ReactionDefinition> reactions() {
        return Collections.unmodifiableList(reactions);
    }

}