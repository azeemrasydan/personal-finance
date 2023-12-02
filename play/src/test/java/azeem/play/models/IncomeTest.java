package azeem.play.models;

import azeem.play.utility.Date;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;

import org.junit.Before;
import org.junit.Test;

public class IncomeTest {

    private Income income;

    @Before
    public void setUp() throws ParseException {
        income = new Income(
                "Salary",
                1000,
                Date.of("2023-01-01").inUtilDate());
    }

    @Test
    public void testSimilarLocalDateTimeWith() {
        assertTrue(
            income
            .similarLocalDateTimeWith(Date.of("2023-01-01").inLocalDateTime())
        );


    }

}
