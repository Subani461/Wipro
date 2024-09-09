Feature: Checking login Functionality
Background: 
					Given the user in the Login page					
Scenario: Valid Login
When he enters the valid details
Then he reaches the Welcome Page

Scenario: Invalid Login
When he enters the in valid details
Then he reaches the Error Page
