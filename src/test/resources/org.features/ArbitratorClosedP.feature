Feature: Verify that all Action present on Closed page are working as required

  Background: 
    Given Arb user is on login page
    Then ArbUser name and ArbPassword field is displayed
    When user see the user name field then enter ArbUser name
    Then user see the user password field then enter Arb password
    And user is on the dashboard page and click on the Closed Action

 # @Sanity @Adddirection @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Add direction
    #Given user is on ongoing page and in first case send direction as Add direction
    #And user click on send direction and click on preview btn and click on send direction

  @Sanity @ClosureContested @Arb
  Scenario: Verify that user able to send direction in particular case selected as Closure (contested)
    Given user is on ongoing page and in first case send direction as Closure (contested)
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @ClosureUncontested @Arb
  Scenario: Verify that user able to send direction in particular case selected as Closure Uncontested
    Given user is on ongoing page and in first case send direction as Closure Uncontested
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @ClosureInformalReply @Arb
  Scenario: Verify that user able to send direction in particular case selected as Closure Informal Reply
    Given user is on ongoing page and in first case send direction as Closure Informal Reply
    And user click on send direction and click on preview btn and click on send direction
#
  #@Smoke @Cmnewdirection @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Cm new direction
    #Given user is on ongoing page and in first case send direction as Cm new direction
    #And user click on send direction and click on preview btn and click on send direction
#
  #@Sanity @Confirmationofarbtrator @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Confirmation of arbtrator
    #Given user is on ongoing page and in first case send direction as Confirmation of arbtrator
    #And user click on send direction and click on preview btn and click on send direction

  @Sanity @InterimOrder @Arb
  Scenario: Verify that user able to send direction in particular case selected as Interim Order
    Given user is on ongoing page and in first case send direction as Interim Order
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @Intimate @Arb
  Scenario: Verify that user able to send direction in particular case selected as Intimate
    Given user is on ongoing page and in first case send direction as Intimate
    And user click on send direction and add no of days then  click on preview btn and click on send direction

 # @Sanity @Newdirectioin @Arb
  #Scenario: Verify that user able to send direction in particular case selected as New directioin
    #Given user is on ongoing page and in first case send direction as  New directioin
    #And user click on send direction and click on preview btn and click on send direction
#
  #@Sanity @ObjectiontoApplicationforWithdrawal @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Objection to Application for Withdrawal
    #Given user is on ongoing page and in first case send direction as  Objection to Application for Withdrawal
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  #@Sanity @ObjectionsReservedforOrders @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Objections Reserved for Orders
    #Given user is on ongoing page and in first case send direction as Objections Reserved for Orders
    #And user click on send direction and click on preview btn and click on send direction
#
 # @Sanity @Opportunitytochoose @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Opportunity to choose
    #Given user is on ongoing page and in first case send direction as Opportunity to choose
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @Recallincorrectorder @Arb
  Scenario: Verify that user able to send direction in particular case selected as Re call incorrect order
    Given user is on ongoing page and in first case send direction as Re call incorrect order
    And user click on send direction and add date then click on preview btn and click on send direction

  @Sanity @Rejoinder @Arb
  Scenario: Verify that user able to send direction in particular case selected as Rejoinder
    Given user is on ongoing page and in first case send direction as Rejoinder
    And user click on send direction and click on preview btn and click on send direction

  #@Sanity @RejoinderExtension @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Rejoinder Extension
    #Given user is on ongoing page and in first case send direction as Rejoinder Extension
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

 # @Sanity @ReopenProceedingsOrder @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Reopen Proceedings Order
    #Given user is on ongoing page and in first case send direction as Reopen Proceedings Order
    #And user click on send direction and click on preview btn and click on send direction

    
     #++++++++++++++++++++++++++++++++++++++++++++++++++++
  #@Sanity @ReplyExtensionOrder @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Reply Extension Order
    #Given user is on ongoing page and in first case send direction as Reply Extension Order
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @ReplytoRespondentApplicationObjection @Arb
  Scenario: Verify that user able to send direction in particular case selected as Reply to Respondent Application Objection
    Given user is on ongoing page and in first case send direction as Reply to Respondent Application Objection
    And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @SettlementExtensionOrder @Arb
  Scenario: Verify that user able to send direction in particular case selected as Settlement Extension Order
    Given user is on ongoing page and in first case send direction as Settlement Extension Order
    And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @SettlementFailureClosureexparte @Arb
  Scenario: Verify that user able to send direction in particular case selected as Settlement Failure Closure exparte
    Given user is on ongoing page and in first case send direction as Settlement Failure Closure exparte
    And user click on send direction and click on preview btn and click on send direction

 # @Sanity @SettlementFailureSOC @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Settlement Failure SOC
    #Given user is on ongoing page and in first case send direction as Settlement Failure SOC
    #And user click on send direction and add no of days then  click on preview btn and click on send direction
