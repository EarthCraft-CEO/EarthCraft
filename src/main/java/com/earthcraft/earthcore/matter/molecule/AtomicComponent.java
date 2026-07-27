package com.earthcraft.earthcore.matter.molecule;

import com.earthcraft.earthcore.matter.element.Element;

/**
 * AtomicComponent represents a specific atom type and its count within a molecule.
 * This immutable record captures the stoichiometric component of a molecular composition.
 */
public final class AtomicComponent {

    private final Element element;
    private final int count;

    /**
     * Creates an atomic component.
     *
     * @param element the element type
     * @param count the number of atoms of this element
     * @throws IllegalArgumentException if count is not positive
     */
    public AtomicComponent(Element element, int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Atom count must be positive, got: " + count);
        }
        this.element = element;
        this.count = count;
    }

    /**
     * Returns the element of this component.
     */
    public Element element() {
        return element;
    }

    /**
     * Returns the count of atoms of this element.
     */
    public int count() {
        return count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AtomicComponent)) return false;
        AtomicComponent that = (AtomicComponent) o;
        return count == that.count && element.equals(that.element);
    }

    @Override
    public int hashCode() {
        return 31 * element.hashCode() + count;
    }

    @Override
    public String toString() {
        return element.symbol() + (count > 1 ? count : "");
    }
}
