package com.earthcraft.earthcore.universe.time;

public final class SimulationTime {

    private long seconds;

    public SimulationTime() {
        this.seconds = 0;
    }

    public long seconds() {
        return seconds;
    }

    public void advance(long seconds) {
        this.seconds += seconds;
    }

    public long minutes() {
        return seconds / 60;
    }

    public long hours() {
        return seconds / 3600;
    }

    public long days() {
        return seconds / 86400;
    }

    public long years() {
        return seconds / 31_536_000L;
    }
}