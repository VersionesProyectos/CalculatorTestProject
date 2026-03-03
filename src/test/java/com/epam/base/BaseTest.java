package com.epam.base;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected Calculator calculator;

    @BeforeMethod(groups = {"math_operations"})
    public void Setup() {
        calculator = new Calculator();
    }

    @AfterMethod(groups = {"math_operations"})
    public void tearDown() {
        calculator = null;
    }
}
