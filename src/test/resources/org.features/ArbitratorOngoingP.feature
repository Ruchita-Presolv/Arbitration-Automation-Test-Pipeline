Feature: Verify that all Action present on Ongoing  page are working as required

  Background: 
    Given Arb user is on login page
    Then ArbUser name and ArbPassword field is displayed
    When user see the user name field then enter ArbUser name
    Then user see the user password field then enter Arb password
    And user is on the dashboard page and click on the Ongoing Action

 # @Sanity @Adddirection @Arb @NotiF @NotiF
  #Scenario: Verify that user able to send direction in particular case selected as Add direction
    #Given user is on ongoing page and in first case send direction as Add direction
    #And user click on send direction and click on preview btn and click on send direction

  @Sanity @ClosureContested @Arb @NotiF1
  Scenario: Verify that user able to send direction in particular case selected as Closure (contested)
    Given user is on ongoing page and in first case send direction as Closure (contested)
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @ClosureUncontested @Arb @NotiF1
  Scenario: Verify that user able to send direction in particular case selected as Closure Uncontested
    Given user is on ongoing page and in first case send direction as Closure Uncontested
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @ClosureInformalReply @Arb @NotiF1
  Scenario: Verify that user able to send direction in particular case selected as Closure Informal Reply
    Given user is on ongoing page and in first case send direction as Closure Informal Reply
    And user click on send direction and click on preview btn and click on send direction

  #@Smoke @Cmnewdirection @Arb @NotiF
  #Scenario: Verify that user able to send direction in particular case selected as Cm new direction
    #Given user is on ongoing page and in first case send direction as Cm new direction
    #And user click on send direction and click on preview btn and click on send direction

  #@Sanity @Confirmationofarbtrator @Arb @NotiF1
  #Scenario: Verify that user able to send direction in particular case selected as Confirmation of arbtrator
    #Given user is on ongoing page and in first case send direction as Confirmation of arbtrator
    #And user click on send direction and click on preview btn and click on send direction

  @Sanity @InterimOrder @Arb @NotiF1
  Scenario: Verify that user able to send direction in particular case selected as Interim Order
    Given user is on ongoing page and in first case send direction as Interim Order
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @Intimate @Arb @NotiF1
  Scenario: Verify that user able to send direction in particular case selected as Intimate
    Given user is on ongoing page and in first case send direction as Intimate
    And user click on send direction and add no of days then  click on preview btn and click on send direction

  #@Sanity @Newdirectioin @Arb @NotiF1
  #Scenario: Verify that user able to send direction in particular case selected as New directioin
    #Given user is on ongoing page and in first case send direction as  New directioin
    #And user click on send direction and click on preview btn and click on send direction

  #@Sanity @ObjectiontoApplicationforWithdrawal @Arb @NotiF1
  #Scenario: Verify that user able to send direction in particular case selected as Objection to Application for Withdrawal
    #Given user is on ongoing page and in first case send direction as  Objection to Application for Withdrawal
    #And user click on send direction and add no of days then  click on preview btn and click on send direction
#
  #@Sanity @ObjectionsReservedforOrders @Arb @NotiF1
  #Scenario: Verify that user able to send direction in particular case selected as Objections Reserved for Orders
    #Given user is on ongoing page and in first case send direction as Objections Reserved for Orders
    #And user click on send direction and click on preview btn and click on send direction

 # @Sanity @Opportunitytochoose @Arb @NotiF1
  #Scenario: Verify that user able to send direction in particular case selected as Opportunity to choose
    #Given user is on ongoing page and in first case send direction as Opportunity to choose
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @Recallincorrectorder @Arb @NotiF1
  Scenario: Verify that user able to send direction in particular case selected as Re call incorrect order
    Given user is on ongoing page and in first case send direction as Re call incorrect order
    And user click on send direction and add date then click on preview btn and click on send direction

  @Sanity @Rejoinder @Arb @NotiF1
  Scenario: Verify that user able to send direction in particular case selected as Rejoinder
    Given user is on ongoing page and in first case send direction as Rejoinder
    And user click on send direction Rejoinder and click on preview btn and click on send direction

  #@Sanity @RejoinderExtension @Arb @NotiF1
  #Scenario: Verify that user able to send direction in particular case selected as Rejoinder Extension
    #Given user is on ongoing page and in first case send direction as Rejoinder Extension
    #And user click on send direction and add no of days then  click on preview btn and click on send direction
