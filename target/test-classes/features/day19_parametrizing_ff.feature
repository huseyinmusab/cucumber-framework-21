@google_search_parameters @regression
Feature: Finding product on google search
  Background: user is navigate to google page
    Given user in on the google page

    Scenario: TC01_iPhone Search
      #test data =iphone. "" will parametrize this data
      #This means this parameter can be any test data
      Given user search for "iPhone"
      Then verify the result has "iPhone"
      Then close the application

  Scenario: TC01_iPhone Search

    Given user search for "bmw"
    Then verify the result has "bmw"
    Then close the application



  Scenario: TC01_iPhone Search

    Given user search for "bmw"
    Then verify the result has "bmw"
    Then close the application