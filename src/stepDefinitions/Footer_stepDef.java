package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Footer_stepDef {
	public static WebDriver driver;

	public Footer_stepDef() {
		driver = Hooks.driver;
	}
	@Then("^I should see the footer section in the home page\\.$")
	public void i_should_see_the_footer_section_in_the_home_page()
			throws Throwable {
		try{
			Assert.assertTrue(pageObjects.Footer.footerSection(driver).isDisplayed());
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Footer section is not displaying");
		}
	}

	@Then("^I should see the footer section in 'Black' background color\\.$")
	public void i_should_see_the_footer_section_in_Black_background_color()
			throws Throwable {
		try {

			String bgColor = pageObjects.Footer.footerSection(driver)
					.getCssValue("background-color").toString();
			System.out.println(bgColor);
			if (pageObjects.Footer.footerSection(driver)
					.isDisplayed()) {
				Assert.assertTrue(bgColor.equalsIgnoreCase("rgba(0, 0, 0, 1)"));
			} else {
				Assert.fail("Back Ground color is not black");
			}
		} catch (Exception e) {
			Assert.fail("failed to check the Back Ground color of footer");
		}
	}

	@Then("^I should see <Elements> in footer\\.$")
	public void i_should_see_Elements_in_footer(DataTable FooterSec)
			throws Throwable {
		List<List<String>> field = FooterSec.raw();
		try{
		Assert.assertTrue(pageObjects.Footer.footerSectionPoweredbyABS_CBNInternationalLink(driver).isDisplayed());
		
		Assert.assertTrue(pageObjects.Footer.footerSectionText(driver).isDisplayed());

		Assert.assertTrue(pageObjects.Footer.footerContactUslink(driver).isDisplayed());

		Assert.assertTrue(pageObjects.Footer.footerSectiontShopnZipText(driver).isDisplayed());

		Assert.assertTrue(pageObjects.Footer.footerTermsAndConditionlink(driver).isDisplayed());
		
		
		
	}catch(Exception e){
		System.out.println(e);
		Assert.fail(" elements are not available");
	}
	}
	@Then("^I should be able to see <Elements>  elements in  <Color name> color\\.$")
	public void i_should_be_able_to_see_Elements_elements_in_Color_name_color(
			DataTable arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
		// E,K,V must be a scalar (String, Integer, Date, enum etc)
		throw new PendingException();
	}

//	@Then("^I should see the <links in footer > link is displayed in the footer\\.$")
//	public void i_should_see_the_links_in_footer_link_is_displayed_in_the_footer(DataTable Footerlink)
//			throws Throwable {
//		List<List<String>> field = Footerlink.raw();
//		try{
//		Assert.assertTrue(pageObjects.Footer.footerContactUslink(driver).isDisplayed());
//		String Contactuslink= pageObjects.Footer.footerContactUslink(driver).getAttribute("href");
//		if(Contactuslink== null){
//			System.out.println(Contactuslink);
//			Assert.fail("Contact us link is not clickable");
//		}
//		Assert.assertTrue(pageObjects.Footer.footerTermsAndConditionlink(driver).isDisplayed());
//		String TClink= pageObjects.Footer.footerTermsAndConditionlink(driver).getAttribute("href");
//		if(TClink== null){
//			System.out.println(TClink);
//			Assert.fail("Term And condition link is not clickable");
//		}
//		}catch(Exception e){
//			System.out.println(e);
//			Assert.fail("Links are not displaying in footer section");
//		}
//		
//	}
	@Then("^I should see the Tearms and Conditions link is displayed in the footer\\.$")
	public void i_should_see_the_Tearms_and_Conditions_link_is_displayed_in_the_footer() throws Throwable {
		try{
		Assert.assertTrue(pageObjects.Footer.footerTermsAndConditionlink(driver).isDisplayed());
		String TClink= pageObjects.Footer.footerTermsAndConditionlink(driver).getAttribute("href");
		if(TClink== null){
			System.out.println(TClink);
			Assert.fail("Term And condition link is not clickable");
		}
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Links TC not  displaying in footer section");		}
		
	}
	@Then("^I should see the Contact Us link is displayed in the footer\\.$")
	public void i_should_see_the_Contact_Us_link_is_displayed_in_the_footer() throws Throwable {
		try{
		Assert.assertTrue(pageObjects.Footer.footerContactUslink(driver).isDisplayed());
			String Contactuslink= pageObjects.Footer.footerContactUslink(driver).getAttribute("href");
			if(Contactuslink== null){
			System.out.println(Contactuslink);
				Assert.fail("Contact us link is not clickable");
		}}catch(Exception e){
			System.out.println(e);
			Assert.fail("Links CU is not  displaying in footer section");
	}
	}
	@When("^I clicked on 'Terms and Conditions ' link in footer\\.$")
	public void i_clicked_on_Terms_and_Conditions_link_in_footer()
			throws Throwable {
		try{
			Assert.assertTrue(pageObjects.Footer.footerTermsAndConditionlink(driver).isDisplayed());
			pageObjects.Footer.footerTermsAndConditionlink(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Term and condition link is not clickable");
		}
	}

	@Then("^I should be redirected on 'Terms and Conditions' page of Shop N Zip\\.$")
	public void i_should_be_redirected_on_Terms_and_Conditions_page_of_Shop_N_Zip()
			throws Throwable {
		try{
			String pageTitle= driver.getTitle();
			Assert.assertEquals(pageTitle, "Shop n Zip - Terms and Condition");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail(" not navigating to the term and condition page ");
		}
	}

	@When("^I clicked on 'Contact Us ' link in footer\\.$")
	public void i_clicked_on_Contact_Us_link_in_footer() throws Throwable {
		try{
			Assert.assertTrue(pageObjects.Footer.footerContactUslink(driver).isDisplayed());
			pageObjects.Footer.footerContactUslink(driver).click();
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("Contact us link is not clickable in footer section");
		}
	}

	@Then("^I should be redirected on 'Contact Us' page of Shop N Zip\\.$")
	public void i_should_be_redirected_on_Contact_Us_page_of_Shop_N_Zip()
			throws Throwable {
		try{
			String PageTitle= driver.getTitle();
			Assert.assertEquals(PageTitle, "Shop n Zip - Contact Us");
		}catch(Exception e){
			System.out.println(e);
			Assert.fail("contact us page is not displaying after clicking on libnk in footer.");
			
		}
	}

}
