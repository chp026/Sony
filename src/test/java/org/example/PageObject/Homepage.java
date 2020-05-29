package org.example.PageObject;

import org.example.BaseClass.DriverFactory;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Homepage extends DriverFactory {
    Actions action = new Actions(driver);

    public void homePageURL() {
        String actualURL = driver.getCurrentUrl();
        Assert.assertThat(actualURL, Matchers.containsString("sony"));
    }

    @FindBy(xpath = "//button[@id='_evidon-accept-button']")
    WebElement cookieButton;
    public void cookie() {
        cookieButton.click();
    }
    @FindBy(xpath = "//li[@class='nav-li sony-accessible-item accessible-megamenu-top-nav-item nav-li-electronics']")
    WebElement electronic;
    public void electronicMH() throws InterruptedException {
        Thread.sleep(2000);
        action.moveToElement(electronic).perform();
    }
    @FindBy(xpath = "//div[@id='menu-electronics']//div[1]//ul[1]//li[3]")
    WebElement subelement;
    public void action2() throws InterruptedException {
        Thread.sleep(2000);
        action.moveToElement(subelement).click().perform();
    }
    @FindBy(xpath = "//li[@class='nav-li sony-accessible-item accessible-megamenu-top-nav-item nav-li-playstation no-submenu']")
    WebElement playStation;
    public void action3() throws InterruptedException {
        Thread.sleep(2000);
        action.moveToElement(playStation).perform();
    }
    @FindBy(xpath = "//li[@class='nav-li sony-accessible-item accessible-megamenu-top-nav-item nav-li-entertainment']")
    WebElement enterainment;
    public void action4() throws InterruptedException {
        Thread.sleep(2000);
        action.moveToElement(enterainment).perform();
    }
    @FindBy(xpath = "//li[@class='nav-li sony-accessible-item accessible-megamenu-top-nav-item nav-li-support']")
    WebElement support;
    public void action5() throws InterruptedException {
        Thread.sleep(2000);
        action.moveToElement(support).perform();
    }
}

