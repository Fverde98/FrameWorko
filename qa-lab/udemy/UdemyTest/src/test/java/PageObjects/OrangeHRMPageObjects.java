package PageObjects;

import org.openqa.selenium.By;

public class OrangeHRMPageObjects {
    public By logoImg = By.cssSelector("img[src*='/web/images/ohrm_branding.png']");
    public  By username = By.cssSelector("input[name='username']");
    public By password = By.cssSelector("input[name='password']");
    public By loginBtn = By.xpath("//button[@type='submit']");


}
