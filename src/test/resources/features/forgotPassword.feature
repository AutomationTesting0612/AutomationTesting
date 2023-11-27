@ForgotPassword
Feature: Test the Forgot Password Page

  Background: Open the URL
    Given Open the Url

  @Regression
  Scenario: Validate User should be able to login in the Home Page
    When User is entering the valid credentials
    And click on the login button
    Then User should be able to login in the home page

  Scenario Outline: Validate User should be able to login in the Home Page
    When User is entering the credentials "<username>","<password>"
    And click on the login button
    Then User should be able to login in the home page

    Examples:
    |username |password |
    |test     |test     |

  @Regression
  Scenario Outline: Validate User should not be able to login in the Home Page
    When User is entering the credentials "<username>","<password>"
    And click on the login button
    Then User should not be able to login in the home page

    Examples:
      |username |password |
      |@@@@     |test     |
