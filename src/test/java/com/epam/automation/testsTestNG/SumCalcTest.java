package com.epam.automation.testsTestNG;


import com.epam.automation.BaseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCalcTest extends BaseTest {

    @Test(dataProvider = "LongParamsForSumTest")
    public void testSummationWithLongValuesTestNG(long a, long b,long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult,  "Invalid result value of sum operation with long params");
    }

    @DataProvider(name = "LongParamsForSumTest")
    public Object[][] longValuesForSum() {
        return new Object[][]{
                {-1000000000L, -222222222L, -1222222222L},
                {399999999L, -5000000L, 394999999L},
                {0L, 1999999999, 1999999999L},
                {-310000000L, 1000000000L, 690000000L},
                {0L, 0L, 0L},
        };
    }

    @Test(dataProvider = "DoubleParamsForSumTest")
    public void testSummationWithDoubleValuesTestNG(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult,  "Invalid result value of sum operation with double params");
    }

    @DataProvider(name = "DoubleParamsForSumTest")
    public Object[][] doublevaluesForSum() {
        return new Object[][]{
                {-1.0, -2.0, -3.0},
                {3.0, -5.0, -2.0},
                {0.0, 1.0, 1.0},
                {-310.0, 10.0, -300.0},
                {0.0, 0.0, 0.0},
        };
    }
}
