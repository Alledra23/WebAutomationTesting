@checkout
Feature: Checkout

  @checkout-success
  Scenario: Complete checkout flow
    Given user is on login page
    And user input email "standard_user"
    And user input password "secret_sauce"
    When user click on Login button
    Then user will redirect to homepage
    And user adds "Sauce Labs Backpack" to cart
    And user clicks on the cart button
    And user clicks on checkout button
    When user see the price is correct "$29.99"
    And user proceeds to checkout with "John" "Doe" "12345"
    Then user should see confirmation message "Thank you for your order!"
