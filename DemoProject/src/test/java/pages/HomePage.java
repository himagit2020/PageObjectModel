package pages;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ReadProperties;

public class HomePage {
	
	WebDriver dr;
	
	ReadProperties p = new ReadProperties();  // Object of Read Property Class
	
	Properties props = new Properties(); // Store the returned properties from ReadProperty Class
	
//	@FindBy(xpath="/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
//	WebElement lnk_Logout;
	
	@FindBy(xpath="(//a[@href='/customer/info'])[1]")
	WebElement lnk_ActName;
	
	public HomePage(WebDriver driver) {
		this.dr = driver;
		PageFactory.initElements(driver, this);
	}
	
	
//	 public void ClickLogoutLink() {
//	    	//  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();   
//	    	lnk_Logout.click();	
//	    }
	
	public void VerifyHomepageContent() {
		props = p.ReadProperty("assertdatafile");
		
		String actName = lnk_ActName.getTagName();
		String expName = props.getProperty("useract");
		System.out.println(actName + "    " + expName);
		
		
		Assert.assertEquals(expName, actName);
	}
	
}
