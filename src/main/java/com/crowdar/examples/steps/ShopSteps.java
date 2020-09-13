package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {

    @Given("El cliente esta en la pagina Home del sitio My Store.")
    public void elClienteEstaEnLaPaginaHomeDelSitioMyStore() {
        Injector._page(ShopHomePage.class).go(); //Invocar a la página deseada y el método que se quiere ejecutar.
        Injector._page(ShopHomePage.class).verificarHome();
    }

    @When("El cliente hace click en el boton (.*).")
    public void elClienteHaceClickEnElBoton(String button) {
        Injector._page(ShopHomePage.class).clickSignInTab(button); //Click en pestaña Sign In.
    }

    @Then("El cliente verifica que fue redireccionado a la pagina (.*).")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaX(String pag) {
        Injector._page(ShopHomePage.class).verificarPagina(pag);
    }

    @When("El cliente coloca su email (.*).")
    public void elClienteColocaSuEmail(String email) {
    }

    @And("El cliente ingresa su password (.*).")
    public void elClienteIngresaSuPassword(String pw) {
    }


}
