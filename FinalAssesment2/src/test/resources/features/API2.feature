Feature: Cancel Order via API
@API2
Scenario: Cancel an order and verify status via API and UI
Given I have an order ID "123456"
When I cancel the order via API
Then the order status should be updated to "Cancelled"