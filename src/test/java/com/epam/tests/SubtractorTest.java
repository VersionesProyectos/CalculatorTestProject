package com.epam.tests;

import com.epam.base.BaseTest;
import com.epam.data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubtractorTest extends BaseTest {

    @Test(dataProvider = "subData",
            dataProviderClass = CalculatorDataProvider.class,
            groups = {"math_operations"})
    public void testSub(long number_one, long number_two, long expected) {
        Assert.assertEquals(calculator.sub(number_one, number_two), expected, "Subtraction result is incorrect.");
    }
}
