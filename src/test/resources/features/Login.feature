@Login @Regression
@Sanity
Feature: Test login functionality
  Scenario: Verify User should be able to login to the Assure Docs application
    When Enter the username
    And Enter the password
    And click on the login button
    Then User should be able to navigate to the home page