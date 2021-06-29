@room_reservation_1 @regression
Feature: Manager should create a reservation
  Scenario: TC01_manager_should_create_hotel_reservation
    Given user is on the application_login page
    And user enters manager_id "manager"
    And user enters manager_password "Manager1!"
    And clicks on login button
    And verify login "manager" is displayed
    #======click on hotel management,room reservation,addroom reservation======
    And user navigates to create_room_reservation_page

    And user enters the IDUser
    And user enters the IDHotel
    And user enters the price
    And user enters the date_start
    And user enters the date_end
    And user enters the adult_amount
    And user enters the children_amount
    And user enters the contact_name
    And user enters the contact_phone
    And user enters the contact_email
    And user enters the notes
    And user clicks on the approved checkbox
    And user clicks on the is_paid checkbox
    And user clicks on the save_button
    Then user verifies the success_message