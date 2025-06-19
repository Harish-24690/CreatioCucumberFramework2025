#Author: Harish.R[testautomation0691@gmail.com]
@tag
Feature: Creatio Functionalities

  Background: Initializing the methods
    Given Initialize the driver

  Scenario Outline: Verify login with valid credentials
    Given the user launches the application
    When the user enters username "<username>" and password "<password>"
    And the user clicks on the login button
    Then the home page should be displayed with header "<header>"

    Examples: 
      | username                     | password    | header        |
      | testautomation0691@gmail.com | Harish@1997 | All processes |

  @tag2
  Scenario Outline: Verify login with invalid credentials
    Given the user launches the application
    When the user enters username "<username>" and password "<password>"
    And the user clicks on the login button
    Then an error message "<errorMessage>" should be displayed

    Examples: 
      | username                     | password  | errorMessage              |
      | testautomation0691@gmail.com | wrongPass | Invalid email or password |

  @tag3
  Scenario: Verify Google login link and navigation
    Given the user launches the application
    When the user clicks on the Google login link
    Then the Google login page should be displayed

  @tag4
  Scenario Outline: Verify forgot login functionality
    Given the user launches the application
    When the user enters username "<username>" and password "<password>"
    And the user clicks on the forgot login link
    Then the forgot login page should be displayed with header "<header>"

    Examples: 
      | username                     | password | header       |
      | testautomation0691@gmail.com | pass123  | Almost done! |
