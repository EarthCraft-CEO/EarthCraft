package com.earthcraft.earthcore.matter.molecule;

import com.earthcraft.earthcore.matter.Matter;

/**
 * Molecule is a runtime instance of a molecular compound.
 * It represents a specific, stateful occurrence of a molecule in the simulation.
 *
 * A Molecule holds a reference to its MoleculeDefinition (the blueprint),
 * following the Definition → Instance architecture pattern.
 * 
 * This allows the simulation to:
 * - Define molecules once (MoleculeDefinition)
 * - Instantiate them many times (Molecule)
 * - Share definition data while maintaining separate instance state
 */
public class Molecule extends Matter {

    private final MoleculeDefinition definition;

    /**
     * Creates a new Molecule instance based on a MoleculeDefinition.
     *
     * @param definition the blueprint for this molecule
     * @throws IllegalArgumentException if definition is null
     */
    public Molecule(MoleculeDefinition definition) {
        if (definition == null) {
            throw new IllegalArgumentException("Molecule definition cannot be null");
        }
        this.definition = definition;
    }

    /**
     * Returns the definition (blueprint) for this molecule.
     * The definition contains the immutable specification: composition, bonds, properties.
     */
    public MoleculeDefinition definition() {
        return definition;
    }

    /**
     * Returns the name of this molecule (from its definition).
     */
    public String name() {
        return definition.name();
    }

    /**
     * Returns the chemical formula of this molecule (from its definition).
     */
    public String formula() {
        return definition.formula();
    }

    /**
     * Returns the total number of atoms in this molecule (from its definition).
     */
    public int totalAtomCount() {
        return definition.totalAtomCount();
    }

    /**
     * Returns the number of unique element types in this molecule (from its definition).
     */
    public int elementTypeCount() {
        return definition.elementTypeCount();
    }

    @Override
    public String toString() {
        return "Molecule(id=" + id() + ", " + definition.name() + ", " + definition.formula() + ")";
    }
}
