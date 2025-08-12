package Obejcts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {

	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;

	}

	By searchbox = By.xpath("//textarea[@name='q']");
	By search_btn = By.xpath("//div[@class='lJ9FBc']//input[@name='btnK']");
	By facebook_link = By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]");

	public void searchgoogle(String Searchinput) {
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(5000);
			driver.findElement(search_btn).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Exception caught " + e.getMessage());
		}
	}
	
	public void clickFacebook() {
		try {
			driver.findElement(facebook_link).click();
			Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println("Exception caught :  " + e.getMessage());
		}
	}
	

}
