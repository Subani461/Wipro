Feature: Retrive Details by ID
@ID
Scenario: Succesfully retrive details using valid ID
Given I open the API to retrive the details
When I provide a valid ID of 1
Then the response status will be displayed
