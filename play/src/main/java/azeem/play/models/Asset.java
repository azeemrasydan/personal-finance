package azeem.play.models;

public class Asset {
    private String name;
    protected double value;
    private AssetType type;

    // Parameterized constructor
    public Asset(String name, double value, AssetType type) {
        this.name = name;
        this.value = value;
        this.type = type;
    }

    // Getters and setters for all attributes

    public String getName() {
        return name;
    }

    public double value() {
        return value;
    }

    public AssetType type() {
        return type;
    }

}
