package com.personal.finance.entity;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class FinancialJourneyPlanTest {
    @Test
    void testName(){
        FinancialJourneyPlan financialJourneyPlan = new FinancialJourneyPlan();
        financialJourneyPlan.setName("Safe path");
        assertEquals("Safe path", financialJourneyPlan.getName());
    }
}
