Feature: Register and signIn into the Application
@Register
Scenario: Trying to register and sign into the account
Given User on the Home Page on Registration
When he enters "<email>" 
And user enters and "<password>" and "<Cpassword>"
Then user receives the Confirmation mail to user mail ID

Examples:
|			  email		       					        	|						password					|				Cpassword			|	
|				t5@yopmail.com										|						Asifkhan@786			|				Asifkhan@786	|
|		    t6@yopmail.com										|					  Assm@786					|				Assm@786			|
|				t1@yopmail.com		  						  |					  Assm@7866					|				Assm@7866			|
