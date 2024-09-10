package DDF;

import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pom.loginpage;
import pom.logoutpgohm;

public class Readdata {
   public static void main(String[] args) throws Exception {
	   
	   ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("116");		
		
	WebDriver wd = new ChromeDriver();	
	System.getProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		
	   
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   loginpage log = new loginpage(wd);
	   logoutpgohm logo = new logoutpgohm(wd);
	   
	   FileInputStream file= new FileInputStream("C:\\Selenium\\sreenshot\\Book1.xlsx");
	   XSSFWorkbook  wk = new XSSFWorkbook(file);
	   XSSFSheet   sh = wk.getSheet("Readohm");
	   wk.close();
	   
	   for(int i =1;i<=sh.getLastRowNum();i++)
	   {
		   XSSFRow rw = sh.getRow(i);
		   XSSFCell un = rw.getCell(0);
		   XSSFCell pw = rw.getCell(1);
		   
		   System.out.println(un+"   "+ pw);
		   
		   log.loginprocess(un.toString(), pw.toString());
		   logo.logoutprocess();
		   
		   wd.findElement(By.name("username")).sendKeys(un.toString());
			wd.findElement(By.name("password")).sendKeys(pw.toString());
			wd.findElement(By.cssSelector("button[type=submit]")).click();
		   
	   }   
  }
}
