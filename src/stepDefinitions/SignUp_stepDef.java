package stepDefinitions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.AboutUs;
import pageObjects.HeaderLinks;
import pageObjects.SignUp;
import utils.Constant;
import utils.Utils;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUp_stepDef {
	public static WebDriver driver;
	public String mainWindow = null;
	Set<String> allWindows = null;

	public SignUp_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in home page of shopNzip$")
	public void i_am_in_home_page_of_shopNzip() throws Throwable {
		driver.get(Constant.Home_URL);
		Assert.assertTrue(driver.getTitle().equals("Shop n Zip - Home"));

	}

	@Then("^I should see 'Sign Up' button in header$")
	public void i_should_see_Sign_Up_button_in_header() throws Throwable {
		Assert.assertTrue(HeaderLinks.signUp_Menulink(driver).isDisplayed());
	}

	@Given("^I am in About us page$")
	public void i_am_in_About_us_page() throws Throwable {
		driver.get(Constant.AboutUs_URL);
		Assert.assertTrue(driver.getTitle().equals("Shop n Zip - About Us"));
	}

	@Then("^I should see 'Sign Up' button$")
	public void i_should_see_Sign_Up_button() throws Throwable {
		Assert.assertTrue(AboutUs.signUpOption(driver).isDisplayed());
	}

	@Then("^I should not see the sign up button in the current page$")
	public void i_should_not_see_the_sign_up_button_in_the_current_page()
			throws Throwable {
		Assert.assertTrue(true);
	}

	@Given("^I am in How It Works page$")
	public void i_am_in_How_It_Works_page() throws Throwable {
		driver.get(Constant.HowItWorks_URL);
		Assert.assertTrue(driver.getTitle().equals("Shop n Zip - How It Works"));
	}

	@Given("^I am in Shop Now page$")
	public void i_am_in_Shop_Now_page() throws Throwable {
		driver.get(Constant.ShopNow_URL);
		Assert.assertTrue(driver.getTitle().equals("Shop n Zip - Shop Now"));
	}

	@When("^I click on 'Sign Up' button$")
	public void i_click_on_Sign_Up_button() throws Throwable {
		try {
			HeaderLinks.signUp_Menulink(driver).click();
		} catch (Exception e) {
			Assert.fail("failed to click sign up button");
		}
	}

	@Then("^I should see 'Or Creat a new TFC account!' heading at Sign Up form$")
	public void i_should_see_Or_Creat_a_new_TFC_account_heading_at_Sign_Up_form()
			throws Throwable {
		try {
			Assert.assertEquals(SignUp.orCreatNewTFCaccunt_title(driver)
					.getText(), "Or create a new TFC account!");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Given("^I am in Sign Up page$")
	public void i_am_in_Sign_Up_page() throws Throwable {
		driver.get(Constant.SignUp_URL);
		Assert.assertTrue(driver.getTitle().equals("Shop n Zip - Sign Up"));
		mainWindow = driver.getWindowHandle();
	}

	@Then("^I should see following fields in SignUp form$")
	public void i_should_see_following_fields_in_SignUp_form(
			DataTable fieldsInSignUp) throws Throwable {
		List<List<String>> field = fieldsInSignUp.raw();

		Assert.assertTrue(SignUp.FirstNameTextBox(driver).isDisplayed());

		Assert.assertTrue(SignUp.LastNameTextBox(driver).isDisplayed());

		// Assert.assertTrue(SignUp.currentCountryDropDown(driver).isDisplayed());

		Assert.assertTrue(SignUp.emailAddressTextBox(driver).isDisplayed());

		Assert.assertTrue(SignUp.phoneNumberTextBox(driver).isDisplayed());

		Assert.assertTrue(SignUp.passWordTextBox(driver).isDisplayed());

		Assert.assertTrue(SignUp.reTypePasswordTextBox(driver).isDisplayed());

		Assert.assertTrue(SignUp.addressTextBox(driver).isDisplayed());

		Assert.assertTrue(SignUp.cityTextBox(driver).isDisplayed());

		// Assert.assertTrue(SignUp.stateDropDown(driver).isDisplayed());

		Assert.assertTrue(SignUp.registerNowButton(driver).isDisplayed());

		Assert.assertTrue(SignUp.CheckBox(driver).isDisplayed());

		Assert.assertTrue(SignUp.termsAndConditionLink(driver).isDisplayed());

		Assert.assertTrue(SignUp.privacypolicyLink(driver).isDisplayed());
	}

	@Then("^I should see Field as mendatory$")
	public void i_should_see_Field_as_mendatory(
			DataTable mandatoryFieldsInSignUp) throws Throwable {
		List<List<String>> manadatoryField = mandatoryFieldsInSignUp.raw();
		Assert.assertTrue(SignUp.FirstNameTextBoxRequiredSymbol(driver)
				.isDisplayed());
		Assert.assertTrue(SignUp.LastNameTextBoxmandatory(driver).isDisplayed());
		Assert.assertTrue(SignUp.currentCountryDropDownRequiredSymbol(driver)
				.isDisplayed());
		Assert.assertTrue(SignUp.emailAddressTextBoxRequiredSymbol(driver)
				.isDisplayed());
		Assert.assertTrue(SignUp.phoneNumberTextBoxRequiredSymbol(driver)
				.isDisplayed());
		Assert.assertTrue(SignUp.passWordTextBoxRequiredSymbol(driver)
				.isDisplayed());
		Assert.assertTrue(SignUp.passWordTextBoxRequiredSymbol(driver)
				.isDisplayed());
	}

	@When("^I clicked on Facebook icon in signup page\\.$")
	public void i_clicked_on_Facebook_icon_in_signup_page() throws Throwable {
		try {
			SignUp.signUp_with_socialNW_FaceBooklink(driver).click();
			allWindows = driver.getWindowHandles();
		} catch (Exception e) {
			Assert.fail("failed to click facebook icon at sign up page");
		}
	}

	@Then("^I should see a pop for Facebook pop up login is appeared$")
	public void i_should_see_a_pop_for_Facebook_pop_up_login_is_appeared()
			throws Throwable {
		try {
			Assert.assertTrue((driver.getWindowHandles().size() > 1));
		} catch (Exception e) {
			Assert.fail("failed to see the facebook pop up");
		}
	}

	@When("^I loged in with my Signin with facebook credintials$")
	public void i_loged_in_with_my_Signin_with_facebook_credintials()
			throws Throwable {
		try {
			Iterator<String> itr = allWindows.iterator();
			String w1 = (String) itr.next();
			String w2 = (String) itr.next();
			driver.switchTo().window(w2);
			SignUp.faceBookEmailId(driver).sendKeys(Constant.SignUpFBuserName);
			SignUp.faceBookPassword(driver)
					.sendKeys(Constant.SignUpFBpassWord);
			SignUp.faceBookLoginButton(driver).click();
			Thread.sleep(1000);
			SignUp.googleAllowAccessButton(driver).click();

			driver.switchTo().window(w1);

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("failed to enter facebook login credentials");
		}
	}

	@Then("^I should see Name field in the sign up from is auto filled$")
	public void i_should_see_Name_field_in_the_sign_up_from_is_auto_filled()
			throws Throwable {
		try {
			// int condition=1;
			// for (int i = 0; i < condition; i++) {
			// System.out.println("entered into for loop");
			// if(((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete")){
			// System.out.println("************** : document is ready");
			// break;
			// }
			// condition++;
			// }
			Thread.sleep(10000);
			String FirstNameField = SignUp.FirstNameTextBox(driver)
					.getAttribute("value");
			System.out.println("************** :" + FirstNameField);
			Assert.assertTrue(!FirstNameField.isEmpty());
		} catch (Exception e) {
			Assert.fail("failed to check the name field in the sign up form is auto filled or not");
		}
	}

	@Then("^I should see Country of current resident field in the sign up from is auto filled$")
	public void i_should_see_Country_of_current_resident_field_in_the_sign_up_from_is_auto_filled()
			throws Throwable {
		Assert.assertTrue(true);
	}

	@Then("^I should see Email Address field in the sign up from is auto filled$")
	public void i_should_see_Email_Address_field_in_the_sign_up_from_is_auto_filled()
			throws Throwable {
		try {
			String emailAddressField = SignUp.emailAddressTextBox(driver)
					.getAttribute("value");
			Assert.assertTrue(!emailAddressField.isEmpty());
		} catch (Exception e) {
			Assert.fail("failed to check the email address field in the sign up form is auto filled or not");
		}
	}

	@Then("^I should see Phone Number field in the sign up from is auto filled$")
	public void i_should_see_Phone_Number_field_in_the_sign_up_from_is_auto_filled()
			throws Throwable {
		Assert.assertTrue(false);
	}

	@When("^I clicked on Twitter icon in signup page\\.$")
	public void i_clicked_on_Twitter_icon_in_signup_page() throws Throwable {
		try {
			SignUp.signUp_with_socialNW_Twitterlink(driver).click();
			allWindows = driver.getWindowHandles();
		} catch (Exception e) {
			Assert.fail("failed to click on twitter logo in sign up page");
		}
	}

	@Then("^I should see a pop for Twitter poup login is appeared$")
	public void i_should_see_a_pop_for_Twitter_poup_login_is_appeared()
			throws Throwable {
		try {
			Assert.assertTrue((driver.getWindowHandles().size() > 1));
		} catch (Exception e) {
			Assert.fail("failed to see the twitter login pop up");
		}
	}

	@When("^I loged in with my Signin with twitter credintials$")
	public void i_loged_in_with_my_Signin_with_twitter_credintials()
			throws Throwable {
		try {
			Iterator<String> itr = allWindows.iterator();
			String w1 = (String) itr.next();
			String w2 = (String) itr.next();
			driver.switchTo().window(w2);
			SignUp.twitterUserNameTextBox(driver).sendKeys(
					Constant.SignTwitUserName);
			SignUp.twitterPassWordTextField(driver).sendKeys(
					Constant.SignTwitPass);
			SignUp.twitterLoginButton(driver).click();
			Thread.sleep(1000);
			SignUp.googleAllowAccessButton(driver).click();
			driver.switchTo().window(w1);
		} catch (Exception e) {
			Assert.fail("failed to enter twitter login credentials");
		}
	}

	@When("^I clicked on Google\\+ icon in signup page\\.$")
	public void i_clicked_on_Google_icon_in_signup_page() throws Throwable {
		try {
			SignUp.signUp_with_socialNW_googlePluslink(driver).click();
			allWindows = driver.getWindowHandles();
		} catch (Exception e) {
			Assert.fail("failed to click on google icon in sign up page");
		}

	}

	@Then("^I should see a pop for Google\\+ login is appeared$")
	public void i_should_see_a_pop_for_Google_login_is_appeared()
			throws Throwable {
		try {
			Assert.assertTrue((driver.getWindowHandles().size() > 1));
			Utils.switchToNewWindow(driver);
			String googlePopUpTitle = driver.getTitle();
			Assert.assertEquals(googlePopUpTitle, "Sign in - Google Accounts");
		} catch (Exception e) {
			Assert.fail("failed to see google login pop up");
		}
	}

	@When("^I loged in with my Signin with google\\+ credintials$")
	public void i_loged_in_with_my_Signin_with_google_credintials()
			throws Throwable {
		try {
			Iterator<String> itr = allWindows.iterator();
			String w1 = (String) itr.next();
			String w2 = (String) itr.next();
			driver.switchTo().window(w2);
			SignUp.googleUserNameTextBox(driver).sendKeys(
					Constant.SignUpGmailUserName);
			SignUp.googleNextButton(driver).click();
			SignUp.googlePassWordTextField(driver).sendKeys(
					Constant.SignUpGmailPass);
			SignUp.googleSignInButton(driver).click();
			Thread.sleep(1000);
			SignUp.googleAllowAccessButton(driver).click();
			driver.switchTo().window(w1);
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("failed to enter google login credentials");
		}
	}

	@Given("^Registered with valid details$")
	public void registered_with_valid_details() throws Throwable {
		try {
			String password = Utils.generateRandomStringWithAllowedSplChars(6,
					"!@#$%^&*())__+").concat("@");
			SignUp.FirstNameTextBox(driver).sendKeys(
					Utils.generateRandomString(10));
			Thread.sleep(1000);
			SignUp.LastNameTextBox(driver).sendKeys(
					Utils.generateRandomString(10));
			Thread.sleep(1000);
			SignUp.currentCountryDropDown(driver, 1);
			Thread.sleep(1000);
			SignUp.emailAddressTextBox(driver).sendKeys(
					Utils.generateRandomEmail(20));
			Thread.sleep(1000);
			SignUp.phoneNumberTextBox(driver).sendKeys(
					Utils.generateRandomPhoneNumber(10));
			Thread.sleep(1000);
			SignUp.passWordTextBox(driver).sendKeys(password);
			Thread.sleep(1000);
			SignUp.reTypePasswordTextBox(driver).sendKeys(password);
			Thread.sleep(1000);
			SignUp.addressTextBox(driver).sendKeys(
					Utils.generateRandomStringWithAllowedSplChars(50,
							"!@#$%^&*()_+"));
			Thread.sleep(1000);
			SignUp.cityTextBox(driver).sendKeys(Utils.generateRandomString(6));
			Thread.sleep(1000);
			SignUp.stateDropDown(driver, 2);
			Thread.sleep(1000);
			SignUp.zipcodeTextBox(driver).sendKeys("12345");
			Thread.sleep(1000);
			SignUp.CheckBox(driver).click();
			Thread.sleep(1000);
			SignUp.registerNowButton(driver).click();

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("failed to enter field values in registration form");
		}

	}

	@Then("^I should see Registration is successful$")
	public void i_should_see_Registration_is_successful() throws Throwable {
		try {
			SignUp.signUpSuccessMsg(driver).isDisplayed();
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Registration successgul messa is not displayed");
		}
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

	@Then("^I should see 'Thank you for registering with us' text along with User name$")
	public void i_should_see_Thank_you_for_registering_with_us_text_along_with_User_name()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see 'Start shopping' button$")
	public void i_should_see_Start_shopping_button() throws Throwable {
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

	@When("^click on same verficatoin link again in email$")
	public void click_on_same_verficatoin_link_again_in_email()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see a message saying 'Your email is already been verified'$")
	public void i_should_see_a_message_saying_Your_email_is_already_been_verified()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I click on verficatoin link in email after one year$")
	public void i_click_on_verficatoin_link_in_email_after_one_year()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see a message saying 'Your link is either incorrect or expired'$")
	public void i_should_see_a_message_saying_Your_link_is_either_incorrect_or_expired()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Given("^I clicked on 'Register now' button$")
	public void i_clicked_on_Register_now_button() throws Throwable {
		try {
			SignUp.registerNowButton(driver).click();
		} catch (Exception e) {
			Assert.fail("failed to click Register Now button in sign up page");
		}
	}

	@Then("^it should see registration is unsuccessful$")
	public void it_should_see_registration_is_unsuccessful() throws Throwable {
		try {
			Assert.assertEquals(driver.getTitle(), "Shop n Zip - Sign Up");
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("fialed to chekc the Registration status");
		}
	}

	@Given("^I tried to Registered without giving details to Name field$")
	public void i_tried_to_Registered_without_giving_details_to_Name_field()
			throws Throwable {try {
				String password = Utils.generateRandomStringWithAllowedSplChars(6,
						"!@#$%^&*())__+").concat("@");
				
				SignUp.LastNameTextBox(driver).sendKeys(
						Utils.generateRandomString(10));
				Thread.sleep(1000);
				SignUp.currentCountryDropDown(driver, 1);
				Thread.sleep(1000);
				SignUp.emailAddressTextBox(driver).sendKeys(
						Utils.generateRandomEmail(20));
				Thread.sleep(1000);
				SignUp.phoneNumberTextBox(driver).sendKeys(
						Utils.generateRandomPhoneNumber(12));
				Thread.sleep(1000);
				SignUp.passWordTextBox(driver).sendKeys(password);
				Thread.sleep(1000);
				SignUp.reTypePasswordTextBox(driver).sendKeys(password);
				Thread.sleep(1000);
				SignUp.addressTextBox(driver).sendKeys(
						Utils.generateRandomStringWithAllowedSplChars(50,
								"!@#$%^&*()_+"));
				Thread.sleep(1000);
				SignUp.cityTextBox(driver).sendKeys(Utils.generateRandomString(6));
				Thread.sleep(1000);
				SignUp.stateDropDown(driver, 2);
				Thread.sleep(1000);
				SignUp.zipcodeTextBox(driver).sendKeys("12345");
				Thread.sleep(1000);
				SignUp.CheckBox(driver).click();
				Thread.sleep(1000);
				SignUp.registerNowButton(driver).click();
				Thread.sleep(1000);
				SignUp.alertMessageForNameTextfield(driver).isDisplayed();

			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("failed to registration form by leaving name field empty");
			}}

	@Then("^I should see registration is unsuccessful$")
	public void i_should_see_registration_is_unsuccessful() throws Throwable {
		try {
			Assert.assertEquals(driver.getTitle(), "Shop n Zip - Sign Up");
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("fialed to chekc the Registration status");
		}
	}

	@Given("^I tried to Registered without selecting anything in Country of current residence field$")
	public void i_tried_to_Registered_without_selecting_anything_in_Country_of_current_residence_field()
			throws Throwable {
		try {
			String password = Utils.generateRandomStringWithAllowedSplChars(6,
					"!@#$%^&*())__+").concat("@");
			SignUp.FirstNameTextBox(driver).sendKeys(
					Utils.generateRandomString(10));
			Thread.sleep(1000);
			SignUp.LastNameTextBox(driver).sendKeys(
					Utils.generateRandomString(10));
			Thread.sleep(1000);
			
			SignUp.emailAddressTextBox(driver).sendKeys(
					Utils.generateRandomEmail(20));
			Thread.sleep(1000);
			SignUp.phoneNumberTextBox(driver).sendKeys(
					Utils.generateRandomPhoneNumber(12));
			Thread.sleep(1000);
			SignUp.passWordTextBox(driver).sendKeys(password);
			Thread.sleep(1000);
			SignUp.reTypePasswordTextBox(driver).sendKeys(password);
			Thread.sleep(1000);
			SignUp.addressTextBox(driver).sendKeys(
					Utils.generateRandomStringWithAllowedSplChars(50,
							"!@#$%^&*()_+"));
			Thread.sleep(1000);
			SignUp.cityTextBox(driver).sendKeys(Utils.generateRandomString(6));
			Thread.sleep(1000);
			SignUp.stateDropDown(driver, 2);
			Thread.sleep(1000);
			SignUp.zipcodeTextBox(driver).sendKeys("12345");
			Thread.sleep(1000);
			SignUp.CheckBox(driver).click();
			Thread.sleep(1000);
			SignUp.registerNowButton(driver).click();
			Thread.sleep(1000);
			SignUp.alertMessageForCountryDropDown(driver).isDisplayed();

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("failed to check the registration form by without selecting country");
		}
	}

	@Given("^I tried to Registered without giving details to Email Address field$")
	public void i_tried_to_Registered_without_giving_details_to_Email_Address_field()
			throws Throwable {try {
				String password = Utils.generateRandomStringWithAllowedSplChars(6,
						"!@#$%^&*())__+").concat("@");
				SignUp.FirstNameTextBox(driver).sendKeys(
						Utils.generateRandomString(10));
				Thread.sleep(1000);
				SignUp.LastNameTextBox(driver).sendKeys(
						Utils.generateRandomString(10));
				Thread.sleep(1000);
				SignUp.currentCountryDropDown(driver, 1);
				Thread.sleep(1000);
				
				SignUp.phoneNumberTextBox(driver).sendKeys(
						Utils.generateRandomPhoneNumber(12));
				Thread.sleep(1000);
				SignUp.passWordTextBox(driver).sendKeys(password);
				Thread.sleep(1000);
				SignUp.reTypePasswordTextBox(driver).sendKeys(password);
				Thread.sleep(1000);
				SignUp.addressTextBox(driver).sendKeys(
						Utils.generateRandomStringWithAllowedSplChars(50,
								"!@#$%^&*()_+"));
				Thread.sleep(1000);
				SignUp.cityTextBox(driver).sendKeys(Utils.generateRandomString(6));
				Thread.sleep(1000);
				SignUp.stateDropDown(driver, 2);
				Thread.sleep(1000);
				SignUp.zipcodeTextBox(driver).sendKeys("12345");
				Thread.sleep(1000);
				SignUp.CheckBox(driver).click();
				Thread.sleep(1000);
				SignUp.registerNowButton(driver).click();
				Thread.sleep(1000);
				SignUp.alertMessageForEmailAddresstextField(driver).isDisplayed();

			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("failed to check the registration form by email address field empty");
			}}

	@Given("^I tried to Registered without giving details to Phone Number field$")
	public void i_tried_to_Registered_without_giving_details_to_Phone_Number_field()
			throws Throwable {try {
				String password = Utils.generateRandomStringWithAllowedSplChars(6,
						"!@#$%^&*())__+").concat("@");
				SignUp.FirstNameTextBox(driver).sendKeys(
						Utils.generateRandomString(10));
				Thread.sleep(1000);
				SignUp.LastNameTextBox(driver).sendKeys(
						Utils.generateRandomString(10));
				Thread.sleep(1000);
				SignUp.currentCountryDropDown(driver, 1);
				Thread.sleep(1000);
				SignUp.emailAddressTextBox(driver).sendKeys(
						Utils.generateRandomEmail(20));
				Thread.sleep(1000);
				
				SignUp.passWordTextBox(driver).sendKeys(password);
				Thread.sleep(1000);
				SignUp.reTypePasswordTextBox(driver).sendKeys(password);
				Thread.sleep(1000);
				SignUp.addressTextBox(driver).sendKeys(
						Utils.generateRandomStringWithAllowedSplChars(50,
								"!@#$%^&*()_+"));
				Thread.sleep(1000);
				SignUp.cityTextBox(driver).sendKeys(Utils.generateRandomString(6));
				Thread.sleep(1000);
				SignUp.stateDropDown(driver, 2);
				Thread.sleep(1000);
				SignUp.zipcodeTextBox(driver).sendKeys("12345");
				Thread.sleep(1000);
				SignUp.CheckBox(driver).click();
				Thread.sleep(1000);
				SignUp.registerNowButton(driver).click();
				Thread.sleep(1000);
				SignUp.alertMessageForPhoneNumbertextField(driver).isDisplayed();

			} catch (Exception e) {
				System.out.println(e);
				Assert.fail("failed to check the registration form by leaving phone number field empty");
			}}

	@Given("^I tried to Registered without giving details to Password field$")
	public void i_tried_to_Registered_without_giving_details_to_Password_field()
			throws Throwable {
		try {
			String password = Utils.generateRandomStringWithAllowedSplChars(6,
					"!@#$%^&*())__+").concat("@");
			SignUp.FirstNameTextBox(driver).sendKeys(
					Utils.generateRandomString(10));
			Thread.sleep(1000);
			SignUp.LastNameTextBox(driver).sendKeys(
					Utils.generateRandomString(10));
			Thread.sleep(1000);
			SignUp.currentCountryDropDown(driver, 1);
			Thread.sleep(1000);
			SignUp.emailAddressTextBox(driver).sendKeys(
					Utils.generateRandomEmail(20));
			Thread.sleep(1000);
			SignUp.phoneNumberTextBox(driver).sendKeys(
					Utils.generateRandomPhoneNumber(12));
			Thread.sleep(1000);
			
			SignUp.reTypePasswordTextBox(driver).sendKeys(password);
			Thread.sleep(1000);
			SignUp.addressTextBox(driver).sendKeys(
					Utils.generateRandomStringWithAllowedSplChars(50,
							"!@#$%^&*()_+"));
			Thread.sleep(1000);
			SignUp.cityTextBox(driver).sendKeys(Utils.generateRandomString(6));
			Thread.sleep(1000);
			SignUp.stateDropDown(driver, 2);
			Thread.sleep(1000);
			SignUp.zipcodeTextBox(driver).sendKeys("12345");
			Thread.sleep(1000);
			SignUp.CheckBox(driver).click();
			Thread.sleep(1000);
			SignUp.registerNowButton(driver).click();
			Thread.sleep(1000);
			SignUp.alertMessageForPasswordtextField(driver).isDisplayed();

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("failed to check the registration form by leaving password field empty");
		}
	}

	@Given("^I tried to Registered without giving details to re-type Password field$")
	public void i_tried_to_Registered_without_giving_details_to_re_type_Password_field()
			throws Throwable {
		try {
			String password = Utils.generateRandomStringWithAllowedSplChars(6,
					"!@#$%^&*())__+").concat("@");
			SignUp.FirstNameTextBox(driver).sendKeys(
					Utils.generateRandomString(10));
			Thread.sleep(1000);
			SignUp.LastNameTextBox(driver).sendKeys(
					Utils.generateRandomString(10));
			Thread.sleep(1000);
			SignUp.currentCountryDropDown(driver, 1);
			Thread.sleep(1000);
			SignUp.emailAddressTextBox(driver).sendKeys(
					Utils.generateRandomEmail(20));
			Thread.sleep(1000);
			SignUp.phoneNumberTextBox(driver).sendKeys(
					Utils.generateRandomPhoneNumber(12));
			Thread.sleep(1000);
			SignUp.passWordTextBox(driver).sendKeys(password);
			Thread.sleep(1000);
			
			SignUp.addressTextBox(driver).sendKeys(
					Utils.generateRandomStringWithAllowedSplChars(50,
							"!@#$%^&*()_+"));
			Thread.sleep(1000);
			SignUp.cityTextBox(driver).sendKeys(Utils.generateRandomString(6));
			Thread.sleep(1000);
			SignUp.stateDropDown(driver, 2);
			Thread.sleep(1000);
			SignUp.zipcodeTextBox(driver).sendKeys("12345");
			Thread.sleep(1000);
			SignUp.CheckBox(driver).click();
			Thread.sleep(1000);
			SignUp.registerNowButton(driver).click();
			Thread.sleep(1000);
			SignUp.alertMessageForReTypePasswordtextField(driver).isDisplayed();

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("failed to check registration form by leaving re-type password field empty");
		}
	}

	@Given("^I Click on sign up button$")
	public void i_Click_on_sign_up_button() throws Throwable {
		try {
			SignUp.registerNowButton(driver).click();
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("failed to click on register now button");
		}
	}

	@Then("^I should see the validation messages are displayed$")
	public void i_should_see_the_validation_messages_are_displayed()
			throws Throwable {
		try {
			SignUp.alertMessageForNameTextfield(driver).isDisplayed();
			SignUp.alertMessageForLastNameTextField(driver).isDisplayed();
			SignUp.alertMessageForCountryDropDown(driver).isDisplayed();
			SignUp.alertMessageForEmailAddresstextField(driver).isDisplayed();
			SignUp.alertMessageForPhoneNumbertextField(driver).isDisplayed();
			SignUp.alertMessageForPasswordtextField(driver).isDisplayed();
			SignUp.alertMessageForReTypePasswordtextField(driver).isDisplayed();
			SignUp.alertMessageForAddressTextField(driver).isDisplayed();
			SignUp.alertMessageForCityTextField(driver).isDisplayed();
			SignUp.alertMessageForSelectStateDropField(driver).isDisplayed();
			SignUp.alertMessageForZipCodetextBox(driver).isDisplayed();
			SignUp.alertMessageForCheckBox(driver).isDisplayed();
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("failed to check the registration form without giving any details to the fields");
		}
	}
}
