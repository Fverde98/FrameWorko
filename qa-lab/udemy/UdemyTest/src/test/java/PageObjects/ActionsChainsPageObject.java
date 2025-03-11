package PageObjects;

import org.openqa.selenium.By;

public class ActionsChainsPageObject {
    public By hoverdis = By.id("hoverdivpara");
    public By hoverlink = By.id("hoverlink");
    public By menuWeb = By.xpath("//li[contains(.,'Web Tech')]");
    public By linkmenu = By.linkText("HTML Tutorial");

    public By draggable1 = By.id("draggable1");
    public By draggable2 = By.id("droppable1");

    public By pythonCourese = By.cssSelector("a[href*='views-in-django-python']");
    public By footerLoc = By.id("gfg-footer");
}
