package Obejcts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	
	WebDriver driver;

	public FacebookPage(WebDriver driver) {
		this.driver = driver;

	}
	
	By user_name = By.id("email");
	By password = By.id("pass");
	By login_btn = By.xpath("//button[@name='login']");
	
	public void userName() {
		driver.findElement(user_name).sendKeys("Testing");
	}
	
	public void passWord() {
		driver.findElement(password).sendKeys("Testing@123");
	}
	
	public void loginAccess() {
		driver.findElement(login_btn).click();
		String title =driver.getTitle();
		assertEquals(title, "Facebook");
	}
	

}
