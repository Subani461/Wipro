Feature: Register and signIn into the Application
Scenario: Trying to register and sign into the account
Given User on the Home Pagee
When he enters "<email>" and "<password>" and "<Cpassword>"
Then user receives the Confirmation mail to user mail ID
Examples:



Scenario: Trying to register and sign into the account
Given User on the home Page
When user enters the Mail ID
Then user sees message on the screen as Invalid Email