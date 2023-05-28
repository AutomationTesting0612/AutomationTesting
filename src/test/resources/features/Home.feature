@Home @Sanity @Regression
Feature: Home Page functionality
  Background: Test the login Functionality
    When Enter the username
    And Enter the password
    And click on the login button
    Then User should be able to navigate to the home page


  Scenario: Verify user should be able to navigate to home page
    Then validate the title

  Scenario: Verify user should be able to navigate to home page
    When User is clicking on all the Add To Cart button