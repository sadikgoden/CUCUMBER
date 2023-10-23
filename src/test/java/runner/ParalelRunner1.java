package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports1.html",
                "json:target/json-reports1/cucumber.json",
                "junit:target/xml-report1/cucumber.xml"},
        features = "features",
        glue = "stepDefinitions",
        tags = "@wip",
        dryRun =false


)
public class ParalelRunner1 {
}
