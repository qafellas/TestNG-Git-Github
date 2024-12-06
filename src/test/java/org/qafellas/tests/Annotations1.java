package org.qafellas.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations1 {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method runs before every test method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After method runs after every test method");
    }

    @Test
    public void test1(){
        System.out.println("---TC1----");
    }

    @Test
    public void test2(){
        System.out.println("----TC2---");
    }

}
