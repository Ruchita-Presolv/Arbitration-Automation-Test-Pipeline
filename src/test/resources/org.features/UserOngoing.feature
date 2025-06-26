Feature: Ongoing Page 

Background:
Given  User is on user login page 
Then User name and UserPassword field is displayed
When user see the user name field then enter User name 
Then user see the user password field then enter user password
And user verify the user dashboard page title as "Home"
#Then user on home page and click on Arbitration360 btn
And user then click on ongoing btn and verify the page title as "Ongoing"


 #@User @Sanity @Claimantdin
Scenario: Verify that able to send application like as Claimant din in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as "Claimant  din" 
Then user click on send application 
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 

 @User @Sanity @claimantApplicationfororalhearing
Scenario: Verify that able to send application like as Claimant: Application for oral hearing in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for oral hearing
Then user click on send application 
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 

@User @Sanity @claimantIntimationregardingfailureofsettlement
Scenario: Verify that able to send application like as Claimant: Intimation regarding failure of settlement in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Intimation regarding failure of settlement
Then user click on send application 
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 

@User @Sanity @ClaimantApplicationforadditionalevidence
Scenario: Verify that able to send application like as Claimant: Application for additional evidence in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for additional evidence
Then user click on send application 
But user uploade file here 
And click on preview btn and then click on send application btn 
When user see the success massage then user click on close btn 

@User @Sanity @ClaimantApplicationforExtensionSOC
Scenario: Verify that able to send application like as Claimant: Application for Extension - SOC in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for Extension - SOC
Then user click on send application 
And user enter the reason for extention as "A little effort towards saving the environment is better than no effort." and no of days as "25"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @ClaimantApplicationforExtensionFileRejoinder
Scenario: Verify that able to send application like as Claimant: Application for Extension File Rejoinder in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for Extension File Rejoinder
Then user click on send application 
And user enter the reason for extention as "Environment is no one’s property to destroy; it’s everyone’s responsibility to protect." and no of days as "15"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @ClaimantApplicationforextensiontofileReply
Scenario: Verify that able to send application like as Claimant: Application for extension to file Reply in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for extension to file Reply
Then user click on send application 
And user enter the reason for extention as "A nation that destroys its soils destroys itself. Forests are the lungs of our land, purifying the air and giving fresh strength to our people." and no of days as "20"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @ClaimantApplicationforWithdrawal
Scenario: Verify that able to send application like as Claimant: Application for Withdrawal in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for Withdrawal
Then user click on send application 
And user enter the reason for extention as "Earth provides enough to satisfy every man’s needs, but not every man’s greed." 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @ClaimantApplicationforWithdrawalwithLibertytofilefreshproceedings
Scenario: Verify that able to send application like as Claimant: Application for Withdrawal with Liberty to file fresh proceedings in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application for Withdrawal with Liberty to file fresh proceedings
Then user click on send application 
And user enter the reason for extention as "Earth provides enough to satisfy every man’s needs, but not every man’s greed." 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @ClaimantApplicationseekingtimeonaccountofsettlement
Scenario: Verify that able to send application like as Claimant: Application seeking time on account of settlement in any case selected on the page
Given user is on ongoing page and select first case and click on Select Application and user select application as Claimant: Application seeking time on account of settlement
Then user click on send application 
And user enter the reason for extention as "25" 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @Other
Scenario: verify that user able to uploade document in other
Given user is on ongoing page and click on Other
Then user select document to upload and click on submit btn
When user see the success massege then user click on close btn

@User @Sanity @ArbitratorDisclosure
Scenario: Verify that user able to see the disclosure and also able to download it
Given user is on ongoing page and then click on ArbitratorOne 
Then user verify that user able to see the disclosure and also able to download or not 





# =================Genaral case filter====Except as blank==========

@User @Sanity @BulkActExtensionSOC
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Extension - SOC
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Application for Extension - SOC"
Then user click on the Bulk action and click on send application 
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "A little effort towards saving the environment is better than no effort." and no of days as "25"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 



@User @Sanity @BulkActApplicationWithdrawalwithLiberty 
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Withdrawal with Liberty to file fresh proceedings
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Application for Withdrawal with Liberty to file fresh proceedings"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "Earth provides enough to satisfy every man’s needs, but not every man’s greed." 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @BulkActApplicationseekingtimeonaccountofsettlement
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application seeking time on account of settlement
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Application seeking time on account of settlement"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "25" 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @BulkActClaimantApplicationforadditionalevidence
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for additional evidence
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Application for additional evidence"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
But user uploade file here 
And click on preview btn and then click on send application btn 
When user see the success massage then user click on close btn 

