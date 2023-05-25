@LaunchBrowser890
  Feature: Launch the Browser
    Scenario Outline: Verify user should be able to login in the application
      When Enter the username "<username>" and password "<password>"
      When Click the Submit button
      Then Validation user should be able to navigate to home

      Examples:
      |username     | password   |
      |standard_user|secret_sauce|


