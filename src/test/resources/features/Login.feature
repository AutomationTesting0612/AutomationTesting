@Login @Regression
Feature: Test login functionality
  Scenario: Verify User should be able to login
    Given Open the browser
    When Enter the URL
    Then Click the Submit button


  Scenario: Verify error should get generate on entering username password
    Given Open the browser
    When Enter the URL
    Then Click the Submit button


  Scenario: Verify Error message should on clicking without entering username/password
    Given Open the browser
    When Enter the URL snd username/password
    Then Click the Submit button




