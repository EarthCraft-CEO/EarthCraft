package com.earthcraft.earthcore.matter.element;

import java.util.HashMap;
import java.util.Map;

public final class PeriodicTable {

    private static final Map<Integer, Element> ELEMENTS = new HashMap<>();

    private PeriodicTable() {

    }

    public static void register(Element element) {
        ELEMENTS.put(element.atomicNumber(), element);
    }

    public static Element get(int atomicNumber) {
        return ELEMENTS.get(atomicNumber);
    }

}