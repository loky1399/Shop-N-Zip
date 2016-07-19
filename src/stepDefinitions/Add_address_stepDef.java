package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.SignIn;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add_address_stepDef {
	public static WebDriver driver;

	public Add_address_stepDef() {
		driver = Hooks.driver;
	}

	@When("^I logged In$")
	public void i_logged_In() throws Throwable {
		SignIn_stepDef.signIn(driver);
		Thread.sleep(1000);
		//SignIn.welcomePopup_closeButton(driver).click();
	}

	@When("^I clicked on my username drop-down in header$")
	public void i_clicked_on_my_username_drop_down_in_header() throws Throwable {
		try{
			Assert.assertTrue(pageObjects.MyProfile.UserName_Menulink(driver).isDisplayed());
			pageObjects.MyProfile.UserName_Menulink(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Fail to click on menulink user name");
		}
	}

	@When("^I selected  'My account' from drop down option$")
	public void i_selected_My_account_from_drop_down_option() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be navigated to 'My Account' page$")
	public void i_should_be_navigated_to_My_Account_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I have not added more than (\\d+) recipient address so far$")
	public void i_have_not_added_more_than_recipient_address_so_far(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Add recipient' option beside 'My recipient shipping address' in page\\.$")
	public void i_clicked_on_Add_recipient_option_beside_My_recipient_shipping_address_in_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see 'Add Recipient ' popup  with cancel icon$")
	public void i_should_be_able_to_see_Add_Recipient_popup_with_cancel_icon()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see the title of the popup as  'ADD RECIPIENT'$")
	public void i_should_see_the_title_of_the_popup_as_ADD_RECIPIENT()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see all field related recipient details in 'Add Recipient ' popup as below$")
	public void i_should_be_able_to_see_all_field_related_recipient_details_in_Add_Recipient_popup_as_below(
			DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@When("^I clicked on 'Contunue' button\\.$")
	public void i_clicked_on_Contunue_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to add my entered recipient  address  with its details in my account page\\.$")
	public void i_should_be_able_to_add_my_entered_recipient_address_with_its_details_in_my_account_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to redirected on 'my account' and  popup window should be closed\\.$")
	public void i_should_be_able_to_redirected_on_my_account_and_popup_window_should_be_closed()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I checked 'use this as my default account' check box \\.$")
	public void i_checked_use_this_as_my_default_account_check_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Submit' button\\.$")
	public void i_clicked_on_Submit_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see this added recipient as default recipient address in my account page\\.$")
	public void i_should_be_able_to_see_this_added_recipient_as_default_recipient_address_in_my_account_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Canceled' icon of add credit card popup\\.$")
	public void i_clicked_on_Canceled_icon_of_add_credit_card_popup()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^add recipient popup should be canceled$")
	public void add_recipient_popup_should_be_canceled() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see my account page on my screen\\.$")
	public void i_should_be_able_to_see_my_account_page_on_my_screen()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'Continue' button without entered any data in fields\\.$")
	public void i_clicked_on_Continue_button_without_entered_any_data_in_fields()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I submit button should not be clickable\\.$")
	public void i_submit_button_should_not_be_clickable() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see all required field are highlighted with red marks\\.$")
	public void i_should_be_able_to_see_all_required_field_are_highlighted_with_red_marks()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^no action should be  performed$")
	public void no_action_should_be_performed() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'cancel' button without entered any data in fields\\.$")
	public void i_clicked_on_cancel_button_without_entered_any_data_in_fields()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see 'Cancel' button is in disable mode\\.$")
	public void i_should_be_able_to_see_Cancel_button_is_in_disable_mode()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should not be able to click on it\\.$")
	public void i_should_not_be_able_to_click_on_it() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter Baby in only  First name$")
	public void i_enter_Baby_in_only_First_name() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked on 'submit' button\\.$")
	public void i_clicked_on_submit_button() throws Throwable {
		try{
			  Assert.assertTrue(pageObjects.ChangePassword.ChangePaaswordSubmiteButton(driver).isDisplayed());
			  pageObjects.ChangePassword.ChangePaaswordSubmiteButton(driver).click();
		  }catch(Exception e){
			  System.out.println(e);
			  Assert.fail("Submot button is not clicking");
			
		  }
		}
		
	@Then("^I should be able to see  on my screen\\.$")
	public void i_should_be_able_to_see_on_my_screen() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see error message 'please entered all required information' on my screen\\.$")
	public void i_should_be_able_to_see_error_message_please_entered_all_required_information_on_my_screen()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter baby\\.kumari@raybiztech\\.com in only  email address$")
	public void i_enter_baby_kumari_raybiztech_com_in_only_email_address()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter rbt in only  address(\\d+)$")
	public void i_enter_rbt_in_only_address(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter (\\d+) in only  Phone number$")
	public void i_enter_in_only_Phone_number(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter Hyderabad in only  City$")
	public void i_enter_Hyderabad_in_only_City() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter (\\d+) in only  postal code$")
	public void i_enter_in_only_postal_code(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entereddf(\\d+) in 'First name' text box \\.$")
	public void i_entereddf_in_First_name_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see it should not be expectable by text box on my screen\\.$")
	public void i_should_be_able_to_see_it_should_not_be_expectable_by_text_box_on_my_screen()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere(\\d+) in 'First name' text box \\.$")
	public void i_entere_in_First_name_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere@&jkhhd\\^&\\*\\*\\*jhckhvl in 'First name' text box \\.$")
	public void i_entere_jkhhd_jhckhvl_in_First_name_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enteregsdjgh@hd(\\d+) in 'First name' text box \\.$")
	public void i_enteregsdjgh_hd_in_First_name_text_box(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enterebaby@(\\d+) in 'First name' text box \\.$")
	public void i_enterebaby_in_First_name_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entereddf(\\d+) in 'Last name' text box \\.$")
	public void i_entereddf_in_Last_name_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere(\\d+) in 'Last name' text box \\.$")
	public void i_entere_in_Last_name_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere@&jkhhd\\^&\\*\\*\\*jhckhvl in 'Last name' text box \\.$")
	public void i_entere_jkhhd_jhckhvl_in_Last_name_text_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enteregsdjgh@hd(\\d+) in 'Last name' text box \\.$")
	public void i_enteregsdjgh_hd_in_Last_name_text_box(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enterebaby@(\\d+) in 'Last name' text box \\.$")
	public void i_enterebaby_in_Last_name_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entereddf(\\d+) in 'Email address' text box \\.$")
	public void i_entereddf_in_Email_address_text_box(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere(\\d+) in 'Email address' text box \\.$")
	public void i_entere_in_Email_address_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere@&jkhhd\\^&\\*\\*\\*jhckhvl in 'Email address' text box \\.$")
	public void i_entere_jkhhd_jhckhvl_in_Email_address_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enteregsdjgh@hd(\\d+) in 'Email address' text box \\.$")
	public void i_enteregsdjgh_hd_in_Email_address_text_box(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enterebaby@(\\d+) in 'Email address' text box \\.$")
	public void i_enterebaby_in_Email_address_text_box(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enterebaby\\.kumari@ggdfk\\.com in 'Email address' text box \\.$")
	public void i_enterebaby_kumari_ggdfk_com_in_Email_address_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entereddf(\\d+) in 'phone number' text box \\.$")
	public void i_entereddf_in_phone_number_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere(\\d+) in 'phone number' text box \\.$")
	public void i_entere_in_phone_number_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere@&jkhhd\\^&\\*\\*\\*jhckhvl in 'phone number' text box \\.$")
	public void i_entere_jkhhd_jhckhvl_in_phone_number_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enteregsdjgh@hd(\\d+) in 'phone number' text box \\.$")
	public void i_enteregsdjgh_hd_in_phone_number_text_box(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enterebaby@(\\d+) in 'phone number' text box \\.$")
	public void i_enterebaby_in_phone_number_text_box(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entereddf(\\d+) in 'postal code' text box \\.$")
	public void i_entereddf_in_postal_code_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere(\\d+) in 'postal code' text box \\.$")
	public void i_entere_in_postal_code_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entere@&jkhhd\\^&\\*\\*\\*jhckhvl in 'postal code' text box \\.$")
	public void i_entere_jkhhd_jhckhvl_in_postal_code_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enteregsdjgh@hd(\\d+) in 'postal code' text box \\.$")
	public void i_enteregsdjgh_hd_in_postal_code_text_box(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enterebaby@(\\d+) in 'postal code' text box \\.$")
	public void i_enterebaby_in_postal_code_text_box(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered (\\d+)hkljfh in first Name text field$")
	public void i_entered_hkljfh_in_first_Name_text_field(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered valid datas in remaining fields\\.$")
	public void i_entered_valid_datas_in_remaining_fields() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see error message  Entered name is not valid on my screen\\.$")
	public void i_should_be_able_to_see_error_message_Entered_name_is_not_valid_on_my_screen()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered @hkfh(\\d+) in Last name text field$")
	public void i_entered_hkfh_in_Last_name_text_field(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered dkdgkf@gmail\\.com in email  text field$")
	public void i_entered_dkdgkf_gmail_com_in_email_text_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see error message  entered email addtress is not valid on my screen\\.$")
	public void i_should_be_able_to_see_error_message_entered_email_addtress_is_not_valid_on_my_screen()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered (\\d+)phone number in phone number is not valid$")
	public void i_entered_phone_number_in_phone_number_is_not_valid(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see error message   on my screen\\.$")
	public void i_should_be_able_to_see_error_message_on_my_screen()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered (\\d+)dsgdl in postal code$")
	public void i_entered_dsgdl_in_postal_code(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see error message  postal code should not be alphanumeric on my screen\\.$")
	public void i_should_be_able_to_see_error_message_postal_code_should_not_be_alphanumeric_on_my_screen()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered (\\d+) in Postal code$")
	public void i_entered_in_Postal_code(int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see error message  postal code should have (\\d+) digits only on my screen\\.$")
	public void i_should_be_able_to_see_error_message_postal_code_should_have_digits_only_on_my_screen(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered valid first in First name text field\\.$")
	public void i_entered_valid_first_in_First_name_text_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered valid last name in Last name text field\\.$")
	public void i_entered_valid_last_name_in_Last_name_text_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered Valid email address in email address text fields\\.$")
	public void i_entered_Valid_email_address_in_email_address_text_fields()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered valid phone number in phone number text fields\\.$")
	public void i_entered_valid_phone_number_in_phone_number_text_fields()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered valid address in address text box\\.$")
	public void i_entered_valid_address_in_address_text_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered Valid barangay in barangay text field\\.$")
	public void i_entered_Valid_barangay_in_barangay_text_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered Valid postal code in postal code text box\\.$")
	public void i_entered_Valid_postal_code_in_postal_code_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered valid city name in City text field\\.$")
	public void i_entered_valid_city_name_in_City_text_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I entered valid Province name in Province text field\\.$")
	public void i_entered_valid_Province_name_in_Province_text_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

}
