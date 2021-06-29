@selenium_grid
Feature: verify_application_title
  Scenario: verify_title_on_chrome
   Given user is on the application_login page with chrome
   Then verify the title includes Resortsline




    #HOW CAN I RUN ON FIREFOX
  #    Scenario: verify_title_on_firefox
   #   Given user is on the application_login page with firefox
    #  Then verify the title includes Resortsline


