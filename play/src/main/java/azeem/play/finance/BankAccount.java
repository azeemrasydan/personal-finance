package azeem.play.finance;

public class BankAccount {
    private Bank bank;
    private String accountNumber;

    // Constructors, getters, and setters

    // Default constructor
    public BankAccount() {
    }

    // Parameterized constructor
    public BankAccount(Bank bank, String accountNumber) {
        this.bank = bank;
        this.accountNumber = accountNumber;
    }

    // Getters and setters for all attributes

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
