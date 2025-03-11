package PageObjects;

import org.openqa.selenium.By;

public class OmayoPageObjects {

    public By txtFnameLoc = By.name("fname");
    public By txtFUdLoc = By.id("ta1");
    public By txtFXpathLoc = By.xpath("//h2[contains(text(), 'Text Area Field Two')]/following::textarea");

    public By multiSelectLoc = By.id("multiselect1");
    public By dropDownLoc = By.id("drop1");

    public By tableLoc = By.cssSelector("table[id='table1'] td");
    public By tableLoc1 = By.id("table1");
    public By tablePuneLoc = By.xpath("//table[@id='table1']//td[contains(text(), 'Pune')]");
    public By btnSameNameLogin = By.xpath("//button[@name='samename' and contains(., 'Login')]");
    public By btnSameNameLoc = By.cssSelector("button[name='samename']");

    public By btnAlert = By.id("alert1");
    public By btnConfirm = By.id("confirm");
    public By btnPrompt = By.id("prompt");

    public  By newPopup = By.linkText("Open a popup window");
    public  By seleniumTutorialLink = By.id("selenium143");
    public By iframe1Loc = By.xpath("//iframe[@id='iframe1']");
    public By divQuestions = By.xpath("(//div[@class='widget-content']//table[contains(., 'What is Selenium?')])[1]");
    public By iframe2Loc = By.xpath("//iframe[@id='iframe2']");
}