#
  #@Sanity @ReopenProceedingsOrder @Arb @NotiF1
  #Scenario: Verify that user able to send direction in particular case selected as Reopen Proceedings Order
    #Given user is on ongoing page and in first case send direction as Reopen Proceedings Order
    #And user click on send direction and click on preview btn and click on send direction

  #++++++++++++++++++++++++++++++++++++++++++++++++++++
 
  #@Sanity @ReplyExtensionOrder @Arb @NotiF
  #Scenario: Verify that user able to send direction in particular case selected as Reply Extension Order
    #Given user is on ongoing page and in first case send direction as Reply Extension Order
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @ReplytoRespondentApplicationObjection @Arb @NotiF
  Scenario: Verify that user able to send direction in particular case selected as Reply to Respondent Application Objection
    Given user is on ongoing page and in first case send direction as Reply to Respondent Application Objection
    And user click on send direction and add no of days then  click on preview btn and click on send direction

  #@Sanity @SettlementExtensionOrder @Arb @NotiF
  #Scenario: Verify that user able to send direction in particular case selected as Settlement Extension Order
    #Given user is on ongoing page and in first case send direction as Settlement Extension Order
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  #@Sanity @SettlementFailureClosureexparte @Arb @NotiF
  #Scenario: Verify that user able to send direction in particular case selected as Settlement Failure Closure exparte
    #Given user is on ongoing page and in first case send direction as Settlement Failure Closure exparte
    #And user click on send direction and click on preview btn and click on send direction
#
  #@Sanity @SettlementFailureSOC @Arb @NotiF
  #Scenario: Verify that user able to send direction in particular case selected as Settlement Failure SOC
    #Given user is on ongoing page and in first case send direction as Settlement Failure SOC
    #And user click on send direction and add no of days then  click on preview btn and click on send direction
