package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\ForgotPassword.feature", glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/ForgotPassword",
		"json:Reports/JsonReports/ForgotPassword.json" },tags={"@test"})

public class ForgotPassword_Runner {

}
//,tags={"@test"}