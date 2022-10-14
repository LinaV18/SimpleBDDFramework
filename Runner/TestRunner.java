package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\Mitesh\\IdeaProjects\\SimpleBDDFramework\\src\\test\\resources\\Feature\\Register.Feature",
        glue = {"StepDefination"},
        format = {"pretty","html:htmlReport","json:json/cucumber.json","junit:junit/cucumber.xml"},
        strict = true
     //dryRun = true
        //dryRun = false








)


public class TestRunner {
}
