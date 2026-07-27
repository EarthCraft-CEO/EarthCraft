package com.earthcraft.earthcore.matter.molecule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MoleculeRegistry maintains a central registry of all defined molecules in the simulation.
 * It provides lookup and management capabilities for MoleculeDefinitions.
 *
 * This registry follows a similar pattern to ReactionRegistry, centralizing access to
 * molecule definitions and enabling validation and lookup by formula or name.
 */
public class MoleculeRegistry {

    private final List<MoleculeDefinition> definitions = new ArrayList<>();
    private final Map<String, MoleculeDefinition> formulaIndex = new HashMap<>();
    private final Map<String, MoleculeDefinition> nameIndex = new HashMap<>();

    /**
     * Registers a new molecule definition in the registry.
     *
     * @param definition the molecule definition to register
     * @throws IllegalArgumentException if a definition with the same formula is already registered
     */
    public void register(MoleculeDefinition definition) {
        if (formulaIndex.containsKey(definition.formula())) {
            throw new IllegalArgumentException(
                    "Molecule with formula '" + definition.formula() + "' is already registered"
            );
        }
        definitions.add(definition);
        formulaIndex.put(definition.formula(), definition);
        nameIndex.put(definition.name(), definition);
    }

    /**
     * Retrieves a molecule definition by its chemical formula.
     *
     * @param formula the chemical formula to look up
     * @return the matching MoleculeDefinition, or null if not found
     */
    public MoleculeDefinition byFormula(String formula) {
        return formulaIndex.get(formula);
    }

    /**
     * Retrieves a molecule definition by its name.
     *
     * @param name the name to look up
     * @return the matching MoleculeDefinition, or null if not found
     */
    public MoleculeDefinition byName(String name) {
        return nameIndex.get(name);
    }

    /**
     * Returns an immutable list of all registered molecule definitions.
     */
    public List<MoleculeDefinition> definitions() {
        return Collections.unmodifiableList(definitions);
    }

    /**
     * Returns the number of registered molecule definitions.
     */
    public int size() {
        return definitions.size();
    }

    /**
     * Checks if a molecule definition with the given formula is registered.
     */
    public boolean contains(String formula) {
        return formulaIndex.containsKey(formula);
    }
}
