package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C04_DataProviderClassTest {




    @Test(
            dataProvider = "testData",
            dataProviderClass = Day03_C03_DataProviderClass.class
    )
    public void dataProviderTest(String english, String turkish){

        System.out.println(english);
        System.out.println(turkish);
    }
}