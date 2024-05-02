@weaveApp @uitest @tearDown
Feature: Weave App

  #@UC1.01
  #Scenario: UC1.01 - New Deal
  #Given scenario starts "deal" "Weave App" "New Deal" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
  #Given scenario New Deal ends
  #
  #@updateCommentStatus @UC1.03
  #Scenario: UC1.03 - Update Comment Status & notify user
  #Given scenario starts "deal" "Weave App" "Update Comment Status & notify user" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
  #When I update comment status and notify user under deal information
  #Then I should verify deal with updated comments
  #Given scenario Update Comment Status & notify user ends
  #
  #@updateFieldStatus @UC1.02
  #Scenario: UC1.02 - Update Field Status
  #Given scenario starts "deal" "Weave App" "Update Field Status" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
  #When I update all fields under deal information
  #Then I should verify deal with updated fields
  #Given scenario Update Field Status ends  
  #
  #@refresh @UC1.15
  #Scenario: UC1.15 - Refresh Deal Worksheet
    #Given scenario starts "deal" "Weave App" "Refresh Deal Worksheet" uitest
    #Given I launch Weave App website
    #And I enter my credentials and submit
    #And I click on New Deal
    #Given I enter Deal information
    #When I switch to new Deal window
    #Then I should verify new deal listed before saving deal worksheet
    #When I save the information on first window
    #And I should verify successful creation of new deal
    #When I click on refresh button on second window
    #Then I should verify new deal listed in deal worksheet on second browser window
    #Given scenario Refresh Deal Worksheet ends
