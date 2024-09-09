Feature: Track order status
@track
Scenario: Track the status of an order using its order ID
Given I am on the order tracking page
When I enter the order ID "123456"
Then I should see the current status of the order