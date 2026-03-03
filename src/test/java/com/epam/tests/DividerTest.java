package com.epam.tests;

import com.epam.base.BaseTest;
import com.epam.data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DividerTest extends BaseTest {

    @Test(dataProvider = "divData",
            dataProviderClass = CalculatorDataProvider.class,
            groups = {"math_operations"})
    public void testDiv(double number_one, double number_two, double expected) {
        Assert.assertEquals(calculator.div(number_one, number_two), expected, "The Division result is incorrect.");
    }
}
