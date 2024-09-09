Feature: Responsive Design Testing
@Resp
Scenario: Verify the website layouton different screen sizes
Given I am on the Booking.com Home Page
When I resize the browser to different sizes 
Then layout should be as expected