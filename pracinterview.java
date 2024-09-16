package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracinterview {

public static void main(String[] args) {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
	driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	
   }
	
}