#
  #@Sanity @SettlementFailureSOD @Arb @NotiF
  #Scenario: Verify that user able to send direction in particular case selected as Settlement Failure SOD
    #Given user is on ongoing page and in first case send direction as Settlement Failure SOD
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  #@Sanity @SOCExtension @Arb @NotiF
  #Scenario: Verify that user able to send direction in particular case selected as SOC Extension
    #Given user is on ongoing page and in first case send direction as SOC Extension
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @SODExtension @Arb @NotiF
  Scenario: Verify that user able to send direction in particular case selected as SOD Extension
    Given user is on ongoing page and in first case send direction as SOD Extension
    And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @WithdrawalOrder @Arb @NotiF
  Scenario: Verify that user able to send direction in particular case selected as Withdrawal Order
    Given user is on ongoing page and in first case send direction as Withdrawal Order
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @WithdrawalWithLiberty @Arb @NotiF
  Scenario: Verify that user able to send direction in particular case selected as Withdrawal WithLiberty
    Given user is on ongoing page and in first case send direction as Withdrawal WithLiberty
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @WithdrawalwithLibertyduetoineffectiveservice @Arb @NotiF
  Scenario: Verify that user able to send direction in particular case selected as Withdrawal with Liberty due to ineffective service
    Given user is on ongoing page and in first case send direction as Withdrawal with Liberty due to ineffective service
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @Other @Arb @NotiF
  Scenario: Verify that user able to send direction in particular case selected as other
    Given user is on ongoing page and in first case and click on  other
    And user select the file to upload and click on submit btn
    When user see the success massage then he click on ok buttn

  #Actions===========================================
  @Sanity @UploadAward @Regression @Arb @NotiF
  Scenario: Verify that user able to perform various Actions inside the Action button
    Given user is on ongoing page and in last case and click on  Action
    And user select action as Upload Award
    Then user select file to upload as a award and click on submit btn
    When user see the success massage then he click on the ok btn

  @Sanity @UploadInterimOrder @Arb @NotiF
  Scenario: Verify that user able to perform various Actions inside the Action button
    Given user is on ongoing page and in last case and click on  Action
    And user select action as Upload Interim Order
    Then user select file as interim order to upload and click on submit btn
    And user than verify the success massage and submit

  @Sanity @Disclosure @Arb @NotiF
  Scenario: Verify that user able to perform various Actions inside the Action button
    Given user is on ongoing page and in last case and click on  Action
    Then user click on view disclosures and verify the page title and download  is enable or not and click on close

  @Sanity @Private @Arb @NotiF
  Scenario: Verify that user able to perform various Actions inside the Action button
    Given user is on ongoing page and in last case and click on  Action
    Then user click on private btn
    And users add messages such as "Whatever we believe about ourselves and our ability comes true for us." and click on ok save btn
    Then user verify the success message

  @Sanity @Share @Arb @NotiF
  Scenario: Verify that user able to perform various Actions inside the Action button
    Given user is on ongoing page and in last case and click on  Action
    Then user click on share btn
    And users add messages such as "Success is often achieved by those who don’t know that failure is inevitable." and click on ok save btn
    Then user verify the success message
 
  @Sanity @ScheduleOralHearingDirect @Arb @NotiF
  Scenario: Verify that user able to send direction in particular case selected as ScheduleOralHearing Direct
  Given user is on ongoing page and in first case send direction as ScheduleOralHearing
  Then user click on send direction and add date as "22-02-2028" and time as "12:30"
  And user click on  Schedule Directly radio btn
  Then user click on preview btn and click on send
  
  @Sanity @ScheduleOralHearingManually @Arb @NotiF
   Scenario: Verify that user able to send direction in particular case selected as ScheduleOralHearing Manually
  Given user is on ongoing page and in first case send direction as ScheduleOralHearing
  Then user click on send direction and add date as "22-02-2028" and time as "12:30"
  And user click on  Schedule Manually  radio btn and add link as "https://www.travelandleisureasia.com/global/destinations/most-beautiful-places-in-the-world/ " and gmail id as "pixel+test@gmail.com."
  Then user click on preview btn and click on send
  
  #@CustomDirection
  #Scenario: Verify that user able to send direction in particular case selected as Custom Direction
  #Given user is on ongoing page and in first case send direction as Custom Direction
  #And user click on send direction and click on preview btn and click on send direction
  #@OngoingPageUsability
  #Scenario: verify that all action present on the Ongoing page are working or not
  #Then user verify that search input field,search btn,refresh btn
  #And users also verify case details and check box,Send Direction dropdown,button,other button
  #And users also verify that Action button , radio button of filter
  
  
  
  #General Filter Scenario ==================================
  @Sanity @BulkActExpBlank @Arb @NotiF
  Scenario: Verify that user able to perform bulk award download and all documents using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user select bulk  action as download Award sheet from it also select download documents
    Then user select any document to download and click on download btn

  @Sanity @BulkActExpAdd @Arb @NotiF
  Scenario: Verify that user able to perform bulk award download and all documents using filter and Add cases in except
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user select bulk  action as download Award sheet from it also select download documents
    Then user select any document to download and click on download btn

  #@Sanity @SentAdddirection @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Add direction using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Add direction" to sent
    #Then user click on send direction
