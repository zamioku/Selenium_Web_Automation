@login
Feature: Login
  As a user
  I want to be able to log into the application
  in order to access the application features

  Background:
    Given I am on the application Login page

  @sanity
  Scenario: Login with a valid user
    When I can login with "standard_user"
    Then I should be logged in