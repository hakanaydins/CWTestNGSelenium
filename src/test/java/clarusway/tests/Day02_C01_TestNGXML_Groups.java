package clarusway.tests;

import org.testng.annotations.Test;

public class Day02_C01_TestNGXML_Groups {

    @Test(groups = {"regression"})
    public void test01(){
        System.out.println("Test01 - Regression testi calisti");
    }

    @Test(groups = {"regression"})
    public void test02(){
        System.out.println("Test02 - Regression testi calisti");
    }

    @Test(groups = {"regression"})
    public void test03(){
        System.out.println("Test03 - Regression testi calisti");
    }

    @Test(groups = {"smoke"})
    public void test04(){
        System.out.println("Test04 - Smoke testi calisti");
    }

    @Test(groups = {"smoke"})
    public void test05(){
        System.out.println("Test05 - Smoke testi calisti");
    }

    @Test(groups = {"smoke"})
    public void test06(){
        System.out.println("Test06 - Smoke testi calisti");
    }

    @Test(groups = {"regression", "smoke"})
    public void test07(){
        System.out.println("Test07 - Smoke regression testi calisti");
    }

}