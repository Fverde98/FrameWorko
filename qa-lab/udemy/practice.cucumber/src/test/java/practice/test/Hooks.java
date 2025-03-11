package practice.test;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class Hooks {
    @AfterAll
    public static void initWebDriver1(){
        System.out.println("This happens after all Features");
    }
    @After
    public static void initWebDriver2(){
        System.out.println("This happens after each Features");
    }
    @Before
    public static void initWebDriver3(){
        System.out.println("This happend Before each Features");
    }
    @BeforeAll
    public static void initWebDriver4(){
        System.out.println("This happend Before All  Features");
    }
}
