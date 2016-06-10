package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageObjects.AboutUs;
import pageObjects.HeaderLinks;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AboutUspage_stepDef {
	public static WebDriver driver;

	public AboutUspage_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in Shop N Zip site$")
	public void i_am_in_Shop_N_Zip_site() throws Throwable {

		driver.get("http://demo24kentico8.raybiztech.com/");
	}

	@When("^I clicked on \"(.*?)\" link in header$")
	public void i_clicked_on_link_in_header(String arg1) throws Throwable {

		HeaderLinks.AboutUs_Menulink(driver).click();
	}

	@Then("^I should redirected to   \"(.*?)\" page$")
	public void i_should_redirected_to_page(String arg1) throws Throwable {

		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	}

	@Then("^I should see \"(.*?)\" link is highlighted in header$")
	public void i_should_see_link_is_highlighted_in_header(String arg1)
			throws Throwable {

		boolean AboutUsMenuLink = HeaderLinks.AboutUs_Menulink(driver)
				.isSelected();
		System.out.println(AboutUsMenuLink);
	}

	@Then("^I should be able to see banner image below of header$")
	public void i_should_be_able_to_see_banner_image_below_of_header()
			throws Throwable {

		boolean bannerImage = AboutUs.carousel_bannerimage(driver)
				.isDisplayed();
		System.out.println("bannerImage is available" + bannerImage);
	}

	@Then("^I should be able to see  \"(.*?)\" title with contents below of banner in the page$")
	public void i_should_be_able_to_see_title_with_contents_below_of_banner_in_the_page(
			String arg1) throws Throwable {

		boolean heading = AboutUs.aboutUs_Title(driver).isDisplayed();
		System.out.println("Heading is available" + heading);
		boolean description = AboutUs.aboutUs_description(driver).isDisplayed();
		System.out.println("description sof about us is available"
				+ description);

	}

	@Then("^I should see the rectangular \"(.*?)\" above the footer$")
	public void i_should_see_the_rectangular_above_the_footer(String arg1)
			throws Throwable {

		boolean RactangularAdSlot = AboutUs.adslot_rectangular(driver)
				.isDisplayed();
		System.out.println("Ractangular AdSlot  is available above the footer"
				+ RactangularAdSlot);

	}

	@Then("^I should see the square \"(.*?)\" above the footer$")
	public void i_should_see_the_square_above_the_footer(String arg1)
			throws Throwable {

		boolean SquireAdSlot = AboutUs.adslot_squire(driver).isDisplayed();
		System.out
				.println("Squire AdSlot  is available in right side of the page"
						+ SquireAdSlot);
	}

}