#
  #@Sanity @SentAdddirectionE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Add direction using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Add direction" to sent
    #Then user click on send direction

  @Sanity @SentClosureContested @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure (contested) using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Closure (contested)" to sent
    Then user click on send direction

  @Sanity @SentClosureContestedE @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure (contested) using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Closure (contested)" to sent
    Then user click on send direction

  @Sanity @SentClosureUncontested @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure (Uncontested) using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Closure (uncontested)" to sent
    Then user click on send direction

  @Sanity @SentClosureUncontestedE @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure (Uncontested) using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Closure (uncontested)" to sent
    Then user click on send direction

  @Sanity @SentClosureinformalreply @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure informal reply using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Closure informal reply" to sent
    Then user click on send direction

  @Sanity @SentClosureinformalreplyE @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure informal reply using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Closure informal reply" to sent
    Then user click on send direction

  #@Sanity @SentCmnewdirection @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Cm new direction using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Cm new direction" to sent
    #Then user click on send direction

  #@Sanity @SentCmnewdirectionE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Cm new direction using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Cm new direction" to sent
    #Then user click on send direction

  #@Sanity @SentConfirmationofarbtrator @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Confirmation of arbtrator using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Confirmation of arbtrator" to sent
    #Then user click on send direction
#
  #@Sanity @SentConfirmationofarbtratorE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Confirmation of arbtrator using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Confirmation of arbtrator" to sent
    #Then user click on send direction

  #******************************************************
  @Sanity @SentInterimOrder @Arb @NotiF
  Scenario: Verify that user able to send direction as  Interim Order using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Interim Order" to sent
    Then user click on send direction

  @Sanity @SentInterimOrderE @Arb @NotiF
  Scenario: Verify that user able to send direction as  Interim Order using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Interim Order" to sent
    Then user click on send direction

  #++++++++++++++++No of Days Add++++++++++++++++++++++++++++++++++++++++
  #@Sanity @SentIntimate @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Intimate using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Intimate" to sent
    #Then user click on send No of days in  the direction
#
  #@Sanity @SentIntimateE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Intimate using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Intimate" to sent
    #Then user click on send No of days in  the direction
#
  #_________________________________________________________
 # @Sanity @Sentnewdirectioin @Arb @NotiF
  #Scenario: Verify that user able to send direction as  new directioin using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "new directioin" to sent
    #Then user click on send direction
#
  #@Sanity @SentnewdirectioinE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  new directioin using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "new directioin" to sent
     #Then user click on send direction

  #@Sanity @SentObjectiontoApplicationforWithdrawal @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Objection to Application for Withdrawal using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Objection to Application for Withdrawal" to sent
    #Then user click on send No of days in  the direction
#
  #@Sanity @SentObjectiontoApplicationforWithdrawalE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Objection to Application for Withdrawal using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Objection to Application for Withdrawal" to sent
    #Then user click on send No of days in  the direction
#
  #@Sanity @SentObjectionsReservedforOrders @Arb @NotiF
  #Scenario: Verify that user able to send direction as Objections Reserved for Orders using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Objections Reserved for Orders" to sent
    #Then user click on send direction
#
  #@Sanity @SentObjectionsReservedforOrdersE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Objections Reserved for Orders using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Objections Reserved for Orders" to sent
    #Then user click on send direction

  #@Sanity @Sentopportunitytochoose @Arb @NotiF
  #Scenario: Verify that user able to send direction as  opportunity to choose using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "opportunity to choose" to sent
    #Then user click on send No of days in  the direction
#
  #@Sanity @SentopportunitytochooseE @Arb @NotiF
  #Scenario: Verify that user able to send direction as opportunity to choose using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "opportunity to choose" to sent
    #Then user click on send No of days in  the direction

  #==================Add Date ===========================
  
 # @Sanity @SentRecallincorrectorder @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Recall incorrect order using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Recall incorrect order" to sent
    #Then user click on send Date in the  direction
