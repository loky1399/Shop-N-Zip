package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement element = null;

	public static WebElement shopNziplogo(WebDriver driver) {
		element = driver.findElement(By
				.xpath("html/body/div[1]/div/nav/div/div[1]/a[1]/img"));
		return element;
	}

	public static List<WebElement> homePageCarousel(WebDriver driver) {
		List<WebElement> carousels = driver.findElements(By
				.xpath(".//*[@class='slide-1']"));
		return carousels;
	}
	public static WebElement homePageCarousel1(WebDriver driver) {
		element = driver.findElement(By
				.xpath("(.//*[@class='slide-1'])[1]"));
		return element;
	}
	public static WebElement homePageCarousel2(WebDriver driver) {
		element = driver.findElement(By
				.xpath("(.//*[@class='slide-1'])[2]"));
		return element;
	}

	public static WebElement homePageCarousel3(WebDriver driver) {
		element = driver.findElement(By
				.xpath("(.//*[@class='slide-1'])[3]"));
		return element;
	}


	public static WebElement homePageCarousel_title(WebDriver driver) {
		element = driver.findElement(By
				.xpath("html/body/form/div[6]/div/div[4]/div/div/h1"));
		return element;
	}

	public static WebElement homePageCarousel_text(WebDriver driver) {
		element = driver.findElement(By
				.xpath("html/body/form/div[6]/div/div[4]/div/div/p[1]"));
		return element;
	}

	public static WebElement homePageCarousel_signUpOption(WebDriver driver) {
		element = driver.findElement(By
				.xpath("html/body/form/div[6]/div/div[4]/div/div/p[2]/a"));
		return element;
	}

	public static WebElement homePageCarousel_signInOption(WebDriver driver) {
		element = driver.findElement(By
				.xpath("html/body/form/div[6]/div/div[4]/div/div/p[3]/a"));
		return element;
	}

	public static List<WebElement> homePageCarousel_pageindicators(WebDriver driver) {
		List<WebElement>  pageIndicators= driver.findElements(By.xpath(".//*[@id='myCarousel']/ol/li"));
		return pageIndicators;
	}
	public static WebElement homePageCarousel_pageindicator1(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@id='myCarousel']/ol/li)[1]"));
		return element;
	}
	public static WebElement homePageCarousel_pageindicator2(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@id='myCarousel']/ol/li)[2]"));
		return element;
	}
	public static WebElement homePageCarousel_pageindicator3(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@id='myCarousel']/ol/li)[3]"));
		return element;
	}
	

	public static WebElement homePageGetStartedtitle(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div[1]/h1"));
		return element;
	}

	public static WebElement homePageGetStartedtitleShortDescription(
			WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div[1]/h2"));
		return element;
	}

	public static WebElement homePageGetStartedtitleStepsall(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div/div"));
		return element;
	}
	public static List<WebElement> homePageGetStartedtitleSteps(WebDriver driver) {
		List<WebElement>  steps= driver.findElements(By
				.xpath(".//*[@class='col-sm-4 col-md-3 pdlr']/div"));
		return steps;
	}

	public static WebElement homePageGetStartedtitleSteps_1st(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div/div)[1]"));
		return element;
	}

	public static WebElement homePageGetStartedtitleSteps_1stTitle(
			WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div[2]/div/h2"));
		return element;
	}

	public static WebElement homePageGetStartedtitleSteps_2nd(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div[3]/div"));
		return element;
	}

	public static WebElement homePageGetStartedtitleSteps_2ndTitle(
			WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div[3]/div/h2"));
		return element;
	}

	public static WebElement homePageGetStartedtitleSteps_3rd(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div[4]"));
		return element;
	}

	public static WebElement homePageGetStartedtitleSteps_3rdTitle(
			WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[1]/div/div/div[4]/div/h2"));
		return element;
	}

	public static WebElement homePageAdslot1(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[2]/div/div/div[1]/a/img"));
		return element;
	}

	public static WebElement homePageAdslot2(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[3]/div[2]/a/img"));
		return element;
	}

	public static WebElement homePageAdslot3Squire(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[4]/div/div/div/div[3]/img"));
		return element;
	}

	public static WebElement homePageTrackYourPackageSection(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[1]/div"));
		return element;
	}

	public static WebElement homePageTrackYourPackageSectionTitle(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@class='pro-col-con']/h2"));
		return element;
	}

	public static WebElement homePageTrackYourPackageSectionTextField(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@class='Track']"));
		return element;
	}

	public static WebElement homePageTrackYourPackageTrackbutton(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='p_lt_WebPartZone5_ZonePlaceHolder_pageplaceholder_p_lt_WebPartZone4_ZoneTrackPackege_ShopNZipHomeTrackPackage_btnTrack']"));
		return element;
	}

	public static WebElement homePageCalculatorSection(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]"));
		return element;
	}

	public static WebElement homePageCalculatorSectiontitle(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/h2"));
		return element;
	}

	public static WebElement homePageCalculatorDestinationtitle(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/label"));
		return element;
	}

	public static WebElement homePageCalculatorDestinationdropdown(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/select"));
		return element;
	}

	public static WebElement homePageCalculatorShippingMethodtext(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/label"));
		return element;
	}

	public static WebElement homePageCalculatorShippingMethodAirRadioButton(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/label/div"));
		return element;
	}

	public static WebElement homePageCalculatorShippingMethodSeaRadioButton(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/div[2]/label/div"));
		return element;
	}

	public static WebElement homePageCalculatorItemSizetext(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[3]/label"));
		return element;
	}

	public static WebElement homePageCalculatorItemSizeRegularRadioButton(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/label/div"));
		return element;
	}

	public static WebElement homePageCalculatorItemSizeOddRadioButton(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/label/div"));
		return element;
	}

	public static WebElement homePageCalculatorWeighttext(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath("(.//*[@id='form']/section[2]/div/div[2]/div[1]/div/div[2]/div/div[1]/div[4]/div/label"));
		return element;
	}

	public static WebElement homePageCalculatorWeightTextBox(WebDriver driver) {
		element = driver
				.findElement(By.xpath("((.//*[@id='inputdefault'])[1]"));
		return element;
	}

	public static WebElement homePageCalculatorTypeOfProductTextBox(
			WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@id='inputdefault'])[2]"));
		return element;
	}

	public static WebElement homePageCalculatorCalculateButton(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@class='col-sm-7 col-md-6 ship']/div"));
		return element;
	}

	public static WebElement homePageStaticMapSection(WebDriver driver) {
		element = driver.findElement(By.xpath("(.//*[@id='form']/section[3]"));
		return element;
	}

	public static WebElement homePageMapYesIwanttoShopnZipText(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[3]/div/div/div/div[1]"));
		return element;
	}

	public static WebElement homePageStaticMapSectionSignUp(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[3]/div/div/div/div[2]/a"));
		return element;
	}

	public static WebElement homePageStaticMapSectionSignIn(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[3]/div/div/div/div[2]/p/a"));
		return element;
	}

	public static WebElement homePageShopnZipDealsHeading(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[4]/div/div/div/div[1]/h2"));
		return element;
	}

	public static WebElement homePageShopnZipDealsCaption(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[4]/div/div/div/div[1]/p"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyicons(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyLinks_1stIcon(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[1]/img"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyLinks_2ndIcon(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[2]/img"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyLinks_3rdIcon(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[3]/img"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyLinks_4thIcon(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[4]/img"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyLinks_5thIcon(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[5]/img"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyLinks_6thicon(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[6]/img"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyLinks_7thIcon(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[7]/img"));
		return element;
	}

	public static WebElement homePageShopnZipDealsTieUp3rdPartyLinks_8thIcon(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[4]/div/div/div/div[2]/div/ul/li[8]/img"));
		return element;
	}

	public static WebElement homePageShopnZipDealsviewDealsButton(
			WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[4]/div/div/p/a"));
		return element;
	}

	public static WebElement homePageReadyToStartText(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='sec-title col-sm-11 col-xs-12']"));
		return element;
	}

	public static WebElement homePageReadyToStartsection(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[5]"));
		return element;
	}


	public static WebElement homePagehomeArrowOfReadyToStart(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[5]/div/div/a/div/div[2]/span"));
		return element;
	}

	public static WebElement homePageReadyToStartSignInOption(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[5]/div/div/div/p/a"));
		return element;
	}

	public static WebElement homePageRealStorySection(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[6]/div/div/div"));
		return element;
	}
	public static List<WebElement> homePageRealStorySectionElements(WebDriver driver) {
		List<WebElement> stries = driver.findElements(By
				.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div/div"));
		return stries;
	}


	public static WebElement homePageRealStoryHeadingText(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[6]/div/div/div/div[1]/h2"));
		return element;
	}

	public static WebElement homePageRealStoryCaption(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section[6]/div/div/div/div[1]/p"));
		return element;
	}

	public static WebElement homePageRealStories(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div/div"));
		return element;
	}

	public static WebElement homePageRealStory1(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div"));
		return element;
	}

	public static WebElement homePageRealStory1Description(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/p"));
		return element;
	}

	public static WebElement homePageRealStory1AuthorImage(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/img"));
		return element;
	}

	public static WebElement homePageRealStory1AuthorNameWithFeedBack(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div"));
		return element;
	}

	public static WebElement homePageRealStory1AuthorName(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div/h4"));
		return element;
	}

	public static WebElement homePageRealStory2(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div"));
		return element;
	}

	public static WebElement homePageRealStory2Description(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/p"));
		return element;
	}

	public static WebElement homePageRealStory2AuthorImage(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/img"));
		return element;
	}

	public static WebElement homePageRealStory2AuthorNameWithFeedBack(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div"));
		return element;
	}

	public static WebElement homePageRealStory2AuthorName(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div/h4"));
		return element;
	}

	public static WebElement homePageRealStory3(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div"));
		return element;
	}

	public static WebElement homePageRealStory3Description(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/p"));
		return element;
	}

	public static WebElement homePageRealStory3AuthorImage(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/img"));
		return element;
	}

	public static WebElement homePageRealStory3AuthorNameWithFeedBack(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div"));
		return element;
	}

	public static WebElement homePageRealStory3AuthorName(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div/h4"));
		return element;
	}

	public static WebElement homePageRealStory4(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div"));
		return element;
	}

	public static WebElement homePageRealStory4Description(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/p"));
		return element;
	}

	public static WebElement homePageRealStory4AuthorImage(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/img"));
		return element;
	}

	public static WebElement homePageRealStory4AuthorNameWithFeedBack(
			WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div"));
		return element;
	}

	public static WebElement homePageRealStory4AuthorName(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section[6]/div/div/div/div[2]/div[1]/div/div/div/h4"));
		return element;
	}

	public static WebElement signUpOption(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section/div/div/div/div/div[1]/a"));
		return element;
	}

	public static WebElement signInOption(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section/div/div/div/div/div[1]/p/a"));
		return element;
	}

}
