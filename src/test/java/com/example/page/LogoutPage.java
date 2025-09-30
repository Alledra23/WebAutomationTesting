package com.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;


public class LogoutPage {
    WebDriver driver;

    By menuButton = By.id("react-burger-menu-btn"); // tombol buka menu
    By logoutLink = By.id("logout_sidebar_link");   // tombol logout

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMenuButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement menu = wait.until(ExpectedConditions.elementToBeClickable(menuButton));
        menu.click();
    }

    public void clickLogoutLink() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement logout = wait.until(ExpectedConditions.visibilityOfElementLocated(logoutLink));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", logout);
    }

}
