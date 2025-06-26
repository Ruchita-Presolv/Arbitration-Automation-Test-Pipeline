Feature: User dashboard Usability 

Background:
Given  User is on user login page 
Then User name and UserPassword field is displayed
When user see the user name field then enter User name 
Then user see the user password field then enter user password
And user verify the user dashboard page title as "Home"

@User @SingleCase
Scenario: verify that user able to register single case on the platform 
Given user on home page and click on Arbitration360 btn
Then user click on single case button and verify that from loaded or not 
When user see the Case Registration page then user click on dispute regarding? and verify  taht all options seletable or not 
Then user click on Disputed amount and verify  taht all options seletable or not 
And verify that Invoke Arbitration  button working or not   

@User @SingleCaseRegister
Scenario: verify that user able to register single case on the platform 
Given user on home page and click on Arbitration360 btn
Then user click on single case button and verify that from loaded or not 
But user select dispute type as "Banking" and the amount type as "Upto Rs. 10 lakhs" 
Then user click on Invoke Arbitration button 
When user see the the page title as "Invoke Arbitration" 
Then user fill the Respondent details Full Name as "Aman Presolv" and email as "amankumar@presolv360.com"  then Phone no "9711727490"    
And Address Line1 as "Old Custom near Central Library" City as "Mumbai"  Pincode as "400001" State as "Maharashtra" Country as "India"
Then user add Nature of Agreement as "Testing Single case registration" and Arbitration Clause No. as "3" and Reference ID as "Testing123"
And user upload  Agreement pdf file 
Then user add Brief description of the claim as "In reference to the aforementioned agreement bearing no. AAC02769H, the Respondent availed a loan facility for the purchase of and by hypothecation of vehicle / equipment / asset being HONDA ACTIVA 5G 110CC STD Engine No.: JF50ET7675793, Chassis No.: ME4JF50AMJT675709, Registration No.: TS13EQ0142 from the Claimant. The Respondent committed an act of default by failing and neglecting to pay various amounts of instalments which fell due and payable in terms of the said agreement. In spite of reminders for the settlement of outstanding dues under the loan facility, the Respondent failed and neglected to pay the outstanding amount of Rs. 24923 as on 24-08-22, and further, failed and neglected to give inspection and / or handover the peaceful possession of the vehicle / equipment / asset, as requested by the Claimant in terms of the agreement. Owing to the dispute that has arisen between the parties, the Claimant issued notice under Section 21 of the Arbitration and Conciliation Act, 1996, and invoked arbitration and seeks the following reliefs."
And user add Relief or remedy sought as "a. That an Award and Order be passed directing the Respondent to pay to the Claimant an amount of Rs. 24923 as on 24-08-22 with further interest till realization of the dues;b. That upon failure to pay the aforesaid amount, the Respondent be ordered and directed to handover the peaceful possession of the vehicle / equipment / asset being HONDA ACTIVA 5G 110CC STD Engine No.: JF50ET7675793, Chassis No.: ME4JF50AMJT675709, Registration No.: TS13EQ0142, including the original documents thereto, and in the event of the Respondents non-compliance thereof, permit the Claimant to take charge / repossess the said vehicle / equipment / asset and sell / transfer the same and appropriate the sale proceeds to satisfy the amount prayed for hereinabove, and in the event, the sale proceeds fall short of the amount awarded, permit the Claimant to recover the balance sum from the Respondent by enforcing this Award;c. That pending the hearing and final disposal of the arbitration proceedings, interim and ad-interim reliefs be granted in terms of (b) hereinabove in favour of the Claimant;d. That the Respondent be directed to pay the costs and legal expenses of the present arbitration proceedings, including the fees of the Ld. Sole Arbitrator, and all other expenses incurred by the Claimant in respect thereof; e. For such other and further reliefs as the Ld. Sole Arbitrator may deem fit considering the facts and circumstances of the present case."
Then user check both checked box of aggrements and click on submit btn 




@User @Smoke @Arbitration360
Scenario: verify that all actions inside Arbitration360 are working or not 
Given user on home page and click on Arbitration360 btn check the following 
Then user click on the For Admin Review btn and verify the page title as "For Admin Review"
And user then click on ongoing btn and verify the page title as "Ongoing"
Then user click on Closed btn and verify the page title as "closed"



@User @Smoke @ShareFile
Scenario: verify that share file option is working or not
Given user is on home page and click on Share file 
And verify the page title as "Share file"
And user also verify that all action btn are workin on that page 


@User @Smoke @downloadexcelSheet
Scenario: verify that user able to download the excel sheet for selected cases on the platform 
Given user is on home page and then click on the arbitration360 and click on for admin review
Then user check the select all cases check box and click on download btn


@User @Smoke @UpdateRefrenceId
Scenario: verify that user able to update the refrence id of any case on the platform
Given user is on home page and then click on the arbitration360 and click on for admin review
Then user select any case on platform and click on update refrence id 
And add refrence id as "Test ref 0101" and click on the Submit btn 

#@Smoke @ImportantResources

