package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\MyProfile.feature", glue = { "stepDefinitions" }, dryRun = true, plugin = {
		"pretty", "html:Reports/HTML/ChangePassword",
		"json:Reports/JsonReports/ChangePassword.json" })
public class MyProfile_Runner {

}