@User @Sanity @BulkActClaimantApplicationfororalhearing
Scenario: Verify that user able to send the application in bulk type of application as Claimant:  Application for oral hearing
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Application for oral hearing"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 


@User @Sanity @BulkActClaimantApplicationforWithdrawal
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Withdrawal
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Application for Withdrawal"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "Earth provides enough to satisfy every man’s needs, but not every man’s greed." 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @BulkActClaimantApplicationforextensiontofileReply
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for extension to file Reply
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Application for extension to file Reply"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "A nation that destroys its soils destroys itself. Forests are the lungs of our land, purifying the air and giving fresh strength to our people." and no of days as "20"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @BulkActClaimantApplicationfoExtensionFileRejoinder
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Extension File Rejoinder
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Application for Extension File Rejoinder"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "Environment is no one’s property to destroy; it’s everyone’s responsibility to protect." and no of days as "15"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @BulkActClaimantIntimationregardingfailureofsettlement
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Intimation regarding failure of settlement
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as "Claimant: Intimation regarding failure of settlement"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 


#@User @Sanity @BulkActClaimantdin
Scenario: Verify that user able to send the application in bulk type of application as Claimant  din
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on select application as Claimant  din
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And click on preview btn and click on send application btn 

When user see the success massage then user click on close btn 



# =================Genaral case filter====Add cases to Except ==========


@User @Sanity @BulkActExtensionSOCE
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Extension - SOC
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on select application as "Claimant: Application for Extension - SOC"
Then user click on the Bulk action and click on send application 
When user see the Do you want to proceed pop up then user select as including exclude cases 
#But user add note as "This is testing case using Automation "
And user enter the reason for extention as "A little effort towards saving the environment is better than no effort." and no of days as "25"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @BulkActApplicationWithdrawalwithLibertyE 
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Withdrawal with Liberty to file fresh proceedings
Given user is on ongoing page and then click on general filter
Then user add cases in from and to
But user add cases to except 
And user click on select application as "Claimant: Application for Withdrawal with Liberty to file fresh proceedings"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "Earth provides enough to satisfy every man’s needs, but not every man’s greed." 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @BulkActApplicationseekingtimeonaccountofsettlementE
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application seeking time on account of settlement
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on select application as "Claimant: Application seeking time on account of settlement"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "25" 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @BulkActClaimantApplicationforadditionalevidenceE
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for additional evidence
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on select application as "Claimant: Application for additional evidence"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
But user uploade file here 
And click on preview btn and then click on send application btn 
When user see the success massage then user click on close btn 

@User @Sanity @BulkActClaimantApplicationfororalhearingE
Scenario: Verify that user able to send the application in bulk type of application as Claimant:  Application for oral hearing
Given user is on ongoing page and then click on general filter
Then user add cases in from and to
But user add cases to except  
And user click on select application as "Claimant: Application for oral hearing"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 


@User @Sanity @BulkActClaimantApplicationforWithdrawalE
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Withdrawal
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on select application as "Claimant: Application for Withdrawal"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "Earth provides enough to satisfy every man’s needs, but not every man’s greed." 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @BulkActClaimantApplicationforextensiontofileReplyE
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for extension to file Reply
Given user is on ongoing page and then click on general filter
Then user add cases in from and to
But user add cases to except  
And user click on select application as "Claimant: Application for extension to file Reply"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "A nation that destroys its soils destroys itself. Forests are the lungs of our land, purifying the air and giving fresh strength to our people." and no of days as "20"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @BulkActClaimantApplicationfoExtensionFileRejoinderE
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Extension File Rejoinder
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on select application as "Claimant: Application for Extension File Rejoinder"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "Environment is no one’s property to destroy; it’s everyone’s responsibility to protect." and no of days as "15"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @BulkActClaimantIntimationregardingfailureofsettlementE
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Intimation regarding failure of settlement
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on select application as "Claimant: Intimation regarding failure of settlement"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 


#@User @Sanity @BulkActClaimantdinE
Scenario: Verify that user able to send the application in bulk type of application as Claimant  din
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on select application as Claimant  din
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases 
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 

#Bulk Actions 

@User @Sanity @BulkActotherapplication 
Scenario: Verify that user able to send the other application 
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on bulk action and select other application 
When user see the Do you want to proceed pop up then user select as including exclude cases 
But user uploade file here 
And user click on submit btn
When user see the success massage for bulk actions  then user click on close btn 


