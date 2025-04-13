Feature: Login Page


Scenario Outline: Login with different usernames and passwords
Given user in the login page
When user enters the username as "<username>" and password as "<password>"
And user clicks on login button
Then login page title should be "My Account"
Examples: 
|username|password|
|shiva@gmail.com|Kranthi@789*|
|swapnil@gmail.com|Uday@789*|         
 
          
Scenario: LoginPage Footers List
Given  user in the login page
When User gets the login page footers list
Then Footers list should contain "Contact Us" 


Scenario: Email Address and Password fileds placeholders 
Given  user in the login page
When   User gets the Email Address and Password fileds placeholders 
Then Email address and Password placeholder values should be "E-Mail Address" and "Password"      