#
 # @Sanity @SentRecallincorrectorderE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Recall incorrect order using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Recall incorrect order" to sent
    #Then user click on send Date in the  direction

  #=======================================================
  @Sanity @SentRejoinder @Arb @NotiF
  Scenario: Verify that user able to send direction as Rejoinder using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Rejoinder" to sent
    Then user add no of days and click on send direction
    #Then user click on send No of days in  the direction

  @Sanity @SentRejoinderE @Arb @NotiF
  Scenario: Verify that user able to send direction as  Rejoinder using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Rejoinder" to sent
    Then user add no of days and click on send direction

  #@Sanity @SentRejoinderExtension @Arb @NotiF
  #Scenario: Verify that user able to send direction as Rejoinder Extension using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Rejoinder Extension" to sent
    #Then user click on send No of days in  the direction

  #@Sanity @SentRejoinderExtensionE @Arb @NotiF
  #Scenario: Verify that user able to send direction as Rejoinder Extension using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Rejoinder Extension" to sent
    #Then user click on send No of days in  the direction

 # @Sanity @SentReopenProceedingsOrder @Arb @NotiF
  #Scenario: Verify that user able to send direction as Reopen Proceedings Order using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Reopen Proceedings Order" to sent
    #Then user click on send direction
#
 # @Sanity @SentReopenProceedingsOrderE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Reopen Proceedings Order using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Reopen Proceedings Order" to sent
    #Then user click on send direction

  #@Sanity @SentReplyExtensionOrder @Arb @NotiF
  #Scenario: Verify that user able to send direction as Reply Extension Order using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Reply Extension Order" to sent
    #Then user click on send No of days in  the direction
#
  #@Sanity @SentReplyExtensionOrderE @Arb @NotiF
  #Scenario: Verify that user able to send direction as Reply Extension Order using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Reply Extension Order" to sent
    #Then user click on send No of days in  the direction

  @Sanity @SentReplytoRespondentApplicationObjection @Arb @NotiF
  Scenario: Verify that user able to send direction as Reply to Respondent Application/ Objection using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Reply to Respondent Application/ Objection" to sent
    Then user click on send No of days in  the direction

  @Sanity @SentReplytoRespondentApplicationObjectionE @Arb @NotiF
  Scenario: Verify that user able to send direction as Reply to Respondent Application/ Objection using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Reply to Respondent Application/ Objection" to sent
    Then user click on send No of days in  the direction

  @Sanity @SentSettlementExtensionOrder @Arb @NotiF
  Scenario: Verify that user able to send direction as Settlement Extension Order using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Settlement Extension Order" to sent
    Then user click on send No of days in  the direction

  @Sanity @SentSettlementExtensionOrderE @Arb @NotiF
  Scenario: Verify that user able to send direction as Settlement Extension Order using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Settlement Extension Order" to sent
    Then user click on send No of days in  the direction

  #@Sanity @SentSettlementFailureClosureexparte @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Failure - Closure ex-parte using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Settlement Failure - Closure ex-parte" to sent
    #Then user click on send direction

  #@Sanity @SentSettlementFailureClosureexparteE @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Settlement Failure - Closure ex-parte using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Settlement Failure - Closure ex-parte" to sent
    #Then user click on send direction
#
  #@Sanity @SentSettlementFailureSOC @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Failure - SOC using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Settlement Failure - SOC" to sent
    #Then user click on send No of days in  the direction

  #@Sanity @SentSettlementFailureSOCE @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Failure - SOC using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Settlement Failure - SOC" to sent
    #Then user click on send No of days in  the direction

  #@Sanity @SentSettlementFailureSOD @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Failure - SOD using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "Settlement Failure - SOD" to sent
    #Then user click on send No of days in  the direction
#
 # @Sanity @SentSettlementFailureSODE @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Failure - SOD using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "Settlement Failure - SOD" to sent
    #Then user click on send No of days in  the direction

  #@Sanity @SentSOCExtension @Arb @NotiF
  #Scenario: Verify that user able to send direction as SOC Extension using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #And user click on the select direction and select direction as "SOC Extension" to sent
    #Then user click on send No of days in  the direction
