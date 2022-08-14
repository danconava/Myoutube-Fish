Feature: Login
  Scenario: As a customer, I want to check the home page, so that I can explore gokomodo corporate commerce products.
    Given I want to open browser
    And go to home page
    And the user is already on corporate commerce login page
    When user hasn't logged in yet
