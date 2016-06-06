package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pageObjects.AboutUs;
import pageObjects.BaseClass;
import pageObjects.HeaderLinks;
import pageObjects.SignIn;
import pageObjects.SignUp;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Registration extends BaseClass {

	@Given("^I am in home page$")
	public void i_am_in_home_page() throws Throwable {
		driver.get("home page URL");
		// AboutUs.aboutus_Menulink().sendKeys("");
	}

	@Then("^I should see \"(.*?)\" button in header$")
	public void i_should_see_button_in_header(String arg1) throws Throwable {
		boolean signup_button = HeaderLinks.signUp_Menulink().isDisplayed();
		System.out.println(signup_button);
	}

	@Given("^I am in About us page$")
	public void i_am_in_About_us_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HeaderLinks.AboutUs_Menulink().click();
		System.out.println(driver.getTitle());
		String actual=driver.getTitle();
		 String Expected="Shop n Zip - About Us"; 
		 if(actual.equals(Expected)){
			 System.out.println("I am in about us page");
		 }
		 else{
			 System.out.println("about us page is not displaying");
		 }
	}

	@Then("^I should see \"(.*?)\" button$")
	public void i_should_see_button(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean signUpLink=HeaderLinks.signUp_Menulink().isDisplayed();
		System.out.println(" aboutUs menu link is available "+signUpLink);
		if(signUpLink==true){
			System.out.println("signUpLink is displaying in menu grid");
			
		}
		else{
			System.out.println("This scenario is fail");
		}
	}

	@Given("^I logged in$")
	public void i_logged_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HeaderLinks.SignIn_Menulink().click();
		SignIn.signIn_with_TFC_credentials_EmailIdTextbox().sendKeys("");
		SignIn.signIn_with_TFC_credentials_PassWordTextbox().sendKeys("");
		SignIn.signIn_with_TFC_credentials_SignInButton().click();
	}

	@Then("^I should not see the sign up button in the current page$")
	public void i_should_not_see_the_sign_up_button_in_the_current_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean signup_button=HeaderLinks.signUp_Menulink().isDisplayed();
		if(signup_button==false){
			System.out.println("SignUp button is not displaying in page.");
		}
		else if (signup_button==true){
			System.out.println("SignUp button is still displaying in page");
		}
	}

	@Given("^I am in FAQ page$")
	public void i_am_in_FAQ_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	 HeaderLinks.FAQ_Menulink().click();
	 String FAQ=driver.getTitle();
	 if(FAQ.contentEquals("")){
		 System.out.println(FAQ);
	 }
	}

	@Given("^I am in How It Works page$")
	public void i_am_in_How_It_Works_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HeaderLinks.howItWorks_Menulink().click();
		String Howitworks=driver.getTitle();
		if(Howitworks.contentEquals("")){
			 System.out.println(Howitworks);
		 }
	}

	@Given("^I am in Shop Now page$")
	public void i_am_in_Shop_Now_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HeaderLinks.shopNow_Menulink().click();
		String ShopNow=driver.getTitle();
		if(ShopNow.contentEquals("")){
			 System.out.println(ShopNow);
		 }
	}

	@Given("^I should see \"(.*?)\" button in header area$")
	public void i_should_see_button_in_header_area(String arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean signup=HeaderLinks.signUp_Menulink().isDisplayed();
		if(signup==true){
			System.out.println("Signup button is displaying");
		}
	}

	@When("^I click on \"(.*?)\" button$")
	public void i_click_on_button(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		HeaderLinks.signUp_Menulink().click();
	}

	@Then("^I should see \"(.*?)\" heading at Sign Up form$")
	public void i_should_see_heading_at_Sign_Up_form(String arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean heading=SignUp.orCreatNewTFCaccunt_title().isDisplayed();
		if(heading==true){
		String headingTitle=SignUp.orCreatNewTFCaccunt_title().getText();
		System.out.println(headingTitle);
			
		}
	}

	@Given("^I am in Sign Up page$")
	public void i_am_in_Sign_Up_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean SignupPage=SignUp.signupForm().isDisplayed();
		if(SignupPage==true){
			System.out.println("I m in signup page");
		}
	}

	@Then("^I should see Name field$")
	public void i_should_see_Name_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean  Name_field=SignUp.NameTextBox().isDisplayed();
		if(Name_field==true){
			System.out.println("Name_field is available in page" +Name_field);
		}
	}
	

	@Then("^I should see Country of current residence drop down$")
	public void i_should_see_Country_of_current_residence_drop_down()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean  Country_of_current_residence_drop_down=SignUp.currentCountryDropDown().isDisplayed();
		if(Country_of_current_residence_drop_down==true){
			System.out.println("Country_of_current_residence_drop_down is available in page" +Country_of_current_residence_drop_down);
		}
	}

	@Then("^I should see Email address field$")
	public void i_should_see_Email_address_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Email_address_field=SignUp.emailAddressTextBox().isDisplayed();
		if(Email_address_field==true){
			System.out.println("Email_address_fieldis available in page" +Email_address_field);
		}
	}

	@Then("^I should see Phone number field$")
	public void i_should_see_Phone_number_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Phone_number_field=SignUp.phoneNumberTextBox().isDisplayed();
		if(Phone_number_field==true){
			System.out.println("Phone_number_field is available in page" +Phone_number_field);
		}
	}

	@Then("^I should see Password field$")
	public void i_should_see_Password_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Password_field=SignUp.passWordTextBox().isDisplayed();
		if(Password_field==true){
			System.out.println("Password_field is available in page" +Password_field);
		}
	}

	@Then("^I should see Re-type password field$")
	public void i_should_see_Re_type_password_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Re_type_password_field=SignUp.reTypePasswordTextBox().isDisplayed();
		if(Re_type_password_field==true){
			System.out.println("Re_type_password_field is available in page" +Re_type_password_field);
		}
	}

	@Then("^I should see Address text field$")
	public void i_should_see_Address_text_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Address_text_field=SignUp.addressTextBox().isDisplayed();
		if(Address_text_field==true){
			System.out.println("Address_text_field is available in page" +Address_text_field);
		}
	}

	@Then("^I should see City text field$")
	public void i_should_see_City_text_field() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean City_text_field=SignUp.cityTextBox().isDisplayed();
		if(City_text_field==true){
			System.out.println("City_text_field is available in page" +City_text_field);
		}
	}

	@Then("^I should see State selection drop down$")
	public void i_should_see_State_selection_drop_down() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean State_selection_drop_down=SignUp.stateDropDown().isDisplayed();
		if(State_selection_drop_down==true){
			System.out.println("State_selection_drop_down is available in page" +State_selection_drop_down);
		}
	}

	@Then("^I should see Register Now button$")
	public void i_should_see_Register_Now_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Register_Now_button=SignUp.registerNowButton().isDisplayed();
		if(Register_Now_button==true){
			System.out.println("Register_Now_button is available in page" +Register_Now_button);
		}
	}

	@Then("^I should see Agree check box$")
	public void i_should_see_Agree_check_box() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Agree_check_box=SignUp.tearmNconditionCheckBox().isDisplayed();
		if(Agree_check_box==true){
			System.out.println("Agree_check_box is available in page" +Agree_check_box);
		}
	}

	@Then("^I should see Terms and condition link$")
	public void i_should_see_Terms_and_condition_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Terms_and_condition_link=SignUp.termsAndConditionLink().isDisplayed();
		if(Terms_and_condition_link==true){
			System.out.println("Terms_and_condition_link is available in page" +Terms_and_condition_link);
		}
	}

	@Then("^I should see Privacy Policy link$")
	public void i_should_see_Privacy_Policy_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Privacy_Policy_link=SignUp.privacypolicyLink().isDisplayed();
		if(Privacy_Policy_link==true){
			System.out.println("Privacy_Policy_link is available in page" +Privacy_Policy_link);
		}
	}

	@Then("^I should see Name field as mendatory$")
	public void i_should_see_Name_field_as_mendatory() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Name_field_as_mendatory=SignUp.NameTextBoxRequiredSymbol().isDisplayed();
		if(Name_field_as_mendatory==true){
			System.out.println("Name_field_as_mendatory  symbol is available in page" +Name_field_as_mendatory);
		}
	}

	@Then("^I should see Country of current residence drop down as mendatory$")
	public void i_should_see_Country_of_current_residence_drop_down_as_mendatory()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Country_of_current_residence_drop_down_as_mendatory=SignUp.currentCountryDropDownRequiredSymbol().isDisplayed();
		if(Country_of_current_residence_drop_down_as_mendatory==true){
			System.out.println("Country_of_current_residence_drop_down_as_mendatory  symbol is available in page" + Country_of_current_residence_drop_down_as_mendatory);
		}
	}

	@Then("^I should see Email address field as mendatory$")
	public void i_should_see_Email_address_field_as_mendatory()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Email_address_field_as_mendatory=SignUp.emailAddressTextBoxRequiredSymbol().isDisplayed();
		if(Email_address_field_as_mendatory==true){
			System.out.println("Email_address_field_as_mendatory symbol is available in page" + Email_address_field_as_mendatory);
		}
	}

	@Then("^I should see Phone number field as mendatory$")
	public void i_should_see_Phone_number_field_as_mendatory() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Phone_number_field_as_mendatory=SignUp.phoneNumberTextBoxRequiredSymbol().isDisplayed();
		if(Phone_number_field_as_mendatory==true){
			System.out.println("Phone_number_field_as_mendatorysymbol is available in page" + Phone_number_field_as_mendatory);
		}
	}

	@Then("^I should see Password field as mendatory$")
	public void i_should_see_Password_field_as_mendatory() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Password_field_as_mendatory=SignUp.passWordTextBoxRequiredSymbol().isDisplayed();
		if(Password_field_as_mendatory==true){
			System.out.println("Password_field_as_mendatory symbol is available in page" + Password_field_as_mendatory);
		}
	}

	@Then("^I should see Re-type password field as mendatory$")
	public void i_should_see_Re_type_password_field_as_mendatory()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		boolean Re_type_password_field_as_mendatory=SignUp.reTypePasswordRequiredSymbol().isDisplayed();
		if(Re_type_password_field_as_mendatory==true){
			System.out.println("Re_type_password_field_as_mendatory symbol is available in page" + Re_type_password_field_as_mendatory);
		}
	}

	@Given("^I clicked on <socila network icon > icon in signup page\\.$")
	public void i_clicked_on_socila_network_icon_icon_in_signup_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see a pop for <socila network icon > login is appeared$")
	public void i_should_see_a_pop_for_socila_network_icon_login_is_appeared()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I loged in with my Signin with facebook credintials$")
	public void i_loged_in_with_my_Signin_with_facebook_credintials()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see Name field in the sign up from is auto filled$")
	public void i_should_see_Name_field_in_the_sign_up_from_is_auto_filled()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see Country of current resident field in the sign up from is auto filled$")
	public void i_should_see_Country_of_current_resident_field_in_the_sign_up_from_is_auto_filled()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see Email Address field in the sign up from is auto filled$")
	public void i_should_see_Email_Address_field_in_the_sign_up_from_is_auto_filled()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see Phone Number field in the sign up from is auto filled$")
	public void i_should_see_Phone_Number_field_in_the_sign_up_from_is_auto_filled()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I loged in with my Signin with twitter credintials$")
	public void i_loged_in_with_my_Signin_with_twitter_credintials()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I loged in with my Signin with google\\+ credintials$")
	public void i_loged_in_with_my_Signin_with_google_credintials()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^Registered with valid details$")
	public void registered_with_valid_details() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see Registration is successful$")
	public void i_should_see_Registration_is_successful() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I completed sign up$")
	public void i_completed_sign_up() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see a welcome pop up$")
	public void i_should_see_a_welcome_pop_up() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see \"(.*?)\" text along with User name$")
	public void i_should_see_text_along_with_User_name(String arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see \"(.*?)\" text along with ID$")
	public void i_should_see_text_along_with_ID(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see \"(.*?)\" text along with shop N zip US location address$")
	public void i_should_see_text_along_with_shop_N_zip_US_location_address(
			String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I am in sign up page$")
	public void i_am_in_sign_up_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should get verification link to the specified email address$")
	public void i_should_get_verification_link_to_the_specified_email_address()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^It should be valid upto one year$")
	public void it_should_be_valid_upto_one_year() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on the verifiction link$")
	public void i_click_on_the_verifiction_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be navigated to shop N zip application$")
	public void i_should_be_navigated_to_shop_N_zip_application()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see verification is successful$")
	public void i_should_see_verification_is_successful() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I logged out$")
	public void i_logged_out() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^click on same verficatoin link again in email$")
	public void click_on_same_verficatoin_link_again_in_email()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be redirected to shop n zip application$")
	public void i_should_be_redirected_to_shop_n_zip_application()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see a message saying \"(.*?)\"$")
	public void i_should_see_a_message_saying(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on verficatoin link in email after one year$")
	public void i_click_on_verficatoin_link_in_email_after_one_year()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I clicked on \"(.*?)\" button$")
	public void i_clicked_on_button(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^it should see registration is unsuccessful$")
	public void it_should_see_registration_is_unsuccessful() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I tried to Registered without giving details to Name field$")
	public void i_tried_to_Registered_without_giving_details_to_Name_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see registration is unsuccessful$")
	public void i_should_see_registration_is_unsuccessful() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I tried to Registered without selecting anything in Country of current residence field$")
	public void i_tried_to_Registered_without_selecting_anything_in_Country_of_current_residence_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see \"(.*?)\" alert message above the field in red color$")
	public void i_should_see_alert_message_above_the_field_in_red_color(
			String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I tried to Registered without giving details to Email Address field$")
	public void i_tried_to_Registered_without_giving_details_to_Email_Address_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see \"(.*?)\" alert message above the field in red color And I should see \"(.*?)\" alert message above the field in red color$")
	public void i_should_see_alert_message_above_the_field_in_red_color_And_I_should_see_alert_message_above_the_field_in_red_color(
			String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I tried to Registered without giving details to Phone Number field$")
	public void i_tried_to_Registered_without_giving_details_to_Phone_Number_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I tried to Registered without giving details to Password field$")
	public void i_tried_to_Registered_without_giving_details_to_Password_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I tried to Registered without giving details to re-type Password field$")
	public void i_tried_to_Registered_without_giving_details_to_re_type_Password_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I Click on sign up button$")
	public void i_Click_on_sign_up_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see the validation messages are displayed$")
	public void i_should_see_the_validation_messages_are_displayed()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter invalid email id in fields email id text box$")
	public void i_enter_invalid_email_id_in_fields_email_id_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I clicked any where in page\\.$")
	public void i_clicked_any_where_in_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see error messageinvalid email address above the respective text field in red color\\.$")
	public void i_should_see_error_messageinvalid_email_address_above_the_respective_text_field_in_red_color()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter password less than (\\d+) charactor in fields in password field$")
	public void i_enter_password_less_than_charactor_in_fields_in_password_field(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see error messagePlease enter a password that is at least (\\d+) characters long and contains at least (\\d+) special characters above the respective text field in red color\\.$")
	public void i_should_see_error_messagePlease_enter_a_password_that_is_at_least_characters_long_and_contains_at_least_special_characters_above_the_respective_text_field_in_red_color(
			int arg1, int arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter Password without special charactor in fields in password  text field$")
	public void i_enter_Password_without_special_charactor_in_fields_in_password_text_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter invalid retype pasword in fields in retype pasword field$")
	public void i_enter_invalid_retype_pasword_in_fields_in_retype_pasword_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see error messageFields do not match above the respective text field in red color\\.$")
	public void i_should_see_error_messageFields_do_not_match_above_the_respective_text_field_in_red_color()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter Invalid phone nuber in fields in phone number text field$")
	public void i_enter_Invalid_phone_nuber_in_fields_in_phone_number_text_field()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see error messageInvalid phone number above the respective text field in red color\\.$")
	public void i_should_see_error_messageInvalid_phone_number_above_the_respective_text_field_in_red_color()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I enter Invalid zip code in fields in zip code text box$")
	public void i_enter_Invalid_zip_code_in_fields_in_zip_code_text_box()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see error messageNot a valid zip code above the respective text field in red color\\.$")
	public void i_should_see_error_messageNot_a_valid_zip_code_above_the_respective_text_field_in_red_color()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
