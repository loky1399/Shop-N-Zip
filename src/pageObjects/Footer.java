package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer{

	public static WebElement element = null;
	
	public static WebElement footerSection(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='form']/footer"));
		return element;

}
	public static WebElement footerSectiontShopnZipText(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='p_lt_WebPartZone6_ZoneFooterLogoandStaticPages_eiFooterLogo_ucEditableImage_imgImage']"));
		return element;

}
	public static WebElement footerSectionText(WebDriver driver) {
		element = driver.findElement(By.xpath(".//*[@id='form']/footer/div/div/p[2]"));
		return element;

}
	
	public static WebElement footerShopNZipLogo(WebDriver driver) {
		element = driver.findElement(By.xpath("//a/img[@alt='Footer Logo']"));
		return element;

}
	public static WebElement footerSectionPoweredbyABS_CBNInternationalLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//p[text()='All Rights Reserved - � 2016 Company | Powered by ABS-CBN International']"));
		return element;

}
	public static WebElement footerTermsAndConditionlink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='Terms and Condition']"));
		return element;

}
	public static WebElement footerContactUslink(WebDriver driver) {
		element = driver.findElement(By.xpath("//a[text()='Contact Us']"));
		return element;

	}

}
