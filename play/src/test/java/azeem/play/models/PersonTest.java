package azeem.play.models;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class PersonTest {
    
    private Person person;

    @Before
    public void setUp() {
        // Initialize a Person object for testing
        person = new Person("John", "Doe", new Date(), "123-45-6789");
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
    
}
