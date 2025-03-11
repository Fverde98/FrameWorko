package Configuration;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;



public class WebDriverHelper {
    
    final Duration EXPLICIT_TIMEOUT = Duration.ofSeconds(15);
    public  HashMap<String, String> windowsHandle = new HashMap<>();

    public WebElement getElement(WebDriver driver, By locator) {
        return isWebElementDisplayed(driver, locator)
                ? driver.findElement(locator)
                : null;
    }
    public List<WebElement> getElements(WebDriver driver, By locator) {
        return isWebElementDisplayed(driver, locator)
                ? driver.findElements(locator)
                : null;
    }
    public Alert isAlertPresent(WebDriver driver) {
        Alert simplealert = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_TIMEOUT);
            wait.until(ExpectedConditions.alertIsPresent());
            simplealert = driver.switchTo().alert();
            System.out.println("Alert is present");
        } catch (Exception e) {
            System.out.println("Alert is not present");
        }
        return simplealert;
    }
    public boolean isWebElementDisplayed(WebDriver driver, By element) {
        boolean isDisplayed;
        try {
            System.out.println(String.format("Trying to find element: %s", element));
            WebDriverWait wait = new WebDriverWait(driver, EXPLICIT_TIMEOUT);
            isDisplayed = wait.until(ExpectedConditions.visibilityOfElementLocated(element)).isDisplayed()
                    && wait.until(ExpectedConditions.elementToBeClickable(element)).isDisplayed();
        } catch (NoSuchElementException e) {
            isDisplayed = false;

            System.out.println(String.valueOf(e));
        }
        System.out.println(String.format("Element %s is displayed: %s", element, isDisplayed));
        return isDisplayed;
    }
    public void getWindowsHandle(WebDriver driver, String windowName) {
        boolean alreadyExists;
        sleep(10);
        if(windowsHandle.containsKey(windowName)){
            driver.switchTo().window(windowsHandle.get(windowName));
            System.out.println(String.format("Switched to window: %s", windowName, windowsHandle.get(windowName)));
        }else{
            for(String winHandle : driver.getWindowHandles()){
                for(String entry : windowsHandle.keySet()){
                    String value = windowsHandle.get(entry.trim());
                    alreadyExists = StringUtils.equalsIgnoreCase(winHandle, value);
                    if(alreadyExists){
                        windowsHandle.put(entry, winHandle);
                        System.out.println("The new windows"
                                + windowName
                                + "is saved in scenario with value: "
                        + windowsHandle.get(winHandle));
                        driver.switchTo().window(winHandle);
                        break;
                    }
                }
            }
        }
    }
    public void sleep(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public Actions createActionsBuilder(WebDriver driver) {
        return new Actions(driver);
    }
    public Actions moveToElement(WebDriver driver, By locator) {
        return (Actions) createActionsBuilder(driver)
                .moveToElement(getElement(driver,locator))
                .build();
    }
    public Actions moveToElementAndClick(WebDriver driver, By locator) {
        return (Actions) createActionsBuilder(driver)
                .moveToElement(getElement(driver,locator))
                .build();
    }
    public Actions DragAndDrop(WebDriver driver, By source, By target) {
        return (Actions) createActionsBuilder(driver)
                .dragAndDrop(getElement(driver,source),getElement(driver,target))
                .build();
    }
    public void scrollToElement(WebDriver driver, By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        System.out.println("Scrolling to element" + locator.toString());
        WebElement elem = getElement(driver,locator);
        if(elem != null){
            jse.executeScript("arguments[0].scrollIntoView(true);", elem);
        }else {
            throw new SkipException("Element not found" +locator);
        }
    }
    public void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;

        if(element != null){
            System.out.println("Scrolling to element" + element.toString());
            jse.executeScript("arguments[0].scrollIntoView(true);", element);
        }else {
            throw new SkipException("Element not found" );
        }
    }
    public void jsClick(WebDriver driver, By locator) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        System.out.println("Looking to element" + locator.toString());
        WebElement elem = driver.findElement(locator) !=null ? driver.findElement(locator) : null;
        if(elem != null){
            jse.executeScript("arguments[0].scrollIntoView(true);", elem);
        }else {
            throw new SkipException("Element not found" +locator);
        }
    }
    public void jsClick(WebDriver driver, WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        if(element != null){
            System.out.println("Scrolling to element" + element.toString());
            executor.executeScript("arguments[0].click();", element);
        }else {
            throw new SkipException("Element not found");
        }
    }
    public void setAtribute(WebDriver driver, WebElement element, String key, String value) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        if(element != null){
            jse.executeScript(String.format("arguments[0].setAttribute('%s', '%s');", key, value), element);
        }else {
            throw new SkipException("Set attribute failed");
        }
    }
    public void setAtribute(WebDriver driver, By locator, String key, String value) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        WebElement elem = driver.findElement(locator) !=null ? driver.findElement(locator) : null;
        if(elem != null){
            jse.executeScript(String.format("arguments[0].setAttribute('%s', '%s');", key, value), elem);
        }else {
            throw new SkipException("Set attribute failed" + locator);
        }
    }
    public void waitForPageLoad(WebDriver driver) {
        String GetActual = driver.getCurrentUrl();
        System.out.println(String.format("Current URL: %s", GetActual));

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(EXPLICIT_TIMEOUT)
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);
        wait.until(webDriver ->
                                ((JavascriptExecutor) webDriver)
                                        .executeScript("return document.readyState")
                                        .equals("complete"));
    }
}
