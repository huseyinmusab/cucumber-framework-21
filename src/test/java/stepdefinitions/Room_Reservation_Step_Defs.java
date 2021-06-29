package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.RoomReservationPage;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class Room_Reservation_Step_Defs {

    DefaultPage defaultPage=new DefaultPage();
    RoomReservationPage roomReservationPage =new RoomReservationPage();
    Faker faker=new Faker();




    @Given("user navigates to create_room_reservation_page")
    public void user_navigates_to_create_room_reservation_page() {
        //======click on hotel management,room reservation,addroom reservation======
        defaultPage.hotelManagement.click();
        defaultPage.roomReservations.click();
        roomReservationPage.addRoomReservationButton.click();
    }


    @Given("user enters the IDUser")
    public void user_enters_the_id_user() {
        Select select=new Select(roomReservationPage.idUser);
        select.selectByIndex(2);
    }


    @Given("user enters the IDHotel")
    public void user_enters_the_id_hotel() {
        Select select =new Select(roomReservationPage.idHotelRoom);
        select.selectByIndex(3);
    }


    @Given("user enters the price")
    public void user_enters_the_price() {
        roomReservationPage.price.sendKeys("1000");
    }


    @Given("user enters the date_start")
    public void user_enters_the_date_start() {
        roomReservationPage.dateStart.sendKeys("07/01/2021");
    }


    @Given("user enters the date_end")
    public void user_enters_the_date_end() {
        roomReservationPage.dateEnd.sendKeys("07/05/2021");
    }


    @Given("user enters the adult_amount")
    public void user_enters_the_adult_amount() {
        roomReservationPage.adultAmount.sendKeys("3");
    }


    @Given("user enters the children_amount")
    public void user_enters_the_children_amount() {
        roomReservationPage.childrenAmount.sendKeys("3");
    }


    @Given("user enters the contact_name")
    public void user_enters_the_contact_name() {
        roomReservationPage.nameAndSurname.sendKeys(faker.name().firstName());
    }


    @Given("user enters the contact_phone")
    public void user_enters_the_contact_phone() {
        roomReservationPage.contactPhone.sendKeys(faker.phoneNumber().phoneNumber() );
    }


    @Given("user enters the contact_email")
    public void user_enters_the_contact_email() {
        roomReservationPage.contactEmail.sendKeys(faker.internet().emailAddress());
    }


    @Given("user enters the notes")
    public void user_enters_the_notes() {
        roomReservationPage.notes.sendKeys("test notes");
    }


    @Given("user clicks on the approved checkbox")
    public void user_clicks_on_the_approved_checkbox() {
        roomReservationPage.approved.click();
    }


    @Given("user clicks on the is_paid checkbox")
    public void user_clicks_on_the_is_paid_checkbox() {
        roomReservationPage.isPaid.click();


    }


    @Given("user clicks on the save_button")
    public void user_clicks_on_the_save_button() {
        roomReservationPage.saveButton.click();
    }


    @Then("user verifies the success_message")
    public void user_verifies_the_success_message() {
        //ReusableMethods.waitFor(3);//HARD WAIT
        ReusableMethods.waitForVisibility(roomReservationPage.actualSuccessMessage,3);//SOFT WAIT
        Assert.assertTrue(roomReservationPage.actualSuccessMessage.isDisplayed());
       // Assert.assertEquals(4,5);
        roomReservationPage.okButton.click();
    }



    //BELOW IS DONE  WITH SCENARIO OUTLINE

    @Given("user enters the IDUser {string}")
    public void user_enters_the_id_user(String string) {
        Select select=new Select(roomReservationPage.idUser);
        select.selectByVisibleText(string);
        //select.selectByVisibleText("manager");
    }


    @Given("user enters the IDHotel {string}")
    public void user_enters_the_id_hotel(String string) {
        Select select =new Select(roomReservationPage.idHotelRoom);
        select.selectByVisibleText(string);
        //select.selectByVisibleText("Sierra");
    }


    @Given("user enters the price {string}")
    public void user_enters_the_price(String string) {
        roomReservationPage.price.sendKeys(string);
    }


    @Given("user enters the date_start {string}")
    public void user_enters_the_date_start(String string) {

        roomReservationPage.dateStart.sendKeys(string);
    }


    @Given("user enters the date_end {string}")
    public void user_enters_the_date_end(String string) {
        roomReservationPage.dateEnd.sendKeys(string);

    }


    @Given("user enters the adult_amount {string}")
    public void user_enters_the_adult_amount(String string) {

        roomReservationPage.adultAmount.sendKeys(string);
    }



    @Given("user enters the children_amount {string}")
    public void user_enters_the_children_amount(String string) {
        roomReservationPage.childrenAmount.sendKeys(string);

    }


    @Given("user enters the contact_name {string}")
    public void user_enters_the_contact_name(String string) {
        roomReservationPage.nameAndSurname.sendKeys(string);

    }


    @Given("user enters the contact_phone {string}")
    public void user_enters_the_contact_phone(String string) {
        roomReservationPage.contactPhone.sendKeys(string);

    }


    @Given("user enters the contact_email {string}")
    public void user_enters_the_contact_email(String string) {
        roomReservationPage.contactEmail.sendKeys(string);

    }


    @Given("user enters the notes {string}")
    public void user_enters_the_notes(String string) {
        roomReservationPage.notes.sendKeys(string);

    }


    @Then("user verifies the success_message {string}")
    public void user_verifies_the_success_message(String string) {

        ReusableMethods.waitForVisibility(roomReservationPage.actualSuccessMessage,3);//SOFT WAIT
        Assert.assertEquals(roomReservationPage.actualSuccessMessage.getText(),string);
        roomReservationPage.okButton.click();
    }








    //testData version
    @Given("user enters all required fields")
    public void user_enters_all_required_fields(DataTable roomData) {
        List<String>testData =  roomData.row(1);
        System.out.println(testData);//[manager, Sierra, 500, 08/01/2021, 08/04/2021, 2, 3, john, (999) 999-9999, test@gmail.com, test]

        Select select=new Select(roomReservationPage.idUser);
        select.selectByVisibleText(testData.get(0));

        Select select1 =new Select(roomReservationPage.idHotelRoom);
        select1.selectByVisibleText(testData.get(1));

        roomReservationPage.price.sendKeys(testData.get(2));

        roomReservationPage.dateStart.sendKeys(testData.get(3));

        roomReservationPage.dateEnd.sendKeys(testData.get(4));

        roomReservationPage.adultAmount.sendKeys(testData.get(5));

        roomReservationPage.childrenAmount.sendKeys(testData.get(6));

        roomReservationPage.nameAndSurname.sendKeys(testData.get(7));

        roomReservationPage.contactPhone.sendKeys(testData.get(8));

        roomReservationPage.contactEmail.sendKeys(testData.get(9));

        roomReservationPage.notes.sendKeys(testData.get(10));

    }

    @Then("capture the screenshot")
    public void capture_the_screenshot() throws IOException {
        ReusableMethods.getScreenshot("Taking Screen Shot ");
    }






}
