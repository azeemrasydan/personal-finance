package azeem.play.models;

public class Asset {
    private String name;
    protected double value;
    private AssetType type;

    // Constructors, getters, and setters

    // Default constructor
    public Asset() {
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public AssetType getType() {
        return type;
    }

    public void setType(AssetType type) {
        this.type = type;
    }

    // Other methods as needed
}
