package azeem.play.models;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Person extends WorldEntity {
    private String _firstName;
    private String _lastName;
    private LocalDate _dateOfBirth;
    private String _socialSecurityNumber;
    private List<Asset> _assets = new ArrayList<Asset>();
    private List<Liability> _liabilities = new ArrayList<Liability>();
    private List<Expense> _expenses = new ArrayList<Expense>();
    private List<Income> _incomes = new ArrayList<Income>();
    private InvestmentPortfolio _investmentPortfolio;
    private Cash _cash;

    // Parameterized constructor
    public Person(
            String firstName,
            String lastName,
            LocalDate dateOfBirth,
            String socialSecurityNumber,
            World world) {

        super(world);
        this._firstName = firstName;
        this._lastName = lastName;
        this._dateOfBirth = dateOfBirth;
        this._socialSecurityNumber = socialSecurityNumber;
    }

    // Getters and setters for all attributes

    public String firstName() {
        return _firstName;
    }

    public String lastName() {
        return _lastName;
    }

    public void withStartingCash(double cash) {
        _cash = new Cash(cash);
        _assets.add(_cash);
    }

    public Cash cash() {
        return _cash;
    }

    public double cashValue() {
        return _cash.value();
    }

    public LocalDate dateOfBirth() {
        return _dateOfBirth;
    }

    public String socialSecurityNumber() {
        return _socialSecurityNumber;
    }

    public List<Asset> assets() {
        return _assets;
    }

    public void addAllAssets(List<Asset> assets) {
        this._assets.addAll(assets);
    }

    public List<Liability> liabilities() {
        return _liabilities;
    }

    public void addAllLiabilities(List<Liability> liabilities) {
        this._liabilities.addAll(liabilities);
    }

    public List<Expense> expenses() {
        return _expenses;
    }

    public void addAllExpenses(List<Expense> expenses) {
        this._expenses.addAll(expenses);
    }

    public List<Income> incomes() {
        return _incomes;
    }

    public void addAllIncomes(List<Income> incomes) {
        this._incomes.addAll(incomes);
    }

    public void addRecurringIncome(String frequency, int dayOfMonth, Date startDate, Date endDate,
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

    public void addRecurringExpense(String frequency, int dayOfMonth, Date startDate, Date endDate,
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

    public void addInvestmentPortfolio(InvestmentPortfolio portfolio) {
        _investmentPortfolio = portfolio;
    }

    public InvestmentPortfolio investmentPortfolio() {
        return _investmentPortfolio;
    }

    public int ageInYear() {
        LocalDate dob = dateOfBirth();

        // Calculate age
        Duration age = Duration.between(dob.atStartOfDay(), world.currentDateTime());

        long days = age.toDays();
        int year = (int) (days / 365);

        return year;
    }

    private void addCashDuringIncomeDay() {

        List<Income> incomesDuringTheDay = _incomes
                .stream()
                .filter(income -> income.similarLocalDateTimeWith(world.currentDateTime()))
                .toList();

        incomesDuringTheDay
                .forEach(income -> _cash.add(income.amount()));
    }

    private void minusCashDuringExpenseDay() {
        List<Expense> expensesDuringTheDay = _expenses
                .stream()
                .filter(expense -> expense.similarLocalDateTimeWith(world.currentDateTime()))
                .toList();

        expensesDuringTheDay
                .forEach(expense -> _cash.minus(expense.amount()));
    }

    @Override
    public void onDayPassed() {
        addCashDuringIncomeDay();
        minusCashDuringExpenseDay();
    }

}
