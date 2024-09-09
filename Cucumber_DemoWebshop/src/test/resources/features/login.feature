Feature: Login with multiple values
@multiple
Scenario Outline: login with different values

Given the user is in the login page with multiple data
When he enters "<email>" and "<password>"
Then he reaches the HOME Page for every input

Examples:
|			  email		       					        	|												password											|
|				pathanasifkhan461@gmail.com				|												Assm@786										  |
|		  	pathanasifkhan461@gmail.com			  |												Assm@786											|
|				pathanasifkhan461@gmail.com		    |									    	Assm@7866											|
