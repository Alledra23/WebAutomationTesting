package com.example.steps;

import com.example.BaseTest;
import com.example.page.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class CheckoutSteps extends BaseTest {

    protected CheckoutPage checkoutPage;

    @And("user clicks on the cart button")
    public void userClicksOnTheCartButton() {
        checkoutPage = new CheckoutPage(driver);
        checkoutPage.goToCart();
    }

    @And("user clicks on checkout button")
    public void userClicksOnCheckoutButton() {
        checkoutPage.clickCheckout();
    }

    @When("user proceeds to checkout with {string} {string} {string}")
    public void userProceedsToCheckoutWith(String firstName, String lastName, String postalCode) {
        checkoutPage.fillCheckoutInfo(firstName, lastName, postalCode);
        checkoutPage.continueCheckout();
    }

    @Then("user should see confirmation message {string}")
    public void userShouldSeeConfirmationMessage(String expectedMessage) {
        checkoutPage.finishCheckout();
        checkoutPage.verifyConfirmation(expectedMessage);
    }

    @When("user see the price is correct {string}")
    public void userSeeThePriceIsCorrect(String expectedPrice) {
        String actualPrice = checkoutPage.getPrice();
        assertTrue("Harga tidak sesuai! Expected: " + expectedPrice + " but was: " + actualPrice,
                actualPrice.contains(expectedPrice));
        System.out.println("Harga benar: " + actualPrice);
    }

}
