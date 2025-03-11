package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;
import PageObjects.ActionsChainsPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionChainsTest2 extends WebDriverHelper {
    WebDriver driver = null;
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    ActionsChainsPageObject actionsChainsPageObject = new ActionsChainsPageObject();

    @BeforeTest
    public void setUp() {
        driver = webDriverFactory.createWebDriver("chrome", "https://www.geeksforgeeks.org/");

    }
    @Test
    public void hoverTest() {


        Actions seriesOfActions = moveToElement(driver,actionsChainsPageObject.menuWeb);
        seriesOfActions.perform();


        Actions seriesOfActions2 = moveToElementAndClick(driver,actionsChainsPageObject.linkmenu);
        seriesOfActions2.perform();
    }
}
