package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FAQs extends BaseClass {
	public static BaseClass bc = BaseClass.getInstance();
	public static WebDriver driver = bc.driver;
	public static WebElement element = null;
	{
		 HeaderLinks.FAQ_Menulink();
	
	}
	public static WebElement FAQsHeading() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[1]/h2"));
		return element;
	}
	public static WebElement FAQsCaption() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[1]/p[1]"));
		return element;
	}
	public static WebElement FAQsGeneralQuwstions() {
		element = driver.findElement(By.xpath(".//*[@class='faq_cont']/div/p[2]"));
		return element;
	}
	public static WebElement FAQsMyAccounts() {
		element = driver.findElement(By.xpath(".//*[@class='faq_cont']/div/p[3]"));
		return element;
	}
	public static WebElement FAQsMyItems() {
		element = driver.findElement(By.xpath(".//*[@class='faq_cont']/div/p[4]"));
		return element;
	}
	public static WebElement FAQsGeneralShippngInfo() {
		element = driver.findElement(By.xpath(".//*[@class='faq_cont']/div/p[5]"));
		return element;
	}
	public static WebElement FAQsReturns() {
		element = driver.findElement(By.xpath(".//*[@class='faq_cont']/div/p[6]"));
		return element;
	}
	public static WebElement FAQsContactUsLink() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[1]/p[7]/a"));
		return element;
	}
	public static WebElement FAQsGeneralQuestionSection() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[2]"));
		return element;
	}
	public static WebElement FAQsSignUpOptionInDescription() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[1]/div/div[2]/div[1]/div[1]/p[2]/a/span"));
		return element;
	}
	public static WebElement FAQsAdSlot1Squire() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[2]/div[1]/img"));
		return element;
	}

	public static WebElement FAQsAdSlot2rightside() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/section/div[1]/div/div/div[2]/div[2]/img"));
		return element;
	}

	public static WebElement FAQsAdSlot3rectangualr() {
		element = driver.findElement(By.xpath(".//*[@id='form']/div[6]/section/div[2]/div/div/div/div[2]/a/img"));
		return element;
	}

	public static WebElement FAQsTables() {
		element = driver.findElement(By.xpath(""));
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

//table section is remaining in general qns
}
