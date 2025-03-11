package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;
import PageObjects.ActionsChainsPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionChainsT3st extends WebDriverHelper {
    WebDriver driver = null;
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    ActionsChainsPageObject actionsChainsPageObject = new ActionsChainsPageObject();

    @BeforeTest
    public void setUp() {
        driver = webDriverFactory.createWebDriver("chrome", "https://testpages.eviltester.com/styled/drag-drop-javascript.html");

    }
    @Test
    public void hoverTest() {
        Actions seriesOfActions = DragAndDrop(driver,
                actionsChainsPageObject.draggable1,actionsChainsPageObject.draggable2);
        seriesOfActions.perform();
    }

}
