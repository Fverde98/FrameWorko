package com.nttdata.stepsdefinitions;

import com.nttdata.steps.ProductSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;

public class ProductsStepsDefs {
    @Steps
    ProductSteps productSteps;

    @Given("estoy en la aplicación de SauceLabs")
    public void estoyEnLaAplicacionDeSauceLabs() {

    }

    @And("valido que carguen correctamente los productos en la galeria")
    public void validoQueCarguenCorrectamenteLosProductosEnLaGaleria() {
        productSteps.productDisplayed();
        productSteps.productDisplayed1();
        productSteps.productDisplayed2();
        productSteps.productDisplayed3();
    }

    @When("agrego {int} del siguiente producto {string}")
    public void agregoDelSiguienteProducto(int unidaddes, String producto) {
    productSteps.uniProduct(unidaddes,producto);
    }

    @Then("valido el carrito de compra actualice correctamente")
    public void validoElCarritoDeCompraActualiceCorrectamente() {
        productSteps.addCart();
    }
}
