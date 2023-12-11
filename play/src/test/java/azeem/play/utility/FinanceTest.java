package azeem.play.utility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FinanceTest {
    @Test
    public void testConvertAnnualRateToDailyRate() {
        double annualRate = 5.0;
        Finance.AnnualRateToMethods result = Finance.convertAnnualRate(annualRate);

        // Assuming a small delta for floating-point precision
        assertEquals(1.3368061711349633E-4, result.toCompoundingDailyRate(), 1E-8);
    }
}
