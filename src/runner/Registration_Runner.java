package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features =  "D:\\Shop-N-Zip\\Features\\SignUp.feature", glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/SignUp.feature",
		"json:Reports/JsonReports/SignUp.json"})

public class Registration_Runner {

}


