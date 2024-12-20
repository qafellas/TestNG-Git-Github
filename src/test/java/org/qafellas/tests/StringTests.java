package org.qafellas.tests;

import org.qafellas.function.StringFunctions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StringTests {
    StringFunctions sf;

    @BeforeClass
    public void setUp(){
         sf = new StringFunctions();
    }


    @Test(description = "should convert a string to uppercase one")
    public void upperCaseTest(){
        String str = "Orlando";
        String expected = "ORLANDO";
        String actual = sf.toUpperCase(str);
        //Verify the result
        Assert.assertEquals(actual, expected, "It is not a match");
    }

    @Test(description = "should reverse a string successfully")
    public void reverseString(){
        String str = "cap";
        Assert.assertEquals(sf.reverseString(str), "pac");
    }

    @Test
    public void stringContainsLetter(){
        boolean status = sf.contains("New york", "k");
        Assert.assertEquals(status, true);
    }

}
