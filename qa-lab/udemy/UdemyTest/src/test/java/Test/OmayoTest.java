package Test;

import Configuration.WebDriverFactory;
import Configuration.WebDriverHelper;

import PageObjects.OmayoPageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class OmayoTest extends WebDriverHelper {
    WebDriver driver = null;
    OmayoPageObjects omayoPageObjects = new OmayoPageObjects();
    WebDriverFactory webDriverFactory = new WebDriverFactory();
    @BeforeTest
    public void setUp() {

        driver = webDriverFactory.createWebDriver("ie","https://omayo.blogspot.com/");
        }
    @Test
    public void seleniumTestBox()  {


        WebElement txtFnameLocEmen = getElement(driver,omayoPageObjects.txtFnameLoc);
        WebElement txtFUdEmen = getElement(driver,omayoPageObjects. txtFUdLoc);
        WebElement txtFXpathEmen = getElement(driver,omayoPageObjects.txtFXpathLoc);

        if(txtFnameLocEmen!=null && txtFUdEmen!=null && txtFXpathEmen!=null){
            (txtFnameLocEmen).clear();
            (txtFnameLocEmen).sendKeys("Selenium");

            (txtFUdEmen).clear();
            (txtFUdEmen).sendKeys("Selenium2");

            (txtFXpathEmen).clear();
            (txtFXpathEmen).sendKeys("Selenium3");
        }else{
            throw new SkipException("Element not found");
        }
    }
    @Test
    public void seleniumTestDropDown()  {


        WebElement multiSelectLocEmen = getElement(driver,omayoPageObjects.dropDownLoc);
        Select select = new Select(multiSelectLocEmen);

        WebElement multiDropEmen = getElement(driver,omayoPageObjects.multiSelectLoc);
        Select multiDrop = new Select(multiDropEmen);



        try {
            select.selectByVisibleText("doc 1");
            multiDrop.selectByValue("audix");
            multiDrop.selectByValue("volvox");
            multiDrop.deselectByVisibleText("Hyundai");
        }catch (NoSuchElementException t) {
            select.selectByVisibleText("doc 2");
        }
    }
    @Test
    public void seleniumTestTable()  {


        List<WebElement> table = getElements(driver,omayoPageObjects.tableLoc);
        WebElement tablePune = getElement(driver,omayoPageObjects.tablePuneLoc);
        WebElement btnSameNameLoginList = getElement(driver,omayoPageObjects.btnSameNameLogin);
        List<WebElement> btnSameNameLocElem  = getElements(driver,omayoPageObjects.btnSameNameLoc);

        for(WebElement elem: table){
            if(elem.getText().equals("Bangalore")){
                System.out.println(elem.getText());
                break;
            }
        }
        System.out.println(tablePune.getText());

        btnSameNameLoginList.click();

        for(WebElement elem: btnSameNameLocElem){
            if(elem.getText().equals("Register")){
                elem.click();
                break;
            }
        }
    }
    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
