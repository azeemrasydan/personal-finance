package azeem.play.finance;

public class Liability {
    private String name;
    private double amount;
    private LiabilityType type;

    // Constructors, getters, and setters

    // Default constructor
    public Liability() {
    }

    // Parameterized constructor
    public Liability(String name, double amount, LiabilityType type) {
        this.name = name;
        this.amount = amount;
        this.type = type;
    }

    // Getters and setters for all attributes

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LiabilityType getType() {
        return type;
    }

    public void setType(LiabilityType type) {
        this.type = type;
    }

    // Other methods as needed
}
