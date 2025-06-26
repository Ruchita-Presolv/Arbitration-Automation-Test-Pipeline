Feature: login page feature

@Admin @Sanity @login
  Scenario: check the user able to login
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    Then user click on logout button



@Admin @Sanity @login1
  Scenario: check the user able to login
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    #Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    Then user click on logout button
    
  #Scenario Outline: login with different credential
    #Examples:
    #|UserName|Password|
    #|Superadmin|@3534fsfxgdgg|
    #| superadmin@presolv360.com|E/vR}$trong21|
#
