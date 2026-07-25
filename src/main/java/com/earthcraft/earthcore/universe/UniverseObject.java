package earthcraft.earthcore.universe;

import java.util.UUID;

public abstract class UniverseObject {

    private final UUID id = UUID.randomUUID();

    public UUID id() {
        return id;
    }

}