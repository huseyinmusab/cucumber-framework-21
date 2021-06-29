@room_reservation_2
Feature: User_should_be_able_to_reserve_room
  Background:user_goes_to_application_login_page
    Given user is on the application_login page
  Scenario Outline: TC_01_login_with_manager_profile
    And user enters manager_id "<manager_id>"
    And user enters manager_password "<manager_password>"
    And clicks on login button
    And verify login "<default_page_id>" is displayed
    Given user navigates to create_room_reservation_page
    And user enters the IDUser "<IDUser>"
    And user enters the IDHotel "<IDHotel>"
    And user enters the price "<price>"
    And user enters the date_start "<date_start>"
    And user enters the date_end "<date_end>"
    And user enters the adult_amount "<adult_amount>"
    And user enters the children_amount "<children_amount>"
    And user enters the contact_name "<contact_name>"
    And user enters the contact_phone "<contact_phone>"
    And user enters the contact_email "<contact_email>"
    And user enters the notes "<notes>"
    And user clicks on the approved checkbox
    And user clicks on the is_paid checkbox
    And user clicks on the save_button
    Then user verifies the success_message "<success_message>"
    Then close the application
    Examples: test data
      |manager_id |manager_password |default_page_id  |IDUser |IDHotel|price|date_start|date_end  |adult_amount|children_amount|contact_name|contact_phone    |contact_email    |notes               |success_message|
      |manager    |Manager1!        |manager          |manager|Sierra|1000 |07/01/2021|07/03/2021 |2            |3              |test        |(546) 345-6345  |test@gmail.com   |test                |RoomReservation was inserted successfully  |
      |manager   |Manager1!        |manager           |manager|Krystel|250 |07/01/2021|08/01/2021 |1            |0              |My Boss     |(999) 345-6345  |alone@gmail.com  |Don't bother        |RoomReservation was inserted successfully  |
      |manager   |Manager1!        |manager           |manager|Karelle|100 |07/01/2021|07/02/2021 |2            |1              |My Boss     |(999) 345-6345  |both@gmail.com   |one day reservation |RoomReservation was inserted successfully  |