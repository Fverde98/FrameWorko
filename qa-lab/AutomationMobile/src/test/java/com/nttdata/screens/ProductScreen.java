package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductScreen extends PageObject {


    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"PRODUCTS\"]")
    private WebElement lblProduct;


    public boolean isProductDisplayed(){
        waitFor(ExpectedConditions.visibilityOf(lblProduct));
        return lblProduct.isDisplayed();
    }

}
