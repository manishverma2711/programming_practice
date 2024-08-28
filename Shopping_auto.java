package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopping_auto {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/inventory.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		String str = driver.findElement(By.className("app_logo")).getText();
		
		System.out.println("The heading of website is:"  +str);
		
	}

}
