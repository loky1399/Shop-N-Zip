package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HowItworks extends BaseClass {

	public static WebElement element = null;

	public static WebElement howItWorks_Menulink(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[1]"));
		return element;
	}

	public static WebElement howItWorks_title(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/section/div/div[1]/div/h2"));
		return element;
	}

	public static WebElement howItWorks_CaptionBelow_of_title(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/div[6]/section/div/div[1]/div/p"));
		return element;
	}

	public static WebElement horizontal_3steps(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div/div"));
		return element;
	}

	public static WebElement horizontal_3steps_steps2nd_numbering(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[1]/div/span"));
		return element;
	}

	public static WebElement horizontal_3steps_steps3rd_numbering(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[2]/div/span"));
		return element;
	}

	public static WebElement horizontal_3steps_steps1st_numbering(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[3]/div/span"));
		return element;
	}

	public static WebElement horizontal_3steps_steps1st_name(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[1]/div/h2"));
		return element;
	}

	public static WebElement horizontal_3steps_steps2nd_name(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[2]/div/h2"));
		return element;
	}

	public static WebElement horizontal_3steps_steps3rd_name(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[3]/div/h2"));
		return element;
	}

	public static WebElement horizontal_3steps_step1st_description(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[1]/div/p"));
		return element;
	}

	public static WebElement horizontal_3steps_step2nd_description(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[2]/div/p"));
		return element;
	}

	public static WebElement horizontal_3steps_step3rd_description(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/section/div/div[3]/div/p"));
		return element;
	}

	public static WebElement vertical_3steps(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@class='col-md-8']"));
		return element;
	}

	public static WebElement vertical_3steps_step1st_name(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[1]/h2"));
		return element;
	}

	public static WebElement vertical_3steps_step2nd_name(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[2]/h2"));
		return element;
	}

	public static WebElement vertical_3steps_step3rd_name(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[3]/h2"));
		return element;
	}

	public static WebElement vertical_3steps_step1st_shortdescription(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[1]/p"));
		return element;
	}

	public static WebElement vertical_3steps_step2nd_shortdescription(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[2]/p"));
		return element;
	}

	public static WebElement vertical_3steps_step3rd_shortdescription(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[3]/p"));
		return element;
	}

	public static WebElement signUpOption(WebDriver driver) {
		element = driver.findElement(By
				.xpath(".//*[@id='form']/section/div[2]/div/div/div/div[1]/a"));
		return element;
	}

	public static WebElement signInOption_withoutsignin(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[2]/div/div/div/div[1]/p/a"));
		return element;
	}

	public static WebElement aboutUs_description(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/div[6]/section/div/div/div[1]/div/p[2]"));
		return element;
	}

	public static WebElement adslot_vertical_rightside(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[2]/div/img"));
		return element;
	}

	public static WebElement adslot_rectangular_horizontal(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[2]/div/div/div/div[2]/a/img"));
		return element;
	}

	public static WebElement note(WebDriver driver) {
		element = driver
				.findElement(By
						.xpath(".//*[@id='form']/section/div[1]/div/div/div[1]/div[4]/p"));
		return element;
	}
}
