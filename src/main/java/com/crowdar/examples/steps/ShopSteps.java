package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {

    @Given("El cliente esta en la pagina Home del sitio My Store.")
    public void elClienteEstaEnLaPaginaHomeDelSitioMyStore() {
        Injector._page(ShopHomePage.class).go();
        Injector._page(ShopHomePage.class).verificarHome();
    }

    @When("El cliente hace click en el boton (.*).")
    public void elClienteHaceClickEnElBoton() {
    }

    @Then("El cliente verifica que fue redireccionado a la pagina (.*).")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaX() {
    }

    @When("El cliente coloca su email (.*).")
    public void elClienteColocaSuEmail(String email) {
    }

    @And("El cliente ingresa su password (.*).")
    public void elClienteIngresaSuPassword(String pw) {
    }


}
