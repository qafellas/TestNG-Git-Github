package org.qafellas.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
    public void onTestStart(ITestResult result){
        System.out.println("Test Case Started " + result.getName());
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("Test Case is passed " + result.getName());
    }

    public void onTestFailure(ITestResult result){
        System.out.println("Test Case is failed " + result.getName());
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("Test Case is skipped " + result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        //
    }

    public void onTestFailedWithTimeout(ITestResult result){
        System.out.println("Test Case is timed out " + result.getName());
    }

    public void onStart(ITestContext context){
        System.out.println("Before test suite " + context.getName());
    }

    public void onFinish(ITestContext context) {
        System.out.println("After test suite " + context.getName());
    }
}
