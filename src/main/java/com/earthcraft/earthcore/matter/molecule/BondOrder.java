package com.earthcraft.earthcore.matter.molecule;

/**
 * BondOrder represents the multiplicity of a covalent bond between atoms.
 * Bond order indicates the number of electron pairs shared between atoms.
 */
public enum BondOrder {
    /**
     * Single bond (one shared electron pair).
     */
    SINGLE(1),

    /**
     * Double bond (two shared electron pairs).
     */
    DOUBLE(2),

    /**
     * Triple bond (three shared electron pairs).
     */
    TRIPLE(3),

    /**
     * Aromatic bond (delocalized bonding in aromatic systems).
     */
    AROMATIC(1.5);

    private final double bondMultiplicity;

    BondOrder(double bondMultiplicity) {
        this.bondMultiplicity = bondMultiplicity;
    }

    /**
     * Returns the numeric bond multiplicity.
     */
    public double multiplicity() {
        return bondMultiplicity;
    }
}
