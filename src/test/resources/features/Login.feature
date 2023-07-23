@Login @Regression
@Sanity
Feature: Test login functionality
  Scenario: Test the login Functionality
    When Enter the username
    And Enter the password
    And click on the login button
    Then User should be able to navigate to the home page

