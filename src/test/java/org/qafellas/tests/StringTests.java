package org.qafellas.tests;

import org.qafellas.function.StringFunctions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringTests {
    @Test(description = "should convert a string to uppercase one")
    public void upperCaseTest(){
        StringFunctions sf = new StringFunctions();
        String str = "Orlando";
        String expected = "ORLANDO";
        String actual = sf.toUpperCase(str);
        //Verify the result
        Assert.assertEquals(actual, expected, "It is not a match");
    }
}
