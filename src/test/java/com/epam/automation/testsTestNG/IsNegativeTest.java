package com.epam.automation.testsTestNG;

import com.epam.automation.BaseConfigurations.BaseTest;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeTest extends BaseTest {

    @Test(dataProvider = "ValuesForIsNegativeTest")
    public void testIsNegativeValueWithPositiveParamTestNG(long value, boolean expected){
    boolean result = calculator.isNegative(value);
    Assert.assertEquals(result, expected, "Is negative operation has been failed");
    }

    @DataProvider(name = "ValuesForIsNegativeTest")
    Object[][] isNegative() {
        return new Object[][]{
                {1, false},
                {-45, false},
                {0, false}
        };
    }
}
