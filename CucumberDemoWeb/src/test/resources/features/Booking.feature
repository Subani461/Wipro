Feature: Booking a Hotel
@Booking
Scenario: User should book a hotel
Given User on the Hotel Page to book the Hotel
When User Chooses the payment method
Then he should books the hotel successfully