package runner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Shop-N-Zip\\Features\\ShopNow.feature", glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/ShopNow.feature",
		"json:Reports/JsonReports/ShopNow.json" })

public class ShopNow_Runner {

}
