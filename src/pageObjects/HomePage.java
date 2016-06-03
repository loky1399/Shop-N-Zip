package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BaseClass {
	public static BaseClass bc = BaseClass.getInstance();
	public static WebDriver driver = bc.driver;
	public static WebElement element = null;
	public static WebElement shopNziplogo() {
		element = driver.findElement(By.xpath("html/body/div[1]/div/nav/div/div[1]/a[1]/img"));
		return element;
	}
	{
		HeaderLinks.howItWorks_Menulink();
	}
	{
		HeaderLinks.shopNow_Menulink();
	}
	{
		HeaderLinks.AboutUs_Menulink();
	}
	{
		HeaderLinks.FAQ_Menulink();
	}
	{
		HeaderLinks.SignIn_Menulink();
	}
	{
		HeaderLinks.signUp_Menulink();
	}
	{
		HeaderLinks.faceBook_Menulink();
	}
	{
		HeaderLinks.twitter_Menulink();
	}
	{
		HeaderLinks.countryDropDown_Menulink();
	}
	{
		HeaderLinks.shopNzipLogo();
	}
	
		public static WebElement homePageCarousel() {
			element = driver.findElement(By.xpath("html/body/form/div[6]/div/div[2]/span"));
			return element;
		}
		public static WebElement homePageCarousel_title() {
			element = driver.findElement(By.xpath("html/body/form/div[6]/div/div[4]/div/div/h1"));
			return element;
		}
		public static WebElement homePageCarousel_text() {
			element = driver.findElement(By.xpath("html/body/form/div[6]/div/div[4]/div/div/p[1]"));
			return element;
		}
		public static WebElement homePageCarousel_signUpOption() {
			element = driver.findElement(By.xpath("html/body/form/div[6]/div/div[4]/div/div/p[2]/a"));
			return element;
		}
		public static WebElement homePageCarousel_signInOption() {
			element = driver.findElement(By.xpath("html/body/form/div[6]/div/div[4]/div/div/p[3]/a"));
			return element;
		}
		public static WebElement homePageCarousel_pageindicator() {
			element = driver.findElement(By.xpath(".//*[@id='myCarousel']/ol/li"));
			return element;
		}
		public static WebElement homePageGetStartedtitle() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[1]/div/div/div[1]/h1"));
			return element;
		}
		public static WebElement homePageGetStartedtitleShortDescription() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[1]/div/div/div[1]/h2"));
			return element;
		}
		public static WebElement homePageGetStartedtitleSteps() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[1]/div/div/div/div"));
			return element;
		}
		public static WebElement homePageGetStartedtitleSteps_1st() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[1]/div/div/div/div)[1]"));
			return element;
		}
		public static WebElement homePageGetStartedtitleSteps_1stTitle() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[1]/div/div/div[2]/div/h2"));
			return element;
		}
		public static WebElement homePageGetStartedtitleSteps_2nd() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[1]/div/div/div[3]/div"));
			return element;
		}
		public static WebElement homePageGetStartedtitleSteps_2ndTitle() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[1]/div/div/div[3]/div/h2"));
			return element;
		}
		public static WebElement homePageGetStartedtitleSteps_3rd() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[1]/div/div/div[4]"));
			return element;
		}
		public static WebElement homePageGetStartedtitleSteps_3rdTitle() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[1]/div/div/div[4]/div/h2"));
			return element;
		}
		public static WebElement homePageAdslot1() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[1]/a"));
			return element;
		}
		public static WebElement homePageAdslot2() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[6]/div/div/div/div[3]/div[2]/a/img"));
			return element;
		}
		public static WebElement homePageAdslot3Squire() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[4]/div/div/div/div[3]/img"));
			return element;
		}
		public static WebElement homePageTrackYourPackageSection() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[1]/div"));
			return element;
		}
		public static WebElement homePageTrackYourPackageSectionTitle() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[1]/div/h2"));
			return element;
		}
		public static WebElement homePageTrackYourPackageSectionTextField() {
			element = driver.findElement(By.xpath("(.//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone4_ZoneTrackPackege_ShopNZipHomeTrackPackage_txttrackingNumber']"));
			return element;
		}
		public static WebElement homePageTrackYourPackageTrackbutton() {
			element = driver.findElement(By.xpath("(.//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone4_ZoneTrackPackege_ShopNZipHomeTrackPackage_btnTrack']"));
			return element;
		}
		public static WebElement homePageCalculatorSection() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]"));
			return element;
		}
		public static WebElement homePageCalculatorSectiontitle() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/h2"));
			return element;
		}
		public static WebElement homePageCalculatorDestinationtitle() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/label"));
			return element;
		}
		public static WebElement homePageCalculatorDestinationdropdown() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/select"));
			return element;
		}
		public static WebElement homePageCalculatorShippingMethodtext() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/label"));
			return element;
		}
		public static WebElement homePageCalculatorShippingMethodAirRadioButton() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/label/div"));
			return element;
		}
		public static WebElement homePageCalculatorShippingMethodSeaRadioButton() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/label/div"));
			return element;
		}
		public static WebElement homePageCalculatorItemSizetext() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[3]/label"));
			return element;
		}
		public static WebElement homePageCalculatorItemSizeRegularRadioButton() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/label/div"));
			return element;
		}
		public static WebElement homePageCalculatorItemSizeOddRadioButton() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/label/div"));
			return element;
		}
		public static WebElement homePageCalculatorWeighttext() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[4]/div/label"));
			return element;
		}
		public static WebElement homePageCalculatorWeightTextBox() {
			element = driver.findElement(By.xpath("((.//*[@id='inputdefault'])[1]"));
			return element;
		}
		public static WebElement homePageCalculatorTypeOfProductTextBox() {
			element = driver.findElement(By.xpath("(.//*[@id='inputdefault'])[2]"));
			return element;
		}
		
		public static WebElement homePageCalculatorCalculateButton() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[5]/div/div[2]/a"));
			return element;
		}
		public static WebElement homePageStaticMapSection() {
			element = driver.findElement(By.xpath("(.//*[@id='form']/section[3]"));
			return element;
		}
		public static WebElement homePageMapYesIwanttoShopnZipText() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[3]/div/div/div/div[1]"));
			return element;
		}
		public static WebElement homePageStaticMapSectionSignUp() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[3]/div/div/div/div[2]/a"));
			return element;
		}
		public static WebElement  homePageStaticMapSectionSignIn() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[3]/div/div/div/div[2]/p/a"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsHeading() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[1]/h2"));
			return element;
		}
		public static WebElement   homePageShopnZipDealsCaption() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[1]/p"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsTieUp3rdPartyicons() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul"));
			return element;
		}
		public static WebElement   homePageShopnZipDealsTieUp3rdPartyLinks_1stIcon() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[1]/img"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsTieUp3rdPartyLinks_2ndIcon() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[2]/img"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsTieUp3rdPartyLinks_3rdIcon() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[3]/img"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsTieUp3rdPartyLinks_4thIcon() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[4]/img"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsTieUp3rdPartyLinks_5thIcon() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[5]/img"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsTieUp3rdPartyLinks_6thicon() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[6]/img"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsTieUp3rdPartyLinks_7thIcon() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[7]/img"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsTieUp3rdPartyLinks_8thIcon() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[8]/img"));
			return element;
		}
		public static WebElement  homePageShopnZipDealsviewDealsButton() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[4]/div/div/p/a"));
			return element;
		}
		public static WebElement  homePageReadyToStartText() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[5]/div/div/a/div/div[1]"));
			return element;
		}
		public static WebElement  homePagehomeArrowOfReadyToStart() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[5]/div/div/a/div/div[2]/span"));
			return element;
		}
		public static WebElement  homePageReadyToStartSignInOption() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[5]/div/div/div/p/a"));
			return element;
		}
		public static WebElement  homePageRealStorySection() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div"));
			return element;
		}
		public static WebElement  homePageRealStoryHeadingText() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[1]/h2"));
			return element;
		}
		public static WebElement   homePageRealStoryCaption() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[1]/p"));
			return element;
		}
		public static WebElement  homePageRealStories() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div/div"));
			return element;
		}
		public static WebElement  homePageRealStory1() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div"));
			return element;
		}
		public static WebElement  homePageRealStory1Description() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/p"));
			return element;
		}
		public static WebElement  homePageRealStory1AuthorImage() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/img"));
			return element;
		}
		public static WebElement  homePageRealStory1AuthorNameWithFeedBack() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div"));
			return element;
		}
		public static WebElement  homePageRealStory1AuthorName() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div/h4"));
			return element;
		}
		public static WebElement  homePageRealStory2() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div"));
			return element;
		}
		public static WebElement  homePageRealStory2Description() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/p"));
			return element;
		}
		public static WebElement  homePageRealStory2AuthorImage() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/img"));
			return element;
		}
		public static WebElement  homePageRealStory2AuthorNameWithFeedBack() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div"));
			return element;
		}
		public static WebElement  homePageRealStory2AuthorName() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div/h4"));
			return element;
		}
		public static WebElement  homePageRealStory3() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div"));
			return element;
		}
		public static WebElement  homePageRealStory3Description() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/p"));
			return element;
		}
		public static WebElement  homePageRealStory3AuthorImage() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/img"));
			return element;
		}
		public static WebElement  homePageRealStory3AuthorNameWithFeedBack() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div"));
			return element;
		}
		public static WebElement  homePageRealStory3AuthorName() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div/h4"));
			return element;
		}
		public static WebElement  homePageRealStory4() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div"));
			return element;
		}
		public static WebElement  homePageRealStory4Description() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/p"));
			return element;
		}
		public static WebElement  homePageRealStory4AuthorImage() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/img"));
			return element;
		}
		public static WebElement  homePageRealStory4AuthorNameWithFeedBack() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div"));
			return element;
		}
		public static WebElement  homePageRealStory4AuthorName() {
			element = driver.findElement(By.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div/h4"));
			return element;
		}
		public static WebElement signUpOption() {
			element = driver.findElement(By
					.xpath(".//*[@id='form']/section/div/div/div/div/div[1]/a"));
			return element;
		}

		public static WebElement signInOption() {
			element = driver.findElement(By
					.xpath(".//*[@id='form']/section/div/div/div/div/div[1]/p/a"));
			return element;
		}
		
		
		

}
