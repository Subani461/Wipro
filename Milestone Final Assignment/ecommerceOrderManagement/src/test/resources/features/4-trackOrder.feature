Feature: Track Order Status
Scenario: Track order status
Given I have a valid order ID
When I navigate to the order tracking page
Then the order status should be displayed correctly
