package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\HowItWorks.feature", glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/HowItWorks",
		"json:Reports/JsonReports/HowItWorks.json" }, tags = { "@test" })
public class HowItWorks_Runner {

}
