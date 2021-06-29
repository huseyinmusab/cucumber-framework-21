package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.DefaultPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class Login_Step_Defs {

    LoginPage loginPage=new LoginPage();
    DefaultPage defaultPage=new DefaultPage();


    @Given("user is on the application_login page")
    public void user_is_on_the_application_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("application_login_url"));
    }


    @Given("user enters manager_id {string}")
    public void user_enters_manager_id(String managerID) {
        loginPage.username.sendKeys(managerID);
    }


    @Given("user enters manager_password {string}")
    public void user_enters_manager_password(String password) {
        loginPage.password.sendKeys(password);
    }


    @Given("clicks on login button")
    public void clicks_on_login_button() {
        loginPage.loginButton.click();
    }


    //@Given("verify login default_page is displayed")
    //public void verify_login_default_page_is_displayed() {
    //}
    //instead of this i am using the one at the below,it has scenario outline


    @Given("verify login {string} is displayed")
    public void verify_login_is_displayed(String string) {
        Assert.assertEquals(defaultPage.userID.getText(),string);  //manager contains all manager types such as manager2,manager3...
    }





    //datatables

    @Given("user enters manager _username and manager_password")
    public void user_enters_manager__username_and_manager_password(io.cucumber.datatable.DataTable credentials) {
        //Getting the first row data
        List<String>managerCredentials = credentials.row(0);


        //System.out.println(managerCredentials);//[manager, Manager1!]
        //System.out.println(managerCredentials.get(0));//manager
        //System.out.println(managerCredentials.get(1));//Manager1!
        //so far we are able to get the data from the feature file


        loginPage.username.sendKeys(managerCredentials.get(0));
        loginPage.password.sendKeys(managerCredentials.get(1));


    }





}
