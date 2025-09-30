@cart
Feature: Cart

  @add-to-cart
  Scenario: Add item to cart and verify badge
    Given user is on login page
    And user input email "standard_user"
    And user input password "secret_sauce"
    When user click on Login button
    Then user will redirect to homepage
    When user adds "Sauce Labs Backpack" to cart
    Then cart badge should show "1"

  @remove-from-cart
  Scenario: Remove item from cart
    Given user is on login page
    And user input email "standard_user"
    And user input password "secret_sauce"
    When user click on Login button
    Then user will redirect to homepage
    And user adds "Sauce Labs Backpack" to cart
    When user removes "Sauce Labs Backpack" from cart
    Then cart badge should not be visible