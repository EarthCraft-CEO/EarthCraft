package com.earthcraft.earthcore.simulation.history;

import com.earthcraft.earthcore.process.result.ProcessResult;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimulationHistory {

    private final List<ProcessResult> results = new ArrayList<>();

    public void record(ProcessResult result) {
        results.add(result);
    }

    public List<ProcessResult> results() {
        return Collections.unmodifiableList(results);
    }

}