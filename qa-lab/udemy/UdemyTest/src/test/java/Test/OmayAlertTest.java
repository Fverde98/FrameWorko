package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;
import PageObjects.OmayoPageObjects;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OmayAlertTest extends WebDriverHelper {
    WebDriver driver = null;
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    OmayoPageObjects omayoPageObjects = new OmayoPageObjects();

    @BeforeTest
    public void setup() {
        webDriverFactory.createWebDriver("chrome", "https://omayo.blogspot.com/");
    }

    @Test
    public void alertTest() {
        WebElement alert1Elem = getElement(driver, omayoPageObjects.btnAlert);
        if (alert1Elem != null) {
            alert1Elem.click();
            Alert alert1 = isAlertPresent(driver);
            if (alert1 != null) {
                alert1.accept();
            }

        }
    }

    @Test
    public void promptTest() {
        WebElement prompt1Elem = getElement(driver, omayoPageObjects.btnPrompt);
        if (prompt1Elem != null) {
            prompt1Elem.click();
            Alert prompt1 = isAlertPresent(driver);
            if (prompt1 != null) {
                System.out.println(prompt1.getText());
                prompt1.sendKeys("Selenium");
                prompt1.accept();
            }

        }
    }

    @Test
    public void confirmTest() {
        WebElement confirm1Elem = getElement(driver, omayoPageObjects.btnConfirm);
        if (confirm1Elem != null) {
            confirm1Elem.click();
            Alert confirm1 = isAlertPresent(driver);
            if (confirm1 != null) {
                confirm1.dismiss();
            }

        }

    }
}
