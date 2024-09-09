Feature: update Details by ID
@put
Scenario: Succesfully updated details using valid ID
Given I open the API to update the details
When user provides a valid ID of 21
Then the response status will be displayed after completion

