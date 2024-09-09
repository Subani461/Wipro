Feature: Update user information
@put
Scenario: Update user job information
Given the user is on the update page for the user data
When he updates the previous data 
Then the system returns the status code 200 OK