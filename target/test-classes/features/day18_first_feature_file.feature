@google_search

Feature: Search Functionality- All feature files must start with Feature keyword

    Background: User is on the google home page
      Given user in on the google page

  Scenario: TC01_iPhone Search- this is used to create test scenario/test cases
    #Given user in on the google page
    And user search for iPhone
    Then verify the result has iPhone
    Then close the application


    # To create another scenario use Scenario  : keyword again
  Scenario: TC02_tea pot Search
    #Given user in on the google page
    And user search for tea pot
    Then verify the result has tea pot
    Then close the application

        # To create another scenario use Scenario  : keyword again
  Scenario: TC03_flower Search
        #Given user in on the google page
    And  user search for flower
    Then verify the result has flower
    Then close the application







