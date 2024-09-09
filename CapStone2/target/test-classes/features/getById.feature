Feature: Retrive Details by ID
@ID
Scenario Outline: Succesfully retrive details using valid ID
Given the user having the  REST API endpoint
When I send a GET request to the endpoint with "<ID>"
Then the response status code wil be as 200
And the response content type will be as "application/json"
And the response should contain user data with ID 1
 Examples: 
 				|  ID    |
 				|  1		 |
 				|  1010	 |