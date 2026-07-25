package com.earthcraft.earthcore.properties;

public final class PropertyKey<T> {

    private final String id;
    private final Class<T> type;

    public PropertyKey(String id, Class<T> type) {
        this.id = id;
        this.type = type;
    }

    public String id() {
        return id;
    }

    public Class<T> type() {
        return type;
    }
}