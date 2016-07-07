package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import pageObjects.HomePage;
import utils.Constant;
import utils.Utils;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePage_stepDef {
	public static WebDriver driver;

	public HomePage_stepDef() {
		driver = Hooks.driver;
	}

	@Given("^I am in Home Page$")
	public void i_am_in_Home_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.get(Constant.Home_URL);
		try {
			String actual = driver.getTitle();
			Assert.assertEquals(actual, "Shop n Zip - Home");

		} catch (Exception e) {
			Assert.fail("Not getting home page title");
		}
	}

	@Then("^I should see a auto slide carousel below the header with five slides$")
	// now slider is 3
	public void i_should_see_a_auto_slide_carousel_below_the_header_with_five_slides()
			throws Throwable {
		try {

			int count = pageObjects.HomePage.homePageCarousel(driver).size();
			Assert.assertEquals(count, 3);
			int countIndicator = pageObjects.HomePage.homePageCarousel(driver)
					.size();
			Assert.assertEquals(countIndicator, 3);
			Assert.assertTrue(pageObjects.HomePage.homePageCarousel1(driver)
					.isDisplayed());
			String Firstcarousel = pageObjects.HomePage.homePageCarousel1(
					driver).getAttribute("style");
			if (Firstcarousel == null) {
				Assert.fail(" 1st Carousel image is not available");
			}
			pageObjects.HomePage.homePageCarousel_pageindicator2(driver)
					.click();
			Assert.assertTrue(pageObjects.HomePage.homePageCarousel2(driver)
					.isDisplayed());
			String secondCarousel = pageObjects.HomePage.homePageCarousel2(
					driver).getAttribute("style");
			if (secondCarousel == null) {
				Assert.fail("2nd carousel image is not available");
			}
			pageObjects.HomePage.homePageCarousel_pageindicator3(driver)
					.click();
			Assert.assertTrue(pageObjects.HomePage.homePageCarousel3(driver)
					.isDisplayed());
			String thirdCarousel = pageObjects.HomePage.homePageCarousel3(
					driver).getAttribute("style");
			if (thirdCarousel == null) {
				Assert.fail("3rd carousel is not available");
			}
		} catch (Exception e) {
			Assert.fail("Carousel section is not fine");
		}

	}

	@Then("^I should see 'Get Started' block with three stpes$")
	public void i_should_see_Get_Started_block_with_three_stpes() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Thread.sleep(1000);
			Utils.scrolltoElement(driver.findElement(By
					.xpath(".//*[@id='form']/section[1]/div/div")));

			int count = pageObjects.HomePage.homePageGetStartedtitleSteps(
					driver).size();
		
			Assert.assertEquals(count, 3);
		
			Assert.assertTrue(pageObjects.HomePage
					.homePageGetStartedtitleSteps_1stTitle(driver)
					.isDisplayed()
					&& pageObjects.HomePage
							.homePageGetStartedtitleSteps_2ndTitle(driver)
							.isDisplayed()
					&& pageObjects.HomePage
							.homePageGetStartedtitleSteps_3rdTitle(driver)
							.isDisplayed());
		
			String FirstStep = pageObjects.HomePage
					.homePageGetStartedtitleSteps_1stTitle(driver).getText();
			Assert.assertTrue(FirstStep.equalsIgnoreCase("Shop online"),
					"Shop online  step is not displaying");
		
			Assert.assertEquals(FirstStep, "Shop online");
			
			String secondStep = pageObjects.HomePage
					.homePageGetStartedtitleSteps_2ndTitle(driver).getText();
			
			Assert.assertTrue(secondStep.equalsIgnoreCase("Ship to us"),
					"Ship to us step is not displaying");
		
			String thirdStep = pageObjects.HomePage
					.homePageGetStartedtitleSteps_3rdTitle(driver).getText();
			
			Assert.assertTrue(thirdStep.equalsIgnoreCase("Get your goods"),
					"Get your goods step is not displaying");
			

		} catch (Exception e) {
			System.out.println(e);
			Assert.fail("Get started steps are not available");
		}
	}

	@Then("^I should see 'Track your packag' block with text are to enter package tracking ID$")
	public void i_should_see_Track_your_packag_block_with_text_are_to_enter_package_tracking_ID()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			String title = pageObjects.HomePage
					.homePageTrackYourPackageSectionTitle(driver).getText();
			Assert.assertTrue(title.equalsIgnoreCase("Track your package"),
					"Track your package title is not available");
			String trackPackageTextbox = pageObjects.HomePage
					.homePageTrackYourPackageSectionTextField(driver)
					.getAttribute("placeholder");
			if (trackPackageTextbox == null) {
				Assert.fail("trackPackageTextbox is not available");
			}
			String trackButton = pageObjects.HomePage
					.homePageTrackYourPackageTrackbutton(driver).getAttribute(
							"type");
			if (trackButton == null) {
				Assert.fail("trackButton is not available");

			}

			String buttoncolor = pageObjects.HomePage
					.homePageTrackYourPackageTrackbutton(driver).getCssValue(
							"background-color");
			Assert.assertEquals(buttoncolor, "rgba(102, 102, 102, 1)",
					" trackpackage button color is not matching");
			System.out.println("verify9");
		} catch (Exception e) {

			Assert.fail("track your package section is not available");
		}
	}

	@Then("^I should see 'Shipping Cost Calculator' block to the estimated cost of the shipment$")
	public void i_should_see_Shipping_Cost_Calculator_block_to_the_estimated_cost_of_the_shipment()
			throws Throwable {
		try {
			Assert.assertTrue(pageObjects.HomePage
					.homePageCalculatorCalculateButton(driver).isDisplayed());

		} catch (Exception e) {
			Assert.fail("Shipping calculator section is not displaying");
		}
	}

	@Then("^I should see 'Shop N Zip Deals' block that will display the third party shopping sites that are tie up with Shop N Zip$")
	public void i_should_see_Shop_N_Zip_Deals_block_that_will_display_the_third_party_shopping_sites_that_are_tie_up_with_Shop_N_Zip()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage
					.homePageShopnZipDealsCaption(driver).isDisplayed());
			String partnerlogo = pageObjects.HomePage
					.homePageShopnZipDealsTieUp3rdPartyLinks_1stIcon(driver)
					.getAttribute("src");
			if (partnerlogo == null) {
				Assert.fail("partners logo is not displaying in deals section.");
			}
		} catch (Exception e) {
			Assert.fail("Deals section is not displaying");
		}
	}

	@Then("^I should see 'Ad block' above the track package section$")
	public void i_should_see_Ad_block_above_the_track_package_section()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage.homePageAdslot1(driver)
					.isDisplayed());
			String adblock1 = pageObjects.HomePage.homePageAdslot1(driver)
					.getAttribute("src");
			if (adblock1 == null) {
				Assert.fail("ad block 1 is missing");
			}
		} catch (Exception e) {
			Assert.fail("Ad block one is not available");
		}

	}

	@Then("^I should see 'Ad block' Below the real stories$")
	public void i_should_see_Ad_block_Below_the_real_stories() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage.homePageAdslot2(driver)
					.isDisplayed());
			String adblock2 = pageObjects.HomePage.homePageAdslot2(driver)
					.getAttribute("src");
			if (adblock2 == null) {
				Assert.fail("ad block 2 is missing");
			}
		} catch (Exception e) {
			Assert.fail("Ad block two is not available");
		}

	}

	@Then("^I should see 'Ad block' Besides the Shipping Cost Calculator$")
	public void i_should_see_Ad_block_Besides_the_Shipping_Cost_Calculator()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage
					.homePageAdslot3Squire(driver).isDisplayed());
			String adblock3 = pageObjects.HomePage
					.homePageAdslot3Squire(driver).getAttribute("src");
			if (adblock3 == null) {
				Assert.fail("ad block 3 is missing");
			}
		} catch (Exception e) {
			Assert.fail("Ad block three is not available");
		}

	}

	@Then("^I should see 'Real stories' block with (\\d+) stories$")
	public void i_should_see_Real_stories_block_with_stories(int arg1)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage.homePageRealStories(driver)
					.isDisplayed(), "real story section is not available");
			int count = pageObjects.HomePage.homePageRealStorySectionElements(
					driver).size();
			Assert.assertEquals(count, 4, "4 stories are not available");

		} catch (Exception e) {
			Assert.fail("Real story section is not displaying in home page");
		}
	}

	@Then("^I should see 'Sign Up' button at Carousel$")
	public void i_should_see_Sign_Up_button_at_Carousel() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage
					.homePageCarousel_signUpOption(driver).isDisplayed());
			String signupAtCarousel = pageObjects.HomePage
					.homePageCarousel_signUpOption(driver).getAttribute("href");
			if (signupAtCarousel == null) {
				Assert.fail("Sign up option at carousel is not clickable");
			}
		} catch (Exception e) {
			Assert.fail("Signup option at carousel is not available");
		}
	}

	@Then("^I should see 'Sign Up' button at Map$")
	public void i_should_see_Sign_Up_button_at_Map() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage
					.homePageStaticMapSectionSignUp(driver).isDisplayed());
			String SignUpAtMap = pageObjects.HomePage
					.homePageStaticMapSectionSignUp(driver)
					.getAttribute("href");
			if (SignUpAtMap == null) {
				Assert.fail("Sign up at map section is not clickable");
			}
		} catch (Exception e) {
			Assert.fail("Signup at map section is not available");
		}
	}

	@Then("^I should see 'Sign Up' button at Below Shop N Zip deals section$")
	public void i_should_see_Sign_Up_button_at_Below_Shop_N_Zip_deals_section()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage.homePageReadyToStartText(
					driver).isDisplayed());
			// String signup =
			// pageObjects.HomePage.homePageReadyToStartText(driver).getAttribute("src");
			// if (signup == null) {
			// Assert.fail("'Sign Up' button at Below Shop N Zip deals section is  not displaying");

			// }
			String buttoncolor = pageObjects.HomePage
					.homePageReadyToStartsection(driver).getCssValue(
							"background-color");
			Assert.assertEquals(buttoncolor, "rgba(255, 102, 0, 1)",
					" trackpackage button color is not orange");

		} catch (Exception e) {
			Assert.fail("SignUp option is not available below of deals");
		}
	}

	@Then("^I should see 'Sign Up' button at Below the Real stories$")
	public void i_should_see_Sign_Up_button_at_Below_the_Real_stories()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage.signUpOption(driver)
					.isDisplayed());
			String Signupend = pageObjects.HomePage.signUpOption(driver)
					.getAttribute("href");
			if (Signupend == null) {
				Assert.fail("'Sign Up' button at Below the Real stories is not clickable ");
			}
			String ColorSignUp = pageObjects.HomePage.signUpOption(driver)
					.getCssValue("background-image");
			Assert.assertEquals(
					ColorSignUp,
					"linear-gradient(180deg, rgb(255, 102, 0) 0px, rgb(255, 51, 0))",
					"Bg color is not orange");
		} catch (Exception e) {
			Assert.fail("Sign Up option is not displaying below of stories");
		}
	}

	@Given("^Signed In with shop site$")
	public void signed_In_with_shop_site() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should not see 'Sign Up' button at Carousel$")
	public void i_should_not_see_Sign_Up_button_at_Carousel() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should not see 'Sign Up' button at Map$")
	public void i_should_not_see_Sign_Up_button_at_Map() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should not see 'Sign Up' button at Below Shop N Zip deals section$")
	public void i_should_not_see_Sign_Up_button_at_Below_Shop_N_Zip_deals_section()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should not see 'Sign Up' button at Below the Real stories$")
	public void i_should_not_see_Sign_Up_button_at_Below_the_Real_stories()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		throw new PendingException();
	}

	@Then("^I should see the 'view deals' button under 'shop n zip deals!'$")
	public void i_should_see_the_view_deals_button_under_shop_n_zip_deals()
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			Assert.assertTrue(pageObjects.HomePage
					.homePageShopnZipDealsviewDealsButton(driver).isDisplayed());
			String viewdeals = pageObjects.HomePage
					.homePageShopnZipDealsviewDealsButton(driver).getAttribute(
							"href");
			if (viewdeals == null) {
				Assert.fail("View deals button is not displaying");
			}
			String viewDealsColor = HomePage
					.homePageShopnZipDealsviewDealsButton(driver).getCssValue(
							"background-image");
			Assert.assertEquals(
					viewDealsColor,
					"linear-gradient(180deg, rgb(0, 140, 0) 0px, rgb(0, 167, 0))",
					"view deals button bg color is not green.");
		} catch (Exception e) {
			Assert.fail("View deals is not available in home page");
		}
	}

	@When("^I click on the 'view deals' button$")
	public void i_click_on_the_view_deals_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			pageObjects.HomePage.homePageShopnZipDealsviewDealsButton(driver)
					.click();
		} catch (Exception e) {
			Assert.fail(" view deals Button is not clickable");
		}
	}

	@Then("^I should be redirected to the 'Shop Now' page$")
	public void i_should_be_redirected_to_the_Shop_Now_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		try {
			String navigatedpageTitle = driver.getTitle();
			Assert.assertEquals(navigatedpageTitle, "Shop n Zip - Shop Now",
					"Navigated page title of shop now page is not matching");
		} catch (Exception e) {
			Assert.fail("View deals is not redirecting to the shop now page.");
		}
	}

}
