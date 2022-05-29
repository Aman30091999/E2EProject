Feature: Application Login 
 
Scenario Outline: Home page default login
Given Initalize chrome driver
And Navigate to QAClick academy
And Click on signin button in home page
When user enter <username> and <password> and login

Examples:
|username	 |password	|
|akum6545	 |12343		  |