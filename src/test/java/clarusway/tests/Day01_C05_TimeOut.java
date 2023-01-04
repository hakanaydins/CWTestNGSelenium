package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C05_TimeOut {


    // timeOut set edildiginde test suresi bu sureyi gecmemelidir. Gecmesi durumunda test exception firlatir
    // timeOut gerceklestigi andan itibaren sonraki satirlar execute edilmez (calistirilmaz)
    // Exception sonrasi kod bloklarimiz execute edilmez kod yarida kesilir


    @Test(
            timeOut = 1000
    )
    public void passedTest(){
        System.out.println("1 saniyeden once calisti");
    }

    @Test(
            timeOut = 1000
    )
    public void timedOutTest() throws InterruptedException {
        // Sout ifademiz calisacaktir timeout exceptiondan once calistigindan dolayi
        System.out.println("1 saniyeden sonra calisti");
        Thread.sleep(1100);

    }

    @Test(
            timeOut = 1000
    )
    public void timedOutTest2() throws InterruptedException {
        // Sout ifademiz calismayacaktir timeout exceptiondan dolayi
        Thread.sleep(1100);
        System.out.println("1 saniyeden sonra calisti");

    }
}