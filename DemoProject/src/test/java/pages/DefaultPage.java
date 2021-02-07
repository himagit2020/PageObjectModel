package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

import utility.ReadProperties;

public class DefaultPage {
	WebDriver dr;
	ReadProperties p = new ReadProperties();  // Object of Read Property Class
	
	Properties props = new Properties(); // Store the returned properties from ReadProperty Class
	
	// PAGE FACTORY IS NOT IMPLEMENTED IN THIS CALL TO USE LOCATORS FROM EXTERNAL PROPERTY FILE

	
	public DefaultPage(WebDriver driver) {
		this.dr = driver;
	}
	
	// Actions
	public void ClickonLink(String linkName) 
	{
		props = p.ReadProperty("propertyfile");
		
		
		//System.out.println(props);
		
		//String result = props.getProperty("lnk_Login");
		//System.out.println(result);
		// Web Elements for this class	
		
		String value = props.getProperty("generic"); // //*[contains(text(),"
		
		System.out.println(value+linkName+"\")]");   //-----//*[contains(text(),"Log in")]
		
	
		WebElement wb_lnk = dr.findElement(By.xpath(value+linkName+"\")]"));	
		wb_lnk.click();    	
	}
		
}
	
	
	
//	public WebElement getElement() {
//		WebElement wb_lnk_login = dr.findElement(By.xpath("//a[@class='ico-login']"));	
//		
//		return wb_lnk_login;
//		
//	}
//			
//			// Actions
//			public void ClickonLoginLink() 
//			{
//				WebElement lnk_login=getElement();
//				lnk_login.click();    	
//			}
//
//}



//
//	// Web Elements for this class	
//	By lnk_login = By.xpath("//a[@class='ico-login']");	
//	
//	
//	public DefaultPage(WebDriver dr) {
//		this.dr = dr;
//	}
//	
//			
//			// Actions
//			public void ClickonLoginLink() {
//				
//				dr.findElement(lnk_login).click();    	
//			}
//
//}