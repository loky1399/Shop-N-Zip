package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.FAQs;
import pageObjects.HeaderLinks;
import utils.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FAQsPage_stepDef {
	public static WebDriver driver;

	public FAQsPage_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in FAQ page$")
	public void i_am_in_FAQ_page() throws Throwable {
		try {
			driver.navigate().to(Constant.FQA_URL);
			String Title = driver.getTitle();
			Assert.assertEquals(Title, "Shop n Zip - General Questions");
		} catch (Exception e) {
			Assert.fail("not able to navigating to the FAQS page");
		}
	}

	@When("^I clicked on 'Contact Us' link$")
	public void i_clicked_on_Contact_Us_link() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should be able to see 'Contact Us' link in page$")
	public void i_should_be_able_to_see_Contact_Us_link_in_page()
			throws Throwable {
		System.out.println("tet");
	}

	@Then("^I should redirected to  'FAQ' page$")
	public void i_should_redirected_to_FAQ_page() throws Throwable {
		driver.get(Constant.FQA_URL);
		try {
			String pageTitle = driver.getTitle();

			Assert.assertEquals("Shop n Zip - General Questions", pageTitle);
		}

		catch (Exception e) {
			Assert.fail("about us title is not matching");
		}

	}

	@Then("^I should see FAQ link is highlited in header$")
	public void i_should_see_FAQ_link_is_highlited_in_header() throws Throwable {
		try {
			String menuSelectionLine = HeaderLinks.FAQ_Menulink(driver)
					.getAttribute("class").toString();
			Assert.assertTrue(menuSelectionLine.equalsIgnoreCase("active"));

		} catch (Exception e) {
			Assert.fail("Menu selection line is not displaying");
		}
	}

	@Then("^I should be able to see  \"(.*?)\" link in page$")
	public void i_should_be_able_to_see_link_in_page() throws Throwable {
		try {
			Assert.assertTrue(FAQs.FAQsContactUsLink(driver).isEnabled());
		} catch (Exception e) {
			Assert.fail("contactUs  link is  not displaying");
		}
	}

	@Then("^I should see there are three ad slots displayed in the page$")
	public void i_should_see_there_are_three_ad_slots_displayed_in_the_page()
			throws Throwable {
		try {
			Assert.assertTrue(FAQs.FAQsAdSlot1Squire(driver).isDisplayed()
					&& FAQs.FAQsAdSlot3rectangualr(driver).isDisplayed()
					&& FAQs.FAQsAdSlot2rightside(driver).isDisplayed());

		} catch (Exception e) {
			Assert.fail("ad slots are not available");
		}
	}

	@When("^I clicked on General Questions category$")
	public void i_clicked_on_General_Questions_category() throws Throwable {
		try {

			Assert.assertTrue(FAQs.FAQsGeneralQuestionLink(driver).isEnabled());
			FAQs.FAQsGeneralQuestionLink(driver).click();
		} catch (Exception e) {
			Assert.fail("general qns category is not available");
		}
	}

	@Then("^I should be moved to the General Questions area within the FAQ page$")
	public void i_should_be_moved_to_the_General_Questions_area_within_the_FAQ_page()
			throws Throwable {
		try {
			boolean description = FAQs.FAQsGeneralQuestionLink(driver)
					.isDisplayed();

		} catch (Exception e) {
			Assert.fail("General Questions area within the FAQ page is not displaying");
		}
	}

	@When("^I clicked on My Account category$")
	public void i_clicked_on_My_Account_category() throws Throwable {
		try {
			Assert.assertTrue(FAQs.FAQsMyAccountLink(driver).isDisplayed());

			FAQs.FAQsMyAccountLink(driver).click();
		} catch (Exception e) {
			Assert.fail(" My Account category is not displaying");

		}
	}

	@Then("^I should be moved to the My Account area within the FAQ page$")
	public void i_should_be_moved_to_the_My_Account_area_within_the_FAQ_page()
			throws Throwable {
		try {

			throw new PendingException();
		} catch (Exception e) {
			Assert.fail("My Account area within the FAQ page is not displaying");
		}
	}

	@When("^I clicked on My Items category$")
	public void i_clicked_on_My_Items_category() throws Throwable {
		try {

			Assert.assertTrue(FAQs.FAQsMyItemsLink(driver).isDisplayed());
			FAQs.FAQsMyItemsLink(driver).click();
		} catch (Exception e) {
			Assert.fail(" My Items category link is not displaying");
		}
	}

	@Then("^I should be moved to the My Items area within the FAQ page$")
	public void i_should_be_moved_to_the_My_Items_area_within_the_FAQ_page()
			throws Throwable {
		try {
			throw new PendingException();
		} catch (Exception e) {
			Assert.fail(" My Items area within the FAQ page is not displaying");
		}
	}

	@When("^I clicked on General Shipping Information category$")
	public void i_clicked_on_General_Shipping_Information_category()
			throws Throwable {
		try {
			Assert.assertTrue(FAQs.FAQsGeneralShippngInfoLink(driver)
					.isDisplayed());

			FAQs.FAQsGeneralShippngInfoLink(driver).click();
		} catch (Exception e) {
			Assert.fail("General Shipping Information category is not displaying");
		}
	}

	@Then("^I should be moved to the General Shipping Information area within the FAQ page$")
	public void i_should_be_moved_to_the_General_Shipping_Information_area_within_the_FAQ_page()
			throws Throwable {
		try {
			throw new PendingException();
		} catch (Exception e) {
			Assert.fail("General Shipping Information area within the FAQ page is not available");
		}
	}

	@When("^I clicked on Returns category$")
	public void i_clicked_on_Returns_category() throws Throwable {
		try {

			Assert.assertTrue(pageObjects.FAQs.FAQsReturnsLinks(driver)
					.isEnabled());
			FAQs.FAQsReturnsLinks(driver).click();
		} catch (Exception e) {
			Assert.fail("faq returns link is not displaying");
		}
	}

	@Then("^I should be moved to the Returns area within the FAQ page$")
	public void i_should_be_moved_to_the_Returns_area_within_the_FAQ_page()
			throws Throwable {
		try {

			throw new PendingException();
		} catch (Exception e) {
			Assert.fail("Returns area within the FAQ page is not available");
		}
	}

	@When("^I clicked on \"(.*?)\" link$")
	public void i_clicked_on_link(String arg1) throws Throwable {
		try {

			Assert.assertTrue(pageObjects.FAQs.FAQsContactUsLink(driver)
					.isEnabled());
			FAQs.FAQsContactUsLink(driver).click();
		} catch (Exception e) {
			Assert.fail("contact us link is not enabled ");
		}
	}

	@Then("^I should be navigated to 'Contact Us' page where I can ask FAQs$")
	public void i_should_be_navigated_to_Contact_Uspage_where_I_can_ask_FAQs(
			String arg1) throws Throwable {
		try {
			String actual = driver.getTitle();
			System.out.println(actual);
			String Expected = "";
			if (actual.equalsIgnoreCase(Expected)) {

				Assert.assertEquals("Shop n Zip - Contact Us", actual);
			} else {
				System.out.println("method is failed");
			}
		} catch (Exception e) {
			Assert.fail(" I am not able to contact us page");
		}
	}

	@Then("^I should see \"(.*?)\" category below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_General_Questions_category_below_of_Shop_N_Zip_FAQs_title(
			String category1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(FAQs.FAQsGeneralQuestionLink(driver)
					.isDisplayed()
					&& FAQs.FAQsGeneralQuestionLink(driver).getText()
							.equals(category1)
					&& FAQs.FAQsGeneralQuestionLink(driver)
							.getAttribute("href")
							.equals("/faq/general-questions"));
		} catch (Exception e) {
			Assert.fail("failed to check FAQ option 1");

		}
	}

	@Then("^I should see \"(.*?)\" category below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_My_Account_category_below_of_Shop_N_Zip_FAQs_title(
			String category2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(FAQs.FAQsMyAccountLink(driver).isDisplayed()
					&& FAQs.FAQsMyAccountLink(driver).getText()
							.equals(category2)
					&& FAQs.FAQsMyAccountLink(driver).getAttribute("href")
							.equals("/faq/my-account"));
		} catch (Exception e) {
			Assert.fail("My Account category  link is  not displaying");
		}
	}

	@Then("^I should see \"(.*?)\" category below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_My_Items_category_below_of_Shop_N_Zip_FAQs_title(
			String category3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(FAQs.FAQsMyItemsLink(driver).isDisplayed()
					&& FAQs.FAQsMyItemsLink(driver).getText().equals(category3)
					&& FAQs.FAQsMyItemsLink(driver).getAttribute("href")
							.equals("/faq/my-items"));
		} catch (Exception e) {
			Assert.fail("My Items category  link is  not displaying");
		}
	}

	@Then("^I should see \"(.*?)\" category below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_General_Shipping_Information_category_below_of_Shop_N_Zip_FAQs_title(
			String category3) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(FAQs.FAQsGeneralShippngInfoLink(driver)
					.isDisplayed()
					&& FAQs.FAQsGeneralShippngInfoLink(driver).getText()
							.equals(category3)
					&& FAQs.FAQsGeneralShippngInfoLink(driver)
							.getAttribute("href")
							.equals("/faq/general-shipping-information"));
		} catch (Exception e) {
			System.out
					.println("General_Shipping_Information category  link is not displaying");
		}
	}

	@Then("^I should see \"(.*?)\" category below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_Returns_category_below_of_Shop_N_Zip_FAQs_title(
			String category4) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(FAQs.FAQsReturnsLinks(driver).isDisplayed()
					&& FAQs.FAQsReturnsLinks(driver).getText()
							.equals(category4)
					&& FAQs.FAQsReturnsLinks(driver).getAttribute("href")
							.equals("/faq/returns"));
		} catch (Exception e) {
			Assert.fail("Returns category  link is  not displaying");
		}
	}

}
