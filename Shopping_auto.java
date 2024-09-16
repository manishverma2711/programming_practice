package practice;

import java.time.Duration;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopping_auto {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/inventory.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		String str = driver.findElement(By.className("app_logo")).getText();
		
		System.out.println("The heading of website is:"  +str);
		
		WebElement jk =driver.findElement(By.className("product_sort_container"));
		
		Select ui = new Select(jk);
		ui.selectByIndex(2);
		
		Thread.sleep(5);
		
		
	String[] prod= {"add-to-cart-sauce-labs-backpack","add-to-cart-sauce-labs-bike-light","add-to-cart-sauce-labs-bolt-t-shirt"};
		
		for(int i=0; i<prod.length;i++) {
			
			WebElement product = driver.findElement(By.id(prod[i])); 
						
			product.click();
		}
		
		System.out.println("Products addded in the cart succesfully");
		
		
		driver.findElement(By.className("shopping_cart_link")).click();
		
		driver.findElement(By.id("checkout")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Manish ");
		driver.findElement(By.id("last-name")).sendKeys("Verma");
		driver.findElement(By.id("postal-code")).sendKeys("421311");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("finish")));
		
		driver.findElement(By.id("finish")).click();
		
	}

}
