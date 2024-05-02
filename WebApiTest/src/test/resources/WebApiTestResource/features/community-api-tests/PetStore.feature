@petStore @webapitest @tearDown
Feature: Community Api tests

  @findPetById
  Scenario: Find pet by Id
  Given scenario starts "petStore" "Pet Store" "Find Pet By Id" webapitest
 	When I run Find pet by Id api test
 	Then I should verify sucessful Find pet by Id api test
  Given scenario Find pet by Id ends
  
  @updatePetName
  Scenario: Find pet by Id
  Given scenario starts "petStore" "Pet Store" "Update Pet Name" webapitest
 	When I run Update Pet Name api test
 	Then I should verify sucessful Update Pet Name api test
  Given scenario Update Pet Name ends
  
  @deletePet
  Scenario: Delete Pet
  Given scenario starts "petStore" "Pet Store" "Delete Pet" webapitest
 	When I run Get Delete Pet api test
 	Then I should verify sucessful Delete Pet api test
  Given scenario Delete Pet ends