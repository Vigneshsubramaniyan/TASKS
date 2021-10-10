@login @home
Feature: Validating the login page of application

Background:
      Given Lauch the browser
    And open the application
 

Scenario Outline:Login the application with valid cerdentials
  
    When enter the "<username>" and "<password>" 
    And click the login button
    Then validate the login "<msg>" message
		
		Examples:
		|username|password|msg|
		|thillai|andfds|Wrong Credentials|
		
@rege
 Scenario Outline:Login the application with valid cerdentials
  
    When enter the "<username>" and "<password>" 
    And click the login button
    Then validate the login "<msg>" message
		
		Examples:
		|username|password|msg|
		|Besant|andfds|Wrong Credentials| 