Feature: user perform action by using random case filter

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

  @Admin @Sanity @RanBulkClose
  Scenario: 1) User select random case  filter and perform action like Bulk Close
    Given user is on ongoing page and select the filter as Random case filter
    When user select filter then input field get open and he capture some case and store in one variable
    Then user send all cases as an input of filter and then click on the bulk action and select Bulk close action
    And user enter the reason as "Case closed using Random case filter by using automation " and click on apply closebtn
    Then user verifies  the success status and click on the close btn

  @Admin @Sanity @RanBulkWithdraw
  Scenario: 2) User select random case  filter and perform action like Bulk Withdraw
    Given user is on ongoing page and select the filter as Random case filter
    When user select filter then input field get open and he capture some case and store in one variable
    Then user send all cases as an input of filter and then click on the bulk action and select Bulk Withdraw action
    And user enter the reason as "Case withdraw using Random case filter using automation " and click on apply withdrawbtn
    Then user verifies  the success status and click on the close btn

  @Admin @Sanity @DownloadAwardSheet
  Scenario: 3) User select random case  filter and perform action like Award sheet download
    Given user is on ongoing page and select the filter as Random case filter
    When user select filter then input field get open and he capture some case and store in second variable
    Then user send all cases as an input of filter and then click on the bulk action
    And user verify that able to download Award sheet or not

  @Admin @Sanity @DownloadDocuments
  Scenario: 4)1 User select random case  filter and perform action like Download Documents
    Given user is on ongoing page and select the filter as Random case filter
    When user select filter then input field get open and he capture some case and store in second variable
    Then user send all cases as an input of filter and then click on the bulk action
    And user verify that able to Download Documents or not

  @Admin @Sanity @DownloadDocumentsSelected
  Scenario: 4)2 User select random case  filter and perform action like Download Documents
    Given user is on ongoing page and select the filter as Random case filter
    When user select filter then input field get open and he capture some case and store in second variable
    Then user send all cases as an input of filter and then click on the bulk action
    And user click on the download documents and verifies that able to select all document and click on the download

   @Admin @Smoke @DownloadDocumentsAllDoc
  Scenario: 4)2 User select random case  filter and perform action like Download Documents
    Given user is on ongoing page and select the filter as Random case filter
    When user select filter then input field get open and he capture some case and store in second variable
    Then user send all cases as an input of filter and then click on the bulk action
    And user click on the download documents and verifies that able to download all documents
    
    
