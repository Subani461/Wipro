Feature: Login with multiple values
@multiple
Scenario Outline: login with different values

Given the user is in the login page with multiple data
When he enters "<username>" and "<password>"
Then he reaches the HOME Page for every input

Examples:
|				username				|							password			|
|				user1						|							password1			|
|				user2						|							password2			|
|				user3						|							password3			|