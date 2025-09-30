package com.example.steps;

import com.example.BaseTest;
import com.example.page.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps extends BaseTest {

    protected CartPage cartPage;

    @When("user adds {string} to cart")
    public void userAddsItemToCart(String itemName) {
        cartPage = new CartPage(driver);
        cartPage.addItemToCart();
    }

    @When("user removes {string} from cart")
    public void userRemovesItemFromCart(String itemName) {
        cartPage = new CartPage(driver);
        cartPage.removeItemFromCart();
    }

    @Then("cart badge should show {string}")
    public void cartBadgeShouldShow(String expectedCount) {
        cartPage = new CartPage(driver);
        cartPage.verifyCartBadge(expectedCount);
    }

    @Then("cart badge should not be visible")
    public void cartBadgeShouldNotBeVisible() {
        cartPage = new CartPage(driver);
        cartPage.verifyCartBadgeNotVisible();
    }
}
