package azeem.play.models;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Person {
    private String _firstName;
    private String _lastName;
    private Date _dateOfBirth;
    private String _socialSecurityNumber;
    private List<Asset> _assets;
    private List<Liability> _liabilities;
    private List<Expense> _expenses;
    private List<Income> _incomes;

    // Constructors, getters, and setters

    // Default constructor
    public Person() {
    }

    // Parameterized constructor
    public Person(String firstName, String lastName, Date dateOfBirth, String socialSecurityNumber,
            List<Asset> assets, List<Liability> liabilities,
            List<Expense> expenses, List<Income> incomes) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._dateOfBirth = dateOfBirth;
        this._socialSecurityNumber = socialSecurityNumber;
        this._assets = assets;
        this._liabilities = liabilities;
        this._expenses = expenses;
        this._incomes = incomes;
    }

    // Getters and setters for all attributes

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        this._firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        this._lastName = lastName;
    }

    public Date getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this._dateOfBirth = dateOfBirth;
    }

    public String getSocialSecurityNumber() {
        return _socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this._socialSecurityNumber = socialSecurityNumber;
    }

    public List<Asset> getAssets() {
        return _assets;
    }

    public void setAssets(List<Asset> assets) {
        this._assets = assets;
    }

    public List<Liability> getLiabilities() {
        return _liabilities;
    }

    public void setLiabilities(List<Liability> liabilities) {
        this._liabilities = liabilities;
    }

    public List<Expense> getExpenses() {
        return _expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this._expenses = expenses;
    }

    public List<Income> getIncomes() {
        return _incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this._incomes = incomes;
    }

    public void setRecurringIncome(String frequency, int dayOfMonth, Date startDate, Date endDate,
            double incomeAmount) {
        // Assume frequency is one of: "daily", "weekly", "monthly"
        // You can customize this logic based on your requirements

        switch (frequency.toLowerCase()) {
            case "daily":
                addDailyRecurringIncomes(startDate, endDate, incomeAmount);
                break;
            case "weekly":
                addWeeklyRecurringIncomes(startDate, endDate, incomeAmount);
                break;
            case "monthly":
                addMonthlyRecurringIncomes(startDate, endDate, dayOfMonth, incomeAmount);
                break;
            default:
                throw new IllegalArgumentException("Invalid frequency");
        }
    }

    private void addDailyRecurringIncomes(Date startDate, Date endDate, double incomeAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            // Generate income for each day
            _incomes.add(new Income("Daily Income", incomeAmount, calendar.getTime()));

            // Move to the next day
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
    }

    private void addWeeklyRecurringIncomes(Date startDate, Date endDate, double incomeAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            // Generate income for each week
            _incomes.add(new Income("Weekly Income", incomeAmount, calendar.getTime()));

            // Move to the next week
            calendar.add(Calendar.WEEK_OF_YEAR, 1);
        }
    }

    private void addMonthlyRecurringIncomes(Date startDate, Date endDate, int dayOfMonth, double incomeAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            // Generate income for each month on the specified day
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            _incomes.add(new Income("Monthly Income", incomeAmount, calendar.getTime()));

            // Move to the next month
            calendar.add(Calendar.MONTH, 1);
        }
    }

    public void setRecurringExpense(String frequency, int dayOfMonth, Date startDate, Date endDate,
            double expenseAmount) {
        // Assume frequency is one of: "daily", "weekly", "monthly"
        // You can customize this logic based on your requirements

        switch (frequency.toLowerCase()) {
            case "daily":
                addDailyRecurringExpenses(startDate, endDate, expenseAmount);
                break;
            case "weekly":
                addWeeklyRecurringExpenses(startDate, endDate, expenseAmount);
                break;
            case "monthly":
                addMonthlyRecurringExpenses(startDate, endDate, dayOfMonth, expenseAmount);
                break;
            default:
                throw new IllegalArgumentException("Invalid frequency");
        }
    }

    private void addDailyRecurringExpenses(Date startDate, Date endDate, double expenseAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            // Generate expense for each day
            _expenses.add(new Expense("Daily Expense", expenseAmount, calendar.getTime()));

            // Move to the next day
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
    }

    private void addWeeklyRecurringExpenses(Date startDate, Date endDate, double expenseAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            // Generate expense for each week
            _expenses.add(new Expense("Weekly Expense", expenseAmount, calendar.getTime()));

            // Move to the next week
            calendar.add(Calendar.WEEK_OF_YEAR, 1);
        }
    }

    private void addMonthlyRecurringExpenses(Date startDate, Date endDate, int dayOfMonth, double expenseAmount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        while (calendar.getTime().before(endDate) || calendar.getTime().equals(endDate)) {
            // Generate expense for each month on the specified day
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            _expenses.add(new Expense("Monthly Expense", expenseAmount, calendar.getTime()));

            // Move to the next month
            calendar.add(Calendar.MONTH, 1);
        }
    }

}
