package com.example.steps;

import com.example.BaseTest;
import com.example.page.ProductdetailsPage;
import com.example.page.ProductdetailsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductdetailsSteps extends BaseTest {

    protected ProductdetailsPage productDetailPage;

    @When("user clicks on {string}")
    public void userClicksOnProduct(String productName) {
        productDetailPage = new ProductdetailsPage(driver);
        productDetailPage.clickProduct(productName);
    }

    @Then("product detail page should display {string}")
    public void productDetailPageShouldDisplay(String productName) {
        productDetailPage = new ProductdetailsPage(driver);
        productDetailPage.verifyProductButtonExists();
    }
}
