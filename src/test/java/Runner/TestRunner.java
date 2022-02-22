package Runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "StepDef", 
monochrome = true, dryRun = false,plugin = {"pretty", "rerun:rerun/failed_scenarios.txt",
		"json:src\\test\\resources\\Report\\output.json"},tags = "@login",
		snippets = SnippetType.CAMELCASE)
public class TestRunner {
	@AfterClass
	public static void afterClass()
	{
		String path=System.getProperty("user.dir");
		Reporting.jvmReport(path+"\\src\\test\\resources\\Report\\output.json");
			
		System.out.println("Thillai Project");
		System.out.println("Thillai Project");

		System.out.println("Thillai Project");
		System.out.println("Thillai Project");


	}
}