#
  #@Sanity @SentSOCExtensionE @Arb @NotiF
  #Scenario: Verify that user able to send direction as SOC Extension using filter and kept except as blank
    #Given user is on ongoing page and select general filter
    #Then user add cases in from to filter
    #But user add case in except
    #And user click on the select direction and select direction as "SOC Extension" to sent
    #Then user click on send No of days in  the direction

  @Sanity @SentSODExtension @Arb @NotiF
  Scenario: Verify that user able to send direction as SOD Extension using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "SOD Extension" to sent
    Then user click on send No of days in  the direction

  @Sanity @SentSODExtensionE @Arb @NotiF
  Scenario: Verify that user able to send direction as SOD Extension using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "SOD Extension" to sent
    Then user click on send No of days in  the direction

  @Sanity @SentWithdrawalOrder @Arb @NotiF
  Scenario: Verify that user able to send direction as Withdrawal Order using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Withdrawal Order" to sent
    Then user click on send direction

  @Sanity @SentWithdrawalOrderE @Arb @NotiF
  Scenario: Verify that user able to send direction as  Withdrawal Order using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Withdrawal Order" to sent
    Then user click on send direction

  @Sanity @SentWithdrawalWithLiberty @Arb @NotiF
  Scenario: Verify that user able to send direction as Withdrawal With Liberty using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Withdrawal With Liberty" to sent
    Then user click on send direction

  @Sanity @SentWithdrawalWithLibertyE @Arb @NotiF
  Scenario: Verify that user able to send direction as  Withdrawal With Liberty using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Withdrawal With Liberty" to sent
    Then user click on send direction

  @Sanity @SentWithdrawalwithLibertyduetoineffectiveservice @Arb @NotiF
  Scenario: Verify that user able to send direction as Withdrawal with Liberty due to ineffective service using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    And user click on the select direction and select direction as "Withdrawal with Liberty due to ineffective service" to sent
    Then user click on send direction

  @Sanity @SentWithdrawalwithLibertyduetoineffectiveserviceE @Arb @NotiF
  Scenario: Verify that user able to send direction as  Withdrawal with Liberty due to ineffective service using filter and kept except as blank
    Given user is on ongoing page and select general filter
    Then user add cases in from to filter
    But user add case in except
    And user click on the select direction and select direction as "Withdrawal with Liberty due to ineffective service" to sent
    Then user click on send direction
    
  #Random case Filter Actions================================
  
  @Sanity @BulkRanActExpBlank @Arb @NotiF
  Scenario: Verify that user able to perform bulk award download and all documents using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user select bulk  action as download Award sheet from it also select download documents
    Then user select any document to download and click on download btn

 #@Sanity @SentAdddirectionRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Add direction using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Add direction" to sent
    #Then user click on send direction

  @Sanity @SentClosureContestedRan @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure (contested) using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Closure (contested)" to sent
    Then user click on send direction Random filter 

  @Sanity @SentClosureUncontestedRan @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure (Uncontested) using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Closure (uncontested)" to sent
    # Then user click on send direction
   Then user click on send direction Random filter 

  @Sanity @SentClosureinformalreplyRan @Arb @NotiF
  Scenario: Verify that user able to send direction as  Closure informal reply using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Closure informal reply" to sent
    Then user click on send direction Random filter 

  #@Sanity @SentCmnewdirectionRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Cm new direction using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Cm new direction" to sent
    #Then user click on send direction

  #@Sanity @SentConfirmationofarbtratorRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Confirmation of arbtrator using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Confirmation of arbtrator" to sent
    #Then user click on send direction

  @Sanity @SentInterimOrderRan @Arb @NotiF
  Scenario: Verify that user able to send direction as  Interim Order using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Interim Order" to sent
    Then user click on send direction Random filter 
    #Then user click on send direction

 #@Sanity  @SentIntimateRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Intimate using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Intimate" to sent
    #Then user click on send No of days in  the direction

  #_________________________________________________________
  #@Sanity @SentnewdirectioinRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as  new directioin using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "new directioin" to sent
    #Then user click on send direction

  #@Sanity @SentObjectiontoApplicationforWithdrawalRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as  Objection to Application for Withdrawal using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Objection to Application for Withdrawal" to sent
    #Then user click on send No of days in  the direction

  #@Sanity @SentObjectionsReservedforOrdersRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as Objections Reserved for Orders using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Objections Reserved for Orders" to sent
    #Then user click on send direction

  #@Sanity @SentopportunitytochooseRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as  opportunity to choose using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "opportunity to choose" to sent
    #Then user click on send No of days in  the direction

  @Sanity @SentRecallincorrectorderRan @Arb @NotiF
  Scenario: Verify that user able to send direction as  Recall incorrect order using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Recall incorrect order" to sent
    Then user click on send Date in the  direction

  #=======================================================
  @Sanity @SentRejoinderRan @Arb @NotiF
  Scenario: Verify that user able to send direction as Rejoinder using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Rejoinder" to sent
   Then user click on send No of days in  the direction Random
  #Then user click on send Date in the  direction
    #Then user click on send direction

  #@Sanity @SentRejoinderExtensionRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as Rejoinder Extension using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Rejoinder Extension" to sent
     #Then user click on send No of days in  the direction Random

  #@Sanity @SentReopenProceedingsOrderRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as Reopen Proceedings Order using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Reopen Proceedings Order" to sent
    #Then user click on send direction
