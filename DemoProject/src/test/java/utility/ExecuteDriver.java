package utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExecuteDriver {
	WebDriver driver = null;
	String url=("https://www.google.com/");
	
	//@BeforeTest: The annotated method will be run before any test method belonging to the classes inside the <test> tag is run.
	@BeforeTest
	public void OpenApp() throws InterruptedException {
		System.out.println("Opening Application");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anand\\Desktop\\POM_Project\\DemoProject\\drivers\\chromedriver.exe");
	    WebDriver dr = new ChromeDriver();
	    driver = dr;
	    driver.get(url);
	    driver.manage().window().maximize();
	    Thread.sleep(5000);  // Let the user actually see something!
	   
	   
	}
  @Test
	public void VerifyGoogleSearch() throws InterruptedException {
	  System.out.println("Enter a search criteria");
	  WebElement searchBox = driver.findElement(By.name("q"));
	    searchBox.sendKeys("ChromeDriver");
	    searchBox.submit();
	    Thread.sleep(5000);  // Let the user actually see something!
	
		 driver.quit();
	}
	
	}

	


