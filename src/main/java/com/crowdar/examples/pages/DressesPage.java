package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

public class DressesPage extends PageBaseShop {
    //private final String DRESSES_SUBCAT_CSS_SELECTOR = "/html/body/div/div[2]/div/div[3]/div[2]/div[2]/ul/li[1]/h5/a";
//    private final String DRESSES_TAB_CSS_SELECTOR = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a";
    private final String DRESSES_TAB_CSS_SELECTOR = "#block_top_menu > ul > li:nth-child(2) > a";
    private final String CAT_XPATH = "//*[@id=\"center_column\"]/div[1]/div";
    private final String TITLE_CSS_SELECTOR = "/html/body/div/div[2]/div/div[3]/div[1]/div[1]/h2";
    private final String TITLE_XPATH = "/html/body/div/div[2]/div/div[3]/div[1]/div[1]/h2";
    private final String DRESSES_XPATH = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a";
    private final String CATEG_XPATH = "//*[@id=\"categories_block_left\"]/h2";

    private final String BUTTON_TSHIRTS_CSS_SELECTOR = "#block_top_menu > ul > li:nth-child(3)";
    private final String DIV_CONTENTSCENE_XPATH = "//*[@id=\"center_column\"]/div[1]/div";

    public DressesPage(RemoteWebDriver wdriver) {
        super(wdriver);
    }

    public void verifyDressesPage(){
//        Assert.assertTrue(isElementPresentAndDisplayed(By.xpath(CATEG_XPATH)), "El elemento verifyDressesPage no esta visible");
//        System.out.println("\n:::: verify DressesPage..." + "\n");
//        Assert.assertTrue(isElementPresentAndDisplayed(By.xpath(TITLE_XPATH)), ">>> El elemento TITLE_XPATH no está presente.");
//        String urlDresses = driver.getCurrentUrl();
//        Assert.assertTrue(urlDresses.contains("http://automationpractice.com/index.php?id_category=8&controller=category"));
        Assert.assertEquals(getWebElement(By.xpath(CATEG_XPATH)).getText(),"DRESSES");
    }

    public void clickDressesButton() {
        clickElement(By.cssSelector(DRESSES_TAB_CSS_SELECTOR));
    }
}
