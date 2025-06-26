Feature: User succefully logged on platform and ready to take action

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

 @Admin @Sanity @CaseCsv
   Scenario: 9) user perform action like upload documents like Case.csv by using bulk action without using from to filter
    Given User is ready to take action as bulk uploade and click on bulk upload
    Then user select action as Case.csv  from drop down
    And user enter the batch name
    Then user select the claimant from drop down list
    And user add the .csv file to upload
    Then user click on the CsvSubmit btn
    And user click on the CsvConfirm  btn
    And then user finally click on the Csvclose btn
  
  #@PageAction
  @Admin @Sanity @forconfirmAction
  Scenario: user show number entries  of cases per page and select all cases and perform confirm action
    without using from to filter

    Given user ckecked the select all cases check box
    Then user click on the confirm butten
    And and set date
    Then click on confirn and click on close btn

  
 # @PageAction
  @Admin @Sanity  @approve
  Scenario: user select All cases from platform by using select all cases checkbox to approve
    without using from to filter and perform approve action

    Given user ckecked the select all cases to Approve check box
    And Select Arbitrater from the dropdown As "Arbitrator One "
    And click on Approve btn
    And click on the Preview Btn
    And click on final Approve btn
    And click on close btn

  #@RandomCon
  #Scenario: 1) user perform action on the cases present per page  and  select randomly/all   on the  page which is already loaded without using filter and perform action
  #Given user refresh the page and select random cases from the page
  #Then user click on the confirm butten
  #And and set date
  #Then click on confirn and click on close btn
   @Admin @Sanity @filterConfirm
  Scenario: 8) user select the cases by using from to filter and keep except window blank  and perform confirm action
    Given user is on filter page  and select action Confirm from drop down
    Then select case by using from to filter
    And and set date
    Then click on confirn and click on close btn

  @Admin @Sanity  @filterApprove
  Scenario: 4) user  select cases by using from to filter and keep except window as blank and perform approve action
    Given user is on filter page  and select action Approve  from drop down
    Then select case by using from to filter for Approve
    And Select Arbitrater from the dropdown As "Arbitrator One "
    # And select the Arbitrator from the dropdown
    And click on ApproveFilter btn
    And click on the Preview Btn
    And click on final Approve btn
    And click on closeFilter btn

 @Admin @Sanity  @filterDownload
  Scenario: 3) user select the cases by using from to filter and keep except window blank  and perform download action
    Given user is on filter page  and select action Download  from drop down
    Then user click on the download btn

  @Admin @Sanity @filterExpConfirm
  Scenario: 7) user select the cases by using from to filter and add cases in except window and perform confirm action
    Given user is on filter page  and select perform action Confirm from drop down

  @Admin @Sanity  @filterExpApprove
  Scenario: 8) user select the cases by using from to filter and add cases in except window and perform Approve action
    Given user is on filter page  and select action Approve  from drop down
    Then select case by using from to filter for Approve
    And add cases to Except
    And Select Arbitrater from the dropdown As "Arbitrator One "
    # And select the Arbitrator from the dropdown
    And click on ApproveFilter btn
    And click on the Preview Btn
    And click on final Approve btn
    And click on closeFilter btn

  @Admin @Sanity @filterExpDownload
  Scenario: 2) user select the cases by using from to filter and add cases in except window and perform download action
    Given user is on filter page  and select perform  action Download from drop down

  @Admin @Sanity @dropShowCases
  Scenario: user show number entries  of cases per page and select all cases and perform action from drop down confirm  action  without using from to filter
    Given : User is on for admin review page and click show number of entries per page
    And user ckecked the select all cases check box
    Then user click on the confirm butten
    And and set date
    Then click on confirn and click on close btn

  @Admin @Sanity @approveWithoutSelectingArb
  Scenario: 3) user trying to approve cases without selecting any Arbitrator from drop down list
    Given user ckecked the select all cases to Approve check box
    And without selecting any Arbitrator click on Approve btn

  #@PageAction
  @Admin @Sanity @downloadSelAll
  Scenario: 1) user show number entries  of cases per page and select all cases and perform Download action  without using from to filter
    Given Select all cases to download
    Then click on download btn

  @Admin @Sanity @AddCaseCsvToReject1
  Scenario: 9) user perform action like upload documents like Case.csv by using bulk action without using from to filter
    Given User is ready to take action as bulk uploade and click on bulk upload
    Then user select action as Case.csv  from drop down
    And user enter the batch name
    Then user select the claimant from drop down list
    And user add the .csv file to upload in dashboard
    Then user click on the CsvSubmit btn
    And user click on the CsvConfirm  btn
    And then user finally click on the Csvclose btn

  #@PageAction
  @Admin @Sanity @Reject
  Scenario: user show number entries  of cases per page and select all cases and perform Reject
    action  without using from to filter

    Given user ckeck the select all cases check box for Reject
    Then user click on the Reject butten
    And user add reason to as massage
    Then user click on the Apply btn
    
  #@RejectAll
  #Scenario: user show number entries  of cases per page and select all cases and perform Reject
    #action  without using from to filter
#
    #Given user select 1000 cases from dropdown the select all cases check box for Reject
    #Then user click on the Reject butten
    #And user add reason to as massage
    #Then user click on the Apply btn
    #
    
    

 @Admin @Sanity  @AddCaseCsvToReject2
  Scenario: 9) user perform action like upload documents like Case.csv by using bulk action without using from to filter
    Given User is ready to take action as bulk uploade and click on bulk upload
    Then user select action as Case.csv  from drop down
    And user enter the batch name
    Then user select the claimant from drop down list
    And user add the .csv file to upload in dashboard
    Then user click on the CsvSubmit btn
    And user click on the CsvConfirm  btn
    And then user finally click on the Csvclose btn

  @Admin @Sanity @dropShowCasesR
  Scenario: user show number entries  of cases per page and select all cases and perform action from drop down Reject  action  without using from to filter
    Given : User is on for admin review page and click show number of entries per page
    And user ckecked the select all cases check box
    Then user click on the Reject butten
    And user add reason to as massage
    Then user click on the Apply btn
    #Then user click on logout button
    
    #@Admin @Sanity @CaseCycleAdmin-Admin
   #Scenario:  user perform action like upload documents like Case.csv by using bulk action confirm and Approve cases
    #Given User is ready to take action as bulk uploade and click on bulk upload
    #Then user select action as Case.csv  from drop down
    #And user enter the batch name
    #Then user select the claimant from drop down list
    #And user add the .csv file to upload
    #Then user click on the CsvSubmit btn
    #And user click on the CsvConfirm  btn
    #And then user finally click on the Csvclose btn
    #Then user click on the action button
    #But  user is on filter page  and select action Confirm from drop down
    #Then select case by using from to filter
    #And and set date
    #Then click on confirn and click on close btn
    #And user click on the action button
    #But user is on filter page  and select action Approve  from drop down
    #Then select case by using from to filter for Approve
    #And Select Arbitrater from the dropdown As "Arbitrator One "
    #And click on ApproveFilter btn
    #And click on the Preview Btn
    #And click on final Approve btn
    #And click on closeFilter btn
    
    #@Admin_Arbitrator_Admin
    #Scenario: Upload - Confirm -assign -approve 
       #Given User is ready to take action as bulk uploade and click on bulk upload
    #Then user login on arbitrator dashboard url as "https://staging.presolv360.com/login"
   #And user logged using uName as "arbone" and passwoed as "User@1234" and click on logged in 
  