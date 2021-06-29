
@feature_login @smoke
Feature: Manage_login_test
@manager_login
Scenario Outline: TC_01_reservation_manager_profile
  Given user is on the application_login page
  And user enters manager_id "<manager_id>"
  And user enters manager_password "<manager_password>"
  And clicks on login button
  And verify login "<default_page_id>" is displayed
  Then close the application

  #examples must be the last ,at the bottom
  Examples:
  |manager_id|manager_password|default_page_id|
  |manager   |Manager1!       |manager        |
  |manager2  |Manager2!       |manager2       |
  |manager3  |Manager3!       |manager3       |

    @admin_login
    Scenario Outline: TC_02_reservation_admin_profile
  Given user is on the application_login page
  And user enters manager_id "<admin_id>"
  And user enters manager_password "<admin_password>"
  And clicks on login button
  And verify login "<default_page_id>" is displayed
  Then close the application
  Examples:
    |admin_id  |admin_password    |default_page_id|
    |admin     |Techproed123!     |admin         |