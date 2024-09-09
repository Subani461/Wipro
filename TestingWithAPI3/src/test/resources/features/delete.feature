Feature: Delete Pet Information
@delete
Scenario: Succesfully deletes a pet Information By ID
Given the user is on the Swagger Application to delete details
When he deletes the content with ID 1
Then the system returns status code 