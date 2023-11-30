package azeem.play.models;

public abstract class WorldEntity {
    protected World world;

    public WorldEntity(World world) {
        this.world = world;
    }

    public World world() {
        return world;
    }
}
