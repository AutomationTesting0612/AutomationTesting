@Home @Sanity @Regression
Feature: Home Page functionality
  Background: Test the login Functionality
    When Enter the username
    And Enter the password
    And click on the login button
    Then User should be able to navigate to the home page


  Scenario: Verify user should be able to navigate to home page
    Then validate the title
@1111
  Scenario: Verify user should be able to navigate to home page
    When User is clicking on all the Add To Cart button
    Then Add To Cart Button text should be display as Remove button
    Then Cart Icon should be increment by one on clicking the Add to cart button
    When User is clicking on cart icon
    And Click on the Checkout button
    And Handle the exception
    And Enter the details in checkout page
