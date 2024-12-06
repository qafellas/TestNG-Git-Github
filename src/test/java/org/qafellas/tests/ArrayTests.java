package org.qafellas.tests;

import org.qafellas.function.ArrayFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayTests {

    @Test(description = "should find the sum of array elements")
    public void sumArrayElements(){
        ArrayFunctions af = new ArrayFunctions();
        int[] arr = {2,3,4,7,8};
        Assert.assertEquals(af.sumOfElements(arr), 24, "The sum is not correct");
    }

    @Test
    public void findMaxNumber(){
        ArrayFunctions af = new ArrayFunctions();
        int[] arr = {9,3,78,-5,45};
        Assert.assertEquals(af.maxNum(arr), 78);
    }

}
