package Test;

import Configuration.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    WebDriver driver = null;
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    @BeforeTest
    public void setUp() {
        driver = webDriverFactory.createWebDriver("ie","https://www.saucedemo.com/");
    }


    @Test
    public void seleniumTest() throws InterruptedException {


    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
