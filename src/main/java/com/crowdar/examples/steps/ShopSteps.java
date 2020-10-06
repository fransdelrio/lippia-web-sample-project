package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.DressesPage;
import com.crowdar.examples.pages.GenericPage;
import com.crowdar.examples.pages.ProductPage;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps {

    @Given("El cliente esta en la pagina Home del sitio My Store.")
    public void elClienteEstaEnLaPaginaHomeDelSitioMyStore() {
        Injector._page(ShopHomePage.class).go(); //Invocar a la página deseada y el método que se quiere ejecutar.
        Injector._page(ShopHomePage.class).verificarHome();
    }


    @When("El cliente presiona el boton (.*).")
    public void elClientePresionaElBoton(String b) {
        Injector._page(GenericPage.class).clickButton(b);
        //Injector._page(ShopHomePage.class).clickControl(b); //Click en pestaña Sign In.
//        switch (b){
//            case "SignInTab":
//                Injector._page(ShopHomePage.class).clickControl(b); //Click en pestaña Sign In.
//                break;
//            case "SignInButton":
//                Injector._page(ShopHomePage.class).clickControl(b); //Click en pestaña Sign In.
//                break;
//            case "DressesButton":
//                Injector._page(DressesPage.class).clickButton(b);
//                break;

    }

    @Then("El cliente verifica que fue redireccionado a la pagina (.*).")
    public void elClienteVerificaQueFueRedireccionadoALaPaginaX(String pag) {
        Injector._page(GenericPage.class).verifyPage(pag);

        //Injector._page(ShopHomePage.class).verificarPagina(pag);
//        switch (pag){
//            case "Login":
//                Injector._page(ShopHomePage.class).verificarPagina(pag);
//                break;
//            case "My-Account":
//                Injector._page(ShopHomePage.class).verificarPagina(pag);
//                break;
//            case "DressesPage":
//                Injector._page(DressesPage.class).checkDressesPage(pag);
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + pag);
//        }
    }

    @When("El cliente coloca su email (.*).")
    public void elClienteColocaSuEmail(String email) {
        Injector._page(ShopHomePage.class).enterLoginEmail(email);
    }

    @And("El cliente ingresa su password (.*).")
    public void elClienteIngresaSuPassword(String pw) {
        Injector._page(ShopHomePage.class).enterLoginPassword(pw);
    }

    @Then("El cliente verifica que aparece ventana (.*).")
    public void elClienteVerificaQueApareceVentana(String v) {
        Injector._page(ProductPage.class).checkWindow(v);
    }

}
