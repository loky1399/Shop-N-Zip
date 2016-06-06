package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BaseClass;
import pageObjects.FAQs;
import pageObjects.HeaderLinks;

public class FAQsPage extends BaseClass {
	@Given("^I am in Shop N Zip site with URL$")
	public void i_am_in_Shop_N_Zip_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.get("");
	}

	@When("^I clicked on \"(.*?)\" link in header part$")
	public void i_clicked_on_link_in_header(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   HeaderLinks.FAQ_Menulink().click();
	}

	@Then("^I should see FAQ link is highlited in header$")
	public void i_should_see_FAQ_link_is_highlited_in_header() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   boolean faqMenuLink= HeaderLinks.FAQ_Menulink().isSelected();
	   System.out.println("FAQ menu link is highlighted" +faqMenuLink);
	}

	@Then("^I should see General Questionscategory below of \"(.*?)\" title\\.$")
	public void i_should_see_General_Questionscategory_below_of_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  boolean General_Questions = FAQs.FAQsGeneralQuestionSection().isDisplayed();
	  System.out.println("General Questions category is displaying"+General_Questions);
	}

	@Then("^I should see My Accountcategory below of \"(.*?)\" title\\.$")
	public void i_should_see_My_Accountcategory_below_of_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean My_Account = FAQs.FAQsMyAccounts().isDisplayed();
		  System.out.println("My Account category  link is displaying"+My_Account);
	}

	@Then("^I should see My Itemscategory below of \"(.*?)\" title\\.$")
	public void i_should_see_My_Itemscategory_below_of_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean My_Items = FAQs.FAQsMyItems().isDisplayed();
		  System.out.println("My Items category  link is displaying"+My_Items);
	}

	@Then("^I should see General Shipping Informationcategory below of \"(.*?)\" title\\.$")
	public void i_should_see_General_Shipping_Informationcategory_below_of_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean General_Shipping_Information = FAQs.FAQsGeneralShippngInfo().isDisplayed();
		  System.out.println("General_Shipping_Information category  link is displaying"+General_Shipping_Information);
	}

	@Then("^I should see Returnscategory below of \"(.*?)\" title\\.$")
	public void i_should_see_Returnscategory_below_of_title(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean Returns = FAQs.FAQsReturns().isDisplayed();
		  System.out.println("Returns category  link is displaying"+Returns);
	}

	@Then("^I should be able to see  \"(.*?)\" link in page$")
	public void i_should_be_able_to_see_link_in_page(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean contactUs = FAQs.FAQsContactUsLink().isEnabled();
		  System.out.println("contactUs  link is displaying"+contactUs);
	}

	@Then("^I should see there are three ad slots displayed in the page$")
	public void i_should_see_there_are_three_ad_slots_displayed_in_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		boolean adslotSquire = FAQs.FAQsAdSlot1Squire().isDisplayed();
		  System.out.println("adslot  which is Squire is displaying"+adslotSquire);
		  boolean RectangularAdslot = FAQs.FAQsAdSlot3rectangualr().isDisplayed();
		  System.out.println("Rectangular Adslot is displaying"+RectangularAdslot);
		  boolean rightsideAdslot = FAQs.FAQsAdSlot2rightside().isDisplayed();
		  System.out.println("right side Adslot is displaying"+rightsideAdslot);
	}

	@When("^I clicked on General Questions category$")
	public void i_clicked_on_General_Questions_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		FAQs.FAQsGeneralQuestionSection().click();
	}

	@Then("^I should be moved to the General Questions area within the FAQ page$")
	public void i_should_be_moved_to_the_General_Questions_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    boolean description=FAQs.FAQsGeneralQuestionSection().isDisplayed();
	    System.out.println(FAQs.FAQsGeneralQuestionSection().getText());
	}

	@When("^I clicked on My Account category$")
	public void i_clicked_on_My_Account_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 FAQs.FAQsMyAccounts().click();
	}

	@Then("^I should be moved to the My Account area within the FAQ page$")
	public void i_should_be_moved_to_the_My_Account_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on My Items category$")
	public void i_clicked_on_My_Items_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   FAQs.FAQsMyItems().click();
	}

	@Then("^I should be moved to the My Items area within the FAQ page$")
	public void i_should_be_moved_to_the_My_Items_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on General Shipping Information category$")
	public void i_clicked_on_General_Shipping_Information_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    FAQs.FAQsGeneralShippngInfo().click();
	}

	@Then("^I should be moved to the General Shipping Information area within the FAQ page$")
	public void i_should_be_moved_to_the_General_Shipping_Information_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on Returns category$")
	public void i_clicked_on_Returns_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
FAQs.FAQsReturns().click();
	}

	@Then("^I should be moved to the Returns area within the FAQ page$")
	public void i_should_be_moved_to_the_Returns_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on \"(.*?)\" link$")
	public void i_clicked_on_link(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   FAQs.FAQsContactUsLink().click();
	}

	@Then("^I should be navigated to \"(.*?)\" page where I can ask FAQs$")
	public void i_should_be_navigated_to_page_where_I_can_ask_FAQs(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String actual =driver.getTitle();
		System.out.println(actual);
		String Expected="";
		if(actual.equalsIgnoreCase(Expected)){
			System.out.println("I navigated to contact Us page");
		}
		else{
			System.out.println("method is failed");
		}
	}

// 5 links faqs's section is pending

}
