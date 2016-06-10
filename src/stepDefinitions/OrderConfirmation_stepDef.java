package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrderConfirmation_stepDef {
	public static WebDriver driver = Hooks.driver;

	@Given("^I have shopped some items earlier$")
	public void i_have_shopped_some_items_earlier() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I have not yet opted for shipping$")
	public void i_have_not_yet_opted_for_shipping() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on username drop down in header$")
	public void i_clicked_on_username_drop_down_in_header() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^selected My Items option$")
	public void selected_My_Items_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be navigated to the My Items page$")
	public void i_should_be_navigated_to_the_My_Items_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I choose an item$")
	public void i_choose_an_item() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked 'Ship my items' in my items page$")
	public void i_clicked_Ship_my_items_in_my_items_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be navigated to checkout page$")
	public void i_should_be_navigated_to_checkout_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I given recipient address and selected a payment method$")
	public void i_given_recipient_address_and_selected_a_payment_method()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I have completed transaction$")
	public void i_have_completed_transaction() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be redirect to 'Order confirmation' page$")
	public void i_should_be_redirect_to_Order_confirmation_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see confirmation message with contact details  in 'order confirmation ' page$")
	public void i_should_be_able_to_see_confirmation_message_with_contact_details_in_order_confirmation_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see following in page$")
	public void i_should_be_able_to_see_following_in_page(DataTable arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^I should see print order details option$")
	public void i_should_see_print_order_details_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Shop more' button$")
	public void i_clicked_on_Shop_more_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on 'Shop now ' page$")
	public void i_should_be_able_to_redirected_on_Shop_now_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see list of (\\d+)rd party site links in page$")
	public void i_should_be_able_to_see_list_of_rd_party_site_links_in_page(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
