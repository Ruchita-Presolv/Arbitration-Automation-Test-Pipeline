Feature: Actions from start to end based on the case

  @Admin_Admin
  Scenario: Verify that admin upload cases and assign to the arbitrator
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
    Given User is ready to take action as bulk uploade and click on bulk upload
    Then user select action as Case.csv  from drop down
    And user enter the batch name
    Then user select the claimant from drop down list
    And user add the .csv file to upload 10cases
    Then user click on the CsvSubmit btn
    And user click on the CsvConfirm  btn
    And then user finally click on the Csvclose btn
    # Then user click on the action button
    Given user checked  the select first cases to Approve check box
    # Given user ckecked the select all cases check box
    Then user click on the confirm butten
    And and set date
    Then click on confirn and click on close btn
    #But user click on the action button
    Given user checked  the select first cases to Approve check box
    And Select Arbitrater from the dropdown As "Arbitrator One "
    And click on Approve btn
    And click on the Preview Btn
    And click on final Approve btn
    And click on close btn
    Then user click on ongoing btn and capture 10th case id from it and assignee status

  @Arbitrator
  Scenario: Arbitrator accept the case
    Given Arb user is on login page
    Then ArbUser name and ArbPassword field is displayed
    When user see the user name field then enter ArbUser name
    Then user see the user password field then enter Arb password
    Given user is on the dashboard page and click on the new request action
    Then user search for the case id and select the case to accept
    #And user then click on Accept btn to accept all selected cases
    And user click on accept btn and when he see the title as "Consent and Disclosures" then click on submit btn
    When user see the success massage then he click on ok btn

  @Admin_Admin2
  Scenario: Verify  that additional doc uploaded or not
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
    Then user click on ongoing btn and select the previously approved case and upload additional documents
    Then user select first case and upload additional doc
    But user verify that additional doc uploaded or not

  # @Arbitrator1
  #Scenario: Arbitrator accept the case
  #Given Arb user is on login page
  #Then ArbUser name and ArbPassword field is displayed
  #When user see the user name field then enter ArbUser name
  #Then user see the user password field then enter Arb password
  #Given user is on the dashboard page and click on the new request action
  #Then user capture 1 case id on the page and  click on ongoing
  @Noti1_Assign_Accept
  Scenario: Verify that admin upload cases and assign to the arbitrator
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
    Given User is ready to take action as bulk uploade and click on bulk upload
    Then user select action as Case.csv  from drop down
    And user enter the batch name
    Then user select the claimant from drop down list
    And user add the .csv file to upload 10cases
    Then user click on the CsvSubmit btn
    And user click on the CsvConfirm  btn
    And then user finally click on the Csvclose btn
    # Then user click on the action button
    Given user checked  the select first cases to Approve check box
    # Given user ckecked the select all cases check box
    Then user click on the confirm butten
    And and set date
    Then click on confirn and click on close btn
    #But user click on the action button
    Given user checked  the select first cases to Approve check box
    And Select Arbitrater from the dropdown As "Arbitrator One "
    And click on Approve btn
    And click on the Preview Btn
    And click on final Approve btn
    And click on close btn
    Then user click on ongoing btn and capture 10th case id from it and assignee status
    But user add new window and switch on that and then set url for user login  user name as "arbone" and password as "User@1234"
    #Then ArbUser name and ArbPassword field is displayed
    # When user see the user name field then enter ArbUser name
    #Then user see the user password field then enter Arb password
    Given user is on the dashboard page and click on the new request action
    Then user search for the case id and select the case to accept
    #And user then click on Accept btn to accept all selected cases
    And user click on accept btn and when he see the title as "Consent and Disclosures" then click on submit btn
    When user see the success massage then he click on ok btn

  @ArbitratorDirNotif
  Scenario: Verify that Mail record is visible or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on the Mail record btn
    When user see the Send mail page then search result based on date as "06-09-2024" if result found then mail send successfully

  #Email
  @Email_DRCN_ARBTR @NotiF
  Scenario: Verify that on admin dashboard Email Queue for DRCN_ARBTR notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on Email Queue notification and check page title as "Email Queue"
    Then user add event type as "DRCN_ARBTR" and date as from "15-10-2024" and to "29-10-2024" and staus as "Sent" and click on search btn
    When user see the result based Event name as "DRCN_ARBTR" on above filter and varify the sent result

  @Email_WDRN_ADM @NotiF
  Scenario: Verify that on admin dashboard Email Queue for WDRN_ADM notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on Email Queue notification and check page title as "Email Queue"
    Then user add event type as "WDRN_ADM" and date as from "15-10-2024" and to "29-10-2024" and staus as "Sent" and click on search btn
    When user see the result based Event name as "WDRN_ADM" on above filter and varify the sent result

  @Email_ASGNARBTR_ADM @NotiF
  Scenario: Verify that on admin dashboard Email Queue for ASGNARBTR_ADM notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on Email Queue notification and check page title as "Email Queue"
    Then user add event type as "ASGNARBTR_ADM" and date as from "15-10-2024" and to "29-10-2024" and staus as "Sent" and click on search btn
    When user see the result based Event name as "ASGNARBTR_ADM" on above filter and varify the sent result

  @Email_ACPTARB_ADM @NotiF
  Scenario: Verify that on admin dashboard Email Queue for ACPTARB_ADM notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on Email Queue notification and check page title as "Email Queue"
    Then user add event type as "ACPTARB_ADM" and date as from "15-10-2024" and to "29-10-2024" and staus as "Sent" and click on search btn
    When user see the result based Event name as "ACPTARB_ADM" on above filter and varify the sent result

  @Email_ACPTARB_ARBTR @NotiF
  Scenario: Verify that on admin dashboard Email Queue for ACPTARB_ARBTR notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on Email Queue notification and check page title as "Email Queue"
    Then user add event type as "ACPTARB_ARBTR" and date as from "15-10-2024" and to "29-10-2024" and staus as "Sent" and click on search btn
    When user see the result based Event name as "ACPTARB_ARBTR" on above filter and varify the sent result

  #WhatsApp
  @WhatsApp_DRCN_ARBTR @NotiF
  Scenario: Verify that on admin dashboard WhatsApp Queue for DRCN_ARBTR notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on WhatsApp Queue notification and check page title as "WhatsApp Queue"
    Then user add event type as "DRCN_ARBTR" and date as from "15-10-2024" and to "29-10-2024" and status as "Sent" and click on search for whatsApp  btn
    When user see the result based Event name as "DRCN_ARBTR" on above filter and varify the sent result

  @WhatsApp_ACPTARB_ADM @NotiF
  Scenario: Verify that on admin dashboard WhatsApp Queue for ACPTARB_ADM notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on WhatsApp Queue notification and check page title as "WhatsApp Queue"
    Then user add event type as "ACPTARB_ADM" and date as from "15-10-2024" and to "29-10-2024" and status as "Sent" and click on search for whatsApp  btn
    When user see the result based Event name as "ACPTARB_ADM" on above filter and varify the sent result

  @WhatsApp_ACPTARB_ARBTR @NotiF
  Scenario: Verify that on admin dashboard WhatsApp Queue for ACPTARB_ARBTR notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on WhatsApp Queue notification and check page title as "WhatsApp Queue"
    Then user add event type as "ACPTARB_ARBTR" and date as from "15-10-2024" and to "29-10-2024" and status as "Sent" and click on search for whatsApp  btn
    When user see the result based Event name as "ACPTARB_ARBTR" on above filter and varify the sent result

  @WhatsApp_WDRN_ADM @NotiF
  Scenario: Verify that on admin dashboard WhatsApp Queue for WDRN_ADM notifications was sent or not
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on WhatsApp Queue notification and check page title as "WhatsApp Queue"
    Then user add event type as "WDRN_ADM" and date as from "15-10-2024" and to "29-10-2024" and status as "Sent" and click on search for whatsApp  btn
    When user see the result based Event name as "WDRN_ADM" on above filter and varify the sent result

  #Download
  @Email_DRCN_ARBTR_Down @NotiF
  Scenario: Verify that user able to download  Email Queue
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on Email Queue notification and check page title as "Email Queue"
    Then user add event type as "DRCN_ARBTR" and date as from "15-10-2024" and to "29-10-2024" and staus as "Sent" and click on search btn
    And user click on select all to download btn and click on download btn
    Then user click on confirm btn and verify success massage

  @WhatsApp_DRCN_ARBTR_Down @NotiF
  Scenario: Verify that user able to download WhatsApp Queue
    Given User is on login page
    Then Username field is displayed
    And Password field is displayed
    And User enters username
    And User enters password
    Then Click on login button
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
    And user is on dashboard page and title as "Presolv360 Admin"
    Then user click on Notifications Queue btn
    And user click on WhatsApp Queue notification and check page title as "WhatsApp Queue"
    Then user add event type as "DRCN_ARBTR" and date as from "15-10-2024" and to "29-10-2024" and status as "Sent" and click on search for whatsApp  btn
    And user click on select WhatsApp massage  to download btn and click on download btn
    Then user click on confirm btn and verify success massage

  #Resent
  #@Admin @WhatsApp&EmailQueue @NotiF
  #Scenario: Verify that on admin dashboard WhatsApp Queue for WDRN_ADM notifications was sent or not
  #Given User is on login page
  #Then Username field is displayed
  #And Password field is displayed
  #And User enters username
  #And User enters password
  #Then Click on login button
  #And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
  #And user is on dashboard page and title as "Presolv360 Admin"
  #Then user click on Notifications Queue btn
  #And user click on WhatsApp & Email Queue and check the page title as "WhatsApp & Email Queue"
  #Then user check for pending records
  #
  # @Admin @Noti2_direction
  Scenario: Arbitrator accept the case
    Given Arb user is on login page
    Then ArbUser name and ArbPassword field is displayed
    When user see the user name field then enter ArbUser name
    Then user see the user password field then enter Arb password
    # When user performs actions in the first case
    And user is on the dashboard page and click on the Ongoing Action
    Given user is on ongoing page and in first case send direction as Closure (contested)
    And user click on send direction and click on preview btn and click on send direction
    But user wait for some time
    Given user is on ongoing page and in first case send direction as Closure Informal Reply
    And user click on send direction and click on preview btn and click on send direction
    But user wait for some time
    Given user is on ongoing page and in first case send direction as Confirmation of arbtrator
    And user click on send direction and click on preview btn and click on send direction
