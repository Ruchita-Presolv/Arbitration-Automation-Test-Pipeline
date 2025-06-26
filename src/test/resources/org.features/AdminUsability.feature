Feature: Verify that Basic usability of all functionality

  Background: 
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button

  @Admin @Smoke @Dashboard
  Scenario: verify that all input/filter working or not for Dashboard
    Given user is on dashboard page and verify that from to date input field working or not
    Then user verify that able to select arbitrator name and also the Enterprise from the dropdown
    And user check he is able to Download Chat360 Data for certain time period

  @Admin @Smoke @ArbitrationNotificationsStatus
  Scenario: verify that user able to see the Arbitration Notifications and update status 
    Given user is on dashboard page click on the Arbitration Notifications
    Then user verify that able to see the arbitration notification or not

@Admin @Smoke @ArbitrationNotifications
  Scenario: verify that user able to see the Arbitration Notifications 
    Given user is on dashboard page click on the Arbitration Notifications
    Then user verify that notifications were displayed or not 

  @Admin @Smoke @ShareFileFun
  Scenario: verify that user able click on share file and also verify input field working or not
    Given user is on dashboard page and click on the Shared Files and verify that page loaded or not
    Then user verifies that all input field are working or not on the page

  @Admin @Sanity @ShareFileUpload
  Scenario: verify that user able click on share file and also verify that able to upload the file
    Given user is on dashboard page and click on the Shared Files and verify that page loaded or not
    Then user click on upload file and select file to upload also select user and click on submit btn
    And user verify the success status and click on ok btn

  @Admin @Smoke @ResolvBtn
  Scenario: verify that user able to click on the Resolv and Verify that all sub action present in it
    Given user is on the dashboard page and click on the Resolv btn and get all action present in it
    When user see the Arbitration360 then click and get all action present in it
    Then user verifies that able to perform all action present in it or not

  @Admin @Smoke @ResolvBtnActionsWorking
  Scenario: verify that user able to click on the Resolv and Verify that all sub action present in it and its usability
    Given user is on the dashboard page and click on the Resolv btn and get all action present in it
    When user see the Arbitration360 then click and get all action present in it and verifies all are working or not
    But user click on For Admin Review action and verify that the page is properly loaded or not and title as "For Admin Review"
    Then user click on Ongoing action and verify that the page is properly loaded or not and title as "Ongoing"
    And user click on Closed action and verify that the page is properly loaded or not and title as "Closed"
    And user click on Rejected action and verify that the page is properly loaded or not and title as "rejected"
    Then user click on  Document list and verify that the page is properly loaded or not and title as "Document list"

  @Admin @Smoke @AddNewBtn
  Scenario: verify that user able to click on the Add New and verify that all sub action present in it
    Given user is on the dashboard page and click on Add new btn and get all action present in it and verify all are working  or not
    Then user click on Users and get all action present in it and verify all are working or not

  @Admin @Smoke @Reports
  Scenario: verify that user able to click on the Reports and verify that all sub action present in it
    Given user is on the dashboard page and click on Reports btn and get all action present in it and verify all are working  or not

  @Admin @Smoke @ReportAllActions
  Scenario: verify that user able to click on the Reports and verify that all sub action present in it usability
    Given user is on dashboard page and click on Report and then click on  whatsapp and verify page loaded or not
    Then user verify the usability of VC Report action and title as "Zoom Meeting List"
    And user verify the  E sign/E stamp
    Then user verify the Ivr Call action and  title as "Incoming call"
    And user verify the Report action and title as "All Users"

  @Admin @Smoke @MenuControl
  Scenario: Verify that user able to click on Menu Control and able to add or update the menu
    Given user is on dashboard page and click on  Menu Control and verify page loaded or not
    And user verify the page title as "Add Menu" and also check that all input field are working or not

  @Admin @Smoke @UserAccessControl
  Scenario: Verify that user able to click on User Access Control and able see User Access Management
    Given user is on dashboard page and click on  User Access Control and verify page loaded or not and page title as "User Access Management"

  #@Admin @Smoke @UpdateProfile
  #Scenario: Verify that user able to click on Update Profile and able see Update Profile
    #Given user is on dashboard page and click on  Update Profile and verify page loaded or not and page title as "Update Profile"
