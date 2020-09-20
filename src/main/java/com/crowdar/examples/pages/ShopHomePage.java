package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShopHomePage extends PageBaseShop {

    private final String TAB_SIGNIN_CSS_SELECTOR = "#header > div.nav > div > div > nav > div.header_user_info > a";
    private final String INPUT_EMAILADRESS_ID = "email";
    private final String INPUT_PASSWORD_ID = "passwd";
    private final String BUTTON_SIGNIN_ID = "SubmitLogin";
    private final String LABEL_MYACCOUNT_CSS_SELECTOR = "#center_column > h1";
    private final String SLIDER_HOME_ID = "slider_row";
    private final String TITLE_ALREADY_CSS_SELECTOR = "#login_form > h3:nth-child(1)";
    private final String NAVIGATION_CSS_SELECTOR = ".navigation_page"; //Ej: Home->My Account

    public ShopHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.google.com/search
    }

    public void go(){
        navigateToCompleteURL(); //método de clase PageBaseWeb. ShopHomePage extiende de PageBaseShop que extiende de PageBaseWeb.
    }

    public void verificarHome(){
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(SLIDER_HOME_ID)), "El elemento no es visible.");
    }

    public void verificarPagina(String pag){
        //Assert.assertTrue(isElementPresentAndDisplayed(By.cssSelector(TITLE_ALREADY_CSS_SELECTOR)), "El elemento no es visible.");
        Assert.assertTrue(isElementVisible(By.cssSelector(LABEL_MYACCOUNT_CSS_SELECTOR)), "El elemento no es visible.");
    }

    /* Click en tab Sign In para ir a pantalla de Login */
    public void clickSignInTab(String button) {
        //System.out.println("boton"+ button);
        if (isElementPresent(By.id(BUTTON_SIGNIN_ID)) && button == "Sign In"){
            clickElement(By.id(BUTTON_SIGNIN_ID));
        }
        else {clickElement(By.cssSelector(TAB_SIGNIN_CSS_SELECTOR));
        }
    }

    public void clickSignInButton(){
        clickElement(By.id(BUTTON_SIGNIN_ID));
    }

    /* Completar credenciales de acceso */
    public void enterLoginCredentials(String email, String pass) {
        completeField(By.id(INPUT_EMAILADRESS_ID), email);
        completeField(By.id(INPUT_PASSWORD_ID), pass);
    }

    public void verifyPage(String page){
        Assert.assertTrue(isElementVisible(By.cssSelector(LABEL_MYACCOUNT_CSS_SELECTOR)), "No se ha encontrado el título My Account.");
    }

}
