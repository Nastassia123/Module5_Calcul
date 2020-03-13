package com.epam.automation.testsTestNG;

import com.epam.automation.BaseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MulCalcTest extends BaseTest {


    @Test(groups = "TestDivision", dataProvider = "DoubleValuesForMultiplication")
    public void testMulOperationWithDoubleValuesTestNG(double a, double b, double expected) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "Incorrect result of multiplication operation with double params");
    }


    @DataProvider(name = "DoubleValuesForMultiplication")
    Object[][] doubleValuesForMultiplication() {
        return new Object[][]{
                {1.0, 1.0, 1.0},
                {135.0, 0, 0},
                {0, -120.0, 0},
                {-10.0, -12.0, 120},
                {-10, 3, -30}
        };
    }

    @Test(groups = "TestDivision", dataProvider = "LongValuesForMultiplication")
    public void testMulOperationWithLongValuesTestNG(long a, long b, long expected) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "Incorrect result of multiplication operation with long params");
    }


    @DataProvider(name = "LongValuesForMultiplication")
    Object[][] longValuesForMultiplication() {
        return new Object[][]{
                {10000L, -10000L, -100000000L},
                {-45454545L, 1L, -45454545L},
                {0L, 0L, 0L},
                {0L, 1200000L, 0L},
                {121212L, 12000L, 1454544000L}
        };
    }
}
