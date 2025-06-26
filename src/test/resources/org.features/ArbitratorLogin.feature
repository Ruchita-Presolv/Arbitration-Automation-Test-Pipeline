Feature: Arbitrator login page

 @Sanity @ArbLogin @Arb
Scenario: Verify that Arbitrator is able to login or not
Given Arb user is on login page 
Then ArbUser name and ArbPassword field is displayed
When user see the user name field then enter ArbUser name 
Then user see the user password field then enter Arb password
And user verify the table title on the page as "Upcoming Oral Hearing"
And user click on Arb logout 

#@ArbLogin2
 #Scenario Outline: User login with different credentials
   #Given Arb user is on login page 
    #When the user enters "<username>" and "<password>"
    #And clicks the login button
   # Then the user should be "Upcoming Oral Hearing"
    #
#
    #Examples:
      #| username       | password       | 
      #| arbone         | User@1234      |
      #| shubhamarb     | Pcn5d819       | 
      #| arbone         |  User@1234@   | Upcoming Oral Hearing       |
      #| arbone1@       |  User@1234   | Upcoming Oral Hearing         |