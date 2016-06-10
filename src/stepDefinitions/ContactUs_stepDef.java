package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactUs_stepDef {
	public static WebDriver driver = Hooks.driver;

	@Then("^I should see the 'Contact Us' link in the footer$")
	public void i_should_see_the_Contact_Us_link_in_the_footer()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'contact us' option in page$")
	public void i_clicked_on_contact_us_option_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see the following sections$")
	public void i_should_see_the_following_sections(DataTable arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@When("^I click on 'contact us' in footer$")
	public void i_click_on_contact_us_in_footer() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on ' Contact us' page$")
	public void i_should_be_able_to_redirected_on_Contact_us_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'chat now' button under 'live chat with us option'$")
	public void i_clicked_on_chat_now_button_under_live_chat_with_us_option()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see a window where I can do chat$")
	public void i_should_be_able_to_see_a_window_where_I_can_do_chat()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'send your feedback ' button under 'send your feedback about site'$")
	public void i_clicked_on_send_your_feedback_button_under_send_your_feedback_about_site()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see a window where I can send my feedback about the site$")
	public void i_should_be_able_to_see_a_window_where_I_can_send_my_feedback_about_the_site()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
