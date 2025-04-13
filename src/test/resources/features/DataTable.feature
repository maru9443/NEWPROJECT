Feature: DataTable Feature Concept

Scenario: New User Registration
Given User is on registration page
When user enters the personal details
|Umeshumikiran|Umeshumi123kiran|Umeshumikiran@gmail.com|9848054329|Umeshumi@1233219|Umeshumi@1233219|
And User selects and accepts privacy policy
When User clicks on the continue button
Then sucessful message displays as "Your Account Has Been Created!"