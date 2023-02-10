@Login @Regression
Feature: Test login functionality
  Scenario: Test the login Functionality
    Given Open the browser
    When Enter the URL
    Then Click the Submit button


  Scenario: Check the Credentials
    Given Open the browser
    When Enter the URL
    And Enter the username and password
    When Click the Submit button
    Then Validate the credentials