#
 # @Sanity @SettlementFailureSOD @Arb
  #Scenario: Verify that user able to send direction in particular case selected as Settlement Failure SOD
    #Given user is on ongoing page and in first case send direction as Settlement Failure SOD
    #And user click on send direction and add no of days then  click on preview btn and click on send direction
#
  #@Sanity @SOCExtension @Arb
  #Scenario: Verify that user able to send direction in particular case selected as SOC Extension
    #Given user is on ongoing page and in first case send direction as SOC Extension
    #And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @SODExtension @Arb
  Scenario: Verify that user able to send direction in particular case selected as SOD Extension
    Given user is on ongoing page and in first case send direction as SOD Extension
    And user click on send direction and add no of days then  click on preview btn and click on send direction

  @Sanity @WithdrawalOrder @Arb
  Scenario: Verify that user able to send direction in particular case selected as Withdrawal Order
    Given user is on ongoing page and in first case send direction as Withdrawal Order
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @WithdrawalWithLiberty @Arb
  Scenario: Verify that user able to send direction in particular case selected as Withdrawal WithLiberty
    Given user is on ongoing page and in first case send direction as Withdrawal WithLiberty
    And user click on send direction and click on preview btn and click on send direction

  @Sanity @WithdrawalwithLibertyduetoineffectiveservice @Arb
  Scenario: Verify that user able to send direction in particular case selected as Withdrawal with Liberty due to ineffective service
    Given user is on ongoing page and in first case send direction as Withdrawal with Liberty due to ineffective service
    And user click on send direction and click on preview btn and click on send direction

  #+==========================================================
  
  @Sanity @BulkDownActExpBlank @Arb
  Scenario: Verify that user able to perform bulk award download and all documents using filter and kept except as blank
    Given user is on closed page and select general filter
   Then user add cases in from to filter Closed
    And user click on  bulk  action btn
    Then user select as download  documents 
    
  @Sanity @BulkDownActExpAddCases @Arb
  Scenario: Verify that user able to perform bulk award download and all documents using filter and kept except as blank
    Given user is on closed page and select general filter
   Then user add cases in from to filter Closed
    But user add case in except
    And user click on  bulk  action btn
    Then user select as download  documents 
    
    
     @Sanity @BulkExportActExpBlank @Arb
  Scenario: Verify that user able to perform bulk award download and all documents using filter and kept except as blank
    Given user is on closed page and select general filter
   Then user add cases in from to filter Closed
    And user click on  bulk  action btn
    Then user select as Export to excel all data
    
     @Sanity @BulkExportActExpAddCases @Arb
  Scenario: Verify that user able to perform bulk award download and all documents using filter and kept except as blank
    Given user is on closed page and select general filter
   Then user add cases in from to filter Closed
    But user add case in except
    And user click on  bulk  action btn
    Then user select as Export to excel all data
    
    
    #========Action =============================================
    
   @Sanity @UploadDirection @Arb
    Scenario: Verify that user able to perform various action on close page like Upload Direction
    Given user is on closed page and then click on Action btn 
    Then user click on upload directions then select file and click on submit button 
    When user see the success massage then user click on upload btn
    
    @Sanity @viewDisclosures @Arb
    Scenario: Verify that user able to perform various action on close page like View Disclosures
    Given user is on closed page and then click on Action btn 
    Then user click on View Disclosures and verify that able to see the Arbitrator’s Consent and Disclosures by Arbitrator 
    And user verify that back button working or not 
    
    @Sanity @Private @Arb
     Scenario: Verify that user able to perform various action on close page like Private
     Given user is on closed page and then click on Action btn 
     Then user click on the private and then add massage as "Sometimes, when things are falling apart, they may actually be falling into place."
     And user click on save btn and also close the pop up
     
    @Sanity  @Shared @Arb
     Scenario: Verify that user able to perform various action on close page like Shared
     Given user is on closed page and then click on Action btn 
     Then user click on the Shared and then add massage as "I believe we are here on the planet Earth to live, grow up and do what we can to make this world a better place for all people to enjoy freedom.."
     And user click on save btn and also close the pop up
     
     
     