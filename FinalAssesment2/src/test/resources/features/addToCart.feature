Feature: Add product to shopping cart
@cart
Scenario: Add a product by name to the shopping cart
Given I am on the homepage
When I search for a product with name "FaceWash"
And I add the product to the shopping cart
Then the product should be added to the shopping cart successfully
