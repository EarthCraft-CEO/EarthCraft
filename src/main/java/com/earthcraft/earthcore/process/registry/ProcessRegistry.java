package com.earthcraft.earthcore.process.registry;

import com.earthcraft.earthcore.process.Process;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessRegistry {

    private final List<Process> processes = new ArrayList<>();

    public void register(Process process) {
        processes.add(process);
    }

    public List<Process> processes() {
        return Collections.unmodifiableList(processes);
    }

}