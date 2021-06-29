@data_tables
Feature: Room_reservation_with_datatables
  Scenario: TC01_user_should_be_able_to_login_with_manager_profile
    Given user is on the application_login page
    Given user enters manager _username and manager_password
      |manager|Manager1!|
    Then capture the screenshot
    And clicks on login button
    And verify login "manager" is displayed
    And user navigates to create_room_reservation_page
    Then capture the screenshot

  Scenario: TC02_user_should_be_able_to_make_reservation
    Given user enters all required fields
      |IDUser |IDHotel |price|date_start|date_end|adult_amount|children_amount|contact_name|contact_phone|contact_email  |notes|
      |manager| Sierra |500  |08/01/2021|08/04/2021|2         |3              |john        |(999) 999-9999  |test@gmail.com |test|
    And user clicks on the approved checkbox
    And user clicks on the is_paid checkbox
    And user clicks on the save_button
    Then user verifies the success_message
    Then capture the screenshot

    Then close the application