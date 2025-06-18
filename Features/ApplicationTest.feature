#Author: your.email@your.domain.com
@tag
Feature: Login Functionality

  Scenario Outline: Verify login with valid credentials
    Given the user launches the application
    When the user enters username "<username>" and password "<password>"
    And the user clicks on the login button
    Then the home page should be displayed with header "<header>"

    Examples: 
      | username                        | password     | header           |
      | testautomation0691@gmail.com    | Harish@1997  | All processes    |

  @tag2
  Feature: Login Functionality - Invalid Credentials

  Scenario Outline: Verify login with invalid credentials
    Given the user launches the application
    When the user enters username "<username>" and password "<password>"
    And the user clicks on the login button
    Then an error message "<errorMessage>" should be displayed

  Examples:
    | username                    | password    | errorMessage             |
    | testautomation0691@gmail.com| wrongPass  | Invalid email or password |
 
 @tag3   
    Feature: Google Login Functionality

  Scenario: Verify Google login link and navigation
    Given the user launches the application
    Then the Google login link should be displayed
    When the user clicks on the Google login link
    Then the Google login page should be displayed
    
 @tag4
 Feature: Forgot Login Feature

  Scenario Outline: Verify forgot login functionality
    Given the user launches the application
    When the user enters username "<username>" and password "<password>"
    And the user clicks on the forgot login link
    Then the forgot login page should be displayed with header "<header>"

  Examples:
    | username  | password  | header        |
    | user1     | pass123   | Almost done!  |
