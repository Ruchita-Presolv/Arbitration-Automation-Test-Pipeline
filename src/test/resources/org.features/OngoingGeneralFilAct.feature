Feature: User perform All Actions using General case Filter on Ongoing page

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
    When user select general case filter
    Then user see from to input window and click on the from and select case
    And user click on the To and select case
    Then user click on the bulk Action

  # 3] General case filter only cases added in from to input window and perform bulk Action
  #@FromToFilter1
  #Scenario: 3[1] select cases by using from to filter and keep except input box empty Bulk Close
    #Given user add cases in filter and  select action as Bulk Close
    #Then User add reason for close and Apply
    #And user close the BulkClose case

  #@FromToFilter2
  #Scenario: 3[2] select cases by using from to filter Bulk Withdraw
    #Given user add cases in filter and  select action as Bulk Withdraw
    #Then User add reason for close and Apply
    #Then user close the BulkClose case

  @Admin @Sanity @FromToFilter3
  Scenario: 3[3] select cases by using from to filter Upload Additional Doc
    Given user add cases in filter and  select action as Upload Additional Doc
    Then user select additional document to upload
    And user click the submit btn
    When user see the uploaded process completed the user click on the close

  @Admin @Sanity @FromToFilter4
  Scenario: 3[4] select cases by using from to filter Download Award Sheet
    Given user add cases in filter and  select action as Download Award Sheet

  @Admin @Sanity @FromToFilter51WCover
  Scenario: 3[5][1] select cases by using from to filter Download Documents like Notice of arbitration
    Given user select action as Download Documents
    And user select the  Notice of arbitration to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter52WCover
  Scenario: 3[5][2] select cases by using from to filter Download Documents like Arbitrator Consent
    Given user select action as Download Documents
    And user select the   Arbitrator Consent to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter53WCover
  Scenario: 3[5][3] select cases by using from to filter Download Documents like  Statement of claim
    Given user select action as Download Documents
    And user select the   Statement of claim to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter54WCover
  Scenario: 3[5][4] select cases by using from to filter Download Documents like Direction by arbtrator
    Given user select action as Download Documents
    And user select the   Direction by arbtrator to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter55WCover
  Scenario: 3[5][5] select cases by using from to filter Download Documents like Application
    Given user select action as Download Documents
    And user select the   Application to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter56WCover
  Scenario: 3[5][6] select cases by using from to filter Download Documents like Award or Interm
    Given user select action as Download Documents
    And user select the Award or Interm order by arbtrator to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter57WCover
  Scenario: 3[5][7] select cases by using from to filter Download Documents like Additonal documents
    Given user select action as Download Documents
    And user select the Additonal documents to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter58WCover
  Scenario: 3[5][8] select cases by using from to filter Download Documents like Award delevery
    Given user select action as Download Documents
    And user select the  Award delevery report to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter59WCover
  Scenario: 3[5][9] select cases by using from to filter Download Documents like Party reply
    Given user select action as Download Documents
    And user select the   Party reply to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter510WCover
  Scenario: 3[5][10] select cases by using from to filter downloadAll Documents
    Given user select action as Download Documents
    # And user select All document  to download
    Then user click on the downloadAll btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter511WCover
  Scenario: 3[5][11] select cases by using from to filter Download Random Documents
    Given user select action as Download Documents
    And user select Random  document  to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

