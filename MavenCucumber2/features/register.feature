Feature:Register
@register
Scenario: new user registration
Given the user is in the registration page
When the user enters valid details in registration Page
Then the user able to register his details
