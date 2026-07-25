package com.earthcraft.earthcore.matter.material;

import com.earthcraft.earthcore.definition.Definition;

public class MaterialDefinition extends Definition {

    private final String name;

    public MaterialDefinition(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

}