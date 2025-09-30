package com.example.steps;

import com.example.BaseTest;
import com.example.page.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class LogoutSteps extends BaseTest {

    protected LogoutPage logoutPage;

    @And("user click on Logout button")
    public void userClickOnLogoutButton() throws InterruptedException {
        logoutPage = new LogoutPage(driver);
        Thread.sleep(1000);
        logoutPage.clickMenuButton();
        Thread.sleep(1000);
        logoutPage.clickLogoutLink();
    }

    @Then("user should be redirected to login page")
    public void userShouldBeRedirectedToLoginPage() {
        assertTrue(driver.getCurrentUrl().contains("saucedemo.com"));
    }
}
