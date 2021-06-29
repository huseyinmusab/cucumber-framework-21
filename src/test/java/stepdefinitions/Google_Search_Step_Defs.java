package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class Google_Search_Step_Defs {

    GooglePage googlePage = new GooglePage();

    @Given("user in on the google page")
    public void user_in_on_the_google_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }



    @When("user search for iPhone")
    public void user_search_for_i_phone() {
        googlePage.googleSearchBox.sendKeys("iPhone"+ Keys.ENTER);
    }



    @Then("verify the result has iPhone")
    public void verify_the_result_has_i_phone() {
        String googleTitle =Driver.getDriver().getTitle();
        Assert.assertTrue(googleTitle.contains("iPhone"));

    }


    @When("user search for tea pot")
    public void user_search_for_tea_pot() {
        googlePage.googleSearchBox.sendKeys("tea pot" + Keys.ENTER);
    }


    @Then("verify the result has tea pot")
    public void verify_the_result_has_tea_pot() {
        String googleTitle =Driver.getDriver().getTitle();
        Assert.assertTrue(googleTitle.contains("tea pot"));

    }


    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @Given("user search for flower")
    public void user_search_for_flower() {

        googlePage.googleSearchBox.sendKeys("flower" + Keys.ENTER);

    }


    @Then("verify the result has flower")
    public void verify_the_result_has_flower() {
        String googleTitle =Driver.getDriver().getTitle();
        Assert.assertTrue(googleTitle.contains("flower"));
    }


    @Given("user search for {string}")
    public void user_search_for(String string) {
        googlePage.googleSearchBox.sendKeys(string + Keys.ENTER);

    }



    @Then("verify the result has {string}")
    public void verify_the_result_has(String string) {
        String googleTitle =Driver.getDriver().getTitle();
        Assert.assertTrue(googleTitle.contains(string));

    }






}
