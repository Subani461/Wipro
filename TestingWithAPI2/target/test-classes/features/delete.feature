Feature: Delete User Information
@delete
Scenario: Succesfully deletes a user By ID
Given the user is on the Reqres delete endpoint
When he deletes the user with ID 2
Then the system returns status code 