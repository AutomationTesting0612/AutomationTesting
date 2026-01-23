Feature:

  Scenario Outline: Validate the Get Endpoint With No Convern

    Given enter the required identity "<identity>" to check the concern
    When User hit the Get API with "<header>"
    Then the response should be "<responseCode>" body should match expected "<expectedFile>"

    Examples:

    |identity|responseCode| expectedFile        |header|
    |1234    |200         |expectedResponse.json|111   |


  Scenario Outline: Validate the Get Endpoint With Concern and no document uploaded

    Given enter the required identity "<identity>" to check the concern
    When User hit the Get API with "<header>"
    Then the response should be "<responseCode>" body should match expected "<expectedFile>"

    Examples:

      |identity|responseCode| expectedFile        |header|
      |1234    |200         |expectedResponse.json|111   |