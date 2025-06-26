Feature: User login page 

 @User @Sanity @UserLogin
Scenario: Verify that User is able to login or not
Given  User is on user login page 
Then User name and UserPassword field is displayed
When user see the user name field then enter User name 
Then user see the user password field then enter user password
And user verify the user dashboard page title as "Home"
Then user click on logout Btn 


 @User @Sanity @UserLogin1
Scenario: Verify that User is able to login or not
Given  User is on user login page 
Then User name and UserPassword field is displayed
When user see the user name field then enter User name 
Then user see the user password field then enter user password
And user verify the user dashboard page title as "Home"
Then user click on logout Btn 