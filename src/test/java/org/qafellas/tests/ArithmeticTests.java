package org.qafellas.tests;

import org.qafellas.function.ArithmeticFunctions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ArithmeticTests {
    ArithmeticFunctions arth;
    SoftAssert soft;
    @BeforeClass(groups = "smoke")
    public void setup(){
        arth = new ArithmeticFunctions();
        soft = new SoftAssert();
    }

    @Test(groups = "smoke")
    public void calculationTest(){
        soft.assertTrue(arth.add(5,4) == 9);
        //Assert.assertTrue(arth.add(5,4) == 9);

        soft.assertEquals(arth.subtract(1, 9), -8);
        //Assert.assertEquals(arth.subtract(1, 9), 0);

        int actualMultiplicationResult = arth.multiply(6,5);
        int expectedMultiplicationResult = 30;
        //Assert.assertEquals(actualMultiplicationResult, expectedMultiplicationResult);
        soft.assertEquals(actualMultiplicationResult, expectedMultiplicationResult);

        soft.assertEquals(arth.division(3, 5), 0.6);

        soft.assertAll();

    }

}
