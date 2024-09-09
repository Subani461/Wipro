Feature: User Login
@login
Scenario: Successful login with valid credentials
Given User is on the login page
When User logs in with username "validUser" and password "validPassword"
Then User should be redirected to the homepage

Scenario: Failed login with invalid credentials
Given User is on the login Page
When User try logs  with username "invalidUser" and password "invalidPassword"
Then User should see an error message "Invalid credentials"