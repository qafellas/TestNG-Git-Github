package org.qafellas.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "getData")
    public void dataProviderTest(String section, String item, int numberOfItems){
        System.out.println(section);
        System.out.println(item);
        System.out.println(numberOfItems);
        System.out.println("--------------------------");
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] data = {
                {"Clothing", "sweat-shirt", 3},
                {"Electronics", "iphone", 5},
                {"Toys", "woody", 7}
        };
        return data;
    }

}
