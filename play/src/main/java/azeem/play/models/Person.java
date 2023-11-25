package azeem.play.models;

import java.util.Date;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String socialSecurityNumber;
    private List<Asset> assets;
    private List<Liability> liabilities;
    private List<Expense> expenses;
    private List<Income> incomes;

    // Constructors, getters, and setters

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String firstName, String lastName, Date dateOfBirth, String socialSecurityNumber,
                  List<Asset> assets, List<Liability> liabilities,
                  List<Expense> expenses, List<Income> incomes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.socialSecurityNumber = socialSecurityNumber;
        this.assets = assets;
        this.liabilities = liabilities;
        this.expenses = expenses;
        this.incomes = incomes;
    }

    // Getters and setters for all attributes

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public List<Liability> getLiabilities() {
        return liabilities;
    }

    public void setLiabilities(List<Liability> liabilities) {
        this.liabilities = liabilities;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    // Other methods as needed
}
