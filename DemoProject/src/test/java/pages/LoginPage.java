package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.ReadProperties;

public class LoginPage {
	WebDriver dr;
	ReadProperties p = new ReadProperties();
	Properties props = new Properties();
	
	// Web Elements for this class	
	@FindBy(id="Email")
	WebElement txtbx_usremail;
	
	@FindBy(id="Password")
	WebElement txtbx_usrpwd;	
	
	@FindBy(xpath="(//input[@type='submit'])[2]")
	WebElement btn_Login;
	

	
	
	
	public LoginPage(WebDriver driver) {
		this.dr = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Actions for this class	
    public void enterUserEmail() {  
    	props = p.ReadProperty("testdatafile");
    	txtbx_usremail.clear();
		txtbx_usremail.sendKeys(props.getProperty("username"));
    }
    
    
    public void enterUserPassword() {
    	props = p.ReadProperty("testdatafile");
    	txtbx_usrpwd.clear();
		txtbx_usrpwd.sendKeys(props.getProperty("userpassword"));
    }
    
    public void ClickLoginBtn() {
    	// usrpwd.submit();  Example where we are submitting the form. Example -// Using ENTER KEY...
		btn_Login.click();
    }
    
   
    
		
    public String getLoginPageTitle() 
	{
		
		String title = dr.getTitle();
		
		return title;
	}
				
					       
		      	     
		        

}