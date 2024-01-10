@Login
@Sanity
Feature: Test login functionality for Fluent DOP
  Scenario Outline: Verify User should be able to login to the Assure Docs application
    When Enter the username "<username>"
    And Enter the password "<password>"
    And click on the login button
    Then User should be able to navigate to the home page
    Examples:
    | username     | password     |
    |standard_user | secret_sauce |