package azeem.play.finance;

import azeem.play.world.World;
import azeem.play.world.WorldEntity;

public abstract class Asset extends WorldEntity {
    private String name;
    protected double value;
    private AssetType type;

    // Parameterized constructor
    public Asset(String name, double value, AssetType type, World world) {
        super(world);
        this.name = name;
        this.value = value;
        this.type = type;
    }

    // Getters and setters for all attributes

    public String name() {
        return name;
    }

    public double value() {
        return value;
    }

    public AssetType type() {
        return type;
    }
}
