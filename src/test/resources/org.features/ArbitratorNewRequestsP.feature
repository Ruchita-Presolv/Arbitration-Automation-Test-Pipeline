Feature: Verify that all Action present on New Request page are working as required

  Background: 
    Given Arb user is on login page
    Then ArbUser name and ArbPassword field is displayed
    When user see the user name field then enter ArbUser name
    Then user see the user password field then enter Arb password

  @Smoke @UabilityOfActBtn @Arb
  Scenario: verify that all action present on the page are working or not
    Given user is on the dashboard page and click on the new request action
    Then user verify the page title as "New Request" and also check no of entries per page dropdown workability
    And verify that button like Accept Reject and Comments are working or not
    Then user capture case id from platform and search for the same case id using search
    And verify that proper search result displayed or not also verify the refresh btn
    When user click on case id then the case details page is displayed or not verify
    Then verify that the user able to select or unselect the case and also next page button working or not

  @Sanity @DownloadRLNOAArbALetter @Arb
  Scenario: verify that user able to click  the case details and download various document related to the case id
    Given user is on the dashboard page and click on the new request action
    Then user capture case id from platform and search for the same case id using search
    But user verify that able to download Request letter,NOA,Arbitration Appoint Letter
    And user also verify that Back btn working or not

  @Sanity @Accept1 @Arb
  Scenario: User select any case from platform and verify Accept action
    Given user is on the dashboard page and click on the new request action
    Then user select first case on the page and click on the accept
    And user select all yes Radio btn for consent  and click on submit
    And user finally verify the success massage as "Consent and disclosures submitted." and click on the Ok btn

  @Sanity @Accept2 @Arb
  Scenario: User select any case from platform and verify Accept action
    Given user is on the dashboard page and click on the new request action
    Then user select first case on the page and click on the accept
    And user select all No Radio btn for consent  and click on submit
    And user finally verify the success massage as "Consent and disclosures submitted." and click on the Ok btn

  @Sanity @Accept3 @Arb
  Scenario: User select any case from platform and verify Accept action
    Given user is on the dashboard page and click on the new request action
    Then user select first case on the page and click on the accept
    And user select all Yes,No,Yes Radio btn for consent  and click on submit
    And user finally verify the success massage as "Consent and disclosures submitted." and click on the Ok btn

  #@Reject
  #Scenario: User select any case from platform and verify Reject action
  #Given user is on the dashboard page and click on the new request action
  #Then user select first case on the page and click on the Reject
  #When user see the Input Reject Reason then enter reason as "Not a valid case document not as per required"
  #Then user click on Apply btn and verify the success message  and click on ok btn
  @Sanity @CommentsPrivate @Arb
  Scenario: User select any case from platform and verify Comments action Private
    Given user is on the dashboard page and click on the new request action
    Then user select first case on the page and click on the Comments and check both options are clickable
    And user select private and add comment as "Live life to the fullest, and focus on the positive."
    Then user click on the save btn and verify the success message  and click on ok btn

  @Sanity @CommentsShare @Arb
  Scenario: User select any case from platform and verify Comments action Share
    Given user is on the dashboard page and click on the new request action
    Then user select first case on the page and click on the Comments and check both options are clickable
    And user select Share and add comment as "He Who is Not Courageous Enough to Take Risks Will Accomplish Nothing in Life. ..."
    Then user click on the save btn and verify the success message  and click on ok btn

  @Smoke @BulkAccept @Arb
  Scenario: User select any case from platform and verify Comments action Bulk Accept
    Given user is on the dashboard page and click on the new request action
    Then user select cases using from to filter and kept except as blank
    And user then click on Accept btn to accept all selected cases

  @Smoke @BulkReject @Arb
  Scenario: User select any case from platform and verify Comments action Bulk Reject
    Given user is on the dashboard page and click on the new request action
    Then user select cases using from to filter and kept except as blank
    And user click on bulk reject and user enter reason as "Not A valid case in Automation" and click on apply btn
    Then verify the success message and user click on close btn

  @Smoke @DashboardCaseDetails @Arb
  Scenario: verify that user is on dashboard page and able to see the case details  when he click on case id
    Given user is on dashboard page and click on case id
    Then user verify that the case details page loaded successfully

  @Smoke @DashboardCaseDocumentsPreview @Arb
  Scenario: verify that user is on dashboard page and able to see the case details  when he click on case id
    Given user is on dashboard page and click on preview or eye icon and check the visibility
    Then user verify that he able to download the file or not
