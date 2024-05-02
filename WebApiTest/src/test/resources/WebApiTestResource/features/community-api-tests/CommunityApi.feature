@communityApi @webapitest @tearDown
Feature: Community Api tests

  @getConsultants
  Scenario: Get Consultants
  Given scenario starts "communityApi" "Community Api tests" "Get Consultants" webapitest
 	When I run Get Consultants api test
 	Then I should verify sucessful Get Consultants api test
  Given scenario Get Consultants ends
  
  @getConsultant
  Scenario: Get Consultant
  Given scenario starts "communityApi" "Community Api tests" "Get Consultant" webapitest
 	When I run Get Consultant api test
 	Then I should verify sucessful Get Consultant api test
  Given scenario Get Consultant ends
  
  @getEntities
  Scenario: Get Entities
  Given scenario starts "communityApi" "Community Api tests" "Get Entities" webapitest
 	When I run Get Entities api test
 	Then I should verify sucessful Get Entities api test
  Given scenario Get Entities ends
  
  @getEntities_Invalid_Token
  Scenario: Get Entities Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Entities Invalid Token" webapitest
 	When I run Get Entities Invalid Token api test
 	Then I should verify sucessful Get Entities Invalid Token api test
  Given scenario Get Entities Invalid Token ends
  
   @getEntities_No_Token
  Scenario: Get Entities No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Entities No Token" webapitest
 	When I run Get Entities No Token api test
 	Then I should verify sucessful Get Entities No Token api test
  Given scenario Get Entities No Token ends
  
  @getEntityById
  Scenario: Get EntityById
  Given scenario starts "communityApi" "Community Api tests" "Get Entity by Id" webapitest
 	When I run Get Entity by Id api test
 	Then I should verify sucessful Get Entity by Id api test
  Given scenario Get Entity by Id ends
  
  @getEntityById_Invalid_Token
  Scenario: Get EntityById Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Entity by Id Invalid Token" webapitest
 	When I run Get Entity by Id Invalid Token api test
 	Then I should verify sucessful Get Entity by Id Invalid Token api test
  Given scenario Get Entity by Id Invalid Token ends
  
  @getEntityById_No_Token
  Scenario: Get EntityById No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Entity by Id No Token" webapitest
 	When I run Get Entity by Id No Token api test
 	Then I should verify sucessful Get Entity by Id No Token api test
  Given scenario Get Entity by Id No Token ends
  
  @postRequestDirectDebit
  Scenario: Post Request Direct Debit
  Given scenario starts "communityApi" "Community Api tests" "Post Request Direct Debit" webapitest
 	When I run Post Request Direct Debit api test
 	Then I should verify sucessful Post Request Direct Debit api test
  Given scenario Post Request Direct Debit ends
  
  @postRequestDirectDebit_Invalid_Token
  Scenario: Post Request Direct Debit Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Post Request Direct Debit Invalid Token" webapitest
 	When I run Post Request Direct Debit Invalid Token api test
 	Then I should verify sucessful Post Request Direct Debit Invalid Token api test
  Given scenario Post Request Direct Debit Invalid Token ends
  
  @postRequestDirectDebit_No_Token
  Scenario: Post Request Direct Debit No Token
  Given scenario starts "communityApi" "Community Api tests" "Post Request Direct Debit No Token" webapitest
 	When I run Post Request Direct Debit No Token api test
 	Then I should verify sucessful Post Request Direct Debit No Token api test
  Given scenario Post Request Direct Debit No Token ends
  
  @getRequestDirectDebit
  Scenario: Get Request Direct Debit
  Given scenario starts "communityApi" "Community Api tests" "Get Request Direct Debit" webapitest
 	When I run Get Request Direct Debit api test
 	Then I should verify sucessful Get Request Direct Debit api test
  Given scenario Get Request Direct Debit ends
  
  @getRequestDirectDebit_Invalid_Token
  Scenario: Get Request Direct Debit Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Request Direct Debit Invalid Token" webapitest
 	When I run Get Request Direct Debit Invalid Token api test
 	Then I should verify sucessful Get Request Direct Debit Invalid Token api test
  Given scenario Get Request Direct Debit Invalid Token ends
  
  @getRequestDirectDebit_No_Token
  Scenario: Get Request Direct Debit No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Request Direct Debit No Token" webapitest
 	When I run Get Request Direct Debit No Token api test
 	Then I should verify sucessful Get Request Direct Debit No Token api test
  Given scenario Get Request Direct Debit No Token ends
  
  @patchRequestDirectDebit
  Scenario: Patch Request Direct Debit
  Given scenario starts "communityApi" "Community Api tests" "Patch Request Direct Debit" webapitest
 	When I run Patch Request Direct Debit api test
 	Then I should verify sucessful Patch Request Direct Debit api test
  Given scenario Patch Request Direct Debit ends
  
  @patchRequestDirectDebit_Invalid_Token
  Scenario: Patch Request Direct Debit Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Patch Request Direct Debit Invalid Token" webapitest
 	When I run Patch Request Direct Debit Invalid Token api test
 	Then I should verify sucessful Patch Request Direct Debit Invalid Token api test
  Given scenario Patch Request Direct Debit Invalid Token ends
  
   @patchRequestDirectDebit_No_Token
  Scenario: Patch Request Direct Debit No Token
  Given scenario starts "communityApi" "Community Api tests" "Patch Request Direct Debit No Token" webapitest
 	When I run Patch Request Direct Debit No Token api test
 	Then I should verify sucessful Patch Request Direct Debit No Token api test
  Given scenario Patch Request Direct Debit No Token ends
  
  @getUserSetting
  Scenario: Get User Setting
  Given scenario starts "communityApi" "Community Api tests" "Get User Setting" webapitest
 	When I run Get User Setting api test
 	Then I should verify sucessful Get User Setting api test
  Given scenario Get User Setting ends
  
  @getUserSetting_Invalid_Token
  Scenario: Get User Setting Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get User Setting Invalid Token" webapitest
 	When I run Get User Setting Invalid Token api test
 	Then I should verify sucessful Get User Setting Invalid Token api test
  Given scenario Get User Setting Invalid Token ends
  
  @getUserSetting_No_Token
  Scenario: Get User Setting No Token
  Given scenario starts "communityApi" "Community Api tests" "Get User Setting No Token" webapitest
 	When I run Get User Setting No Token api test
 	Then I should verify sucessful Get User Setting No Token api test
  Given scenario Get User Setting No Token ends
  
  @postAddUserSetting
  Scenario: Post Add User Setting
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting" webapitest
 	When I run Post Add User Setting api test
 	Then I should verify sucessful Post Add User Setting api test
  Given scenario Post Add User Setting ends
  
  @postAddUserSetting_Invalid_Token
  Scenario: Post Add User Setting Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting Invalid Token" webapitest
 	When I run Post Add User Setting Invalid Token api test
 	Then I should verify sucessful Post Add User Setting Invalid Token api test
  Given scenario Post Add User Setting Invalid Token ends
  
  @postAddUserSetting_No_Token
  Scenario: Post Add User Setting No Token
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting No Token" webapitest
 	When I run Post Add User Setting No Token api test
 	Then I should verify sucessful Post Add User Setting No Token api test
  Given scenario Post Add User Setting No Token ends
  
   @postAddUserSettingProductName
  Scenario: Post Add User Setting Product Name
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting Product Name" webapitest
 	When I run Post Add User Setting Product Name api test
 	Then I should verify sucessful Post Add User Setting Product Name api test
  Given scenario Post Add User Setting Product Name ends
  
   @postAddUserSettingProductName_Invalid_Token
  Scenario: Post Add User Setting Product Name
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting Product Name Invalid Token" webapitest
 	When I run Post Add User Setting Product Name Invalid Token api test
 	Then I should verify sucessful Post Add User Setting Product Name Invalid Token api test
  Given scenario Post Add User Setting Product Name Invalid Token ends
  
   @postAddUserSettingProductName_No_Token
  Scenario: Post Add User Setting Product Name
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting Product Name No Token" webapitest
 	When I run Post Add User Setting Product Name No Token api test
 	Then I should verify sucessful Post Add User Setting Product Name No Token api test
  Given scenario Post Add User Setting Product Name No Token ends
  
   @postAddUserSettingTermsAndConditions
  Scenario: Post Add User Setting TermsAndConditions
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting TermsAndConditions" webapitest
 	When I run Post Add User Setting TermsAndConditions api test
 	Then I should verify sucessful Post Add User Setting TermsAndConditions api test
  Given scenario Post Add User Setting TermsAndConditions ends
  
   @postAddUserSettingTermsAndConditions_Invalid_Token
  Scenario: Post Add User Setting TermsAndConditions Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting TermsAndConditions Invalid Token" webapitest
 	When I run Post Add User Setting TermsAndConditions Invalid Token api test
 	Then I should verify sucessful Post Add User Setting TermsAndConditions Invalid Token api test
  Given scenario Post Add User Setting TermsAndConditions Invalid Token ends
  
   @postAddUserSettingTermsAndConditions_No_Token
  Scenario: Post Add User Setting TermsAndConditions No Token
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting TermsAndConditions No Token" webapitest
 	When I run Post Add User Setting TermsAndConditions No Token api test
 	Then I should verify sucessful Post Add User Setting TermsAndConditions No Token api test
  Given scenario Post Add User Setting TermsAndConditions No Token ends
  
   @postAddUserSettingWalkthrough
  Scenario: Post Add User Setting Walkthrough
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting Walkthrough" webapitest
 	When I run Post Add User Setting Walkthrough api test
 	Then I should verify sucessful Post Add User Setting Walkthrough api test
  Given scenario Post Add User Setting Walkthrough ends
  
  @postAddUserSettingWalkthrough_Invalid_Token
  Scenario: Post Add User Setting Walkthrough Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting Walkthrough Invalid Token" webapitest
 	When I run Post Add User Setting Walkthrough Invalid Token api test
 	Then I should verify sucessful Post Add User Setting Walkthrough Invalid Token api test
  Given scenario Post Add User Setting Walkthrough Invalid Token ends
  
  @postAddUserSettingWalkthrough_No_Token
  Scenario: Post Add User Setting Walkthrough No Token
  Given scenario starts "communityApi" "Community Api tests" "Post Add User Setting Walkthrough No Token" webapitest
 	When I run Post Add User Setting Walkthrough No Token api test
 	Then I should verify sucessful Post Add User Setting Walkthrough No Token api test
  Given scenario Post Add User Setting Walkthrough No Token ends
  
  @postAddRequestDrawdown
  Scenario: Post Add Reuest Drawdown
  Given scenario starts "communityApi" "Community Api tests" "Post Add Request Drawdown" webapitest
 	When I run Post Add Reuest Drawdown api test
 	Then I should verify sucessful Post Add Reuest Drawdown api test
  Given scenario Post Add Reuest Drawdown ends
  
  @postAddRequestDrawdown_Invalid_Token
  Scenario: Post Add Reuest Drawdown Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Post Add Request Drawdown Invalid Token" webapitest
 	When I run Post Add Reuest Drawdown Invalid Token api test
 	Then I should verify sucessful Post Add Reuest Drawdown Invalid Token api test
  Given scenario Post Add Reuest Drawdown Invalid Token ends
  
   @postAddRequestDrawdown_No_Token
  Scenario: Post Add Reuest Drawdown No Token
  Given scenario starts "communityApi" "Community Api tests" "Post Add Request Drawdown No Token" webapitest
 	When I run Post Add Reuest Drawdown NO Token api test
 	Then I should verify sucessful Post Add Reuest Drawdown No Token api test
  Given scenario Post Add Request Drawdown No Token ends
  
  @getRequestDrawdown
  Scenario: Get Reuest Drawdown
  Given scenario starts "communityApi" "Community Api tests" "Get Request Drawdown" webapitest
 	When I run Get Request Drawdown api test
 	Then I should verify sucessful Get Request Drawdown api test
  Given scenario Get Request Drawdown ends
  
  @getRequestDrawdown_Invalid_Token
  Scenario: Get Reuest Drawdown Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Request Drawdown Invalid Token" webapitest
 	When I run Get Request Drawdown Invalid Token api test
 	Then I should verify sucessful Get Request Drawdown Invalid Token api test
  Given scenario Get Request Drawdown Invalid Token ends
  
   @getRequestDrawdown_No_Token
  Scenario: Get Reuest Drawdown No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Request Drawdown No Token" webapitest
 	When I run Get Request Drawdown No Token api test
 	Then I should verify sucessful Get Request Drawdown No Token api test
  Given scenario Get Request Drawdown No Token ends
  
  @patchRequestDrawdown
  Scenario: Patch Reuest Drawdown
  Given scenario starts "communityApi" "Community Api tests" "Patch Request Drawdown" webapitest
 	When I run Patch Request Drawdown api test
 	Then I should verify sucessful Patch Request Drawdown api test
  Given scenario Patch Request Drawdown ends
  
  @patchRequestDrawdown_Invalid_Token
  Scenario: Patch Reuest Drawdown Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Patch Request Drawdown Invalid Token" webapitest
 	When I run Patch Request Drawdown Invalid Token api test
 	Then I should verify sucessful Patch Request Drawdown Invalid Token api test
  Given scenario Patch Request Drawdown Invalid Token ends
  
  @patchRequestDrawdown_No_Token
  Scenario: Patch Reuest Drawdown No Token
  Given scenario starts "communityApi" "Community Api tests" "Patch Request Drawdown No Token" webapitest
 	When I run Patch Request Drawdown No Token api test
 	Then I should verify sucessful Patch Request Drawdown No Token api test
  Given scenario Patch Request Drawdown No Token ends
  
  @getStatements
  Scenario: Get Statements
  Given scenario starts "communityApi" "Community Api tests" "Get Statements" webapitest
 	When I run Get Statements api test
 	Then I should verify sucessful Get Statements api test
  Given scenario Get Statements ends
  
  @getStatements_Invalid_Token
  Scenario: Get Statements Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Statements Invalid Token" webapitest
 	When I run Get Statements Invalid Token api test
 	Then I should verify sucessful Get Statements Invalid Token api test
  Given scenario Get Statements Invalid Token ends
  
  @getStatements_No_Token
  Scenario: Get Statements No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Statements No Token" webapitest
 	When I run Get Statements No Token api test
 	Then I should verify sucessful Get Statements No Token api test
  Given scenario Get Statements No Token ends
  
  @getStatementPDF
  Scenario: Get Statement PDF
  Given scenario starts "communityApi" "Community Api tests" "Get Statement PDF" webapitest
 	When I run Get Statement PDF api test
 	Then I should verify sucessful Get Statement PDF api test
  Given scenario Get Statement PDF ends
  
  @getStatementPDF_Invalid_Token
  Scenario: Get Statement PDF Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Statement PDF Invalid Token" webapitest
 	When I run Get Statement PDF Invalid Token api test
 	Then I should verify sucessful Get Statement PDF Invalid Token api test
  Given scenario Get Statement PDF Invalid Token ends
  
   @getStatementPDF_No_Token
  Scenario: Get Statement PDF No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Statement PDF No Token" webapitest
 	When I run Get Statement PDF No Token api test
 	Then I should verify sucessful Get Statement PDF No Token api test
  Given scenario Get Statement PDF No Token ends
  
  @postStatementEmail
  Scenario: Post Statement Email
  Given scenario starts "communityApi" "Community Api tests" "Post Statement Email" webapitest
 	When I run Post Statement Email api test
 	Then I should verify sucessful Post Statement Email api test
  Given scenario Post Statement Email ends
  
   @postStatementEmail_Invalid_Token
  Scenario: Post Statement Email Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Post Statement Email Invalid Token" webapitest
 	When I run Post Statement Email Invalid Token api test
 	Then I should verify sucessful Post Statement Email Invalid Token api test
  Given scenario Post Statement Email Invalid Token ends
  
   @postStatementEmail_No_Token
  Scenario: Post Statement Email No Token
  Given scenario starts "communityApi" "Community Api tests" "Post Statement Email No Token" webapitest
 	When I run Post Statement Email No Token api test
 	Then I should verify sucessful Post Statement Email No Token api test
  Given scenario Post Statement Email No Token ends
  
  @getUser
  Scenario: Get User
  Given scenario starts "communityApi" "Community Api tests" "Get User" webapitest
 	When I run Get User api test
 	Then I should verify sucessful Get User api test
  Given scenario Get User ends
  
  @getUser_Invalid_Token
  Scenario: Get User Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get User Invalid Token" webapitest
 	When I run Get User Invalid Token api test
 	Then I should verify sucessful Get User Invalid Token api test
  Given scenario Get User Invalid Token ends
  
  @getUser_No_Token
  Scenario: Get User No Token
  Given scenario starts "communityApi" "Community Api tests" "Get User No Token" webapitest
 	When I run Get User No Token api test
 	Then I should verify sucessful Get User No Token api test
  Given scenario Get User No Token ends
  
   @postSendVerificationCode
  Scenario: Post Send Verification Code
  Given scenario starts "communityApi" "Community Api tests" "Post Send Verification Code" webapitest
 	When I run Post Send Verification Code api test
 	Then I should verify sucessful Post Send Verification Code api test
  Given scenario Post Send Verification Code ends
  
  @postSendVerificationCode_Invalid_Token
  Scenario: Post Send Verification Code Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Post Send Verification Code Invalid Token" webapitest
 	When I run Post Send Verification Code Invalid Token api test
 	Then I should verify sucessful Post Send Verification Code Invalid Token api test
  Given scenario Post Send Verification Code Invalid Token ends
  
  @postSendVerificationCode_No_Token
  Scenario: Post Send Verification Code No Token
  Given scenario starts "communityApi" "Community Api tests" "Post Send Verification Code No Token" webapitest
 	When I run Post Send Verification Code No Token api test
 	Then I should verify sucessful Post Send Verification Code No Token api test
  Given scenario Post Send Verification Code No Token ends
  
  @postUserMessage
  Scenario: Post User Message
  Given scenario starts "communityApi" "Community Api tests" "Post User Message" webapitest
 	When I run Post User Message api test
 	Then I should verify sucessful Post User Message api test
  Given scenario Post User Message ends
  
   @postUserMessage_Invalid_Token
  Scenario: Post User Message Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Post User Message Invalid Token" webapitest
 	When I run Post User Message Invalid Token api test
 	Then I should verify sucessful Post User Message Invalid Token api test
  Given scenario Post User Message Invalid Token ends
  
   @postUserMessage_No_Token
  Scenario: Post User Message No Token
  Given scenario starts "communityApi" "Community Api tests" "Post User Message No Token" webapitest
 	When I run Post User Message No Token api test
 	Then I should verify sucessful Post User Message No Token api test
  Given scenario Post User Message No Token ends
  
   @getUserMessage
  Scenario: Get User Message
  Given scenario starts "communityApi" "Community Api tests" "Get User Message" webapitest
 	When I run Get User Message api test
 	Then I should verify sucessful Get User Message api test
  Given scenario Get User Message ends
  
  @getUserMessage_Invalid_Token
  Scenario: Get User Message Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get User Message Invalid Token" webapitest
 	When I run Get User Message Invalid Token api test
 	Then I should verify sucessful Get User Message Invalid Token api test
  Given scenario Get User Message Invalid Token ends
  
  @getUserMessage_No_Token
  Scenario: Get User Message No Token
  Given scenario starts "communityApi" "Community Api tests" "Get User Message No Token" webapitest
 	When I run Get User Message No Token api test
 	Then I should verify sucessful Get User Message No Token api test
  Given scenario Get User Message No Token ends
  
  @patchUserMessage_Invalid_Token
  Scenario: Patch User Message Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Patch User Message Invalid Token" webapitest
  Given I run Get User Message api test
 	When I run Patch User Message Invalid Token api test
 	Then I should verify sucessful Patch User Message Invalid Token api test
  Given scenario Patch User Message Invalid Token ends
  
  @patchUserMessage_No_Token
  Scenario: Patch User Message No Token
  Given scenario starts "communityApi" "Community Api tests" "Patch User Message No Token" webapitest
  Given I run Get User Message api test
 	When I run Patch User Message No Token api test
 	Then I should verify sucessful Patch User Message No Token api test
  Given scenario Patch User Message No Token ends
  
  #@getAppSettings
  #Scenario: Get App Settings
  #Given scenario starts "communityApi" "Community Api tests" "Get App Settings" webapitest
 #	When I run Get App Settings api test
 #	Then I should verify sucessful Get App Settings api test
  #Given scenario Get App Settings ends
  
   @getAppSettings_Invalid_Token
  Scenario: Get App Settings Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get App Settings Invalid Token" webapitest
 	When I run Get App Settings Invalid Token api test
 	Then I should verify sucessful Get App Settings Invalid Token api test
  Given scenario Get App Settings Invalid Token ends
  
   @getAppSettings_No_Token
  Scenario: Get App Settings No Token
  Given scenario starts "communityApi" "Community Api tests" "Get App Settings No Token" webapitest
 	When I run Get App Settings No Token api test
 	Then I should verify sucessful Get App Settings No Token api test
  Given scenario Get App Settings No Token ends
  
  
  @getDesignatedAccounts
  Scenario: Get Designated Accounts
  Given scenario starts "communityApi" "Community Api tests" "Get Designated Accounts" webapitest
 	When I run Get Designated Accounts api test
 	Then I should verify sucessful Get Designated Accounts api test
  Given scenario Get Designated Accounts ends
  
   @getDesignatedAccounts_Invalid_Token
  Scenario: Get Designated Accounts Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Designated Accounts Invalid Token" webapitest
 	When I run Get Designated Accounts Invalid Token api test
 	Then I should verify sucessful Get Designated Accounts Invalid Token api test
  Given scenario Get Designated Accounts Invalid Token ends
  
  @getDesignatedAccounts_No_Token
  Scenario: Get Designated Accounts No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Designated Accounts No Token" webapitest
 	When I run Get Designated Accounts No Token api test
 	Then I should verify sucessful Get Designated Accounts No Token api test
  Given scenario Get Designated Accounts No Token ends
  
  @getContentName
  Scenario: Get Content Name
  Given scenario starts "communityApi" "Community Api tests" "Get Content Name" webapitest
 	When I run Get Content Name api test
 	Then I should verify sucessful Get Content Name api test
  Given scenario Get Content Name ends
  
  #@getContentName_Invalid_Token
  #Scenario: Get Content Name Invalid Token
  #Given scenario starts "communityApi" "Community Api tests" "Get Content Name Invalid Token" webapitest
 #	When I run Get Content Name Invalid Token api test
 #	Then I should verify sucessful Get Content Name Invalid Token api test
  #Given scenario Get Content Name Invalid Token ends
  #
  #@getContentName_No_Token
  #Scenario: Get Content Name No Token
  #Given scenario starts "communityApi" "Community Api tests" "Get Content Name No Token" webapitest
 #	When I run Get Content Name No Token api test
 #	Then I should verify sucessful Get Content Name No Token api test
  #Given scenario Get Content Name No Token ends
  #
  #@getNotifications
  #Scenario: Get Notifications
  #Given scenario starts "communityApi" "Community Api tests" "Get Notifications" webapitest
 #	When I run Get Notifications api test
 #	Then I should verify sucessful Get Notifications api test
  #Given scenario Get Notifications ends
  
  @getNotifications_Invalid_Token
  Scenario: Get Notifications Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Notifications Invalid Token" webapitest
 	When I run Get Notifications Invalid Token api test
 	Then I should verify sucessful Get Notifications Invalid Token api test
  Given scenario Get Notifications Invalid Token ends
  
   @getNotifications_No_Token
  Scenario: Get Notifications No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Notifications No Token" webapitest
 	When I run Get Notifications No Token api test
 	Then I should verify sucessful Get Notifications No Token api test
  Given scenario Get Notifications No Token end
  
  @getOccupations
  Scenario: Get Occupations
  Given scenario starts "communityApi" "Community Api tests" "Get Occupations" webapitest
 	When I run Get Occupations api test
 	Then I should verify sucessful Get Occupations api test
  Given scenario Get Occupations ends
  
   @postCheckRegisterExistingUser
  Scenario: Post Check Register Existing User
  Given scenario starts "communityApi" "Community Api tests" "Post Check Register Existing User" webapitest
 	When I run Post Check Register Existing User api test
 	Then I should verify sucessful Post Check Register Existing User api test
  Given scenario Post Check Register Existing User ends
  
  @patchRequestDirectDebitIntegration
  Scenario: Patch Request Direct Debit Integration
  Given scenario starts "communityApi" "Community Api tests" "Patch Request Direct Debit Integration" webapitest
 	When I run Patch Request Direct Debit Integration api test
 	Then I should verify sucessful Patch Request Direct Debit Integration api test
  Given scenario Patch Request Direct Debit Integration ends
  
  @patchRequestDrawdownIntegration
  Scenario: Patch Request Drawdown Integration
  Given scenario starts "communityApi" "Community Api tests" "Patch Request Drawdown Integration" webapitest
 	When I run Patch Request Drawdown Integration api test
 	Then I should verify sucessful Patch Request Drawdown Integration api test
  Given scenario Patch Request Drawdown Integration ends
  
  @getTransactions
  Scenario: Get Transactions
  Given scenario starts "communityApi" "Community Api tests" "Get Transactions" webapitest
 	When I run Get Transactions api test
 	Then I should verify sucessful Get Transactions api test
  Given scenario Get Transactions ends
  
  @getTransactions_Invalid_Token
  Scenario: Get Transactions Invalid Token
  Given scenario starts "communityApi" "Community Api tests" "Get Transactions Invalid Token" webapitest
 	When I run Get Transactions Invalid Token api test
 	Then I should verify sucessful Get Transactions Invalid Token api test
  Given scenario Get Transactions Invalid Token ends
  
  @getTransactions_No_Token
  Scenario: Get Transactions No Token
  Given scenario starts "communityApi" "Community Api tests" "Get Transactions No Token" webapitest
 	When I run Get Transactions No Token api test
 	Then I should verify sucessful Get Transactions No Token api test
  Given scenario Get Transactions No Token ends
  
   @patchUserMessageIntegration
  Scenario: Patch User Message Integration
  Given scenario starts "communityApi" "Community Api tests" "Patch User Message Integration" webapitest
 	When I run Patch User Message Integration api test
 	Then I should verify sucessful Patch User Message Integration api test
  Given scenario Patch User Message Integration ends
  
  @getValues
  Scenario: Get Values
  Given scenario starts "communityApi" "Community Api tests" "Get Values" webapitest
 	When I run Get Values api test
 	Then I should verify sucessful Get Values api test
  Given scenario Get Values ends
  