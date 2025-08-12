package Test_Scenarios;

import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Obejcts.FacebookPage;
import Obejcts.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	
	WebDriver driver;
	GoogleSearchPage objectrepo;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		
	}
	
	@Test(priority = 0)
	public void searchOperation() {
		
		 objectrepo = new GoogleSearchPage(driver);
		 objectrepo.searchgoogle("facebook");
	}
	
	@Test (priority = 1)
	public void verifyAndAccessFacebook() {
		objectrepo = new GoogleSearchPage(driver);
		objectrepo.clickFacebook();
	}
	
	@Test (priority = 2)
	public void verifyFacebookLogin() {
		FacebookPage page = new FacebookPage(driver);
		page.userName();
		page.passWord();
		page.loginAccess();
	}
	
	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
