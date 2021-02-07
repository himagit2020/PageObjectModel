package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecuteTests {
	WebDriver driver = null;
	//BeforeClass: The annotated method will be run before the first test method in the current class is invoked.
	@BeforeClass
	public void setup() {
		System.out.println("Before Class Annotation");
	}
	//@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	@BeforeTest
	public void OpenApp() throws Exception {
		String url=("http://www.google.com/");
		String path = "C:\\Users\\anand\\Desktop\\POM_Project\\DemoProject\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.ie.driver", path);
		WebDriver dr = new InternetExplorerDriver();
		driver=dr;
		driver.navigate().to(url);		
		System.out.println("Before Test Annotation");
		//Thread.sleep(5000);
		driver.quit();
	}
  @Test
	public void VerifyUserlogin() {
	  System.out.println(" VerifyUserlogin");
	}
  @Test
	public void VerifyUserlogout() {
	  System.out.println(" VerifyUserlogout");
		
	}
  //@AfterTest: The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
	@AfterTest
	public void CloseApp() {
		System.out.println("After Test Annotation");
		
	}
	//AfterClass: The annotated method will be run after all the test methods in the current class have been run.
	@AfterClass
	public void teardown() {
		System.out.println("After class Annotation");
	}
}
