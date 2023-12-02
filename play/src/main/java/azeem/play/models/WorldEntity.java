package azeem.play.models;

public abstract class WorldEntity implements BoundToTime {
    protected World world;

    public WorldEntity(World world) {
        this.world = world;
        world.addDayPassedObserver(this);
    }

    public World world() {
        return world;
    }
}
