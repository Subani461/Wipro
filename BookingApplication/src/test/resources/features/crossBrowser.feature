Feature: Cross-Browser Testing
@cross
 Scenario Outline: Verify Booking.com website across different browsers
Given I am on the Booking.com homepage using "<browser>"
Then the title should contain Booking for "<browser>"

    Examples:
      | browser |
      | Chrome  |
      | Edge    |