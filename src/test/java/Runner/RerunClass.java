package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"@rerun\\failed_scenarios.txt"}, glue = "StepDef", 
monochrome = true, dryRun = false,plugin = {"pretty","html:target/report.html","json:target/report.json",
		"junit:target/report.xml", "rerun:target/rerun.txt"})
public class RerunClass {

}
