Feature: Retrieve comments for a specific post
@CommentID
Scenario: Retrieve comments for post with ID 2
Given user having the API endpoint  
When I sends a GET request to endpoint "/comments?postId=1"
Then the response status code should be as 200
And the response content type should be like "application/json"
And the response body should contain comments for post ID 1