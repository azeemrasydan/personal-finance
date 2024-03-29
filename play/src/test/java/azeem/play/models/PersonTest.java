package azeem.play.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import azeem.play.finance.Expense;
import azeem.play.finance.Income;
import azeem.play.finance.Liability;
import azeem.play.finance.LiabilityType;
import azeem.play.finance.RealEstate;
import azeem.play.people.Person;
import azeem.play.world.World;

public class PersonTest {

    private Person person;

    @Before
    public void setUp() {
        // Initialize a Person object for testing

        World world = new World(azeem.play.utility.Date.of("2023-01-01").inLocalDate());

        person = new Person(
                "John",
                "Doe",
                azeem.play.utility.Date.of("1995-01-01").inLocalDate(),
                "123-45-6789",
                world);

        person.withStartingCash(3000);
    }

    @Test
    public void testOwnRealEstate() {
        RealEstate theRealEstate = person.ownRealEstate("Home", 300000);

        assertEquals(1, person.realEstates().size());
        assertTrue(person.realEstates().contains(theRealEstate));
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
    public void testAgeInYear() {
        int ageYear = person.ageInYear();

        assertEquals(28, ageYear);
    }

    @Test
    public void testGetCash() {
        double cash = person.cashValue();

        assertEquals(3000, cash, 0.1);
    }

}
