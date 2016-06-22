package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\ShopNow.feature", glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/SignIn.feature",
		"json:Reports/JsonReports/SingIn.feature.json" },tags={"@MyTest"})

public class ShopNow_Runner {

}
