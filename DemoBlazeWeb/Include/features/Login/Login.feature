Feature: Login feature
  
  Scenario Outline: Login test 
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button
    Then User is navigate to homepage

   Examples:
   | username | password |
   | akaza | P3OjW+VyDdAcmEtvlJgtAQ== |
   
   
 	Scenario Outline: Login with wrong credentials
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button
    Then Wrong message displayed
    
   Examples:
   | username | password |
   | akaza |  5xx1bkCcAlw= |
   
   
  Scenario Outline: Login no credentials
    Given User navigates to login page
    When User enters <username> and <password>
    And Click on login button
    Then Wrong message displayed empty field
    
   Examples:
   | username | password |
   | "" |  "" |