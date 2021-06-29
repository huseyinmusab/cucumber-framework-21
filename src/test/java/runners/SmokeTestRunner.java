package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber-reports1",  // i put 1 to change the name
                "json:target/json-report/cucumber1.json", //we dont wanna override the old name
                "junit:target/xml-report/cucumber1.xml",  //
                "rerun:target/failedRerun.txt"
        },

        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke",
        dryRun = false
)

public class SmokeTestRunner {


}
