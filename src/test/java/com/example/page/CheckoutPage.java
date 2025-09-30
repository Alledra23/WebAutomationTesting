package com.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class CheckoutPage {
    WebDriver driver;

    By cartIcon = By.id("shopping_cart_container");
    By checkoutButton = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By postalCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By totalPrice = By.className("summary_total_label");
    By finishButton = By.id("finish");
    By confirmationMessage = By.className("complete-header");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToCart() {
        driver.findElement(cartIcon).click();
    }

    public void clickCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void fillCheckoutInfo(String fname, String lname, String zip) {
        driver.findElement(firstName).sendKeys(fname);
        driver.findElement(lastName).sendKeys(lname);
        driver.findElement(postalCode).sendKeys(zip);
    }

    public void continueCheckout() {
        driver.findElement(continueButton).click();
    }

    public String getPrice() {
        By totalPrice = By.className("summary_total_label"); // sesuaikan selector
        return driver.findElement(totalPrice).getText();
    }

    public void finishCheckout() {
        driver.findElement(finishButton).click();
    }

    public void verifyConfirmation(String expectedMessage) {
        String actual = driver.findElement(confirmationMessage).getText();
        assertTrue(actual.contains(expectedMessage));
    }

    public void verifyPrice(String expectedPrice) {
        String actualPrice = driver.findElement(totalPrice).getText();
        assertTrue(actualPrice.contains(expectedPrice));
    }

}
