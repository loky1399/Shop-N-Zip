package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\SingIn.feature", glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/SignIn.feature",
		"json:Reports/JsonReports/SingIn.feature.json" },tags = {""})
public class SignIn_Runner {

}
