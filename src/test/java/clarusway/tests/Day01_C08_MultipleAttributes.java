package clarusway.tests;

import org.testng.annotations.Test;

public class Day01_C08_MultipleAttributes {

    // Bir test methodu birden fazla attribute kullanilarak konfigure edilebilir
    @Test(
            description = "This is a test case",
            priority = 10,
            groups = {"regression"},
            enabled = false
    )
    public void test(){
    }
}


