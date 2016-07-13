package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\ChangePassword.feature", glue = { "stepDefinitions" }, dryRun = true, plugin = {
		"pretty", "html:Reports/HTML/ChangePassword",
		"json:Reports/JsonReports/ChangePassword.json" })
public class ChangePassword_Runner {

}
//,tags={" @test"}