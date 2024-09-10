package Classselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class dbpanelopen {

	public static void main(String[] args) throws Exception, Exception {
		
		WebDriver wd = new ChromeDriver();
		
		wd.get("https://blazedemo.com/");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.manage().window().maximize();

		/*	wd.findElement(By.id("input_username")).sendKeys("testuser");
		wd.findElement(By.name("pma_password")).sendKeys("testuser");
		wd.findElement(By.id("input_go")).click();
		*/		
		Select sc = new Select(wd.findElement(By.name("fromPort")));
	//	sc.selectByValue("Boston");
	    sc.selectByIndex(3);
	    
	 //   TakesScreenshot ts =(TakesScreenshot)wd;
	 //   FileHandler.copy(ts.getScreenshotAs(OutputType.FILE),new File("C:\\Selenium\\sreenshot\\src.png"));
	    
	    
	}
}
