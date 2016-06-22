package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import pageObjects.AboutUs;
import pageObjects.HeaderLinks;
import utils.Constant;
import utils.Utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutUspage_stepDef {
	public static WebDriver driver;

	public AboutUspage_stepDef() {
		driver = Hooks.driver;
	}

	@Then("^I should redirected to  'About Us' page$")
	public void i_should_redirected_to_AbouT_Us_page(String arg1)
			throws Throwable {
		try {
			String pageTitle = driver.getTitle();

			Assert.assertEquals("Shop n Zip - About Us", pageTitle);
		}

		catch (Exception e) {
			Assert.fail("about us title is not matching");
		}

	}

	@Then("^I should see 'About Us' link is highlighted in header$")
	public void i_should_see_About_Us_link_is_highlighted_in_header()
			throws Throwable {
		try {
			String menuSelectionLine = HeaderLinks.AboutUs_Menulink(driver)
					.getAttribute("class").toString();
			Assert.assertTrue(menuSelectionLine.equalsIgnoreCase("active"));

		} catch (Exception e) {
			Assert.fail("Menu selection line is not displaying");
		}
	}

	@Then("^I should be able to see banner image below of header$")
	public void i_should_be_able_to_see_banner_image_below_of_header()
			throws Throwable {
		try {
			Assert.assertTrue(AboutUs.carousel_bannerimage(driver)
					.isDisplayed());

		} catch (Exception e) {
			Assert.fail("banner image is not displaying in about us page");
		}
	}

	@Then("^I should be able to see 'About Us' title with contents below of banner in the page$")
	public void i_should_be_able_to_see_About_Us_title_with_contents_below_of_banner_in_the_page() throws Throwable {
		try {
			Assert.assertTrue(AboutUs.aboutUs_Title(driver).isDisplayed()
					&& AboutUs.aboutUs_description(driver).isDisplayed());

		} catch (Exception e) {
			Assert.fail("about us heading with contents is not displaying");
		}
	}

	@Then("^I should see the rectangular 'Ad Block' above the footer$")
	public void i_should_see_the_rectangular_Ad_Block_above_the_footer() throws Throwable {
		try {

			Assert.assertTrue(AboutUs.adslot_rectangular(driver).isDisplayed());

		} catch (Exception e) {
			Assert.fail("rectangular ad slot is not displaying");
		}

	}

	@Then("^I should see the square 'Ad Block' above the footer$")
	public void i_should_see_the_square_Ad_Block_above_the_footer()
			throws Throwable {
		try {

			Assert.assertTrue(AboutUs.adslot_squire(driver).isDisplayed());
		} catch (Exception e) {
			Assert.fail("ad slot in footer parti is not displaying");
		}

	}

	@Given("^I am in 'About Us' page$")
	public void i_am_in_About_Us_page() throws Throwable {
		driver.get(Constant.AboutUs_URL);
	}
}
