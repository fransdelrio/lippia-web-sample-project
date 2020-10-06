package com.crowdar.examples.pages;

import com.crowdar.core.Injector;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GenericPage extends PageBaseShop {
    public GenericPage(RemoteWebDriver wdriver) {
        super(wdriver);
    }

    public void verifyPage(String pag) {
        switch (pag){
            case "Login":
                //Injector._page(ShopHomePage.class).verificarPagina(pag);
                Injector._page(ShopHomePage.class).verifyLoginPage();
                break;
            case "My-Account":
                Injector._page(ShopHomePage.class).verifyMyAccountPage();
                break;
            case "DressesPage":
                Injector._page(DressesPage.class).verifyDressesPage();
                break;
            case "ProductPage":
                Injector._page(ProductPage.class).verifyProductPage();
                break;
            case "SummaryPage":
                Injector._page(SummaryPage.class).verifySummaryPage();
                break;
            case "AdressPage":
                Injector._page(SummaryPage.class).verifyAdressesPage();
                break;
            case "ShippingPage":
                Injector._page(SummaryPage.class).verifyShippingPage();
                break;
            case "PaymentPage":
                Injector._page(SummaryPage.class).verifyPaymentPage();
                break;
            case "OrderSummaryPage":
                Injector._page(SummaryPage.class).verifyOrderSummaryPage();
                break;
            case "OrderCompletePage":
                Injector._page(SummaryPage.class).verifyOrderCompletePage();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + pag);
        }
    }

    public void clickButton(String b) {
        switch (b){
            case "SignInTab":
                Injector._page(ShopHomePage.class).clickSignInTab(); //Click en pestaña Sign In.
                break;
            case "SignInButton":
                Injector._page(ShopHomePage.class).clickSignInButton(); //Click en botón Sign In.
                break;
            case "DressesButton":
                Injector._page(DressesPage.class).clickDressesButton();
                break;
            case "ProductButton":
                Injector._page(ProductPage.class).clickProductButton();
                break;
            case "AddToCartButton":
                Injector._page(ProductPage.class).clickAddToCartButton();
                break;
            case "ProceedButton":
                Injector._page(ProductPage.class).clickProceedButton();
                break;
            case "ProceedButtonStep1":
                Injector._page(SummaryPage.class).clickProceedButtonStep1();
                break;
            case "ProceedButtonAdress":
                Injector._page(SummaryPage.class).clickProceedButtonAdress();
                break;
            case "IAgree":
                Injector._page(SummaryPage.class).clickIAgreeCheckbox();
                break;
            case "ProceedButtonShipping":
                Injector._page(SummaryPage.class).clickProceedButtonShipping();
                break;
            case "PayByCheck":
                Injector._page((SummaryPage.class)).clickPayByCheckButton();
                break;
            case "ConfirmOrderButton":
                Injector._page((SummaryPage.class)).clickConfirmOrderButton();
                break;
            default:
                throw new IllegalStateException("clickButton - Valor inesperado! -> " + b);
        }
    }
}
