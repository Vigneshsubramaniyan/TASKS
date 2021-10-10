 @login
Feature: Validating the login page of application

Background:
      Given Lauch the browser
    And open the application
@this @rege
Scenario: Login the application with valid cerdentials
  
    When enter the username and password
   |username|password|
   |arasu|thillai|
   |sdfsdfg|fsdfd|
    And click the login button
    Then validate the login "<msg>" message
		
