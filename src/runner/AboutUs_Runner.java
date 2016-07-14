package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\AboutUs.feature", glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/AboutUs",
		"json:Reports/JsonReports/AboutUs.json" })
public class AboutUs_Runner {

}
//, tags = { "" }