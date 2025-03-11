package Test;

import Configuration.WebDriverFactory;
import PageObjects.OrangeHRMPageObjects;
import Pages.OrangeHRMPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OrangeHRMTestLogin {
    WebDriver driver = null;
    OrangeHRMPageObjects orangeHRMTestPageObjects = new OrangeHRMPageObjects();
    OrangeHRMPage orangeHRMPage = new OrangeHRMPage();
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    @BeforeTest
    public void setUp() {
        driver = webDriverFactory.createWebDriver("ie","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }


    @Test
    public void seleniumLoginTest() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        orangeHRMPage.login(driver, "Admin", "admin123");



    }

    @AfterTest
    public void tearDown() {
        System.out.println("Closed session..");
        driver.quit();

    }
}
