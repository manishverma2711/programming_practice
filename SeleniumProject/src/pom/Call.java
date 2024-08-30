package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Call {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("116");		
		
	WebDriver wd = new ChromeDriver();	
	System.getProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		
	   
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	//	wd.manage().window().maximize();
 
	    loginpage lin = new loginpage(wd);
	    logoutpgohm log = new logoutpgohm(wd);
	    
	    lin.loginprocess("admin", "admin123");
	    log.logoutprocess();
	    
		
	}
}