#
  #@Sanity @SentReplyExtensionOrderRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as Reply Extension Order using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Reply Extension Order" to sent
    #Then user click on send No of days in  the direction
#
  #@Sanity Ran @Arb @NotiF
  #Scenario: Verify that user able to send direction as Reply to Respondent Application/ Objection using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Reply to Respondent Application/ Objection" to sent
    #Then user click on send No of days in  the direction
#
  #@Sanity @SentSettlementExtensionOrderRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Extension Order using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Settlement Extension Order" to sent
    #Then user click on send No of days in  the direction

  #@Sanity @SentSettlementFailureClosureexparteRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Failure - Closure ex-parte using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Settlement Failure - Closure ex-parte" to sent
    #Then user click on send direction
#
  #@Sanity @SentSettlementFailureSOCRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Failure - SOC using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Settlement Failure - SOC" to sent
    #Then user click on send No of days in  the direction

  #@Sanity @SentSettlementFailureSODRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as Settlement Failure - SOD using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "Settlement Failure - SOD" to sent
    #Then user click on send No of days in  the direction

 #@Sanity @SentSOCExtensionRan @Arb @NotiF
  #Scenario: Verify that user able to send direction as SOC Extension using filter and kept except as blank
    #Given user is on ongoing page and select random filter and add cases to it
    #And user click on the select direction and select direction as "SOC Extension" to sent
    #Then user click on send No of days in  the direction

  @Sanity @SentSODExtensionRan @Arb @NotiF
  Scenario: Verify that user able to send direction as SOD Extension using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "SOD Extension" to sent
    Then user click on send No of days in  the direction Random

  @Sanity @SentWithdrawalOrderRan @Arb @NotiF
  Scenario: Verify that user able to send direction as Withdrawal Order using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Withdrawal Order" to sent
    Then user click on send direction Random filter 

  @Sanity @SentWithdrawalWithLibertyRan @Arb @NotiF
  Scenario: Verify that user able to send direction as Withdrawal With Liberty using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Withdrawal With Liberty" to sent
    Then user click on send direction Random filter 
    #Then user click on send direction

  @Sanity @SentWithdrawalwithLibertyduetoineffectiveserviceRan @Arb @NotiF
  Scenario: Verify that user able to send direction as Withdrawal with Liberty due to ineffective service using filter and kept except as blank
    Given user is on ongoing page and select random filter and add cases to it
    And user click on the select direction and select direction as "Withdrawal with Liberty due to ineffective service" to sent
   Then user click on send direction Random filter 
    
#Then user verify bulk action,select direction,send direction 
