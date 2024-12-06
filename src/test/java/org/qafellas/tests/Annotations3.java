package org.qafellas.tests;

import org.testng.annotations.*;

public class Annotations3 {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite runs");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite runs");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test runs");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After test runs");
    }

    @Test
    public void test5(){
        System.out.println("---TC5----");
    }

    @Test
    public void test6(){
        System.out.println("----TC6---");
    }

}
