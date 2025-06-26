Feature: Verify that all Action present on Closed By Presolv are working as required

  Background: 
    Given Arb user is on login page
    Then ArbUser name and ArbPassword field is displayed
    When user see the user name field then enter ArbUser name
    Then user see the user password field then enter Arb password
    And user click on closed by presolv btn

  @Sanity @CaseDetailsArb @Arb
  Scenario: Verify that user is able to see the case details page
    Given user is on closed by presolv page and click on caseId
    Then user verify that he able to see the case details page

    @Smoke @Disclosure2 @Arb
    Scenario: Verify that user able to view the disclosures2 present in Action btn
    Given user is on closed by presolv and click on action btn 
    Then user click on view disclosures2 and verify that he is able to view the disclosures2 
    
    @Smoke @UploadDirections @Arb
    Scenario: Verify that user able to upload directions present in Action btn
    Given user is on closed by presolv and click on action btn 
    Then user click on  upload directions btn and select file to upload and click on upload btn 
    
    @Smoke @UploadAwardWithoutSignature @Arb
    Scenario: Verify that user able to Upload Award present in Action btn
    Given user is on closed by presolv and click on action btn 
    Then user then click on the upload award
    But user click on without signature and select file to upload and click on submit btn
    When user sees Final Award uploaded massage then click on ok button 
    
     @Smoke @PrivateComment @Arb
    Scenario: Verify that user able to Upload Award present in Action btn
    Given user is on closed by presolv and click on action btn 
    Then user click on private btn and share comment as "We all have to start somewhere, and doing something is better than nothing at all." and click on save btn 
    When user see the success massage for comment then click on ok btn 
    
     @Smoke @SharedComment @Arb
    Scenario: Verify that user able to Upload Award present in Action btn
    Given user is on closed by presolv and click on action btn 
    Then user click on Shared btn and share comment as "We all have to start somewhere, and doing something is better than nothing at all." and click on save btn 
    When user see the success massage for comment then click on ok btn 
    
    
    @Smoke @ImportantResources @Arb
    Scenario: verify that user able to see the Important Resources page or not 
    Given is on closed by presolv page then he click on Important Resources page
    Then user check that the requires page loaded or not 
     
     @Smoke @Profile  @Arb
    Scenario: Verify that the user is able to see his profile details 
    Given user is on closed by presolv page then he click on Profile 
    Then user verify that he able to see the profile form and also view the password form 