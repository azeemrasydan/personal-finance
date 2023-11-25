package azeem.play.models;

import java.util.Date;

public class Income {
    private String name;
    private double amount;
    private Date date;

    // Constructors, getters, and setters

    // Default constructor
    public Income() {
    }

    // Parameterized constructor
    public Income(String name, double amount, Date date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Other methods as needed
}
