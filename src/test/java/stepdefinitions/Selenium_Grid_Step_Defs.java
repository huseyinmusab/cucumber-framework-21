package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import utilities.ConfigReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class Selenium_Grid_Step_Defs {

    WebDriver driver;

    @Given("user is on the application_login page with chrome")
    public void user_is_on_the_application_login_page_with_chrome() throws MalformedURLException {

        //1.Create Desired Capabilities Object
        DesiredCapabilities cap = new DesiredCapabilities();

        //2.Use cap to assign browser name and the operating system
        cap.setBrowserName("chrome");
        cap.setPlatform(Platform.WINDOWS);
        //cap.setPlatform(Platform.MAC);
        //cap.setPlatform(Platform.ANY);

        //3.Merge the chrome with Desired Capabilities
        ChromeOptions options = new ChromeOptions();
        options.merge(cap);

        //4.Create driver object using RemoteWebDriver==> cover all of them
        //Hub URL= port url / wd / hub (Going to the application) wd=webdriver
        String hubUrl =" http://192.168.0.30:4445/wd/hub";
        driver = new RemoteWebDriver(new URL(hubUrl),options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

         //5.CONFIGURATIONS ARE DONE ,WE CAN WRITE OUR JAVA CODES
        driver.get(ConfigReader.getProperty("application_url"));

    }


    @Then("verify the title includes Resortsline")
    public void verify_the_title_includes_resortsline() {
        String title =driver.getTitle();
        Assert.assertTrue(title.contains("Resortsline"));
    }



    //FIREFOX google
    @Given("user is on the application_login page with firefox")
    public void user_is_on_the_application_login_page_with_firefox() throws MalformedURLException {
        //1.Create Desired Capabilities Object
        DesiredCapabilities cap = new DesiredCapabilities();

        //2.Use cap to assign browser name and the operating system
        cap.setBrowserName("firefox");             //DIFFERENT THAN CHROME
        //cap.setPlatform(Platform.WINDOWS);
        //cap.setPlatform(Platform.MAC);
        cap.setPlatform(Platform.ANY);

        //3.Merge the chrome with Desired Capabilities
        FirefoxOptions options = new FirefoxOptions(); //DIFFERENT THAN CHROME
        options.merge(cap);

        //4.Create driver object using RemoteWebDriver==> cover all of them
        //Hub URL= port url / wd / hub (Going to the application) wd=webdriver
        String hubUrl = "http://192.168.0.30:4450/wd/hub";      //PORT URL NOSU NE ISE ONU KULLAN!!!
        driver = new RemoteWebDriver(new URL(hubUrl), options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        //5.CONFIGURATIONS ARE DONE ,WE CAN WRITE OUR JAVA CODES
        driver.get(ConfigReader.getProperty("google_url"));


    }


}
