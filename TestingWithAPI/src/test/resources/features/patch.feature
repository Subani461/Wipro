Feature: Updates user information
@patch
Scenario: Updating user job information Again
Given the user is on the update page to update the data
When he updates the previous data to new data
Then the system returns the status code for the above update as 200 
