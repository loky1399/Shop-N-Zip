package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HowItWorks_stepDef {
	public static WebDriver driver = Hooks.driver;

	@Given("^I am in 'How It Works' page$")
	public void i_am_in_How_It_Works_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see 'How It Works' link is highlighted in Header$")
	public void i_should_see_How_It_Works_link_is_highlighted_in_Header()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see steps on screen\\.$")
	public void i_should_be_able_to_see_steps_on_screen(DataTable arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^I should be able to see steps link with short definition vertically in page\\.$")
	public void i_should_be_able_to_see_steps_link_with_short_definition_vertically_in_page(
			DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^I should see 'Ad slot' above footer$")
	public void i_should_see_Ad_slot_above_footer() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see 'Ad slot' besides the links in body$")
	public void i_should_see_Ad_slot_besides_the_links_in_body()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
