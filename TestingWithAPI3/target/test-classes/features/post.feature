Feature: Post API test
@post
Scenario: User wants to post data
Given the user in the Home Page for posting data
When he posts data 
Then the system returns the status code 201