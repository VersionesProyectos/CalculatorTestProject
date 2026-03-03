package com.epam.tests;

import com.epam.base.BaseTest;
import com.epam.data.CalculatorDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultiplierTest extends BaseTest {

    @Test(dataProvider = "multData",
            dataProviderClass = CalculatorDataProvider.class,
            groups = {"math_operations"})
    public void testMult(long number_one, long number_two, long expected) {
        Assert.assertEquals(calculator.mult(number_one,number_two), expected, "Multiplication result is incorrect.");
    }
}
