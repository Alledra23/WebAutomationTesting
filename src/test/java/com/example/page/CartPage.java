package com.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {
    WebDriver driver;

    By addBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By removeBackpack = By.id("remove-sauce-labs-backpack");
    By cartBadge = By.xpath("//span[@data-test='shopping-cart-badge']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addItemToCart() {
        driver.findElement(addBackpack).click();
    }

    public void removeItemFromCart() {
        driver.findElement(removeBackpack).click();
    }

    public void verifyCartBadge(String expectedCount) {
        String badgeText = driver.findElement(cartBadge).getText();
        assertTrue(badgeText.equals(expectedCount));
    }

    public void verifyCartBadgeNotVisible() {
        assertTrue(driver.findElements(cartBadge).isEmpty());
    }
}
