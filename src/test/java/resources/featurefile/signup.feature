@regression
Feature: SignUp Page Functionality
  As user I want to sign up into heart bingo website



  Scenario: User should navigate to sign up page successfully
    Given I am on homepage
    When I click on accept cookies
    And I click on sign up link
    And  I enter First Name "Poonam"
    And I enter Last Name "Ramavat"
    And I click on Continue Button
    And I Enter Email "poonam123@gmail.com"
    And I Enter Password "Poonam123"
    And I Enter Mobile Number 7894561235
    And I select Day
    And I select Month
    And I select Year
    And I Click on Address Manually
    And I Enter House Number "35 Alconbury Close"
    And I Enter City "Warrington"
    And I Enter Zip Code "WA5 1ZB"
    And I enter Continue Button
    And I Verify marketing communication on last step "Marketing Communications"
    And I checked marketing communication box
    And I Checked Terms & Condition & Privacy Notice
    Then I created account successfully



