Feature: Verify Order via API
@API1
Scenario: Verify order details via API
Given I have an order ID "123456"
When I retrieve the order details via API
Then the order details should match the UI