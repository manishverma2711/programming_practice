package practice;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {
	
	public static void main(String[] args) throws IOException {
		

	
		ChromeDriver wd = new ChromeDriver();
		
		wd.get("https://rahulshettyacademy.com/locatorspractice/");
		
		        
        File srcc =((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
        Files.copy(srcc, new File("C:\\Selenium\\sreenshot\\src2.png"));
	}
}
