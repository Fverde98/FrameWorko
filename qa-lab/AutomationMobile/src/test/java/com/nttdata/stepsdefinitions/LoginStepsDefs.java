package com.nttdata.stepsdefinitions;

import com.nttdata.stpes.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class LoginStepsDefs {

    @Steps
    LoginSteps loginSteps;

    @Given("que estoy en la aplicacion de Swag Labs")
    public void queEstoyEnLaAplicacionDeSwagLabs() {
        
    }

    @When("ingreso mis credenciales username {string} y password {string}")
    public void ingresoMisCredencialesUsernameYPassword(String user, String pass) {
        loginSteps.login(user,pass);
    }

    @Then("el inicio de sesion exitoso")
    public void elInicioDeSesionExitoso() {
        loginSteps.loginSucces();
    }

    @Then("se muestra el mensaje de error {string}")
    public void seMuestraElMensajeDeError(String message) {
        loginSteps.ValidateErrorMessage(message);
    }
}
