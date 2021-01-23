package testsuites;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import pages.DefaultPage;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import utility.BaseClass;

public class SmokeTestSuite<LandingPage> {
	static WebDriver driver = null;
	String url=("http://demowebshop.tricentis.com/");		
	
	BaseClass bp;
	DefaultPage dp;	
	LoginPage lp;
	HomePage hp;
	LogoutPage userlogout;
	
@BeforeTest
@Parameters({"browser"})
public void Setup(String br) throws Exception 
{
	 WebDriver dr=null;
	 driver = dr;
	 
	 bp = new BaseClass(driver);
	 driver=bp.getDriver(br);	
	    
    driver.get(url);
    driver.manage().window().maximize();
    Thread.sleep(5000);  // Let the user actually see something!
	    
}

@Test
public void VerifyUserLogin() throws Exception {
	
	dp = new DefaultPage(driver);
	lp = new LoginPage(driver);	
	//Step-1 Click on Login Link
	dp.ClickonLoginLink();		
	//Step-2 Verify Login Page title
	String ExpectedTitle ="Demo Web Shop. Login";
	Assert.assertEquals(ExpectedTitle, lp.getLoginPageTitle());
	//Step-3 Enter User Name - email
	lp.enterUserEmail();
	//Step-4 Enter User Password
	lp.enterUserPassword();
	//Step-5 Click on Login Button
	lp.ClickLoginBtn();	
	//Step-6 Waiting few seconds ...
	Thread.sleep(3000);
}

@Test
public void VerifyUserAct() throws Exception {
 hp = new HomePage(driver);
 hp.VerifyHomepageContent();
}

@Test
public void VerifyUserLogout() throws Exception {
	userlogout = new LogoutPage(driver);
	
	//Step-1 Click on Logout Link
	userlogout.ClickLogoutLink();
	//Verification Point here
}


@AfterTest
public void quitdriver() {
	        
		driver.quit();
			}		
}
