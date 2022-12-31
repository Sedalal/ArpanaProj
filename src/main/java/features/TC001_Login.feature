Feature: Verify Login Action
Scenario: Check Login with valid inputs and display a message Successful
Given user is on Home page
When user clicks on Signin Link
Then check title of next page 
When user enter valid username
And user enter valid password clicks on Submit button
Then Check user name is valid and display message as Login successful. 
 

Scenario: Check Login with invalid inputs and display a error message 
Given user is on Home page
When user clicks on Signin Link
Then check title of next page 
When user enters invalid username and valid password clicks on Submit
Then error message is displayed
And user enter valid user name and invalid password clicks on Submit 
Then error message is displayed
 
 