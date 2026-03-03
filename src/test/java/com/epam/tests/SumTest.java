package com.epam.tests;


import com.epam.base.BaseTest;
import com.epam.data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest extends BaseTest {

    @Test(dataProvider = "sumData",
    dataProviderClass = CalculatorDataProvider.class,
    groups = {"math_operations"})
    public void testSum(long number_one, long number_two, long expected) {
        Assert.assertEquals(calculator.sum(number_one,number_two), expected, "The Sum result is incorrect.");
    }

}
