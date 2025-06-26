Feature: User perform action by using random/General case filter and perform bulk upload Action

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
    And User is on ongoing page and ready to take action as bulk uploade and click on bulk upload

   @Admin @Sanity @BulkUploadCaseCsv
  Scenario: 4[1]  After clicking random case filter user able to perform action by using bulk upload  Case.CSV
    Given user select the action Case .csv
    Then user click on the batch name and add batch name
    And user select the user name as Presolv User via Bombay Blokes
    Then user select the case .csv file to uplad and click on the upload btn
    When user see the confirm btn then he  click on confirm btn  and finally click on close btn

@Admin @Sanity @BulkUploadCaseCsv2
  Scenario: 4[1]  After clicking random case filter user able to perform action by using bulk upload  Case.CSV
    Given user select the action Case .csv
    Then user click on the batch name and add batch name
     And user select the user name as Presolv User via Bombay Blokes1
    Then user select the case .csv file to uplad and click on the upload btn
    When user see the confirm btn then he  click on confirm btn  and finally click on close btn




  @Admin @Sanity @ZIPSOC
  Scenario: 4[2]By using bulk upload .ZIP SOC
    Given user select the .ZIP SOC
    And user select the file for claim
    Then user select the file for support and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @InterimOrder
  Scenario: 4[3]By using bulk upload InterimOrder . zip
    Given user select the InterimOrder . zip
    And user select file as interimorder to upload and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @Award
  Scenario: 4[4]By using bulk upload Award
    Given user select the upload Award
    And user select file  as Award.zip and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

 @Admin @Sanity @CourierCsv_NOA_SOC_Dispatchproof
  Scenario: 4[5/1]By using bulk upload  Courier.csv
    Given user select Courier .CSV
    But user select the file type as NOA to SOC_Dispatch proof
    And then user add file to upload as Courier .CSV and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @ZipCourier_NOA_SOC_Dispatchproof
  Scenario: 4[5/2]By using bulk upload ZipCourier
    Given user click ZipCourier
    But user select the file type as NOA to SOC_Dispatch proof
    And user add file to upload as Zip courier and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @CourierCsv_NOA_to_SOC_Tracking
  Scenario: 4[5/3]By using bulk upload  Courier.csv
    Given user select Courier .CSV
    But user select the file type as NOA to SOC_Tracking
    And then user add file to upload as Courier .CSV and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @ZipCourier_NOA_to_SOC_Tracking
  Scenario: 4[5/4]By using bulk upload ZipCourier
    Given user click ZipCourier
    But user select the file type as NOA to SOC_Dispatch proof
    And user add file to upload as Zip courier and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @CourierCsv_Award_Dispatch_proof
  Scenario: 4[5/5]By using bulk upload  Courier.csv
    Given user select Courier .CSV
    But user select the file type as Award_Dispatch proof
    And then user add file to upload as Courier .CSV and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @ZipCourier_Award_Dispatch_proof
  Scenario: 4[5/6]By using bulk upload ZipCourier
    Given user click ZipCourier
    But user select the file type as Award_Dispatch proof
    And user add file to upload as Zip courier and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @CourierCsvAward_Tracking
  Scenario: 4[5/7]By using bulk upload  Courier.csv
    Given user select Courier .CSV
    But user select the file type as Award_Tracking
    And then user add file to upload as Courier .CSV and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @ZipCourierCsvAward_Tracking
  Scenario: 4[5/8]By using bulk upload ZipCourier
    Given user click ZipCourier
    But user select the file type as Award_Tracking
    And user add file to upload as Zip courier and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @CourierCsvAward_Tracking_Dispatch_Proof
  Scenario: 4[5/9]By using bulk upload  Courier.csv
    Given user select Courier .CSV
    But user select the file type as Award_Tracking
    When user click on yes radio button
    And then user add file to upload as Courier .CSV
    Then user add pdf file as a proof and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @ZipCourierCsvAward_Tracking_Dispatch_Proof
  Scenario: 4[5/10]By using bulk upload ZipCourier
    Given user click ZipCourier
    But user select the file type as Award_Tracking
    And user add file to upload as Zip courier and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

  @Admin @Sanity @AdditionalDoc
  Scenario: 4[6]By using bulk upload AdditionalDoc
    Given user select the upload AdditionalDoc
    Then user click on Upload Additional Doc .CSV and select file
    And also user click on Upload Additional Doc .ZIP and select file and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn

 @Admin @Sanity @CourierCsvAward_Tracking_Dispatch_Proof1
  Scenario: 4[5/9]By using bulk upload  Courier.csv
    Given user select Courier .CSV
    But user select the file type as Award_Tracking
    When user click on yes radio button
    And then user add file to upload as Courier .CSV
    Then user add pdf file as a proof and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn
    And User is on ongoing page and ready to take action as bulk uploade and click on bulk upload
    Given user click ZipCourier
    But user select the file type as Award_Tracking
    And user add file to upload as Zip courier and click on upload btn
    And user click on confirm btn and verify success massage and click on close btn
#
  #@BulkUploadCaseCsv
  #Scenario: 4[1]  After clicking random case filter user able to perform action by using bulk upload  Case.CSV
    #Given user select action  Case.csv  from the given option
    #And user click on batch name and enter the batch name
    #Then user select the claimant from drop down list
    #And user add the .csv file to upload
    #Then user click on the CsvUpload btn
    #And user click on the CsvConfirm  btn
    #And then user finally click on the Csvclose btn
#
  #@ZIPSOC
  #Scenario: 4[2]By using bulk upload .ZIP SOC
    #Then user select action .ZIP SOC from drop down
    #And user click on the Claim ZIP input box to upload claim.zip
    #And user click on the Supporting ZIP input box to upload Supporting ZIP
    #Then user click on on upload btn
    #And user click on the confirm btn and then close btn
#
  #@InterimOrder
  #Scenario: 4[3]By using bulk upload InterimOrder . zip
    #Given user select action as Interim Order from drop down
    #And user selet file InterimOrder . zip to upload
    #Then user click on the uploadZip btn
    #And user click on the ZipClose btn
#
  #@Award
  #Scenario: 4[4]By using bulk upload Award
    #Given user select action as Award  from drop down
    #And user select file as Award to upload
    #Then user click on the uploadAward btn
    #And user click on the AClose
#
  #@CourierCsv
  #Scenario: 4[5]By using bulk upload  Courier.csv
    #Given user select action as  Courier.csv  from drop down
    #And user enters the file name (Optional)
    #Then user select the file as Courier.csvFile to upload
    #And User click on the Upload btn
    #Then user click on the Confirm btn
    #And user click on the final Close btn
#
  #@ZipCourier
  #Scenario: 4[6]By using bulk upload ZipCourier
    #Given user select action as  ZipCourier  from drop down
    #And user enters the  type file name (Optional)
    #Then user select the file as ZipCourier File to upload
    #And User click on the ZipUpload btn
    #Then user click on the  ZipUpload Confirm btn
    #And user click on the final ZipUploadClose btn
#
  #@AdditionalDoc
  #Scenario: 4[6]By using bulk upload AdditionalDoc
    #Given user select action as  AdditionalDoc  from drop down
    #Then user select the file as AdditionalDoc File to upload
    #And User click on the AdditionalUpload btn
    #And user click on the AdditionalDoc Close btn
