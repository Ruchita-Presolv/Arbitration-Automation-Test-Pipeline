Feature: Verify that user able to perform various actions  in Resolv tab  for Ongoing cases

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

  @Admin @Smoke @BatchNameFil
  Scenario: 1] verify the search option based on the required field 1) Batch Name
    Given User is on the ongoing page and verifies that able to see the header filter
    And Also verifies that he able to filter the cases based on the bached name he select from the drop down as "Bali_Roy_44"
    Then user click on the search icon and verify that all cases loaded on the page having batch name as "Bali_Roy_44"

  @Admin @Smoke @ArbNameFil
  Scenario: 2] verify the search option  based on the required field  2) Arbitrator
    Given User is on the ongoing page and verifies that able to see the header filter
    And Also verifies that he able to filter the cases based on the Arbitrator name he select from the drop down as Arbitrator one
    Then user click on the search icon and verify that all cases loaded on the page having Arbitrator name as Arbitrator one

  @Admin @Smoke @OrganizationFil
  Scenario: 3] verify the search option for various field   based on the required field 3) Organisation
    Given User is on the ongoing page and verifies that able to see the header filter
    And Also verifies that he able to filter the cases based on the Organisation name he select from the drop down as Presolv360
    Then user click on the search icon and verify that all cases loaded on the page having Organisation name as Presolv360

  @Admin @Smoke @DateFilter
  Scenario: 4] verify the search option for various field   based on the required field  4) date
    Given User is on the ongoing page and verifies that able to see the header filter
    And Also verifies that he able to filter the cases based on the date in from as "09/09/2023" and in to as "10/10/2023"
    Then user click on the search icon and verify that all cases loaded as per the date entered by user

  @Admin @Smoke @CaseIdSearchAndRefresh
  Scenario: 5] search option for particular case id for ongoing cases and Refresh btn
    Given User is on the ongoing page and verifies that able to see the case table loaded or not
    And user capture any case id from the table and enter the same in the search input box and click on search icon
    Then user again capture the case id and compare with the previous case id for which he search
    And after this user click on the refresh button to verify that it is working or not

  @Admin @Smoke @CasesDropdown
  Scenario: 11] check no of entries per page dropdown working or not
    Given User is on the ongoing page and verifies that able to see the case table loaded or not
    Then user load no of cases per page as "25" and also compare it with case count per page and also same for "500" and "100"cases

  @Admin @Smoke @NextPageBtn
  Scenario: 10] check no of Next button working or not
    Given User is on the ongoing page and verifies that able to see the case table loaded or not
    Then user click on the next button and check it working or not

  #@Admin @Smoke @CaseStatusChange
  #Scenario: 15] check either able to change the status of case Active/Pause
    #Given user select the case and update its status as pause
    #Then after user checked the checkbox and tries to upload additional documents then he get an alert
    #And user click on the no btn

  @Admin @Smoke @PauseCaseWithdraw
  Scenario: 15]2 check either able to change the status of case Active/Pause
    Given user select the case and update its status as pause
    Then after user click on the action btn and select Withdraw action then get an alert
    And user click on the no btn

  #@Admin @Smoke @CasePauseUploadDoc
  #Scenario: 12] check either we are able to check or uncheck the checkbox or not of any case id
    #Given user select the case and update its status as pause
    #Then user checked the checkbox and tries to upload additional documents then he get an alert
    #And users verify the message as "Are you sure?" and then click on Confirm btn
    #Then user upload the additional document and verify the success message

  @Admin @Smoke @CasePauseUploadDoc1
  Scenario: 12] check either we are able to check or uncheck the checkbox or not of any case id
    Given user select the case and update its status as pause
    #Then user checked the checkbox and tries to upload additional documents then he get an alert
    When user see the Upload Additional Docs pop up then user select document to upload
    And user verify that yes and no radio btn are active or not and checked yes and add discription as "Using Automation suite discription added"
    Then user select mode of communication as email also enability or other btn and click on submit btn
  And user verify success massage and click on close btn

  @Admin @Smoke @ActionBtn
  Scenario: 7] verify all action button present in action tab are working or not case id A003852
    Given User is on the ongoing page and verifies that able to see the case table loaded or not
    Then user select the caseId as "A015745" on platform and click on the action btn
    And user then verify all action present in action are working or not
    Then user also verify that the select all cases checkbox working or not

  @Admin @Smoke @ConsentDownload
  Scenario: 14] user able to download the consent pdf or not
    Given User is on the ongoing page and verifies that able to see the case table loaded or not
    Then user select any case present on the page and click on assign arbitrator and download consent and click on close Btn

  @Admin @Smoke @BulkActionOptions
  Scenario: 9] select all cases present on the page  and check Bulk Action button are working or not for All selected cases
    Given User is on the ongoing page and verifies that able to see the case table loaded or not
    Then user select all cases present on the page using select all checkbox
    And user verifies that able to click on bulk action and also check the usability of all action present in  it for Both filter

  @Admin @Smoke @BulkUploadOptions
  Scenario: 9] select all cases present on the page  and check Bulk Action button are working or not for All selected cases
    Given User is on the ongoing page and verifies that able to see the case table loaded or not
    And user verifies that able to click on bulk upload and also check the usability of all action present in  it
