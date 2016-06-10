package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.FAQs;
import pageObjects.HeaderLinks;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FAQsPage_stepDef {
	public static WebDriver driver;

	public FAQsPage_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in Shop N Zip site with URL$")
	public void i_am_in_Shop_N_Zip_site() throws Throwable {

		driver.get("");
	}

	@When("^I clicked on \"(.*?)\" link in header part$")
	public void i_clicked_on_link_in_header(String arg1) throws Throwable {

		HeaderLinks.FAQ_Menulink(driver).click();
	}

	@Then("^I should see FAQ link is highlited in header$")
	public void i_should_see_FAQ_link_is_highlited_in_header() throws Throwable {

		boolean faqMenuLink = HeaderLinks.FAQ_Menulink(driver).isSelected();
		System.out.println("FAQ menu link is highlighted" + faqMenuLink);
	}

	@Then("^I should see General Questionscategory below of \"(.*?)\" title\\.$")
	public void i_should_see_General_Questionscategory_below_of_title(
			String arg1) throws Throwable {

		boolean General_Questions = FAQs.FAQsGeneralQuestionSection(driver)
				.isDisplayed();
		System.out.println("General Questions category is displaying"
				+ General_Questions);
	}

	@Then("^I should see My Accountcategory below of \"(.*?)\" title\\.$")
	public void i_should_see_My_Accountcategory_below_of_title(String arg1)
			throws Throwable {

		boolean My_Account = FAQs.FAQsMyAccounts(driver).isDisplayed();
		System.out.println("My Account category  link is displaying"
				+ My_Account);
	}

	@Then("^I should see My Itemscategory below of \"(.*?)\" title\\.$")
	public void i_should_see_My_Itemscategory_below_of_title(String arg1)
			throws Throwable {

		boolean My_Items = FAQs.FAQsMyItems(driver).isDisplayed();
		System.out.println("My Items category  link is displaying" + My_Items);
	}

	@Then("^I should see General Shipping Informationcategory below of \"(.*?)\" title\\.$")
	public void i_should_see_General_Shipping_Informationcategory_below_of_title(
			String arg1) throws Throwable {

		boolean General_Shipping_Information = FAQs.FAQsGeneralShippngInfo(
				driver).isDisplayed();
		System.out
				.println("General_Shipping_Information category  link is displaying"
						+ General_Shipping_Information);
	}

	@Then("^I should see Returnscategory below of \"(.*?)\" title\\.$")
	public void i_should_see_Returnscategory_below_of_title(String arg1)
			throws Throwable {

		boolean Returns = FAQs.FAQsReturns(driver).isDisplayed();
		System.out.println("Returns category  link is displaying" + Returns);
	}

	@Then("^I should be able to see  \"(.*?)\" link in page$")
	public void i_should_be_able_to_see_link_in_page(String arg1)
			throws Throwable {

		boolean contactUs = FAQs.FAQsContactUsLink(driver).isEnabled();
		System.out.println("contactUs  link is displaying" + contactUs);
	}

	@Then("^I should see there are three ad slots displayed in the page$")
	public void i_should_see_there_are_three_ad_slots_displayed_in_the_page()
			throws Throwable {

		boolean adslotSquire = FAQs.FAQsAdSlot1Squire(driver).isDisplayed();
		System.out.println("adslot  which is Squire is displaying"
				+ adslotSquire);
		boolean RectangularAdslot = FAQs.FAQsAdSlot3rectangualr(driver)
				.isDisplayed();
		System.out.println("Rectangular Adslot is displaying"
				+ RectangularAdslot);
		boolean rightsideAdslot = FAQs.FAQsAdSlot2rightside(driver)
				.isDisplayed();
		System.out.println("right side Adslot is displaying" + rightsideAdslot);
	}

	@When("^I clicked on General Questions category$")
	public void i_clicked_on_General_Questions_category() throws Throwable {

		FAQs.FAQsGeneralQuestionSection(driver).click();
	}

	@Then("^I should be moved to the General Questions area within the FAQ page$")
	public void i_should_be_moved_to_the_General_Questions_area_within_the_FAQ_page()
			throws Throwable {

		boolean description = FAQs.FAQsGeneralQuestionSection(driver)
				.isDisplayed();
		System.out.println(FAQs.FAQsGeneralQuestionSection(driver).getText());
	}

	@When("^I clicked on My Account category$")
	public void i_clicked_on_My_Account_category() throws Throwable {

		FAQs.FAQsMyAccounts(driver).click();
	}

	@Then("^I should be moved to the My Account area within the FAQ page$")
	public void i_should_be_moved_to_the_My_Account_area_within_the_FAQ_page()
			throws Throwable {

		throw new PendingException();
	}

	@When("^I clicked on My Items category$")
	public void i_clicked_on_My_Items_category() throws Throwable {

		FAQs.FAQsMyItems(driver).click();
	}

	@Then("^I should be moved to the My Items area within the FAQ page$")
	public void i_should_be_moved_to_the_My_Items_area_within_the_FAQ_page()
			throws Throwable {

		throw new PendingException();
	}

	@When("^I clicked on General Shipping Information category$")
	public void i_clicked_on_General_Shipping_Information_category()
			throws Throwable {

		FAQs.FAQsGeneralShippngInfo(driver).click();
	}

	@Then("^I should be moved to the General Shipping Information area within the FAQ page$")
	public void i_should_be_moved_to_the_General_Shipping_Information_area_within_the_FAQ_page()
			throws Throwable {

		throw new PendingException();
	}

	@When("^I clicked on Returns category$")
	public void i_clicked_on_Returns_category() throws Throwable {

		FAQs.FAQsReturns(driver).click();
	}

	@Then("^I should be moved to the Returns area within the FAQ page$")
	public void i_should_be_moved_to_the_Returns_area_within_the_FAQ_page()
			throws Throwable {

		throw new PendingException();
	}

	@When("^I clicked on \"(.*?)\" link$")
	public void i_clicked_on_link(String arg1) throws Throwable {

		FAQs.FAQsContactUsLink(driver).click();
	}

	@Then("^I should be navigated to \"(.*?)\" page where I can ask FAQs$")
	public void i_should_be_navigated_to_page_where_I_can_ask_FAQs(String arg1)
			throws Throwable {

		String actual = driver.getTitle();
		System.out.println(actual);
		String Expected = "";
		if (actual.equalsIgnoreCase(Expected)) {
			System.out.println("I navigated to contact Us page");
		} else {
			System.out.println("method is failed");
		}
	}

	// 5 links faqs's section is pending

}
