Feature: 5] verify that user able to see the Case Details and some download actions like

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
    And user click on the Ongoing tab

@Admin @Smoke @DownloadAllwithCover
  Scenario: user search for the perticular case using search box Download all Document 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId
    Then user verify that able to see the case details of the same case then user download all document
    And user click on the downloadall document 
    Then user click on download with cover letter 
    When user see the success massage then click on ok btn
    
    
    @Admin @Smoke @DownloadAllwithoutCover
  Scenario: user search for the perticular case using search box Download all Document 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId
    Then user verify that able to see the case details of the same case then user download all document
    And user click on the downloadall document 
    Then user click on download without  cover letter 
    When user see the success massage then click on ok btn
    
   @Admin @Smoke @DirectionsByArbitrator
  Scenario: user search for the perticular case using search box Download all Document 1]Directions By Arbitrator
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId
    Then user verify that able to see the case details of the same case then user download all document
    And user click on the Directions By Arbitrator 
    Then user click on the Download Selected btn
     Then user click on download with cover letter 
    When user see the success massage then click on ok btn                  
  #A012898  A001630,A001042, A000526
    
    
    
    #@Admin @Smoke @StatementOfClaimAndInterimApplication
  #Scenario: user search for the perticular case using search box Download all Document 3]Statement Of Claim and Interim Application
    #Given user is on the ongoing page and click in search box enter the case as "A000526" and click on the search icon
    #When user see the result for the as per search the user click on the caseId
    #Then user verify that able to see the case details of the same case then user download all document
    #And user click on the Statement Of Claim and Interim Application
    #Then user click on the Download Selected btn
    #When user see the success massage then click on ok btn 
    #
     @Admin @Smoke @Applications
  Scenario: user search for the perticular case using search box Download all Document 4]Applications
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId
    Then user verify that able to see the case details of the same case then user download all document
    And user click on the Applications
    Then user click on the Download Selected btn
     Then user click on download with cover letter 
    When user see the success massage then click on ok btn 
    
    @Admin @Smoke @closeBtn
  Scenario: user search for the perticular case using search box Download all Document and verify the  close button working or not
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId
    Then user verify that able to see the case details of the same case then user download all document 
    Then user click on the close btn
    
     @Admin @Smoke @Download_RequestLetterP
   Scenario: user search for the perticular case using search box Download RequestLetter  
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
     Then user click on the Request Letter preview 
    
    
    @Admin @Smoke @Download_RequestLetterD
   Scenario: user search for the perticular case using search box Download RequestLetter  
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
     Then user click on the Request Letter download 
  
   @Admin @Smoke @Download_NOAP
    Scenario: user search for the perticular case using search box Download NOA  
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
     Then user preview Noa  
   
   @Admin @Smoke @Download_NOAD
    Scenario: user search for the perticular case using search box Download NOA  
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
     Then user download Noa  
     
     @Admin @Smoke @Download_arbitrator_Assignment_letterP
      Scenario: user search for the perticular case using search box Download arbitrator appoint letter 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user preview arbitrator assignment  letter 
     
     
     @Admin @Smoke @Download_arbitrator_Assignment_letterD
      Scenario: user search for the perticular case using search box Download arbitrator appoint letter 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user download arbitrator assignment  letter  
     
      @Admin @Smoke @Download_arbitrator_appoint_letterP
      Scenario: user search for the perticular case using search box Download arbitrator appoint letter 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user preview arbitrator appoint letter 
     
     
    @Admin @Smoke @Download_arbitrator_appoint_letterD
      Scenario: user search for the perticular case using search box Download arbitrator appoint letter 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user download arbitrator appoint letter  
   
   
    @Admin @Smoke @Download_Consent_andDisclosuresp
      Scenario: user search for the perticular case using search box preview Consent and Disclosures 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user preview Consent and Disclosures 
   
    @Admin @Smoke @Download_Consent_andDisclosuresD
      Scenario: user search for the perticular case using search box Download arbitrator appoint letter 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user download Consent and Disclosures  
   
   @Admin @Smoke @Download_Communications_by_AdminP
      Scenario: user search for the perticular case using search box Download arbitrator appoint letter 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user preview  Communications  by Admin 
   
      @Admin @Smoke @Download_Communications_by_AdminDown
      Scenario: user search for the perticular case using search box Download arbitrator appoint letter 
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user download  Communications  by Admin          
   
   
   
   @Admin @Smoke @Download_Statement_of_ClaimP
     Scenario: user search for the perticular case using search box Download Statement of Claim & Support
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user previw the statement of claim 
   # And after that user download Claim, and Interim Application, if any
    #And user also download the  Supporting Documents 
    
    @Admin @Smoke @Download_Statement_of_ClaimDown
     Scenario: user search for the perticular case using search box Download Statement of Claim & Support
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user Download the statement of claim 
    
      
   @Admin @Smoke @Download_supporting_documentP
     Scenario: user search for the perticular case using search box Download Statement of Claim & Support
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user previw the supporting document 
    
     @Admin @Smoke @Download_supporting_documentD
     Scenario: user search for the perticular case using search box Download Statement of Claim & Support
    Given user is on the ongoing page and click in search box enter the case as "A015604" and click on the search icon
    When user see the result for the as per search the user click on the caseId 
    And after that user download the supporting document 
    
    
     #@Admin @Smoke @AwardInterimOrderByArbitrator
  #Scenario: user search for the perticular case using search box Download all Document 2] Award Interim Order By Arbitrator 
    #Given user is on the ongoing page and click in search box enter the case as "A012898" and click on the search icon
    #When user see the result for the as per search the user click on the caseId
    #Then user verify that able to see the case details of the same case then user download all document
    #And user click on the Award Interim Order By Arbitrator 
    #Then user click on the Download Selected btn
      #Then user click on download with cover letter 
    #When user see the success massage then click on ok btn 