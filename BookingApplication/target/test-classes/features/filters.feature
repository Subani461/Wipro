Feature: Hotel Search and Filtering
@filter			
Scenario: Filter result by Property 
Given I am on the Booking.com homepage	
When I filter results by "<Property1>"
Then I should see results sorted by property

		Examples:
      |  Property1  									   |
      |  Free Cancellation							 |
			|  5-Stars												 |
			|	 No prepayment									 |
			|  Hostels												 |
			|  Times Square										 |
     