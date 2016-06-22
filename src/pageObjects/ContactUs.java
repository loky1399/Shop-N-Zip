package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUs extends BaseClass {

	public static WebElement element = null;

public static WebElement contactUs_title(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@class='text-center hwt_main_txt mt92']"));
	return element;
}
public static WebElement contactUs_LiveChatImg(WebDriver driver) {
	element = driver.findElement(By.xpath("(.//*[@class='col-md-4'])[1]"));
	return element;
}
public static WebElement contactUs_sendFeedbackimg(WebDriver driver) {
	element = driver.findElement(By.xpath("(.//*[@class='col-md-4'])[2]"));
	return element;
}
public static WebElement contactUs_liveChatWithUsTitle(WebDriver driver) {
	element = driver.findElement(By.xpath("(.//*[@class='txtbold'])[1]"));
	return element;
}
public static WebElement contactUs_sendYourFeedbackTitle(WebDriver driver) {
	element = driver.findElement(By.xpath("(.//*[@class='txtbold'])[2]"));
	return element;
}
public static WebElement contactUs_liveChatWithUsShortDescription(WebDriver driver) {
	element = driver.findElement(By.xpath("(.//*[@class='txtlgt'])[1]"));
	return element;
}
public static WebElement contactUs_sendYourFeedbackShortDescription(WebDriver driver) {
	element = driver.findElement(By.xpath("(.//*[@class='txtlgt'])[2]"));
	return element;
}
public static WebElement contactUs_chatNowButton(WebDriver driver) {
	element = driver.findElement(By.xpath("(.//*[@class='right_txt']/a)[1]"));
	return element;
}
public static WebElement contactUs_SendFeedbackButton(WebDriver driver) {
	element = driver.findElement(By.xpath("(.//*[@class='right_txt']/a)[2]"));
	return element;
}
public static WebElement contactUs_adslot(WebDriver driver) {
	element = driver.findElement(By.xpath(".//*[@class='img-responsive']"));
	return element;
}

}



