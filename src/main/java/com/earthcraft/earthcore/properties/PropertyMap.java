package com.earthcraft.earthcore.properties;

import com.earthcraft.earthcore.properties.PropertyKey;

import java.util.HashMap;
import java.util.Map;

public class PropertyMap {

    private final Map<PropertyKey<?>, Object> values;

    public PropertyMap() {
        values = new HashMap<>();
    }

    public <T> void set(
            PropertyKey<T> key,
            T value
    ) {
        values.put(key, value);
    }

    @SuppressWarnings("unchecked")
    public <T> T get(
            PropertyKey<T> key
    ) {
        return (T) values.get(key);
    }

    public boolean has(
            PropertyKey<?> key
    ) {
        return values.containsKey(key);
    }

    public PropertyMap copy() {

        PropertyMap copy = new PropertyMap();

        copy.values.putAll(values);

        return copy;
    }

}