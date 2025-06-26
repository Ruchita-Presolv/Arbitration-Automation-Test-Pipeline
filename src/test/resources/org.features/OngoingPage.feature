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

  @Admin @Sanity @upload
  Scenario: Select single case and upload additional document
    Given user in on ongoing page and verify the title as "Ongoing"
    Then user select first case and upload additional doc

  @Admin @Sanity @withdraw
  Scenario: 3) select single case from platform  and perform action withdraw case selected
    Given user is on ongoing page and select single case to perform withdraw action
    And user click on withdraw perticular selected case

  @Admin @Smoke @ActionRefId1
  Scenario: 4)  user select single case from platform and take any action present in Action tab like case refrence id change
    Given user is on ongoing page and click on the Action btn and select single case
    But user capture previous RefId and select action as Update Refrence ID
    Then user user add new refrence id to the selected case and click on the submit btn
    And user compare the both ref. id. if both should be different

  @Admin @Smoke @ActionArbilog2
  Scenario: 4)2  user select single case from platform and take any action present in Action tab like Arbitrator Log
    Given user is on ongoing page and select single case and click on the Action btn
    Then user select action as Arbitrator log
    And user should be able to see the Arbitrator Added and date when assign
    Then user should be  able to close the Arbitrator Log

  @Admin @Sanity @ActionAssignArbi3
  Scenario: 4)3  user select single case from platform and take any action present in Action tab like Assign Arbitrator
    Given user is on ongoing page and select single case and capture old arbitrator name  click on the Action btn
    Then user select action as Assign Arbitrator
    And user select the arbitrator from the dropdown list
    Then user add reason as "Previous arbitrator is not available,So to avoid delay in arbitration process we assign new Arbitrator"
    And user click on the Assign btn
    And user verify that the new arbitrator added successfully or not by compairing previous and new added

  @Admin @Sanity @ActionAddLawyerAndWithdraw4
  Scenario: 4)4{1}  user select single case from platform and take any action present in Action tab like Add Lawyer
    Given user is on ongoing page and select single case and click on the Action btn
    Then user select action as Add Lawyer
    And user enter first name as "Prashant" and last name as "Presolv"
    And user add   Email ID "prashant@presolv360.com" and Moblie No "7218722304" and
    Then user enter Other details as "Success is not final; failure is not fatal: It is the courage to continue that counts."
    And user click on the submit btn
    Then verify that Lawyer added successfully or not
    #And user withdraw the same case because its action get change from add Lawyer to view Lawyer(update)
    And user is on ongoing page select the first case and click on the view lawyer details and update it
    Then user delete the lawyer from the selected case id

  @Admin @Sanity @ActionAddLawyer4
  Scenario: 4)4{2}  user select single case from platform and take any action present in Action tab like Add Lawyer to update
    Given user is on ongoing page and select single case and click on the Action btn
    Then user select action as Add Lawyer
    And user enter first name as "Niraj" and last name as "Presolv"
    And user add   Email ID "niraj@presolv360.com" and Moblie No "8881099089" and
    Then user enter Other details as "I know the price of success: dedication, hard work and an unremitting devotion to the things you want to see happen."
    And user click on the submit btn
    Then verify that Lawyer added successfully or not

  #@new
  #Scenario: 4)4{1}  user select single case from platform and take any action present in Action tab like Add Lawyer to update
  #Given user is on ongoing page and select single case and click on the Action btn
  #Then user select action as Add Lawyer
  #And user enter first name as "Akshay" and last name as "Rane"
  #And user add   Email ID "Akshaysds@gmail.com" and Moblie No "2100087000" and
  #Then user enter Other details as "I know the price of success: dedication, hard work and an unremitting devotion to the things you want to see happen."
  #And user click on the submit btn
  #Then verify that Lawyer added successfully or not
  #@Sample
  #Scenario: 4)4{2}  user select single case from platform and take any action present in Action tab like Add Lawyer
  #Given user is on ongoing page and select single case and click on the Action btn
  #Then user select action as Add Lawyer
  #And user enter first name as "Akshay" and last name as "Rane"
  #And user add   Email ID "Akshaysds@gmail.com" and Moblie No "2100087000" and
  #Then user enter Other details as "I know the price of success: dedication, hard work and an unremitting devotion to the things you want to see happen."
  #And user click on the submit btn
  #And user click on the Addsubmit btn
  #Then verify that Lawyer added successfully or not
  @Admin @Sanity @ActionUpdateLawyer4
  Scenario: 4)4{3}  user select single case from platform and update Lawyer details which is added previously
    Given user is on ongoing page select the first case and click on the view lawyer details and update it
    And user clear the previous Arbitrator details and enter first name as "Niraj" and last name as "Singh"
    And user user clear the previous Arbitrator details and add   Email ID "niraj@presolv360.com" and Moblie No "8881099089" and
    Then user user clear the previous Arbitrator details and enter Other details as "updated lawyer details due to non availability of assign one "
    And user click on the update  btn
    Then verify that updated Lawyer added successfully or not

  #And user delete the lawyer from the selected case id
  
  @Admin @Sanity @DeleteLawyer4
  Scenario: 4)4{3}  user select single case from platform and delete Lawyer details which is added previously
    Given user is on ongoing page select the first case and click on the view lawyer details and update it
    And user delete the lawyer from the selected case id

  @Admin @Sanity @ClaimSummery
  Scenario: 5)  user select single case from platform and take any action present in Action tab like Claim Summary
    Given user is on ongoing page and select single case and click on the Action btn
    And user select action as Claim Summary
    And user verify it is download successfully and click on the Ok btn

  @Admin @Sanity @UploadPartyReply
  Scenario: 6) user select single case from platform and take any action present in Action tab like Upload Party Reply
    Given user is on ongoing page and select single case and click on the Action btn
    And user select action as Upload Party Reply
    When user click on the View Details then pdf should be download to check the case details
    Then user add the Party Name as "Jindal Steel Power"
    And user add reply as "All our dreams can come true, if we have the courage to pursue them. Don’t limit yourself. Many people limit themselves to what they think they can do. You can go as far as your mind lets you. What you believe, remember, you can achieve.It’s hard to beat a person who never gives up."
    And user add  Attachment in party reply
    Then user click on the party reply submit btn

  @Admin @Sanity @EditPartyDetails
  Scenario: 7) user select single case from platform and take any action present in Action tab like Edit Party Details
    Given user is on ongoing page and select single case and click on the Action btn
    And user select action as Edit Party Details
    Then user click on the Add Claimant Party btn
    And user ada email Id as "chandresh@presolv360.com" and Mobile No as "8866822947"
    Then user Enter Each Claimants Name,Status as "Chandresh Pawar  East Dadar Mumbai  Pin:400002 MoNo : 8866822947"
   # And user click on the Add Responding Party btn
    #Then user add email Id as "shubham@presolv360.com" and Mobile No as "8888927018"
    And user Enter Each Respondent Name,Status as "Shubham Shetty  Andheri West Mumbai  Pin:400004 MoNo : 8888927018"
    Then user click on the Edit Party Details submit btn
    And user verify the final update massage and click on the ok btn

  #But user again go on the ongoing page and select the same case id and click on the case details
  #Then user verify the other claimant details as per update or not email Id as "Rahul@gmail.com" and Mobile No as "0001001010" Claimants Name,Status as "Rahul Pawar  East Dadar Mumbai  Pin:400002 MoNo : 9008989999"
  #And user also verify the Other Respondent details as per updated or not email Id as "Ganesh@gmail.com" and Mobile No as "0054671010" Respondent Name,Status as "Ganesh Shetty  Andheri West Mumbai  Pin:400004 MoNo : 7968989999"
  
  @Admin @Sanity @DeletePartyDetailsAdded
  Scenario: 7)2 user select single case from platform and take any action present in Action tab like Edit Party Details
    Given user is on ongoing page and select single case and click on the Action btn
    And user select action as Edit Party Details
    Then user delete the claimant and Respondent previously added

  @Admin @Sanity @uploadSOD
  Scenario: 7)3 user select single case from platform and take any action present in Action tab like Upload SOD  zip file
    Given user is on ongoing page and search for case id as "A015626"
    Then user click on the action btn and select action as like Upload SOD
    And user select zip file to upload
    And user click on the SOD submit btn
    Then user verify the success massage as "Statement of Defence submitted" and then user click on the ok btn

  #A002328
  @Admin @Smoke @ViewDocumentList
  Scenario: 8)user select single case from platform and take any action present in Action tab like View Document List
    Given user is on ongoing page and select single case and click on the Action btn
    And user select action as View Document List
    Then user able to see the documents present in the selected case

  @Admin @Smoke @shared
  Scenario: 9)user select single case from platform and take any action present in Action tab like shared
    Given user is on ongoing page and select single case and click on the Action btn
    And user select action as Shared
    Then user enter the comment in the input box and then user click on the sent btn
    And user verify that the comment added Successfully or not

 # @Admin @Smoke @Private
  #Scenario: 9)user select single case from platform and take any action present in Action tab like Private
    #Given user is on ongoing page and select single case and click on the Action btn
    #And user select action as Private
    #Then user add the comment in the input box and and click on the send btn
    #And user verify that the comment added Successfully or not
