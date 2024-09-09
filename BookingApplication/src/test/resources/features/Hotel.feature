Feature: Hotel Booking
@Hotel
Scenario: Verify hotel details and book a room
Given I am on the hotel details page
Then I should see the hotel name
And I should see the hotel description
And I should see the amenities
And I should see the room options
And I should see the pricing
When I select the first room option
Then I should be on the booking page