Feature: Retrieve comments for a post
@comment
Scenario: Retrieve comments for a specific post
Given User having the API endpoint  
When I send a GET request to the endpoint "/posts/1/comments"
Then the response status code should be 200
And the response content type should be "application/json"
And the response body should contain a list of comments