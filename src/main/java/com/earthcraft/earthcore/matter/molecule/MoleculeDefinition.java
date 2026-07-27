package com.earthcraft.earthcore.matter.molecule;

import com.earthcraft.earthcore.definition.Definition;
import com.earthcraft.earthcore.matter.element.Element;
import com.earthcraft.earthcore.properties.PropertyMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * MoleculeDefinition represents the immutable specification of a molecular compound.
 * It defines the atomic composition, bonding structure, and properties of a molecule type.
 *
 * This is a Definition (blueprint), not a runtime Instance. Multiple Molecule instances
 * can share the same MoleculeDefinition, following the Definition → Instance architecture.
 *
 * Example usage:
 * <pre>
 * MoleculeDefinition water = new MoleculeDefinition("Water", "H2O");
 * Element hydrogen = PeriodicTable.element(1);
 * Element oxygen = PeriodicTable.element(8);
 * water.addAtom(hydrogen, 2);
 * water.addAtom(oxygen, 1);
 * water.addBond(new MolecularBond(0, 2, BondOrder.SINGLE));
 * water.addBond(new MolecularBond(1, 2, BondOrder.SINGLE));
 * </pre>
 */
public final class MoleculeDefinition extends Definition {

    private final String name;
    private final String formula;
    
    private final List<AtomicComponent> composition = new ArrayList<>();
    private final List<MolecularBond> bonds = new ArrayList<>();
    private final PropertyMap properties = new PropertyMap();

    /**
     * Creates a new MoleculeDefinition with a name and chemical formula.
     *
     * @param name the common name of the molecule (e.g., "Water", "Carbon Dioxide")
     * @param formula the chemical formula (e.g., "H2O", "CO2")
     * @throws IllegalArgumentException if name or formula is null or empty
     */
    public MoleculeDefinition(String name, String formula) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Molecule name cannot be null or empty");
        }
        if (formula == null || formula.isEmpty()) {
            throw new IllegalArgumentException("Molecule formula cannot be null or empty");
        }
        this.name = name;
        this.formula = formula;
    }

    /**
     * Returns the common name of this molecule.
     */
    public String name() {
        return name;
    }

    /**
     * Returns the chemical formula of this molecule.
     */
    public String formula() {
        return formula;
    }

    /**
     * Returns an immutable list of atomic components in this molecule.
     * Each component represents a unique element and its count in the molecule.
     */
    public List<AtomicComponent> composition() {
        return Collections.unmodifiableList(composition);
    }

    /**
     * Returns an immutable list of bonds in this molecule.
     */
    public List<MolecularBond> bonds() {
        return Collections.unmodifiableList(bonds);
    }

    /**
     * Returns the property map for this molecule definition.
     * Properties are mutable and can be modified after definition.
     */
    public PropertyMap properties() {
        return properties;
    }

    /**
     * Adds an atomic component (atom) to this molecule's composition.
     *
     * @param element the element type
     * @param count the number of atoms of this element in the molecule
     * @throws IllegalArgumentException if count is not positive
     */
    public void addAtom(Element element, int count) {
        composition.add(new AtomicComponent(element, count));
    }

    /**
     * Adds a bond between atoms in this molecule.
     *
     * @param bond the bond to add
     */
    public void addBond(MolecularBond bond) {
        bonds.add(bond);
    }

    /**
     * Returns the total number of atoms in this molecule.
     */
    public int totalAtomCount() {
        int count = 0;
        for (AtomicComponent component : composition) {
            count += component.count();
        }
        return count;
    }

    /**
     * Returns the total number of elements (unique element types) in this molecule.
     */
    public int elementTypeCount() {
        return composition.size();
    }

    @Override
    public String toString() {
        return "MoleculeDefinition(" + name + ", " + formula + ")";
    }
}
