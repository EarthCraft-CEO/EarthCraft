package com.earthcraft.earthcore.universe.entity;

import java.util.UUID;

public abstract class Entity {

    private final UUID id = UUID.randomUUID();

    public UUID id() {
        return id;
    }

}