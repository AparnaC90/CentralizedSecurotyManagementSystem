package CEN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UserManagement 
{

	WebDriver driver;
	
	 @Test
	  public void TC_1() throws InterruptedException
	 {
}
	 
	
	 @Parameters({ "browser" })
	  @BeforeTest
	  public void beforeTest(String browser) {
		  
		  if(browser.equalsIgnoreCase("chrome"))
	      {
	      	System.setProperty("webdriver.chrome.driver", "F:\\Widget\\Browser\\chromedriver_win32\\chromedriver.exe");
	      	//System.setProperty("webdriver.chrome.driver", "F:\\Widget\\Browser\\chromedriver_win32\\chromedriver.exe");
	      	driver = new ChromeDriver(); 
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	      	driver.manage().window().maximize();
	      	
	      }
	      else if(browser.equalsIgnoreCase("IE"))
	      {
	        System.setProperty("webdriver.ie.driver", "F:\\selenium\\IEDriverServer_x64_2.53.1\\IEDriverServer.exe");
	        driver = new InternetExplorerDriver(); 
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	            
	      }
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.quit();
	  }

}
