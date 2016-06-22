package stepDefinitions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.HeaderLinks;
import pageObjects.HowItworks;
import utils.Constant;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HowItWorks_stepDef {
	public static WebDriver driver;

	public HowItWorks_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in 'How It Works' page$")
	public void i_am_in_How_It_Works_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			driver.get(Constant.HowItWorks_URL);
			Assert.assertEquals(driver.getTitle().trim(),
					"Shop n Zip - How it works");
		} catch (Exception e) {
			Assert.fail("Failed to navigate to how it works page");
		}
	}

	@Then("^I should see 'How It Works' link is highlighted in Header$")
	public void i_should_see_How_It_Works_link_is_highlighted_in_Header()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			String menuSelectionLine = pageObjects.HowItworks
					.howItWorks_Menulink(driver).getAttribute("class")
					.toString();
			Assert.assertTrue(menuSelectionLine.equalsIgnoreCase("active"));

		} catch (Exception e) {
			Assert.fail("Menu selection line is not displaying");
		}
	}

//	@Then("^I should be able to see steps on screen\\.$")
//	public void i_should_be_able_to_see_steps_on_screen(DataTable stepsDisplayed)
//			throws Throwable {
//		List<String> stepText = new ArrayList<String>();
//		stepText.add("["
//				+ HowItworks.horizontal_3steps_steps1st_name(driver).getText()
//				+ "]");
//		stepText.add("["
//				+ HowItworks.horizontal_3steps_steps2nd_name(driver).getText()
//				+ "]");
//		stepText.add("["
//				+ HowItworks.horizontal_3steps_steps3rd_name(driver).getText()
//				+ "]");
//		List<List<String>> steps = stepsDisplayed.raw();
//		int i = 0;
//		for (List<String> s : steps) {
//			System.out.println(s);
//			System.out.println(stepText.get(i));
//			Assert.assertEquals(s, stepText.get(i));
//			// Assert.assertTrue(s.contains(stepText.get(i)));
//			i += 1;
//		}
//	}

	
	 @Then("^I should be able to see (\\d+)\\.Shop online steps on screen\\.$")
	 public void i_should_be_able_to_see_Shop_online_steps_on_screen(int arg1)
	 throws Throwable {
	 // Write code here that turns the phrase above into concrete actions
	 try {
	 Assert.assertTrue(pageObjects.HowItworks
	 .horizontal_3steps_steps1st_name(driver).isDisplayed());
	
	 System.out.println(pageObjects.HowItworks
	 .horizontal_3steps_steps1st_name(driver).getText());
	 } catch (Exception e) {
	 Assert.fail("1st step Shop online is not displaying");
	 }
	
	 }
	
	 @Then("^I should be able to see (\\d+)\\.Ship to Us steps on screen\\.$")
	 public void i_should_be_able_to_see_Ship_to_Us_steps_on_screen(int arg1)
	 throws Throwable {
	 // Write code here that turns the phrase above into concrete actions
	 try {
	 Assert.assertTrue(pageObjects.HowItworks
	 .horizontal_3steps_steps2nd_name(driver).isDisplayed());
	 System.out.println(pageObjects.HowItworks
	 .horizontal_3steps_steps2nd_name(driver).getText());
	
	 } catch (Exception e) {
	 Assert.fail("2nd step Ship to Us is not displaying");
	 }
	
	 }
	
	 @Then("^I should be able to see (\\d+)\\.Get your goods steps on screen\\.$")
	 public void i_should_be_able_to_see_Get_your_goods_steps_on_screen(int
	 arg1)
	 throws Throwable {
	 // Write code here that turns the phrase above into concrete actions
	 try {
	 Assert.assertTrue(pageObjects.HowItworks
	 .horizontal_3steps_steps3rd_name(driver).isDisplayed());
	 System.out.println(pageObjects.HowItworks
	 .horizontal_3steps_steps3rd_name(driver).getText());
	
	 } catch (Exception e) {
	 Assert.fail("3rd step  Get your goods is not displaying");
	 }
	
	 }

	@Then("^I should be able to see steps link with short definition vertically in page\\.$")
	public void i_should_be_able_to_see_steps_link_with_short_definition_vertically_in_page(
			DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

	@Then("^I should be able to see steps link with short definition (\\d+)\\.Shop online vertically in page\\.$")
	public void i_should_be_able_to_see_steps_link_with_short_definition_Shop_online_vertically_in_page(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HowItworks
					.vertical_3steps_step1st_shortdescription(driver)
					.isDisplayed());
			System.out
					.println(pageObjects.HowItworks
							.vertical_3steps_step1st_shortdescription(driver)
							.getText());

		} catch (Exception e) {
			Assert.fail("Shop online short description is not available");
		}

	}

	@Then("^I should be able to see steps link with short definition (\\d+)\\.Ship to Us vertically in page\\.$")
	public void i_should_be_able_to_see_steps_link_with_short_definition_Ship_to_Us_vertically_in_page(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HowItworks
					.vertical_3steps_step2nd_shortdescription(driver)
					.isDisplayed());
			System.out
					.println(pageObjects.HowItworks
							.vertical_3steps_step2nd_shortdescription(driver)
							.getText());

		} catch (Exception e) {
			Assert.fail("Ship to Us vertically short description is not available");
		}

	}

	@Then("^I should be able to see steps link with short definition (\\d+)\\.Get your goods vertically in page\\.$")
	public void i_should_be_able_to_see_steps_link_with_short_definition_Get_your_goods_vertically_in_page(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HowItworks
					.vertical_3steps_step3rd_shortdescription(driver)
					.isDisplayed());
			System.out
					.println(pageObjects.HowItworks
							.vertical_3steps_step3rd_shortdescription(driver)
							.getText());

		} catch (Exception e) {
			Assert.fail("Get your goods vertically short description is not available");
		}

	}

	@Then("^I should see 'Ad slot' above footer$")
	public void i_should_see_Ad_slot_above_footer() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		try {
			Assert.assertTrue(pageObjects.HowItworks
					.adslot_rectangular_horizontal(driver).isDisplayed());

		} catch (Exception e) {
			Assert.fail("rectangular ad slot is not displaying");
		}

	}

	@Then("^I should see 'Ad slot' besides the links in body$")
	public void i_should_see_Ad_slot_besides_the_links_in_body()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HowItworks.adslot_vertical_rightside(
					driver).isDisplayed());

		} catch (Exception e) {
			Assert.fail("right side vertical ad slot is not displaying");
		}

	}
}
