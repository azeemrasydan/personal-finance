package azeem.play.finance;

import java.util.List;

public class Bank {
    private String bankName;
    private List<String> cardTypes;  // New attribute for card types

    // Constructors, getters, and setters

    // Default constructor
    public Bank() {
    }

    // Parameterized constructor
    public Bank(String bankName, List<String> cardTypes) {
        this.bankName = bankName;
        this.cardTypes = cardTypes;
    }

    // Getters and setters for all attributes

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<String> getCardTypes() {
        return cardTypes;
    }

    public void setCardTypes(List<String> cardTypes) {
        this.cardTypes = cardTypes;
    }

    // Other methods as needed
}
