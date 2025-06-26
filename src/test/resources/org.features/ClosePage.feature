Feature: Verify that user able to perform various actions  in Resolv tab  for Close cases

  Background: 
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    And user click on the Resolv btn
    Then user click on Arbitration360
    And User click on close btn 
    
   @Smoke @AwardClose
    Scenario: Bulk upload Award in particular cases present in close status 
    Given user is on close page and verify the page title as "Closed"
    Then user verify that both filter are loaded on click and usable 
    And user select random filter and select bulk upload action then click on award 
    When user see the pop up title as "Bulk Upload Award" then he select file to upload and click on upload btn
    
    ## risky scenario please check before update 
     @Smoke @AwardInterimOrderByArbitrator
  Scenario: user search for the perticular case using search box Download all Document 2] Award Interim Order By Arbitrator 
    Given user is on the ongoing page and click in search box enter the case as "A015616" and click on the search icon
    When user see the result for the as per search the user click on the caseId
    Then user verify that able to see the case details of the same case then user download all document
    And user click on the Award Interim Order By Arbitrator 
    Then user click on the Download Selected btn
      Then user click on download with cover letter 
    When user see the success massage then click on ok btn  