package srcript;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dropdown {

public static <WebDriverWait> void main(String[] args) throws IOException {

	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/AutomationPractice");
	
	WebElement staticdropdwon = driver.findElement(By.id("dropdown-class-example"));
	
	Select sel = new Select(staticdropdwon);
	sel.selectByIndex(2);
	
	System.out.println(sel.getFirstSelectedOption().getText());
	
   List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

            // Count the number of checkboxes
            int totalCheckboxes = checkboxes.size();
            System.out.println("Total checkboxes on the webpage: " + totalCheckboxes);
	
     
	
  }	  
	
}
