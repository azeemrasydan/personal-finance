package azeem.play.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        // Initialize a Person object for testing
        Calendar calendar2023 = Calendar.getInstance();
        calendar2023.setTime(
                azeem.play.utility.Date.of("2023-02-01"));

        person = new Person(
                "John",
                "Doe",
                azeem.play.utility.Date.of("1995-01-01"),
                "123-45-6789",
                calendar2023);
    }

    @Test
    public void testAddAsset() {
        Asset asset = new Asset("House", 500000.0, new AssetType("Real Estate"));
        person.assets().add(asset);

        assertEquals(1, person.assets().size());
        assertTrue(person.assets().contains(asset));
    }

    @Test
    public void testAddLiability() {
        Liability liability = new Liability("Mortgage", 200000.0, new LiabilityType("Mortgage"));
        person.liabilities().add(liability);

        assertEquals(1, person.liabilities().size());
        assertTrue(person.liabilities().contains(liability));
    }

    @Test
    public void testAddExpense() {
        Expense expense = new Expense("Rent", 1000.0, new Date());
        person.expenses().add(expense);

        assertEquals(1, person.expenses().size());
        assertTrue(person.expenses().contains(expense));
    }

    @Test
    public void testAddIncome() {
        Income income = new Income("Salary", 5000.0, new Date());
        person.incomes().add(income);

        assertEquals(1, person.incomes().size());
        assertTrue(person.incomes().contains(income));
    }

    @Test
    public void testAddRecurringIncome() {
        person.addRecurringIncome("monthly", 1, new Date(), new Date(), 2000.0);

        assertEquals(1, person.incomes().size());
        // You might want to add more specific assertions based on your implementation
    }

    @Test
    public void testAddRecurringExpense() {
        person.addRecurringExpense("weekly", 1, new Date(), new Date(), 500.0);

        assertEquals(1, person.expenses().size());
        // You might want to add more specific assertions based on your implementation
    }

    @Test
    public void testAddRecurringIncomeDaily() {
        Date startDate = new Date();
        Date endDate = new Date();
        double incomeAmount = 50.0;

        person.addRecurringIncome("daily", 0, startDate, endDate, incomeAmount);

        // Validate the incomes list in the person object
        assertNotNull(person.incomes());
        assertFalse(person.incomes().isEmpty());
        // Add more assertions based on your specific logic
    }

    @Test
    public void testAddRecurringIncomeWeekly() {
        Date startDate = new Date();
        Date endDate = new Date();
        double incomeAmount = 100.0;

        person.addRecurringIncome("weekly", 0, startDate, endDate, incomeAmount);

        // Validate the incomes list in the person object
        assertNotNull(person.incomes());
        assertFalse(person.incomes().isEmpty());
        // Add more assertions based on your specific logic
    }

    @Test
    public void testAddRecurringIncomeMonthly() {
        Date startDate = new Date();
        Date endDate = new Date();
        int dayOfMonth = 15;
        double incomeAmount = 200.0;

        person.addRecurringIncome("monthly", dayOfMonth, startDate, endDate, incomeAmount);

        // Validate the incomes list in the person object
        assertNotNull(person.incomes());
        assertFalse(person.incomes().isEmpty());
        // Add more assertions based on your specific logic
    }

    @Test
    public void testAddRecurringExpenseDaily() {
        Date startDate = new Date();
        Date endDate = new Date();
        double expenseAmount = 50.0;

        person.addRecurringExpense("daily", 0, startDate, endDate, expenseAmount);

        // Validate the expenses list in the person object
        assertNotNull(person.expenses());
        assertFalse(person.expenses().isEmpty());
        // Add more assertions based on your specific logic
    }

    @Test
    public void testAddRecurringExpenseWeekly() {
        Date startDate = new Date();
        Date endDate = new Date();
        double expenseAmount = 100.0;

        person.addRecurringExpense("weekly", 0, startDate, endDate, expenseAmount);

        // Validate the expenses list in the person object
        assertNotNull(person.expenses());
        assertFalse(person.expenses().isEmpty());
        // Add more assertions based on your specific logic
    }

    @Test
    public void testAddRecurringExpenseMonthly() {
        Date startDate = new Date();
        Date endDate = new Date();
        int dayOfMonth = 15;
        double expenseAmount = 200.0;

        person.addRecurringExpense("monthly", dayOfMonth, startDate, endDate, expenseAmount);

        // Validate the expenses list in the person object
        assertNotNull(person.expenses());
        assertFalse(person.expenses().isEmpty());
        // Add more assertions based on your specific logic
    }

    @Test
    public void testAgeIsCorrect(){
        assertEquals(person.age(), 28);
    }

}
