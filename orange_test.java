package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
public class orange_test {
	
	

	
	    public static void main(String[] args) {
	        // Set up WebDriver
//	    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	        try {
	            // Open the OrangeHRM login page
	            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Login to the dashboard
	            driver.findElement(By.name("username")).sendKeys("Admin");
	            driver.findElement(By.name("password")).sendKeys("admin123");
	            driver.findElement(By.xpath("//button[@type='submit']")).click();

	            // Wait for the dashboard to load (use explicit waits if needed)
	            Thread.sleep(3000); // Use WebDriverWait for better handling

	            // Locate the left side menu
	            List<WebElement> menuItems = driver.findElements(By.cssSelector("ul.oxd-main-menu > li"));

	            // Print each menu item text
	            System.out.println("Left Side Menu Items:");
	            for (WebElement item : menuItems) {
	                System.out.println(item.getText());
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } 
	}


}
