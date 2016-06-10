package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.HeaderLinks;
import utils.Constant;
import utils.Utils;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn_stepDef {
	public WebDriver driver;

	public SignIn_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in home page$")
	public void i_am_in_home_page() throws Throwable {
		try {
			driver.get("http://demo24kentico8.raybiztech.com");
			Assert.assertEquals(driver.getTitle().trim(), "Shop n Zip - Home");
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("driver not in home page");
		}
	}

	@Then("^I should see 'Sign In' link$")
	public void i_should_see_Sign_In_link() throws Throwable {
		try {
			Assert.assertTrue(HeaderLinks.SignIn_Menulink(driver).isDisplayed());
		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("SignIn link is not visible");
		}
	}

	@Given("^I am in Sing up page$")
	public void i_am_in_Sing_up_page() throws Throwable {
		try {
			driver.navigate().to(Constant.SignUp_URL);
			Assert.assertEquals(driver.getTitle(), "Shop n Zip - Sign Up");
		} catch (Exception e) {
			Assert.fail("failed to navigate to sign up page");
		}

	}

	@Then("^I should see 'Sign In' button$")
	public void i_should_see_Sign_In_button() throws Throwable {
		try {
			Assert.assertTrue(HeaderLinks.SignIn_Menulink(driver).isDisplayed()
					&& HeaderLinks.SignIn_Menulink(driver).isEnabled());
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn_Button_Visibilty");
			Assert.fail("Sign in button is not displayed");
		}
	}

	@Given("^I am in sign In page$")
	public void i_am_in_sign_In_page() throws Throwable {
		driver.navigate().to(Constant.SignIn_URL);
	}

	@Then("^I should see the title of the Sign In form as Sign In using your Social Network$")
	public void i_should_see_the_title_of_the_Sign_In_form_as_Sign_In_using_your_Social_Network()
			throws Throwable {
		try {
			Assert.assertEquals(pageObjects.SignIn.with_socialNWtitle(driver)
					.getText(), "Sign in using your Social Network");
		} catch (Exception e) {
			Utils.takeScreenshot("title_SignIn_using_your_scoial_network");
			Assert.fail("Sign in using your social network title is not correct");
		}
	}

	@Then("^I should see the title of the Sign In form as Or user your TFC credentials!$")
	public void i_should_see_the_title_of_the_Sign_In_form_as_Or_user_your_TFC_credentials()
			throws Throwable {
		try {
			Assert.assertEquals(
					pageObjects.SignIn.with_TFC_credentials_title(driver)
							.getText(), "Or use your TFC credentials!");
		} catch (Exception e) {
			Utils.takeScreenshot("title_SignIn_using_TFC_credetials");
			Assert.fail("Sign in using TFC credentials title is not correct");
		}
	}

	@Given("^I am in Sing in page$")
	public void i_am_in_Sing_in_page() throws Throwable {
		driver.navigate().to(Constant.SignIn_URL);
	}

	@Then("^I should see 'Remember me' check box is selected by default$")
	public void i_should_see_Remember_me_check_box_is_selected_by_default()
			throws Throwable {
		try {
			if (pageObjects.SignIn.checkBox_RememberMe(driver).isDisplayed()) {
				Assert.assertTrue(pageObjects.SignIn
						.checkBox_RememberMe(driver).isSelected());
			} else {
				Utils.takeScreenshot("checkBox_SignInPage");
				Assert.fail("Check box is not in selected state by default");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("checkBox_SignInPage");
			Assert.fail("Check box is not in selected state by default");
		}
	}

	@Then("^I should see 'Sign In' button is displayed in orange color$")
	public void i_should_see_Sign_In_button_is_displayed_in_orange_color()
			throws Throwable {
		try {
			String buttonColor = pageObjects.SignIn
					.with_TFC_credentials_SignInButton(driver)
					.getAttribute("background").toString();
			if (pageObjects.SignIn.with_TFC_credentials_SignInButton(driver)
					.isDisplayed()) {
				Assert.assertTrue(buttonColor
						.endsWith("rgba(0, 0, 0, 0) linear-gradient(180deg, #f60 0px, #f30) repeat scroll 0 0"));
			} else {
				Utils.takeScreenshot("SignIn_Button_Color");
				Assert.fail("sign in button color is not orange");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("color of sign in button");
			Assert.fail("failed to check the color of the sign in button");
		}
	}

	@Then("^I should see 'Email Id' text field$")
	public void i_should_see_Email_Id_text_field() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn
					.with_TFC_credentials_EmailIdTextbox(driver).isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("emailIDfield_signInPage");
			Assert.fail("failed to check the email id field availability in sign in page");
		}
	}

	@Then("^I should see 'Pass word' text field$")
	public void i_should_see_Pass_word_text_field() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn
					.with_TFC_credentials_PassWordTextbox(driver).isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("passwordField_signInPage");
			Assert.fail("failed to check the password field availability in sign in page");
		}
	}

	@Then("^I should see 'Sign in' button$")
	public void i_should_see_Sign_in_button() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn
					.with_TFC_credentials_SignInButton(driver).isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("signIn_signInPage");
			Assert.fail("failed to check the sign in button availability in sign in page");
		}
	}

	@Then("^I should see 'Remember' me check box$")
	public void i_should_see_Remember_me_check_box() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.checkBox_RememberMe(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("rememberMeCheckBox_signInPage");
			Assert.fail("failed to check the remember me checkbox availability in sign in page");
		}
	}

	@Then("^I should see 'Forgot password' link$")
	public void i_should_see_Forgot_password_link() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn
					.with_TFC_credentials_ForgotpasswordLink(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("forgotPasswordLink_signInPage");
			Assert.fail("failed to check the forgot password link availability in sign in page");
		}
	}

	@Then("^I should see 'Facebook' icon$")
	public void i_should_see_Facebook_icon() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.with_socialNW_FaceBook(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("facebookIcon_signInPage");
			Assert.fail("failed to check the facebook icon availability in sign in page");
		}
	}

	@Then("^I should see 'Twitter' icon$")
	public void i_should_see_Twitter_icon() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.with_socialNW_Twitter(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("twitterIcon_signInPage");
			Assert.fail("failed to check the twittor icon availability in sign in page");
		}
	}

	@Then("^I should see 'Google plus' icon$")
	public void i_should_see_Google_plus_icon() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.with_socialNW_googlePlus(
					driver).isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("googlePlusIcon_signInPage");
			Assert.fail("failed to check the gooleplus icon availability in sign in page");
		}
	}

	@When("^I click on the drop dwon at user name in header$")
	public void i_click_on_the_drop_dwon_at_user_name_in_header()
			throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
			} else {
				Utils.takeScreenshot("UserName_Dropdown");
				Assert.fail("failed to click the user name drop down");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("UserName_Dropdown");
			Assert.fail("failed to click the user name drop down");
		}
	}

	@Then("^I should see the option My Items is displayed in the drop list$")
	public void i_should_see_the_option_My_Items_is_displayed_in_the_drop_list()
			throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				Assert.assertTrue(HeaderLinks.userNameDropdown_MyItems(driver)
						.isDisplayed());
			} else {
				Utils.takeScreenshot("UserName_Dropdown");
				Assert.fail("failed to click the user name drop down");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("UserName_Dropdown");
			Assert.fail("failed to check the option My Items availablity in user name drop down");
		}
	}

	@Then("^I should see the option My Accounts is displayed in the drop list$")
	public void i_should_see_the_option_My_Accounts_is_displayed_in_the_drop_list()
			throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				Assert.assertTrue(HeaderLinks
						.userNameDropdown_MyAccount(driver).isDisplayed());
			} else {
				Utils.takeScreenshot("UserName_Dropdown");
				Assert.fail("failed to click the user name drop down");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("UserName_Dropdown");
			Assert.fail("failed to check the option My Account availablity in user name drop down");
		}
	}

	@Then("^I should see the option Track My Packages is displayed in the drop list$")
	public void i_should_see_the_option_Track_My_Packages_is_displayed_in_the_drop_list()
			throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				Assert.assertTrue(HeaderLinks.userNameDropdown_TrackMyPackage(
						driver).isDisplayed());
			} else {
				Utils.takeScreenshot("UserName_Dropdown");
				Assert.fail("failed to click the user name drop down");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("UserName_Dropdown");
			Assert.fail("failed to check the option track my package availablity in user name drop down");
		}
	}

	@Then("^I should see the option My Profile is displayed in the drop list$")
	public void i_should_see_the_option_My_Profile_is_displayed_in_the_drop_list()
			throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				Assert.assertTrue(HeaderLinks
						.userNameDropdown_MyProfile(driver).isDisplayed());
			} else {
				Utils.takeScreenshot("UserName_Dropdown");
				Assert.fail("failed to click the user name drop down");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("UserName_Dropdown");
			Assert.fail("failed to check the option my profile availablity in user name drop down");
		}
	}

	@Then("^I should see the option Logout is displayed in the drop list$")
	public void i_should_see_the_option_Logout_is_displayed_in_the_drop_list()
			throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				Assert.assertTrue(HeaderLinks.userNameDropdown_Logout(driver)
						.isDisplayed());
			} else {
				Utils.takeScreenshot("UserName_Dropdown");
				Assert.fail("failed to click the user name drop down");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("UserName_Dropdown");
			Assert.fail("failed to check the option logout availablity in user name drop down");
		}
	}

	@Then("^I should should see a pop up is displayed to log in with Facebook credentials$")
	public void i_should_should_see_a_pop_up_is_displayed_to_log_in_with_Facebook_credentials()
			throws Throwable {
		try {
			Utils.switchToNewWindow(driver);
			String title = driver.getTitle();
			Assert.assertEquals(title, "Facebook");
		} catch (Exception e) {
			Utils.takeScreenshot("Login_with_Facebook");
			Assert.fail("failed to log in with facebook credentials");
		}

	}

	@When("^I logged in with valid Facebook log in credentials$")
	public void i_logged_in_with_valid_Facebook_log_in_credentials()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see log in is successful$")
	public void i_should_see_log_in_is_successful() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.welcomePopup(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn_successful");
			Assert.fail("welcome pop up after sign in not displayed");
		}
	}

	@Then("^I should see the user name in header$")
	public void i_should_see_the_user_name_in_header() throws Throwable {
		try {
			Assert.assertTrue(HeaderLinks.userNameDropdown(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("I should see the user name in header");
			Assert.fail("user name is either wrong or not displayed");
		}
	}

	@Then("^I should should see a pop up is displayed to log in with Twitter credentials$")
	public void i_should_should_see_a_pop_up_is_displayed_to_log_in_with_Twitter_credentials()
			throws Throwable {
		try {
			Utils.switchToNewWindow(driver);
			String title = driver.getTitle();
			Assert.assertEquals(title, "Twitter / Authorize an application");
		} catch (Exception e) {
			Utils.takeScreenshot("Login_with_Twitter");
			Assert.fail("failed to log in with Twitter credentials");
		}
	}

	@When("^I logged in with valid Twitter log in credentials$")
	public void i_logged_in_with_valid_Twitter_log_in_credentials()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should should see a pop up is displayed to log in with Google\\+ credentials$")
	public void i_should_should_see_a_pop_up_is_displayed_to_log_in_with_Google_credentials()
			throws Throwable {
		try {
			Utils.switchToNewWindow(driver);
			String title = driver.getTitle();
			Assert.assertEquals(title, "Sign in - Google Accounts");
		} catch (Exception e) {
			Utils.takeScreenshot("Login_with_Google Accounts");
			Assert.fail("failed to log in with Google Accounts credentials");
		}
	}

	@When("^I logged in with valid Google\\+ log in credentials$")
	public void i_logged_in_with_valid_Google_log_in_credentials()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@When("^I Entered valid email address$")
	public void i_Entered_valid_email_address() throws Throwable {
		try {
			if (pageObjects.SignIn.with_TFC_credentials_EmailIdTextbox(driver)
					.isDisplayed()) {
				pageObjects.SignIn.with_TFC_credentials_EmailIdTextbox(driver)
						.sendKeys(Constant.userName_Hemant);
			} else {
				Utils.takeScreenshot("I Entered valid email address");
				Assert.fail("email id fiels is not displayed in sign in page");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("I Entered valid email address");
			Assert.fail("failed to enter email address in sign in form");
		}
	}

	@When("^I entered correct password$")
	public void i_entered_correct_password() throws Throwable {
		try {
			if (pageObjects.SignIn.with_TFC_credentials_EmailIdTextbox(driver)
					.isDisplayed()) {
				pageObjects.SignIn.with_TFC_credentials_EmailIdTextbox(driver)
						.sendKeys(Constant.password_UserHemant);
			} else {
				Utils.takeScreenshot("I Entered valid email address");
				Assert.fail("email id fiels is not displayed in sign in page");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("I Entered valid email address");
			Assert.fail("failed to enter email address in sign in form");
		}
	}

	@When("^I selected 'remember me' check box$")
	public void i_selected_remember_me_check_box() throws Throwable {
		try {
			if (pageObjects.SignIn.checkBox_RememberMe(driver).isDisplayed()) {
				if (!pageObjects.SignIn.checkBox_RememberMe(driver)
						.isSelected()) {
					pageObjects.SignIn.checkBox_RememberMe(driver).click();
				} else {
					Assert.assertTrue(true);
				}
			} else {
				Utils.takeScreenshot("select_RemeberMe_checkBox");
				Assert.fail("check box is not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("select_RemeberMe_checkBox");
			Assert.fail("failed to select the remember me check box");
		}
	}

	@When("^click on Sign in button$")
	public void click_on_Sign_in_button() throws Throwable {
		try {
			if (pageObjects.SignIn.with_TFC_credentials_SignInButton(driver)
					.isDisplayed()
					&& pageObjects.SignIn.with_TFC_credentials_SignInButton(
							driver).isEnabled()) {
				pageObjects.SignIn.with_TFC_credentials_SignInButton(driver)
						.click();
			} else {
				Utils.takeScreenshot("click_SignIn_button");
				Assert.fail("sign button is either not displayed or not enabled");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("click_SignIn_button");
			Assert.fail("failed to click on sign in button");
		}
	}

	@Then("^I should see the log in is successful$")
	public void i_should_see_the_log_in_is_successful() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.welcomePopup(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn_successful");
			Assert.fail("welcome pop up after sign in not displayed");
		}
	}

	@When("^I navigated to sign in page again$")
	public void i_navigated_to_sign_in_page_again() throws Throwable {
		driver.navigate().to(Constant.SignIn_URL);
	}

	@Then("^I should see the Email Address is auto filled with remembered email address$")
	public void i_should_see_the_Email_Address_is_auto_filled_with_remembered_email_address()
			throws Throwable {
		try {
			String EmailFieldValue = pageObjects.SignIn
					.with_TFC_credentials_EmailIdTextbox(driver).getText();
			boolean value = EmailFieldValue.isEmpty();
			if (!value) {
				Assert.assertTrue(!value);
			} else {
				Utils.takeScreenshot("remember_emailID");
				Assert.fail("remember email address functionality failed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("remember_emailID");
			Assert.fail("remember me functionality failed");
		}

	}

	@Then("^I should see the Password field is auto filled with remembered password$")
	public void i_should_see_the_Password_field_is_auto_filled_with_remembered_password()
			throws Throwable {
		try {
			String PasswordFieldValue = pageObjects.SignIn
					.with_TFC_credentials_ForgotpasswordLink(driver).getText();
			boolean value = PasswordFieldValue.isEmpty();
			if (!value) {
				Assert.assertTrue(!value);
			} else {
				Utils.takeScreenshot("remember_password");
				Assert.fail("remember me functionality failed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("remember_emailID");
			Assert.fail("remember email address functionality failed");
		}
	}

	@When("^I clicked on forgot password link$")
	public void i_clicked_on_forgot_password_link() throws Throwable {
		try {
			if (pageObjects.SignIn.with_TFC_credentials_ForgotpasswordLink(
					driver).isDisplayed()) {
				pageObjects.SignIn.with_TFC_credentials_ForgotpasswordLink(
						driver).click();
			} else {
				Utils.takeScreenshot("click_ForgotPasswordLink");
				Assert.fail("forgot password link is not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("click_ForgotPasswordLink");
			Assert.fail("failed to click forgot password link");
		}
	}

	@Then("^I should be be navigated to Forgot Password page$")
	public void i_should_be_be_navigated_to_Forgot_Password_page()
			throws Throwable {
		try {
			Assert.assertEquals(driver.getTitle(),
					"Shop n Zip - Forgot Password");
		} catch (Exception e) {
			Utils.takeScreenshot("click_ForgotPasswordLink");
			Assert.fail("forgot password link is redirected to wrong page");
		}
	}

	@When("^I logged in$")
	public void i_logged_in() throws Throwable {
		try {
			if (HeaderLinks.SignIn_Menulink(driver).isDisplayed()) {
				HeaderLinks.SignIn_Menulink(driver).click();
				pageObjects.SignIn.with_TFC_credentials_EmailIdTextbox(driver)
						.sendKeys(Constant.userName_Hemant);
				pageObjects.SignIn.with_TFC_credentials_PassWordTextbox(driver)
						.sendKeys(Constant.password_UserHemant);
				pageObjects.SignIn.with_TFC_credentials_SignInButton(driver)
						.click();
			} else {
				Utils.takeScreenshot("SignIn");
				Assert.fail("sign in link is not displayed in the header");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn");
			Assert.fail("failed to sign in");
		}
	}

	@Then("^I should see 'Welcome Back' popup$")
	public void i_should_see_Welcome_Back_popup() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.welcomePopup(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn");
			Assert.fail("welcome pop up after sign in not displayed");
		}
	}

	@Then("^I should see 'Welcome back' text along with User name$")
	public void i_should_see_Welcome_back_text_along_with_User_name(
			String nameOfTheUser) throws Throwable {
		try {
			if (pageObjects.SignIn.welcomePopup(driver).isDisplayed()) {
				Assert.assertEquals(pageObjects.SignIn
						.welcomePopup_welcomeBackLableTitle(driver).getText()
						.trim(), "THANKYOU FOR REGISTERING WITH US");
				Assert.assertEquals(
						pageObjects.SignIn.welcomePopup_UserName(driver),
						nameOfTheUser);
			} else {
				Utils.takeScreenshot("SignIn");
				Assert.fail("welcome pop up is not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn");
			Assert.fail("either \"Welcome Back\" lable along with user name is not displayed or user name is wrong");
		}
	}

	@Then("^I should see 'Your shop N zip ID' text along with ID$")
	public void i_should_see_Your_shop_N_zip_ID_text_along_with_ID(
			String shopNzipId) throws Throwable {
		try {
			if (pageObjects.SignIn.welcomePopup(driver).isDisplayed()) {
				Assert.assertEquals(pageObjects.SignIn
						.welcomePopup_yourShopNZipIDlableTitle(driver)
						.getText().trim(), "YOUR SHOP N ZIP ID: ");
				Assert.assertEquals(
						pageObjects.SignIn.welcomePopup_yourShopNZipID(driver),
						shopNzipId);
			} else {
				Utils.takeScreenshot("SignIn");
				Assert.fail("welcome pop up is not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn");
			Assert.fail("either \"Your shop N zip ID\" lable along with ID is not displayed or ID is wrong");
		}
	}

	@Then("^I should see 'Your Shop N Zip address' text along with shop N zip US location address$")
	public void i_should_see_Your_Shop_N_Zip_address_text_along_with_shop_N_zip_US_location_address()
			throws Throwable {
		try {
			if (pageObjects.SignIn.welcomePopup(driver).isDisplayed()) {
				Assert.assertEquals(pageObjects.SignIn
						.welcomePopup_yourShopNZipAddressLableTitle(driver)
						.getText().trim(), "YOUR SHOP N ZIP ADDRESS:");
				Assert.assertTrue(pageObjects.SignIn
						.welcomePopup_yourShopNZipAddress(driver)
						.getText()
						.trim()
						.equals(Constant.userName_Hemant
								+ "c/o Shop n Zip SZ0W23S4" + " "
								+ "150 Shoreline Drive," + " "
								+ "Redwood City,California,94065"));
			} else {
				Utils.takeScreenshot("SignIn");
				Assert.fail("welcome pop up is not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn");
			Assert.fail("either \"Your Shop N Zip address\" lable along with shop N zip US location address is not displayed or shop N zip US location address is wrong");
		}
	}

	@Then("^I should see 'My Items' button$")
	public void i_should_see_My_Items_button() throws Throwable {
		try {
			if (pageObjects.SignIn.welcomePopup(driver).isDisplayed()) {
				Assert.assertTrue(pageObjects.SignIn
						.welcomePopup_MyItemsButton(driver).isDisplayed());
				Assert.assertTrue(pageObjects.SignIn
						.welcomePopup_MyItemsButton(driver).isEnabled());
			} else {
				Utils.takeScreenshot("SignIn");
				Assert.fail("welcome pop up is not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn");
			Assert.fail("my items button is either not displayed or not clickable");
		}
	}

	@When("^I click on 'My Items' button$")
	public void i_click_on_My_Items_button() throws Throwable {
		try {
			if (pageObjects.SignIn.welcomePopup(driver).isDisplayed()) {
				if (pageObjects.SignIn.welcomePopup_MyItemsButton(driver)
						.isDisplayed()
						&& pageObjects.SignIn
								.welcomePopup_MyItemsButton(driver).isEnabled()) {
					pageObjects.SignIn.welcomePopup_MyItemsButton(driver)
							.click();
				} else {
					Utils.takeScreenshot("Click_MyItemButton_signIn");
					Assert.fail("my items button is either not displayed or not clickable");
				}
			} else {
				Utils.takeScreenshot("SignIn");
				Assert.fail("welcome pop up is not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn");
			Assert.fail("my items button is either not displayed or not clickable");
		}
	}

	@Then("^I should be redicted to 'My Items' page$")
	public void i_should_be_redicted_to_My_Items_page() throws Throwable {
		try {
			Assert.assertEquals(driver.getTitle().trim(),
					"Shop n Zip - My Items");
		} catch (Exception e) {
			Utils.takeScreenshot("navigateTo_MyItemsPage");
			Assert.fail("navigated to wrong page instead of my items page");
		}
	}

	@Given("^I Logged in with TFC login credentials$")
	public void i_Logged_in_with_TFC_login_credentials() throws Throwable {
		try {
			if (HeaderLinks.SignIn_Menulink(driver).isDisplayed()) {
				HeaderLinks.SignIn_Menulink(driver).click();
				pageObjects.SignIn.with_TFC_credentials_EmailIdTextbox(driver)
						.sendKeys(Constant.userName_Hemant);
				pageObjects.SignIn.with_TFC_credentials_PassWordTextbox(driver)
						.sendKeys(Constant.password_UserHemant);
				pageObjects.SignIn.with_TFC_credentials_SignInButton(driver)
						.click();
			} else {
				Utils.takeScreenshot("SignIn");
				Assert.fail("sign in link is not displayed in the header");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn");
			Assert.fail("failed to sign in");
		}
	}

	@Then("^I should see the log in is succesful$")
	public void i_should_see_the_log_in_is_succesful() throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.welcomePopup(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn_successful");
			Assert.fail("welcome pop up after sign in not displayed");
		}
	}

	@Then("^I click on the item My Items in drop list$")
	public void i_click_on_the_item_My_Items_in_drop_list() throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				HeaderLinks.userNameDropdown_MyItems(driver).click();
			} else {
				Utils.takeScreenshot("click_myItemsLink");
				Assert.fail("user name dropdown in not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("click_myItemsLink");
			Assert.fail("failed to click my items link");
		}
	}

	@Then("^I click on the item My Accounts in drop list$")
	public void i_click_on_the_item_My_Accounts_in_drop_list() throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				HeaderLinks.userNameDropdown_MyAccount(driver).click();
			} else {
				Utils.takeScreenshot("click_myAccountLink");
				Assert.fail("user name dropdown in not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("click_myAccountsLink");
			Assert.fail("failed to click my accounts link");
		}
	}

	@Then("^I click on the item Track My Packages in drop list$")
	public void i_click_on_the_item_Track_My_Packages_in_drop_list()
			throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				HeaderLinks.userNameDropdown_TrackMyPackage(driver).click();
			} else {
				Utils.takeScreenshot("click_trackMyPackageLink");
				Assert.fail("user name dropdown in not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("click_trackMyPackageLink");
			Assert.fail("failed to click track my package link");
		}
	}

	@Then("^I click on the item My Profile in drop list$")
	public void i_click_on_the_item_My_Profile_in_drop_list() throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				HeaderLinks.userNameDropdown_MyProfile(driver).click();
			} else {
				Utils.takeScreenshot("click_myProfileLink");
				Assert.fail("user name dropdown in not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("click_myProfileLink");
			Assert.fail("failed to click my profile link");
		}
	}

	@Then("^I click on the item Logout in drop list$")
	public void i_click_on_the_item_Logout_in_drop_list() throws Throwable {
		try {
			if (HeaderLinks.userNameDropdown(driver).isDisplayed()) {
				HeaderLinks.userNameDropdown(driver).click();
				HeaderLinks.userNameDropdown_Logout(driver).click();
			} else {
				Utils.takeScreenshot("click_logout");
				Assert.fail("user name dropdown in not displayed");
			}
		} catch (Exception e) {
			Utils.takeScreenshot("click_myProfileLink");
			Assert.fail("failed to click log out");
		}
	}

	@Then("^I should see the log in is unsuccesful$")
	public void i_should_see_the_log_in_is_unsuccesful() throws Throwable {
		try {
			Assert.assertTrue(!pageObjects.SignIn.welcomePopup(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn_successful");
			Assert.fail("welcome pop up after sign in not displayed");
		}
	}

	@Then("^I should see a validation message is displayed as 'Please fill out this field' at every field$")
	public void i_should_see_a_validation_message_is_displayed_as_Please_fill_out_this_field_at_every_field(
			String validationMessage) throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.emailId_validation(driver)
					.isDisplayed());
			Assert.assertTrue(pageObjects.SignIn.password_validation(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("SignIn_fieldValidations");
			Assert.fail("failed to see the field validation messages in sign in page");
		}
	}

	@When("^I entered valid email in Email Address field$")
	public void i_entered_valid_email_in_Email_Address_field_Email_id()
			throws Throwable {
		try {
			pageObjects.SignIn.with_TFC_credentials_EmailIdTextbox(driver)
					.sendKeys(Constant.userName_Hemant);
		} catch (Exception e) {
			Utils.takeScreenshot("enter_Valid_emailID");
			Assert.fail("failed to check the email id field validation");
		}
	}

	@When("^I left password field blank$")
	public void i_left_password_field_blank() throws Throwable {
		try {
			Assert.assertTrue(true, "left password field blank");
		} catch (Exception e) {
			Utils.takeScreenshot("leave_passwordBlank");
			Assert.fail();
		}
	}

	@When("^I clicked on sign in button$")
	public void i_clicked_on_sign_in_button() throws Throwable {
		try {
			pageObjects.SignIn.with_TFC_credentials_SignInButton(driver)
					.click();
		} catch (Exception e) {
			Utils.takeScreenshot("click_signInButton");
			Assert.fail("failed to click on sign in button");
		}
	}

	@Then("^I should see a validation message is displayed as 'Please fill out this field' at password field$")
	public void i_should_see_a_validation_message_is_displayed_as_Please_fill_out_this_field_at_password_field()
			throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.password_validation(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("password_validation");
			Assert.fail("failed to check the password field validation");
		}
	}

	@When("^I left email id field blank$")
	public void i_left_email_id_field_blank() throws Throwable {
		try {
			Assert.assertTrue(true, "left password field blank");
		} catch (Exception e) {
			Utils.takeScreenshot("leave_EmailIDfield_Blank");
			Assert.fail();
		}
	}

	@When("^I entered valid Password in password field$")
	public void i_entered_valid_Password_in_password_field_password()
			throws Throwable {
		try {
			pageObjects.SignIn.with_TFC_credentials_PassWordTextbox(driver)
					.sendKeys(Constant.password_UserHemant);
		} catch (Exception e) {
			Utils.takeScreenshot("enter_Valid_password");
			Assert.fail("failed to check the password field validation");
		}
	}

	@Then("^I should see a validation message is displayed as 'Please fill out this field' at Email Address field$")
	public void i_should_see_a_validation_message_is_displayed_as_Please_fill_out_this_field_at_Email_Address_field()
			throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.emailId_validation(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("emailID_validation");
			Assert.fail("failed to check the email id field validation");
		}
	}

	@When("^I entered invalid Email address in Email Address field$")
	public void i_entered_invalid_Email_address_in_Email_Address_field_Invalid_email_id()
			throws Throwable {
		try {
			pageObjects.SignIn.with_TFC_credentials_EmailIdTextbox(driver)
					.sendKeys(Utils.generateRandomEmail(25));
		} catch (Exception e) {
			Utils.takeScreenshot("enter_InValid_email");
			Assert.fail("failed to check the email field validation");
		}
	}

	@When("^I entered password in password field$")
	public void i_entered_password_in_password_field_password()
			throws Throwable {
		try {
			pageObjects.SignIn.with_TFC_credentials_PassWordTextbox(driver)
					.sendKeys(Constant.password_UserHemant);
		} catch (Exception e) {
			Utils.takeScreenshot("enter_Valid_password");
			Assert.fail("failed to check the password field validation");
		}
	}

	@Then("^I should see a validation message is displayed as 'Email Address is invalid' at Email Address field$")
	public void i_should_see_a_validation_message_is_displayed_as_Email_Address_is_invalid_at_Email_Address_field()
			throws Throwable {
		try {
			Assert.assertTrue(pageObjects.SignIn.emailId_validation(driver)
					.isDisplayed());
		} catch (Exception e) {
			Utils.takeScreenshot("emailID_validation");
			Assert.fail("failed to check the email id field validation");
		}
	}

}
