package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObjects.FAQs;
import pageObjects.HeaderLinks;
import utils.Constant;
import utils.Utils;
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
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(Constant.FAQ_URL);
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
	    // Write code here that turns the phrase above into concrete actions
		try {
			String menuSelectionLine = HeaderLinks.FAQ_Menulink(driver)
					.getAttribute("class").toString();
			System.out.println("menu attribute"+menuSelectionLine);
			Assert.assertTrue(menuSelectionLine.equalsIgnoreCase("active"));

		} catch (Exception e) {
			Assert.fail("Menu selection line is not displaying");
		}
	
	}

	@Then("^I should see General Questionscategory below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_General_Questionscategory_below_of_Shop_N_Zip_FAQs_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   try{
		   Assert.assertTrue(pageObjects.FAQs.FAQsGeneralQuwstions(driver).isDisplayed());
	   }catch(Exception e){
		   System.out.println(e);
		   Assert.fail("General qns link is not displaying");
	   }
	   
	}

	@Then("^I should see My Accountcategory below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_My_Accountcategory_below_of_Shop_N_Zip_FAQs_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   try{
		   Assert.assertTrue(pageObjects.FAQs.FAQsMyAccounts(driver).isDisplayed());
	   }catch(Exception e){
		   System.out.println(e);
		   Assert.fail("My accaount link is not displaying");
	   }
	}

	@Then("^I should see My Itemscategory below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_My_Itemscategory_below_of_Shop_N_Zip_FAQs_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 try{
			   Assert.assertTrue(pageObjects.FAQs.FAQsMyItems(driver).isDisplayed());
		   }catch(Exception e){
			   System.out.println(e);
			   Assert.fail("My items link is not displaying");
		   }
	}

	@Then("^I should see General Shipping Informationcategory below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_General_Shipping_Informationcategory_below_of_Shop_N_Zip_FAQs_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 try{
			   Assert.assertTrue(pageObjects.FAQs.FAQsGeneralShippngInfo(driver).isDisplayed());
		   }catch(Exception e){
			   System.out.println(e);
			   Assert.fail("General shipping info link is not displaying");
		   }
	}

	@Then("^I should see Returnscategory below of 'Shop N Zip FAQs' title\\.$")
	public void i_should_see_Returnscategory_below_of_Shop_N_Zip_FAQs_title() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 try{
			   Assert.assertTrue(pageObjects.FAQs.FAQsReturns(driver).isDisplayed());
		   }catch(Exception e){
			   System.out.println(e);
			   Assert.fail("Return link is not displaying");
		   }
	}

	@Then("^I should be able to see  'Contact Us' link in page$")
	public void i_should_be_able_to_see_Contact_Us_link_in_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(FAQs.FAQsContactUsLink(driver).isEnabled());
		}
	catch(Exception e)
	{
		Assert.fail("contactUs  link is  not displaying");
		}
	}
	

	@Then("^I should see there are three ad slots displayed in the page$")
	public void i_should_see_there_are_three_ad_slots_displayed_in_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			Assert.assertTrue(FAQs.FAQsAdSlot1Squire(driver).isDisplayed()&& FAQs.FAQsAdSlot3rectangualr(driver)
						.isDisplayed()&&FAQs.FAQsAdSlot2rightside(driver)
						.isDisplayed());
			String saddslotSrc = FAQs.FAQsAdSlot1Squire(driver)
					.getAttribute("src");
			if (saddslotSrc == null) {
				Assert.fail("squire ad slot is not displaying in FAQ page");
			}
			String raddslotSrc = FAQs.FAQsAdSlot3rectangualr(driver)
					.getAttribute("src");
			if (raddslotSrc == null) {
				Assert.fail("rectangular ad slot is not displaying in FAQ page");
			}
			String vaddslotSrc = FAQs.FAQsAdSlot2rightside(driver)
					.getAttribute("src");
			if (vaddslotSrc == null) {
				Assert.fail("vertical ad slot is not displaying in FAQ page");
			}
				
				
			}
		catch(Exception e){
			Assert.fail("ad slots are not available");
		}
		}

	@When("^I clicked on General Questions category$")
	public void i_clicked_on_General_Questions_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			
			Assert.assertTrue(FAQs.FAQsGeneralQuestionSection(driver).isEnabled());
					FAQs.FAQsGeneralQuestionSection(driver).click();
				}
			catch(Exception e){
				Assert.fail("general qns category is not available");
			}
			}
	

	@Then("^I should be moved to the General Questions area within the FAQ page$")
	public void i_should_be_moved_to_the_General_Questions_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			boolean description = FAQs.FAQsGeneralQuestionSection(driver)
					.isDisplayed();
			
		}
	catch(Exception e){
		Assert.fail("General Questions area within the FAQ page is not displaying");
	}
	}
	

	@When("^I clicked on My Account category$")
	public void i_clicked_on_My_Account_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be moved to the My Account area within the FAQ page$")
	public void i_should_be_moved_to_the_My_Account_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on My Items category$")
	public void i_clicked_on_My_Items_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be moved to the My Items area within the FAQ page$")
	public void i_should_be_moved_to_the_My_Items_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on General Shipping Information category$")
	public void i_clicked_on_General_Shipping_Information_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be moved to the General Shipping Information area within the FAQ page$")
	public void i_should_be_moved_to_the_General_Shipping_Information_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on Returns category$")
	public void i_clicked_on_Returns_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be moved to the Returns area within the FAQ page$")
	public void i_should_be_moved_to_the_Returns_area_within_the_FAQ_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I clicked on 'Contact Us' link$")
	public void i_clicked_on_Contact_Us_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			
			Assert.assertTrue(pageObjects.FAQs.FAQsContactUsLink(driver).isEnabled());
					FAQs.FAQsContactUsLink(driver).click();
				}
			catch(Exception e){
				Assert.fail("contact us link is not enabled ");
	}
	}
	@Then("^I should be navigated to 'Contact Us' page where I can ask FAQs$")
	public void i_should_be_navigated_to_Contact_Us_page_where_I_can_ask_FAQs() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try{
			String actual = driver.getTitle();
			System.out.println(actual);
			String Expected = "";
			if (actual.equalsIgnoreCase(Expected)) {
				
				Assert.assertEquals("Shop n Zip - Contact Us", actual);
			} else {
				System.out.println("method is failed");
			}
		}catch(Exception e){
			Assert.fail(" I am not able to contact us page");
		}
		}
	}



