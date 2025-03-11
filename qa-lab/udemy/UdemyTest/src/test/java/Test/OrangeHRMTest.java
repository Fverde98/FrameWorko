package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;
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

public class OrangeHRMTest extends WebDriverHelper {
    WebDriver driver = null;
    OrangeHRMPageObjects orangeHRMPageObjects = new OrangeHRMPageObjects();
    OrangeHRMPage orangeHRMPage = new OrangeHRMPage();
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    @BeforeTest
    public void setUp() {

        driver = webDriverFactory.createWebDriver("ie","https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }


    @Test
    public void seleniumTest() throws InterruptedException {

        WebElement logo = getElement(driver,orangeHRMPageObjects.logoImg);
        WebElement user = getElement(driver,orangeHRMPageObjects.username);
        WebElement pass = getElement(driver,orangeHRMPageObjects.password);
        WebElement login = getElement(driver,orangeHRMPageObjects.loginBtn);

        orangeHRMPage.login(driver, "Admin", "admin123");

    }

    @AfterTest
    public void tearDown() {
        System.out.println("Closed session..");
        driver.quit();

    }
}
