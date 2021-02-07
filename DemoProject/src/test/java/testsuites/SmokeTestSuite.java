package testsuites;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.DefaultPage;
import pages.FetchAllLinks;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import pages.ProductCheckout;
import utility.BaseClass;

// Author - Sid
public class SmokeTestSuite<LandingPage> {
	static WebDriver driver = null;
	String url=("http://demowebshop.tricentis.com/"); 
	
	BaseClass bp;
	DefaultPage dp;	
	LoginPage lp;
	HomePage hp;
	LogoutPage userlogout;
	ProductCheckout pc;
	FetchAllLinks fal;
	
	
	
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
    Thread.sleep(2000);  // Let the user actually see something!
	    
}

@Test(priority = 0)
public void VerifyUserLogin() throws Exception {
	
	//dp = new DefaultPage(driver);
	//lp = new LoginPage(driver);	
	fal = new FetchAllLinks(driver);
	
	fal.getLinks();
	
//	dp.ClickonLink("Blog");
//	Thread.sleep(5000);
//	
//	
//	dp.ClickonLink("News");
//	Thread.sleep(5000);
	
	//Step-1 Click on Login Link
//	dp.ClickonLink("Log in");
//	
//	
//	//Step-2 Verify Login Page title
//	String ExpectedTitle ="Demo Web Shop. Login";
//	Assert.assertEquals(ExpectedTitle, lp.getLoginPageTitle());
//	//Step-3 Enter User Name - email
//	lp.enterUserEmail();
//	//Step-4 Enter User Password
//	lp.enterUserPassword();
//	//Step-5 Click on Login Button
//	lp.ClickLoginBtn();	
//	//Step-6 Waiting few seconds ...
//	Thread.sleep(3000);
}

//@Test(priority=1)
//public void VerifyUserAct() throws Exception {
// hp = new HomePage(driver);
// //hp.VerifyHomepageContent();
//}
//@Test(priority=2)
//public void VerifyProductCheckout() throws Exception {
//	pc = new ProductCheckout(driver);
//		pc.HoverElectronics();
//		Thread.sleep(2000);
//		pc.ClickCellphones();
//		String ExpectedTitle = "Cell phones";
//		String actTitle= pc.verifycellpage();
//		Assert.assertEquals(ExpectedTitle, actTitle);
//		pc.ClickaddCart();
////		String ExpectedTitle1 = "Shopping Cart(1)";
////		Assert.assertEquals(ExpectedTitle1, pc.verifyshoppingcart());
//		pc.ClickShoppingcart();
//		pc.ClickCheckout();
//		String getElementText = pc.VerifyTermService();
//		String ExpectedTitle2 = "Terms of service";
//		System.out.println(getElementText);
//		
//		Assert.assertEquals(ExpectedTitle2, getElementText);
//		
//		pc.CloseXmark();
//		pc.SelectCheckmark();
//		pc.ClickCheckout();
//		
//		
//		
//}
//
//@Test(priority=3)
//public void VerifyUserLogout() throws Exception {
//	userlogout = new LogoutPage(driver);
//	
//	//Step-1 Click on Logout Link
//	userlogout.ClickLogoutLink();
//	//Verification Point here
//}


@AfterTest
public void quitdriver() {
	        
		driver.quit();
			}		
}
