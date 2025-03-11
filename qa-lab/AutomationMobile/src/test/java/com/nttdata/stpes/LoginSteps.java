package com.nttdata.stpes;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.ProductScreen;
import org.junit.Assert;

public class LoginSteps {
    LoginScreen loginScreen;
    ProductScreen productScreen;
    public void login(String user, String pass){
        loginScreen.enterUser(user);
        loginScreen.enterPassword(pass);
        loginScreen.clickLogin();
    }
    public void loginSucces(){
        Assert.assertTrue("No se inicio sesion de forma exitosa",productScreen.isProductDisplayed());
    }
    public void ValidateErrorMessage(String message){
        Assert.assertEquals("Mensaje de error incorrecto",message,loginScreen.getErrorMessage());
    }
}
