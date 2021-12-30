Feature: Account Summary Tab Functionality

  Background: Login steps
    Given the user is on the login page
    And User logins with username "username" and password "password"

  Scenario: Checking the account summary page features
    And the "Account Summary" page should be displayed