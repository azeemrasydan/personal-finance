package azeem.play.models;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class Income {
    private String name;
    private double amount;
    private Date date;

    // Constructors, getters, and setters

    // Parameterized constructor
    public Income(String name, double amount, Date date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    // Getters and setters for all attributes

    public String name() {
        return name;
    }

    public double amount() {
        return amount;
    }

    public Date date() {
        return date;
    }

    public LocalDateTime localDateTime() {
        return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }

    public boolean similarLocalDateTimeWith(LocalDateTime dateTime) {
        return localDateTime().getYear() == dateTime.getYear() &&
                localDateTime().getMonth() == dateTime.getMonth() &&
                localDateTime().getDayOfMonth() == dateTime.getDayOfMonth();

    }
}