#
  #
  #@reset @UC1.14
  #Scenario: UC1.14 - Reset
  #Given scenario starts "deal" "Weave App" "Reset" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
  #When I click on reset button Weave App
  #Then I should verify resetting filter
  #Given scenario Reset ends
  #
  #@UC1.08
  #Scenario: UC1.08 - Filter & Sort in the local storage of Weave app
  #Given scenario starts "deal" "Weave App" "Filter & Sort in the local storage of Weave app" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #Given I click on New Deal
  #And I enter Deal information based on new amount and same comment status
  #And I save the information and ok on successful message
  #When I filter by comments and sort by amount
  #Then I should verify two deals sorted by amount and filter by comments
  #Given scenario Filter & Sort in the local storage of Weave app ends
  #
  #@UC1.04
  #Scenario: UC1.04 - Sales users check the Weave app
  #Given scenario starts "deal" "Weave App" "Sales users check the Weave app" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet based on each filter
  #Given scenario Sales users check the Weave app ends
  #
  #@UC1.05
  #Scenario: UC1.05 - Sales users filter by Settlement date
  #Given scenario starts "deal" "Weave App" "Sales users filter by Settlement date" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet based on settlement date filter
  #Given scenario Sales users filter by Settlement date ends
  #
  #@UC1.06
  #Scenario: UC1.06 - Sales users filter by Current Month, Next Month or Future Deals
  #Given scenario starts "deal" "Weave App" "Sales users filter by Current Month, Next Month or Future Deals" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #Given I change settlement date to today
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet based on current month filter
  #And I click on New Deal
  #Given I enter Deal information
  #Given I change settlement date to next month
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet based on next month filter
  #And I should verify new deal listed in deal worksheet based on future deals filter
  #Given scenario Sales users filter by Current Month, Next Month or Future Deals ends
  
  
  # This test development is suspended after discussing with Jordan  
  #@UC1.07
  #Scenario: UC1.07 - Open sales report in Weave app
  #Given scenario starts "deal" "Weave App" "Open sales report in Weave app" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #When I navigated to Reports and enter credentials
  #Then I verify successful sales report shown on the page
  #Given scenario Open sales report in Weave app ends
  
  #@UC1.20
  #Scenario: UC1.20 - Settlement field only permit Date
  #Given scenario starts "deal" "Weave App" "Settlement field only permit Date" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I enter an invalid settlement date
  #Then I should verify invalid entry of settlement date
  #Given scenario Settlement field only permit Date ends
  #
  #@UC1.21
  #Scenario: UC1.21 - Enter different letters in the Amount Financed Field
  #Given scenario starts "deal" "Weave App" "Enter different letters in the Amount Financed Field" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I enter letters other than numeric in amount field
  #Then I should verify error invalid entry of amount
  #Given scenario Enter different letters in the Amount Financed Field ends
  #
  #@UC1.05
  #Scenario: UC1.05 - Missing Mandatory Fields when user Manually enter a new deal in Weave App
  #Given scenario starts "deal" "Weave App" "Missing Mandatory Fields when user Manually enter a new deal in Weave App" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify error on each missing mandatory field
  #Given scenario Missing Mandatory Fields when user Manually enter a new deal in Weave App ends
  #
  #
  #@UC1.16
  #Scenario: UC1.16 - Update Lead Owner in Weave App
  #Given scenario starts "deal" "Weave App" "Update Lead Owner in Weave App" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #And I filter by First Name under Leads tab
  #And I open Lead
  #When I update Lead owner in Weave app
  #Then I should verify successful update of lead owner
  #Given scenario Update Lead Owner in Weave App ends
  #
  #@dealsPerPage @UC1.17
  #Scenario: UC1.17 - Users set up the view by showing 20 Deals, 50 Deals or 100 Deals per page
  #Given scenario starts "deal" "Weave App" "Users set up the view by showing 20 Deals, 50 Deals or 100 Deals per page" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #When I select no.of deals per page
  #Then I should verify no. of deals showing per page
  #Given scenario Users set up the view by showing 20 Deals, 50 Deals or 100 Deals per page ends
  #
  #@goodDescription  @UC1.01Users set up the view by showing 20 Deals, 50 Deals or 100 Deals per page
  #Scenario: UC1.01 - Add Good Description Field in the deal worksheet view
  #Given scenario starts "deal" "Weave App" "Add Good Description Field in the deal worksheet view" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #Given I also enter goods description
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
  #And I should verify Goods Description in deal worksheet view  
  #Given scenario Add Good Description Field in the deal worksheet view ends
  #
  #@UC1.12
  #Scenario: UC1.12 - Reset filter in Leads view
  #Given scenario starts "deal" "Weave App" "Reset filter in Leads view" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #And I filter by First Name under Leads tab
  #And I filter by Marketing Label under Leads tab
  #When I click on reset button Weave App
  #Then I should verify all filters cleared
  #Given scenario Reset filter in Leads view ends
  #
  #
  #@RefreshLeads @UC2.11
  #Scenario: UC2.11 - Refresh Leads button
  #Given scenario starts "deal" "Weave App" "Refresh Leads button" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #Given I create a lead from new browser page
  #When I filter lead by Topic
  #Then I should verify if no lead displayed before saving new lead
  #Given I save new lead from Dynamics page
  #When I click on Refresh Leads
  #Then I should verify new lead just created
  #Given scenario Refresh Leads button ends
  #
  #@QualifyLeads @UC2.05-AF1
  #Scenario: UC2.05-AF1 - Qualify Lead in Weave App
  #Given scenario starts "deal" "Weave App" "Qualify Lead in Weave App" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #Given I create a lead from new browser page
  #Given I save new lead from Dynamics page
  #When I filter lead by Topic
  #Then I should verify new lead just created
  #When I Qualify Lead from Weave App
  #Then I should verify successful lead qualify from Dynamics
  #Given scenario Qualify Lead in Weave App ends
  #
  #@DisqualifyLeads @UC2.05-AF2
  #Scenario: UC2.05-AF2 - Disqualify Lead in Weave App
  #Given scenario starts "deal" "Weave App" "Disqualify Lead in Weave App" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #Given I create a lead from new browser page
  #Given I save new lead from Dynamics page
  #When I filter lead by Topic
  #Then I should verify new lead just created
  #When I Disqualify Lead from Weave App
  #Then I should verify successful lead disqualify from Dynamics
  #Given scenario Disqualify Lead in Weave App ends
  #
  #@DuplicateLead
  #Scenario: Duplicate Lead
  #Given scenario starts "deal" "Weave App" "Duplicate Lead" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #Given I create a lead with duplicate data from new browser page
  #Given I save new lead with duplicate data from Dynamics page
  #When I filter lead by Topic
  #Then I should verify new lead just created
  #When I Qualify Lead from Weave App
  #Then I should verify error on lead from Weave app
  #Given scenario Duplicate Lead ends
  #
  #
  #@OpenDynamics @UC1.16
  #Scenario: UC1.16 - User Opens Dynamics using the D365 Icon
  #Given scenario starts "deal" "Weave App" "User Opens Dynamics using the D365 Icon" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #When I click on icon D365
  #Then I should be shown with Dynamics page
  #Given scenario User Opens Dynamics using the D365 Icon ends
  #
  #@DisqualifyLeadDynamics
  #Scenario: Disqualify Lead in Dynamics and check it displays in Weave
  #Given scenario starts "deal" "Weave App" "Disqualify Lead in Dynamics and check it displays in Weave" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #Given I create a lead from new browser page
  #Given I save new lead from Dynamics page
  #When I disqualify lead in Dynamcis
  #And I filter lead by Topic
  #Then I should verify if lead by Topic is not present in Weave app
  #Given scenario Disqualify Lead in Dynamics and check it displays in Weave ends
  #
  #@FixDuplicateError
  #Scenario: Fix Duplicate error in Dynamics
  #Given scenario starts "deal" "Weave App" "Fix Duplicate error in Dynamics" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #Given I create a lead with duplicate data from new browser page
  #Given I save new lead with duplicate data from Dynamics page
  #When I filter lead by Topic
  #Then I should verify new lead just created
  #When I Qualify Lead from Weave App
  #Then I should verify error on lead from Weave app
  #When I qualify duplicate lead in Dynamcis
  #Then I should verify successful lead qualify in Dynamics
  #Given scenario Fix Duplicate error in Dynamics ends
  #
  #@UC1.20
  #Scenario: UC1.20 - Clean up filter of 'EXPECTED SETTLEMENT DATE' and 'MODIFIED ON' fields from the Clear Button
    #Given scenario starts "deal" "Weave App" "Clean up filter of Expected Settlement Date and Modified on" uitest
    #Given I launch Weave App website
    #And I enter my credentials and submit
    #And I click on New Deal
    #Given I enter Deal information
    #When I save the information
    #Then I should verify successful creation of new deal
    #And I should verify new deal listed in deal worksheet based on settlement date filter
    #When I clean expected settlment date
    #Then I should verify deal based on clear settlement date
    #When I filter deal by Modified On date
    #Then I should verify deal based on Modified On date
    #When I clean modified on date
    #Then I should verify deal based on clear modified on date
    #Given scenario Clean up filter of Expected Settlement Date and Modified on ends
    #
  #@UC1.12
  #Scenario: UC1.12 - Close as Lost deals in Weave App 
  #Given scenario starts "deal" "Weave App" "Close as Lost deals in Weave App" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information  
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
  #Given I click on thumb down icon
  #And I enter status reason and description
  #When I click on update 
  #Then I should verify deal closed as lost  
  #Given scenario Close as Lost deals in Weave App ends
  #
  #@UC2.07
  #Scenario: UC2.07 - Open the Weave app to check the leads 
  #Given scenario starts "deal" "Weave App" "Open the Weave app to check the leads" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit 
  #And I navigate to leads
  #When I turn on the switch Disqualified Leads 
  #Then I should verify all columns under Leads tab
  #Given scenario Open the Weave app to check the leads ends
  #
  #@UC2.08
  #Scenario: UC2.08 - Re-active lead in Weave App 
  #Given scenario starts "deal" "Weave App" "Re-active lead in Weave App" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #Given I turn on the switch Disqualified Leads
  #Given I create a lead from new browser page
  #Given I save new lead from Dynamics page
  #And I disqualify lead in Dynamcis
  #And I filter lead by Topic
  #When I click Reactivate and ok on dialog
  #Then I should verify successful lead reactivation  
  #Given scenario Re-active lead in Weave App ends
  #
  #@UC1.19
  #Scenario: UC1.19 - Filter by clicking the drop-down arrow in deals view 
  #Given scenario starts "deal" "Weave App" "Filter by clicking the drop-down arrow in deals view" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #When I filter by Action Status drop down
  #Then I should verify by Action Status
  #When I filter by Rating drop down
  #Then I should verify by Rating
  #When I filter by Finance Type drop down
  #Then I should verify by Finance Type
  #When I filter by Status drop down
  #Then I should verify by Status
  #When I filter by Status Reason drop down
  #Then I should verify by Status Reason 
  #Given scenario Filter by clicking the drop-down arrow in deals view ends
  #
  #
   #@UC1.11
  #Scenario: UC1.11 - Check the totals in weave App 
  #Given scenario starts "deal" "Weave App" "Check the totals in weave App" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I capture current month and next month total
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
  #When I update my deal with amount
  #Then I verify current month total
  #When I update my deal with settlement date as next month
  #Then I verify next month total
  #Given scenario Check the totals in weave App ends
  #
   #@UC1.13
  #Scenario: UC1.13 - Check the comment status history in particular deal 
  #Given scenario starts "deal" "Weave App" "Check the comment status history in particular deal" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
 #	Given I navigate to comment status field
 #	When I navigate to history 
 #	Then I should verify comment status history
  #Given scenario Check the comment status history in particular deal ends
  #
  #
  #@UC2.02
  #Scenario: UC2.02 - Open the Weave app to check the leads 
  #Given scenario starts "deal" "Weave App" "Open the Weave app to check the leads" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #When I navigate to leads  
  #Then I should verify all filter options under Leads tab
  #When I click on icon D365
  #Then I should verify leads information
  #Given scenario Open the Weave app to check the leads ends
  #
  #
  #@UC2.09 
  #Scenario: UC2.09 - Check the comment status history in particular lead  
  #Given scenario starts "deal" "Weave App" "Check the comment status history in particular lead" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #Given I navigate to leads
  #Given I create a lead from new browser page
  #Given I save new lead from Dynamics page
  #When I filter lead by Topic
  #Then I should verify new lead just created
  #Given click on topic cell
 #	When I navigate to history 
 #	Then I should verify comment status history
  #Given scenario Check the comment status history in particular deal ends
  
   #@UCR2-2.01
   #Scenario: UCR2-2.01 - In the Full-screen, manually enter a new deal in Weave 
   #Given scenario starts "deal" "Weave App" "In the Full-screen, manually enter a new deal in Weave" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #And I click on New Deal
   #Given I enter Deal information
   #When I save the information
   #Then I should verify successful creation of new deal
   #Given scenario In the Full-screen, manually enter a new deal in Weave ends
   
   #@UCR2-2.02
   #Scenario: UCR2-2.02 - Check and update a deal 
   #Given scenario starts "deal" "Weave App" "Check and update a deal" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #And I click on New Deal
   #Given I enter Deal information
   #When I save the information
   #Then I should verify successful creation of new deal
   #When I update all fields under deal information
   #Then I should verify deal with updated fields
   #Given scenario Check and update a deal ends
   
   #@UCR2-2.03
   #Scenario: UCR2-2.03 - Check and update a Lead  
   #Given scenario starts "deal" "Weave App" "Check and update a Lead" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #Given I navigate to leads
   #Given I create a lead from new browser page
   #Given I save new lead from Dynamics page
   #When I filter lead by Topic
   #Then I should verify new lead just created
   #Given click on topic cell
   #Given I update lead deatails
   #When I save the information
   #Then I should verify lead updated
   #Given scenario Check and update a Lead ends
   
    #@UCR2-2.30
   #Scenario: UCR2-2.30 - Update the comments after the lead is closed  
   #Given scenario starts "deal" "Weave App" "Update the comments after the lead is closed" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #Given I navigate to leads
   #Given I create a lead from new browser page
   #Given I save new lead from Dynamics page
   #When I filter lead by Topic
   #Then I should verify new lead just created
   #Given I Disqualify Lead from Weave App
   #Given I click on Disqualify Lead toggle button
   #And I uncheck status reason
   #Given I filter lead by Topic
   #When I update comment status for disqualified lead
   #Then I should verify successful comment update
   #Given scenario Update the comments after the lead is closed ends
   
   #@UCR2-2.29
   #Scenario: UCR2-2.29 - Update the action status and comments after the deal is closed
   #Given scenario starts "deal" "Weave App" "Update the action status and comments after the deal is closed" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #And I click on New Deal
   #Given I enter Deal information
   #When I save the information
   #Then I should verify successful creation of new deal
   #Given I click on Deals tab
   #And I filter by comments
   #And close the deal as lost
   #When I update comments
   #Then I should verify successful comment update
   #Given scenario Update the action status and comments after the deal is closed ends
   
   
  #@UCR2-2.29
   #Scenario: UCR2-2.29 - Add comments after the deal is closed and notify the user
   #Given scenario starts "deal" "Weave App" "Add comments after the deal is closed and notify the user" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #And I click on New Deal
   #Given I enter Deal information
   #When I save the information
   #Then I should verify successful creation of new deal
   #Given I click on Deals tab
   #And I filter by comments
   #And close the deal as lost 
   #When I add comments and user under Status tab  
   #Then I should verify successful update status sent
   #Given scenario Add comments after the deal is closed and notify the user ends
   
   #@UCR2-2.02
   #Scenario: UCR2-2.02 - The user check the WON or Lost deal, the entire page is read-only
   #Given scenario starts "deal" "Weave App" "The user check the WON or Lost deal, the entire page is read-only" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #And I click on New Deal
   #Given I enter Deal information
   #When I save the information
   #Then I should verify successful creation of new deal
   #Given I click on Deals tab
   #And I filter by comments
   #And close the deal as lost 
   #When I navigate to deal overiew page
   #Then I should verify deal is read only
   #Given scenario The user check the WON or Lost deal, the entire page is read-only ends
   
   
   #@UCR2-2.30
   #Scenario: UCR2-2.30 - Add comments after the lead is disqualified and notify the user  
   #Given scenario starts "deal" "Weave App" "Add comments after the lead is disqualified and notify the user" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #Given I navigate to leads
   #Given I create a lead from new browser page
   #Given I save new lead from Dynamics page
   #When I filter lead by Topic
   #Then I should verify new lead just created
   #Given I Disqualify Lead from Weave App
   #Given I click on Disqualify Lead toggle button
   #And I uncheck status reason
   #Given I filter lead by Topic  
   #When I add comments and user under Status tab  
   #Then I should verify successful update status sent
   #Given scenario Add comments after the lead is disqualified and notify the user ends
   
  #@UCR2-2.02
  #Scenario: UCR2-2.02 - The user check the Originated By field, when the deal is WON
  #Given scenario starts "deal" "Weave App" "The user check the Originated By field, when the deal is WON" uitest
  #Given I launch Weave App website
  #And I enter my credentials and submit
  #And I click on New Deal
  #Given I enter Deal information
  #When I save the information
  #Then I should verify successful creation of new deal
  #And I should verify new deal listed in deal worksheet
  #Given I open dynamics
  #And I enter opportunity details in Dynamics page
  #And I save opportunity in Dynamics
  
  
   #@UC1.14
   #Scenario: UC1.14 - Update Lead comment status & notify user  
   #Given scenario starts "deal" "Weave App" "Update Lead comment status & notify user" uitest
   #Given I launch Weave App website
   #And I enter my credentials and submit
   #Given I navigate to leads
   #Given I create a lead from new browser page
   #Given I save new lead from Dynamics page
   #When I filter lead by Topic
   #Then I should verify new lead just created  
   #When I update comment status and notify user under leads tab
   #Then I should verify lead with updated comments
   #Given scenario Update Lead comment status & notify user ends
   
   @UC1.13
   Scenario: UC1.13 - Leads are filtered & sort in the local storage of Weave app  
   Given scenario starts "deal" "Weave App" "Leads are filtered & sort in the local storage of Weave app" uitest
   Given I launch Weave App website
   And I enter my credentials and submit
   Given I navigate to leads
   When I filter by first name and sort by topic on leads tab
   Then I should verify leads based on filter by first name and sort by topic
   Given scenario Leads are filtered & sort in the local storage of Weave app ends
   
  
   
  
  
