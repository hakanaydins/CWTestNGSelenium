package clarusway.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day02_C03_ParametersExample {

    String driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browserName){

        // Driver konfigurasyonlari yapiliyor
        if (browserName.equals("chrome")){
            driver = "chrome";
            // chrome konf yapildi
        } else if (browserName.equals("firefox")) {
            driver = "firefox";
            //firefox konf yapildi
        } else if (browserName.equals("opera")) {
            driver = "opera";
            // opera conf yapildi
        }

        System.out.println("Driver objesi olusturuldu - " + driver);


    }

    @AfterMethod
    public void tearDown(){
        driver = "-";
        System.out.println("driver snlandirildi " + driver);
        // driver kapatiliyor
    }

    @Test
    public void test(){

        System.out.println("Test execution basladi");
        System.out.println("Testte kullanilan driver = " + driver);
        // testimiz gerceklesiyor
    }

}