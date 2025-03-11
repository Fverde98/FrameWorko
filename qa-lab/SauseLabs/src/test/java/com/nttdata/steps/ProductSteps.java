package com.nttdata.steps;

import com.nttdata.screens.ProductScreen;
import org.junit.Assert;

public class ProductSteps {

    ProductScreen productScreen;

    public void productDisplayed(){
        Assert.assertTrue("no se visualiza el titulo producto",productScreen.isProductDisplayed());
    }
    public void productDisplayed1(){
        Assert.assertTrue("no se visualiza el producto 1",productScreen.isProduct1Displayed());
    }
    public void productDisplayed2(){
        Assert.assertTrue("no se visualiza el producto 2",productScreen.isProduct2Displayed());
    }
    public void productDisplayed3(){
        Assert.assertTrue("no se visualiza el producto 3",productScreen.isProduct3Displayed());
    }
    public void addCart(){
        productScreen.Addcart_bolt_shirt();
    }
    public void uniProduct(int cantidad, String producto){
       switch (producto){
           case "Sauce Labs Backpack ":
               productScreen.addUp(cantidad);
               break;
           case "Sauce Labs Bolt - T-Shirt":
               productScreen.addUp(cantidad);
               break;
           case "Sauce Labs Bike Light":
               productScreen.addUp(cantidad);
               break;
           default:
               throw new IllegalArgumentException("Producto no reconocido: " + producto);
       }

        }


}
