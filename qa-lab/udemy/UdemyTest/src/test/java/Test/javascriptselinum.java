package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;
import PageObjects.ActionsChainsPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class javascriptselinum extends WebDriverHelper {
    WebDriver driver = null;
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    ActionsChainsPageObject actionsChainsPageObject = new ActionsChainsPageObject();

    @BeforeTest
    public void setUp() {
        driver = webDriverFactory.createWebDriver("chrome", "https://www.geeksforgeeks.org/");

    }
    @Test
    public void jstest() {
        //getElement(driver,actionsChainsPageObject.pythonCourese);
        jsClick(driver,driver.findElement(actionsChainsPageObject.pythonCourese));
        waitForPageLoad(driver);
        scrollToElement(driver,actionsChainsPageObject.footerLoc);

    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
