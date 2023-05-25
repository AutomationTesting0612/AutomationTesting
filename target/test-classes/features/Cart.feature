@Cart
  Feature: Testing the Cart Page

    Background: Login the functionality
      When Enter the username and password
      When Click the Submit button

#      Scenario Outline: Check the Flip flop of Button in Cart Page
#        When user is clicking the Add to cart button
#        When User is clicking on the Bike Light Add to cart button
#        Then Text should be display as remove from Add to cart
#        Then The value of cart icon should be increment by one "<value>"
#
#        Examples:
#        |value|
#        |2    |


    Scenario: Check the Flip flop of Button in Cart Page
      When user is clicking the Add to cart button using loop
