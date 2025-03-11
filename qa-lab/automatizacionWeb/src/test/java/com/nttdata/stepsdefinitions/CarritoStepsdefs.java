package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CarritoSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.nttdata.core.DriverManager.screenShot;

public class CarritoStepsdefs{
    private WebDriver driver;
    CarritoSteps carritoSteps;
    @When("navego a la categoria clothes y subcategoria men")
    public void navegoALaCategroiaYSubcategoria(String categoria,String subcategoria) {
        carritoSteps = new CarritoSteps(driver);
        carritoSteps.clothes();
        carritoSteps.Men();
        screenShot();
    }
    @When("agrego {int} unidades del primer producto al carrito")
    public void agregoUnidadesDelPrimerPrdocutoAlCarrito(int cantidad) {
        carritoSteps.PoloxCantidad(2);
        screenShot();
    }

    @Then("valido en el popup que el monto total sea calculado correctamente")
    public void validoEnElPopudElMontoTotalCalculadoCorrectamente() {
        carritoSteps.popud();
        carritoSteps.montoPopup();
        screenShot();
    }
    @When("finalizo la compra")
    public void finalizoLaCompra() {
        carritoSteps.finalizo();
        screenShot();
    }
    @Then("valido el titulo de la pagina del carrito")
    public void validoElTituloDeLaPaginaDelCarrito() {
        carritoSteps.title();
        screenShot();
    }
    @And("vuelvo a validar el calculo de precios en el carrito")
    public void vuelvoAvalidarElCalculoDePreciosEnElCarrito() {
    }
}