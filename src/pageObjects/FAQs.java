package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FAQs{
	public static WebElement element = null;

	public static WebElement FAQsHeading(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[1]/h2"));
		return element;
	}

	public static WebElement FAQsCaption(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[1]/p[1]"));
		return element;
	}

	public static WebElement FAQsGeneralQuwstions(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='faq_cont']/div/p[2]"));
		return element;
	}

	public static WebElement FAQsMyAccounts(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='faq_cont']/div/p[3]"));
		return element;
	}

	public static WebElement FAQsMyItems(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='faq_cont']/div/p[4]"));
		return element;
	}

	public static WebElement FAQsGeneralShippngInfo(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='faq_cont']/div/p[5]"));
		return element;
	}

	public static WebElement FAQsReturns(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@class='faq_cont']/div/p[6]"));
		return element;
	}

	public static WebElement FAQsContactUsLink(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@class='findanswr']/a"));
		return element;
	}

	public static WebElement FAQsGeneralQuestionSection(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[2]"));
		return element;
	}

	public static WebElement FAQsSignUpOptionInDescription(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[2]/div[1]/div[1]/p[2]/a/span"));
		return element;
	}

	public static WebElement FAQsAdSlot1Squire(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[2]/div[1]/img"));
		return element;
	}

	public static WebElement FAQsAdSlot2rightside(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[2]/div[2]/img"));
		return element;
	}

	public static WebElement FAQsAdSlot3rectangualr(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div[2]/div/div/div/div[2]/a/img"));
		return element;
	}

	public static WebElement FAQsTables(WebDriver driver) {
		element = driver.findElement(By.xpath(""));
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

	// table section is remaining in general qns
}
