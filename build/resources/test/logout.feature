@logout
Feature: Logout

  @logout-success
  Scenario: Logout after login
    Given user is on login page
    And user input email "standard_user"
    And user input password "secret_sauce"
    When user click on Login button
    Then user will redirect to homepage
    When user click on Logout button
    Then user should be redirected to login page
