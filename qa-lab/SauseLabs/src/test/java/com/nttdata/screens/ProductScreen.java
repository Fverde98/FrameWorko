package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductScreen extends PageObject {
    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Backpack\"]")
    private WebElement backpack;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bolt T-Shirt\"]")
    private WebElement Bolt_shrit;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"Sauce Labs Bike Light\"]")
    private WebElement bike_light;

    @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"com.saucelabs.mydemoapp.android:id/productTV\"]")
    private WebElement lblProduct;

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Tap to add product to cart\"]")
    private WebElement btnCart;

    public void Selection_backpack(){
        //waitFor(ExpectedConditions.visibilityOf(backpack));
        backpack.click();
    }
    public void Selection_bolt_shirt(){
        //waitFor(ExpectedConditions.visibilityOf(Bolt_shrit));
        Bolt_shrit.click();
    }
    public void Selection_bike_light(){
        //waitFor(ExpectedConditions.visibilityOf(bike_light));
        bike_light.click();
    }
    public boolean isProductDisplayed(){
        //waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblProduct.isDisplayed();
    }
    public boolean isProduct1Displayed(){
        //waitFor(ExpectedConditions.visibilityOf(backpack));
        return backpack.isDisplayed();
    }
    public boolean isProduct2Displayed(){
        //waitFor(ExpectedConditions.visibilityOf(Bolt_shrit));
        return Bolt_shrit.isDisplayed();
    }
    public boolean isProduct3Displayed(){
        //swaitFor(ExpectedConditions.visibilityOf(bike_light));
        return bike_light.isDisplayed();
    }

    public void Addcart_bolt_shirt(){
        btnCart.click();
    }
    public void addUp(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            btnCart.click();
        }
        System.out.println("Se agregó " + cantidad + " unidad(es) del producto  al carrito.");
    }
}
