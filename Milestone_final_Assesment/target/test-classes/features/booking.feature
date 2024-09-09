Feature: Booking Flight

  Scenario: User books a flight successfully
    Given User is logged in with username "user" and password "pass"
    When User searches for a flight from "New York" to "London" on "2024-09-10"
    And User books flight "NY100" with passenger "John Doe" in "Economy" class
    Then The booking reference is displayed and details are correct