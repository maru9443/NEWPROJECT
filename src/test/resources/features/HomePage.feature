Feature: HomePage Feature

@RegressionTesting
Scenario: Home Page Title
Given user is on the home page
When user gets the title of the home page
Then title of the page should be "Register Account"


Scenario: Home Page Header Bar count 
Given User is on the home page
When User gets the count of the header bar
Then Header count must be 8 


Scenario: Visibility of Home Page Headers Texts
Given User is on the home page
When User gets the elements texts of headers 
Then texts of the headers should be 
|Desktops|
|Laptops & Notebooks|
|Components|
|Tablets|
|Software|
|Phones & PDAs|
|Cameras|
|MP3 Players|

