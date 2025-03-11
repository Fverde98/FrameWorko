package com.nttdata.steps;

import com.nttdata.page.storePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarritoSteps {
    private WebDriver driver;

    public CarritoSteps(WebDriver driver){
        this.driver = driver;
    }
    public void clothes(){
        WebElement clothesElement = driver.findElement(storePage.btnClothes);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        clothesElement.click();
    }
    public void Men(){
        WebElement clothesElement = driver.findElement(storePage.btnMen);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        clothesElement.click();
    }
    public  void PoloxCantidad(int stock){

        WebElement cantidad = driver.findElement(storePage.ropaPolo);
        WebElement btnAgregar = cantidad.findElement(storePage.Cantidad);
        btnAgregar.clear();
        btnAgregar.sendKeys(String.valueOf(stock));
        WebElement add = driver.findElement(storePage.addCar);
        add.click();
    }
    public void popud(){
        WebElement popup = driver.findElement(storePage.finalizarCompra);
        assertTrue(popup.isDisplayed());
    }
    public double montoPopup(){
        WebElement price = driver.findElement(storePage.price);
        String precioTexto = price.getText().replace("$", "");
        return Double.parseDouble(precioTexto);
    }
    public void finalizo(){
        WebElement finalizar = driver.findElement(storePage.finalizar);
        finalizar.click();
    }
    public void title(){
        String titulo = driver.getTitle();
        assertEquals("Carrito",titulo);
    }
    public double totalFinalizar(){
        WebElement price = driver.findElement(storePage.price);
        WebElement totalfinal = price.findElement(storePage.total);
        return  Double.parseDouble((totalfinal.getText().replace("$", "")));

    }
}