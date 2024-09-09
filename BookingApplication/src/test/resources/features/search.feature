Feature: Booking.com UI Testing
@search
Scenario: Validate search functionality
Given I am on the Booking.com home page
When I search for New York in my Feasable dates  with family
Then I should see search results for "New York
And the promotional banners should be visible

    