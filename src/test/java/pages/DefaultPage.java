package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DefaultPage {

    public DefaultPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//span[@class='hidden-480']")
    public WebElement addUserButton;
    @FindBy(xpath = "//span[contains(text(),'Hotel Management')]")
    public WebElement hotelManagement;
    @FindBy(partialLinkText = "Hotel Rooms")
    public WebElement hotelRooms;
    @FindBy(xpath = "(//span)[1]")
    public WebElement userID;
    @FindBy(partialLinkText = "Room reservations")
    public WebElement roomReservations;

}
