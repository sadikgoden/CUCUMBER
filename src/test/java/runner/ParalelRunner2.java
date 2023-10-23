package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports2.html",
                "json:target/json-reports2/cucumber.json",
                "junit:target/xml-report2/cucumber.xml"},
        features = "features",
        glue = "stepDefinitions",
        tags = "@wip",
        dryRun =false


)
public class ParalelRunner2 {

}
