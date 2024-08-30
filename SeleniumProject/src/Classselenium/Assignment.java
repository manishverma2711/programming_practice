package Classselenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		
		
		 ChromeOptions co = new ChromeOptions();
			co.setBrowserVersion("116");		
			
		WebDriver wd = new ChromeDriver();	
		System.getProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		wd.get("https://gor-pathology.web.app/");
		wd.findElement(By.name("email")).sendKeys("test@kennect.io");
		wd.findElement(By.name("password")).sendKeys("Qwerty@1234");
		
		wd.findElement(By.className("MuiButton-label")).click();
		 
		JavascriptExecutor js = (JavascriptExecutor)wd;
		js.executeAsyncScript("window.scrollBy(0,500)");		
       
       wd.findElement(By.id("patient-test")).click();
       
       wd.findElement(By.xpath("//span[@class='MuiChip-label']")).click();
	
   
       wd.findElement(By.xpath("//li[normalize-space()='10%']")).click();
		
		
	}

}
