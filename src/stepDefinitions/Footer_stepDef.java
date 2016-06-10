package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Footer_stepDef {
	public static WebDriver driver;

	public Footer_stepDef() {
		driver = Hooks.driver;
	}
	@Then("^I should see the footer section in the home page\\.$")
	public void i_should_see_the_footer_section_in_the_home_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see the footer section in 'Black' background color\\.$")
	public void i_should_see_the_footer_section_in_Black_background_color()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see <Elements> in footer\\.$")
	public void i_should_see_Elements_in_footer(DataTable arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^I should be able to see <Elements>  elements in  <Color name> color\\.$")
	public void i_should_be_able_to_see_Elements_elements_in_Color_name_color(
			DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^I should see the <links in footer > link is displayed in the footer\\.$")
	public void i_should_see_the_links_in_footer_link_is_displayed_in_the_footer()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Terms and Conditions ' link in footer\\.$")
	public void i_clicked_on_Terms_and_Conditions_link_in_footer()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be redirected on 'Terms and Conditions' page of Shop N Zip\\.$")
	public void i_should_be_redirected_on_Terms_and_Conditions_page_of_Shop_N_Zip()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Contact Us ' link in footer\\.$")
	public void i_clicked_on_Contact_Us_link_in_footer() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be redirected on 'Contact Us' page of Shop N Zip\\.$")
	public void i_should_be_redirected_on_Contact_Us_page_of_Shop_N_Zip()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
