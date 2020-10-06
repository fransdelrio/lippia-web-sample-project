package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ShopHomePage extends PageBaseShop {
    private final String TAB_SIGNIN_CSS_SELECTOR = ".login";
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

    public void verifyLoginPage(){
        Assert.assertEquals(getWebElement(By.cssSelector(TITLE_ALREADY_CSS_SELECTOR)).getText(),"ALREADY REGISTERED?");
    }

    public void verifyMyAccountPage(){
        Assert.assertEquals(getWebElement(By.cssSelector(LABEL_MYACCOUNT_CSS_SELECTOR)).getText(),"MY ACCOUNT");
    }

    public void verificarPagina(String pag){
    //       System.out.println(pag);
        switch (pag){
            case "Login":
                //System.out.println(getWebElement(By.cssSelector(TITLE_ALREADY_CSS_SELECTOR)).getText());
                Assert.assertEquals(getWebElement(By.cssSelector(TITLE_ALREADY_CSS_SELECTOR)).getText(),"ALREADY REGISTERED?");
                break;
             case "My-Account":
                Assert.assertEquals(getWebElement(By.cssSelector(LABEL_MYACCOUNT_CSS_SELECTOR)).getText(),"MY ACCOUNT");
                break;
            case "DressesPage":
            //    Assert.assertEquals(getWebElement(By.cssSelector(LABEL_MYACCOUNT_CSS_SELECTOR)).getText(),"MY ACCOUNT");
                break;
            case "ProductPage":
                //    Assert.assertEquals(getWebElement(By.cssSelector(LABEL_MYACCOUNT_CSS_SELECTOR)).getText(),"MY ACCOUNT");
                break;
             default:
                 System.out.println("Error!!");
                 break;
        }
    }

    public void clickSignInButton(){
        clickElement(By.id(BUTTON_SIGNIN_ID));
    }

    public void clickSignInTab(){
        clickElement(By.cssSelector(TAB_SIGNIN_CSS_SELECTOR));
    }

    /* Completar credenciales de acceso */
    public void enterLoginEmail(String email) {
        completeField(By.id(INPUT_EMAILADRESS_ID), email);
    }
    public void enterLoginPassword(String pass) {
        completeField(By.id(INPUT_PASSWORD_ID), pass);
    }

}
