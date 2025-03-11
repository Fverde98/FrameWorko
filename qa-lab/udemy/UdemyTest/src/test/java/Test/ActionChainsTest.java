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

public class ActionChainsTest extends WebDriverHelper {
    WebDriver driver = null;
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    ActionsChainsPageObject actionsChainsPageObject = new ActionsChainsPageObject();

    @BeforeTest
    public void setUp() {
        driver = webDriverFactory.createWebDriver("chrome", "https://testpages.eviltester.com/styled/csspseudo/css-hover.html");

    }
    @Test
    public void hoverTest() {
        Actions builder = new Actions(driver);


        Action seriesOfActions = builder
                .moveToElement(getElement(driver,actionsChainsPageObject.hoverdis))
                .build();
        seriesOfActions.perform();
        Action seriesOfActions2 = builder
                .click(getElement(driver,actionsChainsPageObject.hoverlink))

                .build();
        seriesOfActions2.perform();
    }
}
