package azeem.play.models;

import static org.junit.Assert.assertEquals;

import java.sql.Date;

import org.junit.Before;
import org.junit.Test;

import azeem.play.people.Person;
import azeem.play.world.World;

public class PersonOnDayPassedTest {
    private Person person;
    private World world;

    @Before
    public void setUp() {
        // Initialize a Person object for testing

        world = new World(azeem.play.utility.Date.of("2023-01-01").inLocalDate());

        person = new Person(
                "John",
                "Doe",
                azeem.play.utility.Date.of("1995-01-01").inLocalDate(),
                "123-45-6789",
                world);

        person.withStartingCash(10000);
    }

    @Test
    public void testOnDayPassed_Income_AddCash_WhenTheTimeComes() {
        person.addRecurringIncome(
                "monthly",
                2,
                Date.valueOf(azeem.play.utility.Date.of("2023-01-01").inLocalDate()),
                Date.valueOf(azeem.play.utility.Date.of("2024-01-01").inLocalDate()),
                400);
        world.passTheDay();
        world.passTheDay();

        assertEquals(10400.00, person.cashValue(), 1);
    }

    @Test
    public void testOnDayPassed_Income_MinusCash_WhenTheTimeComes() {
        person.addRecurringExpense(
                "daily",
                2,
                Date.valueOf(azeem.play.utility.Date.of("2023-01-01").inLocalDate()),
                Date.valueOf(azeem.play.utility.Date.of("2024-01-01").inLocalDate()),
                300);
        world.passTheDay();
        world.passTheDay();

        assertEquals(9400.00, person.cashValue(), 1);
    }
}
