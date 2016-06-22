package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObjects.ContactUs;
import utils.Utils;
import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs_stepDef {
	public static WebDriver driver;

	public ContactUs_stepDef() {
		driver = Hooks.driver;
	}

	@Then("^I should see the 'Contact Us' link in the footer$")
	public void i_should_see_the_Contact_Us_link_in_the_footer()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			driver.get("http://demo24kentico8.raybiztech.com/");
			Assert.assertTrue(pageObjects.Footer.footerContactUslink(driver).isDisplayed());
		}
		catch(Exception e){
			Assert.fail("Contact us link is not displaying in footer");
		}
	}

	@When("^I clicked on 'contact us' option in page$")
	public void i_clicked_on_contact_us_option_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		pageObjects.Footer.footerContactUslink(driver).click();
	}
//skipping table cocept
//	@Then("^I should see the following sections$")
//	public void i_should_see_the_following_sections(DataTable sectionsDisplayed)
//			throws Throwable {
//		// Write code here that turns the phrase above into concrete actions
//		// For automatic transformation, change DataTable to one of
//		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
//		// E,K,V must be a scalar (String, Integer, Date, enum etc)
//		List<String> sectionName = new ArrayList<String>();
//		sectionName.add(ContactUs.contactUs_liveChatWithUsTitle(driver)
//				.getText());
//		sectionName.add(ContactUs.contactUs_sendYourFeedbackTitle(driver).getText());
//		List<List<String>> sections = sectionsDisplayed.raw();
//		int i = 0;
//		for (List<String> s : sections) {
//			Assert.assertTrue(s.equals(sectionName.get(i)));
//			i += 1;
//		}
//		
//	}
	@Then("^I should see the following sectionsLive chat with us in page$")
	public void i_should_see_the_following_sectionsLive_chat_with_us_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  try{
		  Assert.assertTrue(pageObjects.ContactUs.contactUs_liveChatWithUsTitle(driver).isDisplayed());
	  }
	  catch(Exception e){
		  Assert.fail("Live chat with us section is not available");
	  }
	}

	@Then("^I should see the following sectionsSend us your feedback bout the site in page$")
	public void i_should_see_the_following_sectionsSend_us_your_feedback_bout_the_site_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	try{
		Assert.assertTrue(pageObjects.ContactUs.contactUs_sendYourFeedbackTitle(driver).isDisplayed());
	}
	catch(Exception e){
		Assert.fail("Send your feedback section is not available in page");
	}
	}

	@When("^I click on 'contact us' in footer$")
	public void i_click_on_contact_us_in_footer() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			
			Assert.assertTrue(pageObjects.Footer.footerContactUslink(driver).isEnabled());
			pageObjects.Footer.footerContactUslink(driver).click();
			
		}
		catch(Exception e){
			Assert.fail("Contact us link in footer is not enabled");
		}
	}

	@Then("^I should be able to redirected on ' Contact us' page$")
	public void i_should_be_able_to_redirected_on_Contact_us_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertEquals("Shop n Zip - Contact Us", driver.getTitle());
		}
		catch(Exception e){
			Assert.fail("Not navigating to the contact us page" );
		}
	}

	@When("^I clicked on 'chat now' button under 'live chat with us option'$")
	public void i_clicked_on_chat_now_button_under_live_chat_with_us_option()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			pageObjects.Footer.footerContactUslink(driver).click();
			Assert.assertTrue(pageObjects.ContactUs.contactUs_chatNowButton(driver).isEnabled());
			pageObjects.ContactUs.contactUs_chatNowButton(driver).click();
		}
		catch(Exception e){
			Assert.fail("caht now button is not clickable");
		}
	}

	@Then("^I should be able to see a window where I can do chat$")
	public void i_should_be_able_to_see_a_window_where_I_can_do_chat()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Utils.switchToNewWindow(driver);
			String title = driver.getTitle();
			Assert.assertEquals("Chat | Welcome",title);
		} catch (Exception e) {
			Utils.takeScreenshot("chat now window");
			Assert.fail("chat now option is failed");
		}

	}
	

	@When("^I clicked on 'send your feedback ' button under 'send your feedback about site'$")
	public void i_clicked_on_send_your_feedback_button_under_send_your_feedback_about_site()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	try{
		pageObjects.Footer.footerContactUslink(driver).click();
		Assert.assertTrue(pageObjects.ContactUs.contactUs_SendFeedbackButton(driver).isDisplayed());
		pageObjects.ContactUs.contactUs_SendFeedbackButton(driver).click();
	}
	catch(Exception e){
		Assert.fail("send your feedback button is not displaying in contact us page");
	}
	}

	@Then("^I should be able to see a window where I can send my feedback about the site$")
	public void i_should_be_able_to_see_a_window_where_I_can_send_my_feedback_about_the_site()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try{
			Utils.switchToNewWindow(driver);
			String title= driver.getTitle();
			System.out.println(title);
		Assert.assertEquals("Feature: Contact us", title);
		}
		catch(Exception e){
			Assert.fail("Send your feedback option is failed");
		}
	}

}
