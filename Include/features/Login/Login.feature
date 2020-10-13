Feature: Login feature
Scenario Outline: Login in the application with valid credentials

Given User navigates to login page
When  User enter <username> and <password>
And   Click the login button
And   Navigate to homepage
Then  User logout the application

Examples:
	|username|password|
	|admin   |hUKwJTbofgPU9eVlw/CnDQ==|

	
	