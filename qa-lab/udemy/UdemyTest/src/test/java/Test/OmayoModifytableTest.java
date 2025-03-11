package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;
import PageObjects.OmayoPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.NoSuchElementException;

public class OmayoModifytableTest extends WebDriverHelper {
    WebDriver driver = null;
    OmayoPageObjects omayoPageObjects = new OmayoPageObjects();
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    @BeforeTest
    public void setUp() {

        driver = webDriverFactory.createWebDriver("ie","https://omayo.blogspot.com/");
        }


    @Test
    public void seleniumTestTable()  {


        WebElement tablePune = getElement(driver,omayoPageObjects.tableLoc1);
        setAtribute(driver, omayoPageObjects.tableLoc1, "border", "50");
        setAtribute(driver, tablePune, "border", "100");
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
