package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"

        },
        features = "@target/failedRerun.txt",
        glue = "stepdefinitions",
        tags = "",
        dryRun =false
)
public class FailedScenarioRunner {
}
