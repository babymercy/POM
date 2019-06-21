/**
 * 
 */
package login1page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages1.loginpage1storing;

/**
 * @author Admin
 *
 */
public class verifylogn1 {
	
	// updating this for github
	@Test
	public void verfylogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.topexamer.com/login");
		driver.manage().window().maximize();
		
		loginpage1storing login = new loginpage1storing(driver);
		
		/*
		login.TypePHONENUMBER("7893655956");
		login.TypePASSWORD("1234567");
		login.Clickonlogin();
		*/
		
		login.login("7893655956", "123456");
	
		driver.close();
		
		
		
	}

}
