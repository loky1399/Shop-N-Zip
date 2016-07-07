package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\SignUp.feature", glue = { "stepDefinitions" }, dryRun = true, plugin = {
		"pretty", "html:Reports/HTML/SignIn.feature",
		"json:Reports/JsonReports/SingIn.feature.json" })

public class Registration_Runner {

}
