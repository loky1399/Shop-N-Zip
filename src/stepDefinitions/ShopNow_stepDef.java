package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import pageObjects.HeaderLinks;
import pageObjects.ShopNow;
import utils.Constant;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShopNow_stepDef {
	public static WebDriver driver;

	public ShopNow_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in 'Shop Now' page$")
	public void i_am_in_Shop_Now_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			driver.get("http://demo24kentico8.raybiztech.com");
			driver.navigate().to(Constant.ShopNow_URL);
			Assert.assertEquals(driver.getTitle(), "Shop n Zip - Shop Now");
		} catch (Exception e) {
			Assert.fail("Failed to navigate on shop now page");
		}
	}

	@Then("^I should see 'Shop Now' is highlighted in header$")
	public void i_should_see_Shop_Now_is_highlighted_in_header()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			String menuSelectionLine = ShopNow.shopNow_Menulink(driver)
					.getAttribute("class").toString();
			Assert.assertTrue(menuSelectionLine.equalsIgnoreCase("active"));

		} catch (Exception e) {
			Assert.fail("Menu selection line is not displaying");
		}
	}

	@Then("^I should be able to see  '(\\d+)rd party links which are in tie-up with Shop N Zip$")
	public void i_should_be_able_to_see_Shop_n_Zip_Deals_title_with_all_the_rd_party_links_which_are_in_tie_up_with_Shop_N_Zip(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.ShopNow.shopNow_Heading(driver)
					.isDisplayed()
					&& ((WebElement) pageObjects.ShopNow
							.tieup3rdParty_logos(driver)).isDisplayed());
		} catch (Exception e) {
			Assert.fail("not getting Shop n Zip Deals' title with all the tieup 3rd party links ");
		}
	}

	@Then("^I should be able to see list of  deals$")
	public void i_should_be_able_to_see_list_of_deals() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			List<WebElement> Tieuppartylogos = pageObjects.ShopNow
					.tieup3rdParty_logos(driver);
			int count = Tieuppartylogos.size();
			Assert.assertEquals(count, 8);
		} catch (Exception e) {
			Assert.fail("list of  deals are not displaying");
		}
	}

	@Then("^I should be able to see maximum (\\d+)$")
	public <WebElements> void i_should_be_able_to_see_maximum(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			List<WebElement> dealList = pageObjects.ShopNow
					.tieup3rdParty_Vertical_linkSectionlogos(driver);
			System.out.println(dealList.size());
			int count = dealList.size();
			Assert.assertEquals(count, 8);
		} catch (Exception e) {
			Assert.fail("count is not 8");
		}
	}

	@Then("^I should see two ad slots in the page$")
	public void i_should_see_two_ad_slots_in_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.ShopNow.adslot_rectangular(driver)
					.isDisplayed()
					&& pageObjects.ShopNow.adslot_squire(driver).isDisplayed());

		} catch (Exception e) {
			Assert.fail("ad slots are not displaying");
		}
	}

	@When("^I clicked on (\\d+)rd party links which are in tie-up with Shop N Zip$")
	public void i_clicked_on_rd_party_links_which_are_in_tie_up_with_Shop_N_Zip(
			int arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			List<WebElement> listlogo = pageObjects.ShopNow
					.tieup3rdParty_logos(driver);
			for (WebElement l : listlogo) {
				Assert.assertTrue(l.isDisplayed());
				l.click();
			}
		} catch (Exception e) {

		}
	}

	@Then("^I should see links are not clickable$")
	public void i_should_see_links_are_not_clickable() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		List<WebElement> listlogo = pageObjects.ShopNow
				.tieup3rdParty_logos(driver);
		try {
			if (!(listlogo == null)) {
				for (WebElement l : listlogo) {
					String temp = l.getAttribute("href");
					if (!(temp == null)) {
						Assert.fail("found logo is clickable");
					}
				}
			} else {
				Assert.fail("there are no links present");
			}
		} catch (Exception e) {
			Assert.fail("links are clickable");

		}
	}

	@When("^I clicked on any items$")
	public void i_clicked_on_any_items() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			List<WebElement> tieuplinks = pageObjects.ShopNow
					.tieup3rdpartylinks(driver);
			for (WebElement l : tieuplinks) {
				Assert.assertTrue(l.isEnabled());
				l.click();
			}
		} catch (Exception e) {
			Assert.fail("3rd party links are not clickable");
		}
	}

	@Then("^I should be able to redirected on respective item page$")
	public void i_should_be_able_to_redirected_on_respective_item_page()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}
}
