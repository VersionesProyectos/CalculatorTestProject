package com.epam.data;

import org.testng.annotations.DataProvider;

public class CalculatorDataProvider {

    @DataProvider(name = "sumData")
    public static Object[][] sumData() {
        return new Object[][] {
                { 10L, 5L, 15L },
                { -1L, 1L, 0L }
        };
    }

    @DataProvider(name = "divData")
    public static Object[][] divData() {
        return new Object[][] {
                { 10.0, 2.0, 5.0 },
                { 15.0, 3.0, 5.0 }
        };
    }

    @DataProvider(name = "subData")
    public static Object[][] subData() {
        return new Object[][] {
                { 20L, 10L, 10L },
                { 5L, 10L, -5L },
                { 0L, 0L, 0L }
        };
    }

    @DataProvider(name = "multData")
    public static Object[][] multData() {
        return new Object[][] {
                { 5L, 5L, 25L },
                { -2L, 10L, -20L },
                { 0L, 100L, 0L }
        };
    }
}
