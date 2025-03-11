package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;
import PageObjects.OmayoPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OmayoFrameTest extends WebDriverHelper {
    WebDriver driver = null;
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    OmayoPageObjects omayoPageObjects = new OmayoPageObjects();
    @BeforeTest
    public void setUp() {
        driver = webDriverFactory.createWebDriver("chrome", "https://omayo.blogspot.com/");
    }
    @Test
    public void frameTest() {
        WebElement frameElem = getElement(driver,omayoPageObjects.iframe1Loc);

        if (frameElem != null) {
            driver.switchTo().frame(frameElem);
            WebElement divquetionsframe = getElement(driver,omayoPageObjects.divQuestions);
            System.out.println(divquetionsframe.getText());
            driver.switchTo().parentFrame();
        }
    }
}
