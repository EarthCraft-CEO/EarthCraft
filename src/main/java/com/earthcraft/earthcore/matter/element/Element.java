package com.earthcraft.earthcore.matter.element;

import com.earthcraft.earthcore.definition.Definition;
import com.earthcraft.earthcore.properties.PropertyMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Element extends Definition {

    private final int atomicNumber;
    private final String symbol;
    private final String name;
    private final ElementCategory category;
    private final int period;
    private final int group;

    private final PropertyMap properties = new PropertyMap();
    private final List<Isotope> isotopes = new ArrayList<>();

    public Element(
            int atomicNumber,
            String symbol,
            String name,
            ElementCategory category,
            int period,
            int group
    ) {
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.name = name;
        this.category = category;
        this.period = period;
        this.group = group;
    }

    public int atomicNumber() {
        return atomicNumber;
    }

    public String symbol() {
        return symbol;
    }

    public String name() {
        return name;
    }

    public ElementCategory category() {
        return category;
    }

    public int period() {
        return period;
    }

    public int group() {
        return group;
    }

    public PropertyMap properties() {
        return properties;
    }

    public List<Isotope> isotopes() {
        return Collections.unmodifiableList(isotopes);
    }

    public void addIsotope(Isotope isotope) {
        isotopes.add(isotope);
    }
}