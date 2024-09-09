Feature: Place an order and verify confirmation
@order
Scenario: Place an order with a shipping address
Given I am on the checkout page
When I enter the shipping address "522101 Islampet"
And I place the order
Then I should receive an order confirmation with an order ID