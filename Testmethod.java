package testscenerios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GooglesearchPage;
import Objects.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testmethod {
	
	WebDriver driver;
	
	@BeforeTest
	public  void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
	}
	
	@Test
	
	public void googlesearch()  {
		GooglesearchPage page =new GooglesearchPage(driver);
		page.searchgoogle("https://admin-demo.nopcommerce.com/login");
		
	}
	
   @Test
	
   public void verifylogin() {
	   loginPage obj = new loginPage(driver);
	   obj.Enteremail();
	   obj.Enterpwd();
	   obj.clicklogin();
	   obj.clicklogout();
	   
	    }
   
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
	
	
		}


