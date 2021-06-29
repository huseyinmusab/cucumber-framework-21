@manager_login_long_way @regression
Feature: Manger_login_test
  Scenario: TC_01_reservation_manager_profile
    Given user is on the application_login page
    And user enters manager_id "manager"
    And user enters manager_password "Manager1!"
    And clicks on login button
    And verify login "manager" is displayed
    Then close the application

  Scenario: TC_02_reservation_manager_profile
    Given user is on the application_login page
    And user enters manager_id "manager2"
    And user enters manager_password "Manager2!"
    And clicks on login button
    And verify login "manager2" is displayed
    Then close the application

  Scenario: TC_03_reservation_manager_profile
    Given user is on the application_login page
    And user enters manager_id "manager3"
    And user enters manager_password "Manager3!"
    And clicks on login button
    And verify login "manager3" is displayed
    Then close the application