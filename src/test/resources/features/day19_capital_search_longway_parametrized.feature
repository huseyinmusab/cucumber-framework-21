@capital_search @smoke
Feature: Finding product on google search
  Background: use is navigate to google page
    Given user in on the google page

    #      Test data = iphone. "" will parametrize this data
#      This means this parameter can be any test data
  Scenario: TC01_paris_search
    Given user search for "paris"
    Then verify the result has "paris"
    Then close the application
  Scenario: TC02_london_search
    Given user search for "london"
    Then verify the result has "london"
    Then close the application
  Scenario: TC03_berlin_search
    Given user search for "berlin"
    Then verify the result has "berlin"
    Then close the application
  Scenario: TC04_ankara_search
    Given user search for "ankara"
    Then verify the result has "ankara"
    Then close the application
  Scenario: TC05_baku_search
    Given user search for "baku"
    Then verify the result has "baku"
    Then close the application