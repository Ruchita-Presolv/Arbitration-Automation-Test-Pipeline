Feature: User perform bulk upload action using filter

  Background: check the user able to login
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
    Then user click on the For admin review btn
    And user verify the page title as "For Admin Review"
    Then user click on the action button

  @Sanity @CaseCsv1
  Scenario: 9) user perform action like upload documents like Case.csv by using bulk action without using from to filter
    Given User is ready to take action as bulk uploade and click on bulk upload
    Then user select action as Case.csv  from drop down
    And user enter the batch name
    Then user select the claimant from drop down list
    And user add the .csv file to upload
    Then user click on the CsvSubmit btn
    And user click on the CsvConfirm  btn
    And then user finally click on the Csvclose btn

  # Removed
  #@InterimOrder
  #Scenario:9(3) user perform action like upload documents like Interim Order by using bulk action without using from to filter
  #Given User is ready to take action as bulk uploade and click on bulk upload
  #Then user select action as  Interim Order  from drop down
  #And user add the file as Interimorder.zip format
  #And user click on the upload document btn
  #Then user click on the Interimclose btn
  @ZIPSOC
  Scenario: 9(3) user perform action like upload documents like .ZIP SOC by using bulk action without using from to filter
    Given User is ready to take action as bulk uploade and click on bulk upload
    Then user select action as  .ZIP SOC from drop down
    And user click on the Claim ZIP input box to upload claim.zip
    And user click on the Supporting ZIP input box to upload Supporting ZIP
    Then user click on on upload btn
    And user click on the confirm btn and then close btn
