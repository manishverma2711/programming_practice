 package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logoutpgohm {
	
	WebDriver wd ;
	
	public logoutpgohm(WebDriver wd){
		this.wd = wd;		
	}

	  By call = By.xpath("//p[@class='oxd-userdropdown-name']");
	  By logoutlink = By.linkText("Logout");
 

  public void colling() {
	  wd.findElement(call).click();
  }  
  public void logout() {
    wd.findElement(logoutlink).click();
  
  }
  public void logoutprocess() {
	  colling();
	  logout();
  }
  }