@User @Sanity @BulkActotherapplicationE 
Scenario: Verify that user able to send the other application 
Given user is on ongoing page and then click on general filter
Then user add cases in from and to
But user add cases to except  
And user click on bulk action and select other application 
When user see the Do you want to proceed pop up then user select as including exclude cases 
But user uploade file here 
And user click on submit btn
When user see the success massage for bulk actions  then user click on close btn 


@User @Sanity @BulkActBulkOtherApplication
Scenario: Verify that user able to upload bulk other application 
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on bulk action and select upload bulk other application 
Then user add file to upload and click on upload btn 
And user click on confirm btn and verify the success massage and click on close 

@User @Sanity @BulkActBulkOtherApplicationE
Scenario: Verify that user able to upload bulk other application 
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on bulk action and select upload bulk other application 
Then user add file to upload and click on upload btn 
And user click on confirm btn and verify the success massage and click on close 

@User @Sanity @BulkActExporttoexcel
Scenario: Verify that user able to Export to excel
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
And user click on bulk action and select Export to excel 

@User @Sanity @BulkActExporttoexcelE
Scenario: Verify that user able to Export to excel
Given user is on ongoing page and then click on general filter
Then user add cases in from and to 
But user add cases to except 
And user click on bulk action and select Export to excel 


#@BulkActDownloadDocuments
#Scenario: Verify that user able to Download  Documents
#Given user is on ongoing page and then click on general filter
#Then user add cases in from and to 
#But user add cases to except 
#And user click on bulk action and select Download  Documents


#Randon case Filter

@User @Sanity @RandomBulkActExtensionSOC
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Extension - SOC
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Application for Extension - SOC"
Then user click on the Bulk action and click on send application 
When user see the Do you want to proceed pop up then user select as including exclude cases 
And user enter the reason for extention as "A little effort towards saving the environment is better than no effort." and no of days as "25"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @RandomBulkActApplicationWithdrawalwithLiberty 
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Withdrawal with Liberty to file fresh proceedings
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Application for Withdrawal with Liberty to file fresh proceedings"
Then user click on the Bulk action and click on send application
When user see the pause case pop up then he select includind hold cases 
And user enter the reason for extention as "Earth provides enough to satisfy every man’s needs, but not every man’s greed." 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @RandomBulkActApplicationseekingtimeonaccountofsettlement
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application seeking time on account of settlement
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Application seeking time on account of settlement"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases
And user enter the reason for extention as "25" 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @RandomBulkActClaimantApplicationforadditionalevidence
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for additional evidence
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Application for additional evidence"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases
But user uploade file here 
And click on preview btn and then click on send application btn 
When user see the success massage then user click on close btn 

@User @Sanity @RandomBulkActClaimantApplicationfororalhearing
Scenario: Verify that user able to send the application in bulk type of application as Claimant:  Application for oral hearing
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Application for oral hearing"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 


@User @Sanity @RandomBulkActClaimantApplicationforWithdrawal
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Withdrawal
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Application for Withdrawal"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases
And user enter the reason for extention as "Earth provides enough to satisfy every man’s needs, but not every man’s greed." 
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @RandomBulkActClaimantApplicationforextensiontofileReply
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for extension to file Reply
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Application for extension to file Reply"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases
And user enter the reason for extention as "A nation that destroys its soils destroys itself. Forests are the lungs of our land, purifying the air and giving fresh strength to our people." and no of days as "20"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 


@User @Sanity @RandomBulkActClaimantApplicationfoExtensionFileRejoinder
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Application for Extension File Rejoinder
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Application for Extension File Rejoinder"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases
And user enter the reason for extention as "Environment is no one’s property to destroy; it’s everyone’s responsibility to protect." and no of days as "15"
And click on preview btn and then click on send application for soc btn 
When user see the success massage then user click on close btn 

@User @Sanity @RandomBulkActClaimantIntimationregardingfailureofsettlement
Scenario: Verify that user able to send the application in bulk type of application as Claimant: Intimation regarding failure of settlement
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as "Claimant: Intimation regarding failure of settlement"
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 


#@User @Sanity @RandomBulkActClaimantdin
Scenario: Verify that user able to send the application in bulk type of application as Claimant  din
Given user is on ongoing page and then click on Random case filter
Then user add cases to the random input field 
And user click on select application as Claimant  din
Then user click on the Bulk action and click on send application
When user see the Do you want to proceed pop up then user select as including exclude cases
And click on preview btn and click on send application btn 
When user see the success massage then user click on close btn 




