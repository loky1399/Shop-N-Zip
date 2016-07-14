package runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "D:\\Shop-N-Zip\\src\\runner\\SignIn_Runner.java","D:\\Shop-N-Zip\\src\\runner\\Registration_Runner.java" }, glue = { "stepDefinitions" }, dryRun = false, plugin = {
		"pretty", "html:Reports/HTML/", "json:Reports/JsonReports/AboutUs.json" })
public class GroupRunner {

}
// ==> AboutUs= "D:\\Shop-N-Zip\\src\\runner\\AboutUs_Runner.java"
// ==> ChangePagssword=
// "D:\\Shop-N-Zip\\src\\runner\\ChangePassword_Runner.java"
// ==> ContactUs = "D:\\Shop-N-Zip\\src\\runner\\ContactUs_Runner.java"
// ==> Faq ="D:\\Shop-N-Zip\\src\\runner\\FAQs_Runner.java"
// ==> ForgotPassword
// ="D:\\Shop-N-Zip\\src\\runner\\ForgotPassword_Runner.java"
// ==> HowItWorks ="D:\\Shop-N-Zip\\src\\runner\\HowItWorks_Runner.java"
// ==> MyProfile ="D:\\Shop-N-Zip\\src\\runner\\MyProfile_Runner.java"
// ==> Registration ="D:\\Shop-N-Zip\\src\\runner\\Registration_Runner.java"
// ==> ShopNow = "D:\\Shop-N-Zip\\src\\runner\\ShopNow_Runner.java"
// ==> SignIn = "D:\\Shop-N-Zip\\src\\runner\\SignIn_Runner.java"