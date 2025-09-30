package com.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;


public class ProductdetailsPage {
    WebDriver driver;

    By productBackpack = By.xpath("//div[text()='Sauce Labs Backpack']");
    By productBtn = By.id("back-to-products");

    public ProductdetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickProduct(String productName) {
        driver.findElement(productBackpack).click();
    }

    public void verifyProductButtonExists() {
        WebElement buttonElement = driver.findElement(productBtn);
        assertTrue(buttonElement.isDisplayed());
    }
}