@Admin @Sanity @FromToFilter511NCover
  Scenario: 3[5][11] select cases by using from to filter Download Random Documents
    Given user select action as Download Documents
    And user select Random  document  to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn




  @Admin @Sanity @FromToFilter512
  Scenario: 3[5][12] select cases by using from to filter Download Documents
    Given user select action as Download Documents
    Then user click on the Close btn

  # 4]General case filter only cases added in from to and Except input window and perform bulk Action
  @Admin @Sanity @FromToFilter41
  Scenario: 4[1] select cases by using from to filter and add cases in except box and Bulk Close
    But user here add cases in except input box
    Given user add cases in filter and  select action as Bulk Close
    Then User add reason for close and Apply
    And user close the BulkClose case

  @Admin @Sanity @FromToFilter42
  Scenario: 4[2] select cases by using from to filter Bulk Withdraw
    But user here add cases in except input box
    Given user add cases in filter and  select action as Bulk Withdraw
    Then User add reason for close and Apply
    Then user close the BulkClose case

  @Admin @Sanity @FromToFilter43
  Scenario: 4[3] select cases by using from to filter Upload Additional Doc
    But user here add cases in except input box
    Given user add cases in filter and  select action as Upload Additional Doc
    Then user select additional document to upload
    And user click the submit btn
    When user see the uploaded process completed the user click on the close

  @Admin @Sanity @FromToFilter44
  Scenario: 4[4] select cases by using from to filter Download Award Sheet
    But user here add cases in except input box
    Given user add cases in filter and  select action as Download Award Sheet

  @Admin @Sanity @FromToFilter451
  Scenario: 4[5][1] select cases by using from to filter Download Documents like Notice of arbitration
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the  Notice of arbitration to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter452
  Scenario: 4[5][2] select cases by using from to filter Download Documents like Arbitrator Consent
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the   Arbitrator Consent to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter453
  Scenario: 4[5][3] select cases by using from to filter Download Documents like Statement of claim
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the   Statement of claim to download
    Then user click on the Docdownload btn
      When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter454
  Scenario: 4[5][4] select cases by using from to filter Download Documents like Direction by arbtrator
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the   Direction by arbtrator to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter455
  Scenario: 4[5][5] select cases by using from to filter Download Documents like Application
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the   Application to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter456
  Scenario: 4[5][6] select cases by using from to filter Download Documents like Award or Interm
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the Award or Interm order by arbtrator to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter457
  Scenario: 4[5][7] select cases by using from to filter Download Documents like Additonal
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the Additonal documents to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter458
  Scenario: 4[5][8] select cases by using from to filter Download Documents like Award delevery report
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the  Award delevery report to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter459
  Scenario: 4[5][9] select cases by using from to filter Download Documents like Party reply
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select the   Party reply to download
    Then user click on the Docdownload btn
      When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter4510
  Scenario: 4[5][10] select cases by using from to filter downloadAll Documents
    But user here add cases in except input box
    Given user select action as Download Documents
    # And user select All document  to download
    Then user click on the downloadAll btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter4511
  Scenario: 4[5][11] select cases by using from to filter Download Random Documents
    But user here add cases in except input box
    Given user select action as Download Documents
    And user select Random  document  to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download without cover letter
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter4512
  Scenario: 4[5][12] select cases by using from to filter Download Documents
    But user here add cases in except input box
    Given user select action as Download Documents
    Then user click on the Close btn

  # 5] select single  cases by using from to filter and keep except input box empty  and perform action  present in dropdown
  #General case filter only cases added in from to input window and perform bulk Action
  @Admin @Sanity @FromToFilter051
  Scenario: 5[1] select Single case by using from to filter and keep except input box empty Bulk Close
    But user select single case and take action
    Given user add cases in filter and  select action as Bulk Close
    Then User add reason for close and Apply
    And user close the BulkClose case

  @Admin @Sanity @FromToFilter052
  Scenario: 5[2] select Single cases by using from to filter Bulk Withdraw
    But user select single case and take action
    Given user add cases in filter and  select action as Bulk Withdraw
    Then User add reason for close and Apply
    Then user close the BulkClose case

  @Admin @Sanity @FromToFilter053
  Scenario: 5[3] select  Single cases by using from to filter Upload Additional Doc
    But user select single case and take action
    Given user add cases in filter and  select action as Upload Additional Doc
    Then user select additional document to upload
    And user click the submit btn
    When user see the uploaded process completed the user click on the close

  @Admin @Sanity @FromToFilter054
  Scenario: 5[4] select Single cases by using from to filter Download Award Sheet
    But user select single case and take action
    Given user add cases in filter and  select action as Download Award Sheet

  @Admin @Sanity @FromToFilter551
  Scenario: 5[5][1] select Single  cases by using from to filter Download Documents like Notice of arbitration
    But user select single case and take action
    Given user select action as Download Documents
    And user select the  Notice of arbitration to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter552
  Scenario: 5[5][2] select Single cases by using from to filter Download Documents like Arbitrator Consent
    But user select single case and take action
    Given user select action as Download Documents
    And user select the   Arbitrator Consent to download
    Then user click on the Docdownload btn
     When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter553
  Scenario: 5[5][3] select Single cases by using from to filter Download Documents like Statement of claim
    But user select single case and take action
    Given user select action as Download Documents
    And user select the   Statement of claim to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter554
  Scenario: 5[5][4] select Single cases by using from to filter Download Documents like Direction by arbtrator
    But user select single case and take action
    Given user select action as Download Documents
    And user select the   Direction by arbtrator to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter555
  Scenario: 5[5][5] select Single cases by using from to filter Download Documents like Application
    But user select single case and take action
    Given user select action as Download Documents
    And user select the   Application to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter556
  Scenario: 5[5][6] select Single cases by using from to filter Download Documents like Award or Interm order
    But user select single case and take action
    Given user select action as Download Documents
    And user select the Award or Interm order by arbtrator to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter557
  Scenario: 5[5][7] select Single cases by using from to filter Download Documents like Additonal documents
    But user select single case and take action
    Given user select action as Download Documents
    And user select the Additonal documents to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter558
  Scenario: 5[5][8] select Single cases by using from to filter Download Documents like Award delevery report
    But user select single case and take action
    Given user select action as Download Documents
    And user select the  Award delevery report to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter559
  Scenario: 5[5][9] select Single cases by using from to filter Download Documents like Party reply
    But user select single case and take action
    Given user select action as Download Documents
    And user select the   Party reply to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter5510
  Scenario: 5[5][10] select Single cases by using from to filter downloadAll Documents
    But user select single case and take action
    Given user select action as Download Documents
    Then user click on the downloadAll btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter5511
  Scenario: 5[5][11] select Single cases by using from to filter Download  Random Documents
    But user select single case and take action
    Given user select action as Download Documents
    And user select Random  document  to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download with cover letter 
    And user verify the success massage and user click on the ok btn

  @Admin @Sanity @FromToFilter5512
  Scenario: 5[5][12] select Single cases by using from to filter Download Documents
    But user select single case and take action
    Given user select action as Download Documents
    Then user click on the Close btn

 @Admin @Sanity @FromToFilter5513
  Scenario: 5[5][11] select Single cases by using from to filter Download  Random Documents
    But user select single case and take action
    Given user select action as Download Documents
    And user select Random  document  to download
    Then user click on the Docdownload btn
    When user see the pop up then he click on download without cover letter 
    And user verify the success massage and user click on the ok btn



  @Admin @Sanity @FromToFilter5uploadBatch
  Scenario: select case using header filter and select cases of one batch and rename
    Given user is on the ongoing page and refresh the page
    Then user select the batch from filter and click on the search btn
    And user select all cases of particular batch to rename
    Then user click on the bulk Action	Tab
    And user select action as Update batch name
    Then user add new batch name and click on the submit btn
   # And user verify the success message and click on the close btn
  # 6] without selecting any case using  from to filter user try to perform bulk action should not be allowed
  
  
  @Admin @Sanity @FromToFilter07
  Scenario: without adding any case user try to perform bulk action
    Given select single case and add same case in except and take action
    And user add cases in filter and  select action as Bulk Close
    Then select action as Bulk Close and then verify the massage
  # 7] if user select cases from platform and also click on input box then unselect the cases  selected before 
 #@FromToFilter07
 #Scenario: verify the bulk action independant of case selection either from to filter or platform
 #Given user already apply the filter and also select the case on the platform 
 #Then user check the previous selection is change or not 
 #And user perform action like Download Award Sheet 
