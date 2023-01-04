package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C04_Enable {



    @Test(enabled = true)
    public void enabledTest(){
        System.out.println("Enabled test");
    }

    @Test(enabled = false)
    public void disabledTest(){
        System.out.println("Disabled test");
    }

}