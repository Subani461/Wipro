
Feature: Booking.com UI Testing
@search
Scenario: Validate search functionality
Given I am on the Booking.com home page
When I search for "New York" with check-in date "2024-12-01" and check-out date "2024-12-07" and 2 guests
Then I should see search results for "New York"
And the promotional banners should be visible

    