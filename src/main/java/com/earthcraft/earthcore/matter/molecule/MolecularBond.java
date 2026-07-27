package com.earthcraft.earthcore.matter.molecule;

/**
 * MolecularBond represents a covalent bond between two atoms in a molecule.
 * It specifies which atoms (by index in the molecule's composition) are bonded
 * and the type/order of the bond.
 */
public final class MolecularBond {

    private final int atomIndex1;
    private final int atomIndex2;
    private final BondOrder order;

    /**
     * Creates a molecular bond between two atoms.
     *
     * @param atomIndex1 index of the first atom in the composition
     * @param atomIndex2 index of the second atom in the composition
     * @param order the bond order (single, double, triple, aromatic)
     * @throws IllegalArgumentException if indices are negative or equal
     */
    public MolecularBond(int atomIndex1, int atomIndex2, BondOrder order) {
        if (atomIndex1 < 0 || atomIndex2 < 0) {
            throw new IllegalArgumentException(
                    "Atom indices must be non-negative, got: " + atomIndex1 + ", " + atomIndex2
            );
        }
        if (atomIndex1 == atomIndex2) {
            throw new IllegalArgumentException(
                    "Cannot create a bond between an atom and itself (index: " + atomIndex1 + ")"
            );
        }
        this.atomIndex1 = Math.min(atomIndex1, atomIndex2);
        this.atomIndex2 = Math.max(atomIndex1, atomIndex2);
        this.order = order;
    }

    /**
     * Returns the index of the first atom in this bond.
     * This index is always less than or equal to atomIndex2 for consistency.
     */
    public int atomIndex1() {
        return atomIndex1;
    }

    /**
     * Returns the index of the second atom in this bond.
     * This index is always greater than or equal to atomIndex1 for consistency.
     */
    public int atomIndex2() {
        return atomIndex2;
    }

    /**
     * Returns the bond order (single, double, triple, aromatic).
     */
    public BondOrder order() {
        return order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MolecularBond)) return false;
        MolecularBond that = (MolecularBond) o;
        return atomIndex1 == that.atomIndex1 &&
               atomIndex2 == that.atomIndex2 &&
               order == that.order;
    }

    @Override
    public int hashCode() {
        return 31 * (31 * atomIndex1 + atomIndex2) + order.hashCode();
    }

    @Override
    public String toString() {
        return "Bond(" + atomIndex1 + "-" + atomIndex2 + ", " + order + ")";
    }
}
