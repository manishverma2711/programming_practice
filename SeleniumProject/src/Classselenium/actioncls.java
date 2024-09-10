package Classselenium;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actioncls {

	public static void main(String[] args) {
	WebDriver wd = new ChromeDriver();
		
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		wd.manage().window().maximize();
		
		wd.findElement(By.name("username")).sendKeys("Admin");
		wd.findElement(By.name("password")).sendKeys("admin123");
		
		wd.findElement(By.cssSelector("button[type=submit]")).click();
		
		
		Actions act = new Actions(wd);
		List<WebElement>menu = wd.findElements(By.className("oxd-main-menu-item"));
		System.out.println("Menu==> " + menu.size());
		for(int i=0;i<menu.size();i++) {
			System.out.println(menu.get(i).getText());
			act.moveToElement(menu.get(i)).perform();
	
		}
	}
}
