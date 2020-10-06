package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class SummaryPage extends PageBaseShop {
    private final String BUTTON_PROCEED_STEP1_CSS_SELECTOR = "#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium";
    private final String COMBO_ADRESS_ID = "uniform-id_address_delivery";
    private final String BUTTON_PROCEED_ADRESS_CSS_SELECTOR = "#center_column > form > p > button";
    private final String BUTTON_PROCEED_SHIPPING_CSS_SELECTOR = "#form > p > button";
    private final String DIV_SHIPPING_OPTIONS_ID = "HOOK_BEFORECARRIER";
    private final String CHECKBOX_IAGREE_ID = "uniform-cgv";
    private final String HOOK_PAYMENT_ID = "HOOK_PAYMENT";
    private final String BUTTON_PAYBYCHECK_CSS_SELECTOR = "#HOOK_PAYMENT > div:nth-child(2) > div > p > a";
    private final String BUTTON_CONFIRMORDER_CSS_SELECTOR = "#cart_navigation > button";
    private final String TITLE_SUMMARY_CSS_SELECTOR = "step_end";

    public SummaryPage(RemoteWebDriver wdriver) {
        super(wdriver);
    }

    public void verifySummaryPage() {
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("controller=order"), "Página Summary no verificada." );
    }

    public void clickProceedButtonStep1() {
        clickElement(By.cssSelector(BUTTON_PROCEED_STEP1_CSS_SELECTOR));
//        sleep(500); //zzz
    }

    public void verifyAdressesPage() {
//        sleep(1000);
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(COMBO_ADRESS_ID)), "El elemento COMBO_ADRESS_ID no esta visible");
    }

    public void clickProceedButtonAdress() {
        clickElement(By.cssSelector(BUTTON_PROCEED_ADRESS_CSS_SELECTOR));
//        sleep(900); //zzz
    }

    public void verifyShippingPage() {
//        sleep(2000);
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(DIV_SHIPPING_OPTIONS_ID)), "El elemento DIV_SHIPPING_OPTIONS_ID no esta visible");
    }

    public void clickIAgreeCheckbox() {
        clickElement(By.id(CHECKBOX_IAGREE_ID));
    }

    public void clickProceedButtonShipping() {
        clickElement(By.cssSelector(BUTTON_PROCEED_SHIPPING_CSS_SELECTOR));
    }

    public void verifyPaymentPage() {
//        sleep(1000);
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(HOOK_PAYMENT_ID)), "El elemento HOOK_PAYMENT_ID no esta visible");
    }

    public void clickPayByCheckButton() {
        clickElement(By.cssSelector(BUTTON_PAYBYCHECK_CSS_SELECTOR));
    }

    public void verifyOrderSummaryPage() {
        Assert.assertTrue(isElementPresentAndDisplayed(By.id(TITLE_SUMMARY_CSS_SELECTOR)),"Elemento TITLE_SUMMARY_CSS_SELECTOR no visible");
    }

    public void clickConfirmOrderButton() {
        clickElement(By.cssSelector(BUTTON_CONFIRMORDER_CSS_SELECTOR));
    }

    public void verifyOrderCompletePage() {
        String URL = driver.getCurrentUrl();
//        System.out.println("\n::::::::  " + URL + "  :::::::::::\n");
        Assert.assertTrue(URL.contains("order-confirmation"), "Página Order Complete no verificada." );
    }
}
