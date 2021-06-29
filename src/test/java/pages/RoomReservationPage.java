package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomReservationPage {

    public RoomReservationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(className = "hidden-480")
    public WebElement addRoomReservationButton;
    @FindBy(id = "IDUser")
    public WebElement idUser;
    @FindBy(id = "IDHotelRoom")
    public WebElement idHotelRoom;
    @FindBy(id = "Price")
    public WebElement price;
    @FindBy(id="DateStart")
    public WebElement dateStart;
    @FindBy(id="DateEnd")
    public WebElement dateEnd;
    @FindBy(id="AdultAmount")
    public WebElement adultAmount;
    @FindBy(id="ChildrenAmount")
    public WebElement childrenAmount;
    @FindBy(id="ContactNameSurname")
    public WebElement nameAndSurname;
    @FindBy(id="ContactPhone")
    public WebElement contactPhone;
    @FindBy(id="ContactEmail")
    public WebElement contactEmail;
    @FindBy(id="Notes")
    public WebElement notes;
    @FindBy(id="Approved")
    public WebElement approved;
    @FindBy(id="IsPaid")
    public WebElement isPaid;
    @FindBy(id="btnSubmit")
    public WebElement saveButton;
    @FindBy(className = "bootbox-body")
    public WebElement actualSuccessMessage;

    @FindBy(xpath = "(//button[@type='button'])[last()]")
    public WebElement okButton;


}
