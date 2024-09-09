Feature: Login With multiple Data
@valid
Scenario Outline: login with valid crdentials
Given user on the Home Page for Login
When he enters "<email>" and "<password>"
Then user sees navigates to the Home Page.
Examples:
|			  email		       					        	|						password					|			
|				t1@yopmail.com										|						Asifkhan@786			|
|				davidtim631@gmail.com							|						Abcdefgh@123			|				