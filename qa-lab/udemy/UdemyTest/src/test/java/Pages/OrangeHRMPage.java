package Pages;

import PageObjects.OrangeHRMPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrangeHRMPage {
    OrangeHRMPageObjects orangeHRMTestPageObjects = new OrangeHRMPageObjects();
    public void login(WebDriver driver, String username, String password) {
        WebElement user = driver.findElement(orangeHRMTestPageObjects.username);
        WebElement pass = driver.findElement(orangeHRMTestPageObjects.password);
        WebElement login = driver.findElement(orangeHRMTestPageObjects.loginBtn);

        user.sendKeys(username);
        pass.sendKeys(password);
        login.click();
    }
}
