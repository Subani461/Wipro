Feature: Hotel Search and Filtering
@filter2			
Scenario: Filter result by properties 
Given I am on the Booking.com homepage to search	
When I filter results by "<Property1>" and "<Property2>"
Then I should see results sorted by depending upon properties

		Examples:
      | Property1  				 |	 Property2  			 |
      | Hotels						 |	 5 stars				   |
      | 5 stars			       |	 Free cancellation |	
      | Free WiFi				   |	 Breakfast included|
      | Swimming Pools     |	 Massage      		 |
     