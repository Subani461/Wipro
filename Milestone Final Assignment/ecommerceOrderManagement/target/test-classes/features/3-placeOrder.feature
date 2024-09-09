Feature: Place Order
Scenario: Place order
Given I am on the checkout page
When I enter shipping address
And I place the order
Then the order should be placed successfully