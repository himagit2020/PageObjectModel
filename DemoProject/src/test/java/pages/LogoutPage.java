package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.ReadProperties;

public class LogoutPage {
	
	WebDriver dr;
	ReadProperties p = new ReadProperties();
	Properties props = new Properties();
	
	// PAGE FACTORY IS NOT IMPLEMENTED IN THIS CALL TO USE LOCATORS FROM EXTERNAL PROPERTY FILE

	
	public LogoutPage(WebDriver driver) {
		this.dr = driver;
	}
	
	// Actions	
	 public void ClickLogoutLink() {
		 
		 props = p.ReadProperty("propertyfile");
 
	     WebElement wb_lnk_logout = dr.findElement(By.xpath(props.getProperty("lnk_Logout")));	
	     wb_lnk_logout.click();	
	    }

}
