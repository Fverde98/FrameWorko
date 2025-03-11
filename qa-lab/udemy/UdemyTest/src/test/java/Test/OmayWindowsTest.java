package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;
import PageObjects.OmayoPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OmayWindowsTest extends WebDriverHelper {
    WebDriver driver = null;
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    OmayoPageObjects omayoPageObjects = new OmayoPageObjects();

    @BeforeTest
    public void setup() {
        webDriverFactory.createWebDriver("chrome", "https://omayo.blogspot.com/");
        windowsHandle.put("principal", driver.getWindowHandle());
    }

    @Test
    public void windowtest()  {
       WebElement seleniumTutorialElem = getElement(driver,omayoPageObjects.seleniumTutorialLink);
       WebElement newPopupElem = getElement(driver,omayoPageObjects.newPopup);
       if(seleniumTutorialElem!=null ){
           seleniumTutorialElem.click();
            getWindowsHandle(driver,"Selenium Tutorial");
       }
            getWindowsHandle(driver,"principal");
        if( newPopupElem!=null){

            newPopupElem.click();
            getWindowsHandle(driver,"New Popup");

        }

    }


}
