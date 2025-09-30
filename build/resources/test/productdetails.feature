@product-detail
Feature: Product Detail Page

  @open-product-detail
  Scenario: Click product and open product detail page
    Given user is on login page
    And user input email "standard_user"
    And user input password "secret_sauce"
    When user click on Login button
    Then user will redirect to homepage
    When user clicks on "Sauce Labs Backpack"
    Then product detail page should display "Sauce Labs Backpack"
