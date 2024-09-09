Feature: Add Product to Cart
Scenario: Add product to cart
Given I am logged in
When I search for a product
And I add the product to the cart
Then the product should be added to the cart successfully