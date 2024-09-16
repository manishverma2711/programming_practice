package practice;

import org.openqa.selenium.WebDriver;    
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions; 

public class pagestart {

	public static void main(String[] args) {
		
//		ChromeOptions co = new ChromeOptions();
//		co.setBrowserVersion("116");		
//		

		ChromeDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		driver.get("https://www.google.com/");
		
	}

}
