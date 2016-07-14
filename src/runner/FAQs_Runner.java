package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\FAQ.feature", glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/FAQ",
		"json:Reports/JsonReports/FAQ.json" })
public class FAQs_Runner {

}
//,tags={"@test"}