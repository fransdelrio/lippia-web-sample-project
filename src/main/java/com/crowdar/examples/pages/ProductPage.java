package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class ProductPage extends PageBaseShop {
    public ProductPage(RemoteWebDriver wdriver) {
        super(wdriver);
        this.url = "";
    }
    
    private final String PRODUCT_CSS_SELECTOR = "#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > h5 > a";//"#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img";
    private final String ADD_CART_BUTTON_CSS_SELECTOR ="#add_to_cart > button > span";
    private final String WINDOW_LAYERCART_ID = "layer_cart";
    private final String PROCEED_BUTTON_CSS_SELECTOR = "#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a";

    public void verifyProductPage(){
        String URL = driver.getCurrentUrl();
        Assert.assertTrue(URL.contains("id_product="), "Página de producto no verificada." );
    }
    
    public void clickProductButton(){
        clickElement(By.cssSelector(PRODUCT_CSS_SELECTOR));
        sleep(500); //zzz
    }

    public void clickAddToCartButton() {
        clickElement(By.cssSelector(ADD_CART_BUTTON_CSS_SELECTOR));
        sleep(500); //zzz
    }

    public void checkWindow(String v) {
        switch (v){
            case "LayerCart":
                sleep(3000);
                Assert.assertTrue(isElementPresentAndDisplayed(By.id(WINDOW_LAYERCART_ID)), "El elemento LayerCart no esta visible");
                break;
            default:
                throw new IllegalStateException("::checkWindow:: Valor inesperado: " + v);
        }
    }

    public void clickProceedButton() {
        clickElement(By.cssSelector(PROCEED_BUTTON_CSS_SELECTOR));
    }
}