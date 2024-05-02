@documents @uitest @tearDown
Feature: Documents Upload
    As a member of IT team
    I need to upload the document

  @deleteRecords
  Scenario: Delete Azure table records
    Given scenario starts "documents" "Documents" "Delete Records" uitest
    Given I launch document upload website
    When I enter my credentials and submit
    Then I should verify successful login to document upload website
    And I delete records lockedBy svc-test-automation from Azure Storage Table

  
  @login
  Scenario: Verify successful login into document upload website
  Given scenario starts "documents" "Documents" "Login" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  Then I should verify successful login to document upload website
  
  @uploadDocument
  Scenario: upload a document and vrify status
  Given scenario starts "documents" "Documents" "Upload Document" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  
  @error
  Scenario: verify displayed issues error
  Given scenario starts "documents" "Documents" "Verify Error Message" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  When I Confirm the form
  Then I should verify errror on the screen
  
  @confirmCheck
  Scenario: verify confirm check
  Given scenario starts "documents" "Documents" "Verify Confirm Check" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I enter client name
  And I enter document details
  When I Confirm the form
  Then I should verify confirm check next to document
  When I Edit the form
  Then I should verify confirm check disappear
  
  @allOriginal
  Scenario: verify all original
  Given scenario starts "documents" "Documents" "Verify All Original" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  When I click on button All Original
  Then I should verify correct no. of images of original document
  
  @postView
  Scenario: verify status after viewing document
  Given scenario starts "documents" "Documents" "Verify Status Post View Document" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  When I navigate back to document list page
  Then I should verify status of document post view
  
  @integrateDocToDynmics
  Scenario: verify integrate document to Dynamics
  Given scenario starts "documents" "Documents" "Integrate Document to Dynamics" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  When I uncheck Integrate this document to dynamics
  Then I should verify document to be ignored from integration to dynamics
  When I check Integrate this document to dynamics
  Then I should verify document to be integrated to dynamics
  
  @sendToDynamics
  Scenario: verify successful upload document
  Given scenario starts "documents" "Documents" "Send to Dynamics" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I enter client name on each detected document
  When I submit send to Dynamics
  Then I should verify successful document upload to dynamics
  
  
  @resetDocuments
  Scenario: Reset documents
  Given scenario starts "documents" "Documents" "Reset Documents" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I enter client name on each detected document
  When I click on reset button
  Then I should verify successful document reset
  
  
  @clearClient
  Scenario: verify clear client
  Given scenario starts "documents" "Documents" "Clear Client" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I enter client name
  When I click on clear client button
  Then I should verify successful clearing client from combobox
  @editMedicareIRN
  Scenario: Edit Medicare Individual Reference Number
  Given scenario starts "documents" "Documents" "Edit Medicare Individual Reference Number" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I click on Medicare under Detected Documents
  And I enter client name
  When I delete Individual Reference Number
  Then I should verify successful deletion of IRN
  Given I add IRN details
  When I Confirm the form
  Then I should verify confirm check next to document
  
  @validateIRN
  Scenario: Validate Medicare Individual Reference Number
  Given scenario starts "documents" "Documents" "Validate Individual Reference Number" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I click on Medicare under Detected Documents
  And I enter client name
  When I click on Individual Reference Number
  Then I should verify validation of Individual Reference Number
  Given I delete Individual Reference Number2
  When I Confirm the form
  Then I should verify confirm check next to document
  
   @validateMandatoryIRN
  Scenario: Validate Mandatory Medicare Individual Reference Number
    Given scenario starts "documents" "Documents" "Validate Mandatory Individual Reference Number" uitest
    Given I launch document upload website
    When I enter my credentials and submit
    And I upload a document
    Then I should verify the status of successful document upload
    Given I view the document
    And I click on Medicare under Detected Documents
    And I enter client name
    When I delete Individual Reference Number1
    Then I should verify validation of mandatory field Individual Reference Number
  
  @uploadMultiDoc
  Scenario: Upload Multi Document
  Given scenario starts "documents" "Documents" "Upload Multi Document" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I enter client name on each detected document
  When I submit send to Dynamics
  Then I should verify successful document upload to dynamics
  
  @backAddressMatchToFront
  Scenario: Licence Back Address Should be Matched To Front
  Given scenario starts "documents" "Documents" "Licence Back Address Should be Matched To Front" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I enter different client name on each detected document
  When I click on button send to Dynamics
  Then I should verify error message on send to Dynamics
  
  @backAddressMatchToFrontPositive
  Scenario: Licence Back Address Should be Matched To Front Positive Scenario
  Given scenario starts "documents" "Documents" "Licence Back Address Should be Matched To Front Positive" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I enter client name on each detected document
  When I submit send to Dynamics
  Then I should verify successful document upload to dynamics
  
  @mandantoryFieldsLicence
  Scenario: Validate Mandatory Fields Licence
  Given scenario starts "documents" "Documents" "Validate Mandatory Fields Licence" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I click on Licence under Detected Documents
  And I enter client name  
  When I cleared text from Fullname textbox
  And I Confirm the form
  Then I should verify mandatory field for Fullname
  Given I enter fullname 
  When I Confirm the form
  Then I should verify confirm check next to document
 
  
  @mandantoryFieldsMedicare
  Scenario: Validate Mandatory Fields for Medicare
  Given scenario starts "documents" "Documents" "Validate Mandatory Fields for Medicare" uitest
  Given I launch document upload website
  When I enter my credentials and submit
  And I upload a document
  Then I should verify the status of successful document upload
  Given I view the document
  And I click on Medicare under Detected Documents
  And I enter client name 
  When I cleared text from Fullname textbox
  And I Confirm the form
  Then I should verify mandatory field for Fullname
  Given I enter fullname 
  When I Confirm the form
  Then I should verify confirm check next to document

