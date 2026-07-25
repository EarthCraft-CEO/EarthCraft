package com.earthcraft.earthcore.properties;

public final class PropertyKeys {

    private PropertyKeys() {
    }

    public static final PropertyKey<Double> MASS =
            new PropertyKey<>("mass", Double.class);

    public static final PropertyKey<Double> VOLUME =
            new PropertyKey<>("volume", Double.class);

    public static final PropertyKey<Double> TEMPERATURE =
            new PropertyKey<>("temperature", Double.class);

    public static final PropertyKey<Double> DENSITY =
            new PropertyKey<>("density", Double.class);

    public static final PropertyKey<Double> MELTING_POINT =
            new PropertyKey<>("melting_point", Double.class);

    public static final PropertyKey<Double> BOILING_POINT =
            new PropertyKey<>("boiling_point", Double.class);

    public static final PropertyKey<Double> ATOMIC_MASS =
            new PropertyKey<>("atomic_mass", Double.class);
    public static final PropertyKey<Double> SPECIFIC_HEAT =
            new PropertyKey<>("specific_heat", Double.class);
    public static final PropertyKey<Double> THERMAL_CONDUCTIVITY =
            new PropertyKey<>("thermal_conductivity", Double.class);
}