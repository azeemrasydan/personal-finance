package azeem.play.models;

import org.junit.Before;
import org.junit.Test;

public class PersonOnDayPassedTest {
    private Person person;

    @Before
    public void setUp() {
        // Initialize a Person object for testing

        person = new Person(
                "John",
                "Doe",
                azeem.play.utility.Date.of("1995-01-01"),
                "123-45-6789");
    }

    @Test
    public void testOnDayPassed() {
        person.onDayPassed();
    }
}
