package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "D:\\Shop-N-Zip\\Features" }, glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/DailyReport", "json:Reports/JsonReports/DailyReport.json" },tags={"@dailyRun"})
public class GroupRunner {

}
