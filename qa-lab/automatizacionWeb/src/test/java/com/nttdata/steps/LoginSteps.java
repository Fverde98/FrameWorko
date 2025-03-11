package com.nttdata.steps;
import com.nttdata.page.storePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginSteps {
    private WebDriver driver;

    public LoginSteps(WebDriver driver){
        this.driver = driver;
    }
    public void Usuario(String user){
        WebElement userElement = driver.findElement(storePage.Usuario);
        userElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(storePage.btnIniciar));
    }
    public void password(String password){
        WebElement passwordElement = driver.findElement(storePage.Pass);
        passwordElement.sendKeys(password);
    }
    public void LoginIniciar(){
        this.driver.findElement(storePage.btnInicioSesion).click();
    }
    public void BtnIniciar(){
        this.driver.findElement(storePage.btnIniciar).click();
    }
}