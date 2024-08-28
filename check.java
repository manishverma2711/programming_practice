package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) {

		WebDriver wd = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		wd.get("https://rahulshettyacademy.com/locatorspractice/");
		wd.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
	//	wd.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		wd.findElement(By.className("submit")).click();
		System.out.println(wd.findElement(By.xpath("//p[@class='error']")).getText());
	    wd.findElement(By.linkText("Forgot your password?")).click();
	    wd.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Manish");
	    wd.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("manish@gmail.com");
	   wd.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9899889989");
       wd.findElement(By.className("go-to-login-btn")).click();
	   
	}

}
