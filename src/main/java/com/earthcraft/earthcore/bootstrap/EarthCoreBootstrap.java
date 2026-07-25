package com.earthcraft.earthcore.bootstrap;

import com.earthcraft.earthcore.process.HeatTransferProcess;
import com.earthcraft.earthcore.process.Process;
import com.earthcraft.earthcore.process.registry.ProcessRegistry;

public final class EarthCoreBootstrap {

    private EarthCoreBootstrap() {

    }

    public static void initialize(ProcessRegistry registry) {

        Process heatTransfer = new HeatTransferProcess();

        registry.register(heatTransfer);

    }

}