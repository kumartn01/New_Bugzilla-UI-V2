#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Add
Feature: Verify whether user is able to add a New Product
  I want Verify whether user is able to add a New Product

  @Add
  Scenario: Login and click on Product Add Tab to go to Add page
    Given navigate_to_application_url
    When login_to_application_with_valid_credentials
    Then click_on_ProductAdd_Button
    And verify the product add fields
    And verify if ProductAdd button is disabled
    And input all mandatory fields
    Then verify Product Add button is enabled
    And verify duplicate product cannot be created
    Then create a new valid product
    
    
    
    
    
    
   

