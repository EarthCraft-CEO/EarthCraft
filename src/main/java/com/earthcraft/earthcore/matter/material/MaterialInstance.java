package com.earthcraft.earthcore.matter.material;

import com.earthcraft.earthcore.universe.entity.Entity;

public class MaterialInstance extends Entity {

    private final MaterialDefinition definition;

    private final MaterialState state =
            new MaterialState();

    public MaterialInstance(
            MaterialDefinition definition
    ) {
        this.definition = definition;
    }

    public MaterialDefinition definition() {
        return definition;
    }

    public MaterialState state() {
        return state;
    }

}