package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C03_DependsOn {

    // Home page testimiz login testimize bagli oldugundan dependsOn attribute unu kullanabiliriz
    // Bagimli olunan test fail olursa bagimli olan method ignore edilir.
    // Bagimli olan method alfabetik execution a bakilmaksizin bagimli olunan metoddan sonra calisir
    // Coklu dependsOn kullaniminda tum bagimli olunan methodlar pass oldugu durumda bagimli method calisir


    @Test
    public void loginTest(){
        System.out.println("Login testi yapiliyor");
    }

    @Test
    public void registrationTest(){
        System.out.println("Kayit testi yapiliyor");
    }


    @Test(dependsOnMethods = {"registrationTest", "loginTest"})
    public void homePageTest(){
        System.out.println("Home Page testi yapiliyor");
    }



}