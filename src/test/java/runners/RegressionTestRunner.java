package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "html:target/default-cucumber-reports2",  // i put 2 to change the name
                "json:target/json-report/cucumber2.json", //we dont wanna override the old name
                "junit:target/xml-report/cucumber2.xml",  //
                "rerun:target/failedRerun.txt"
        },

        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@regression",
        dryRun = false
)


public class RegressionTestRunner {


}
