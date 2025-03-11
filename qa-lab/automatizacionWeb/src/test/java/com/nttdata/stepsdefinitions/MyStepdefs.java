package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.getDriver;
import static com.nttdata.core.DriverManager.screenShot;

public class MyStepdefs {
    private WebDriver driver;
    LoginSteps loginSteps;
    @Given("que me encuentro en la página de login de MyStore")
    public void queMeEncuentroEnLaPaginaDeLoginDeMyStore() {
        driver = getDriver();
        driver.get("https://www.google.com.pe/?hl=es");
        loginSteps.LoginIniciar();
        screenShot();
    }

    @And("inicio sesión con las credenciales usuario: {string} y password: {string}")
    public void inicioSesionConLasCredencialesUsuarioYContrasena(String user, String password) {
        loginSteps = new LoginSteps(driver);
        loginSteps.Usuario(user);
        loginSteps.password(password);
        loginSteps.BtnIniciar();
        screenShot();
    }

}
