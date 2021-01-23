package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {
	WebDriver dr;
	
	public BaseClass(WebDriver driver) {
		this.dr=driver;
	}
	
	public WebDriver getDriver(String br) throws Exception {
		String path = "C:\\Users\\17209\\eclipse-workspace\\DemoProject\\drivers\\";
		
		if(br.contains("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",path+"chromedriver.exe");
		     dr = new ChromeDriver();
		     
			}
		
			else if(br.contains("ie")) {
				
				System.setProperty("webdriver.ie.driver", path+"IEDriverServer.exe");
				 dr= new InternetExplorerDriver();
			}
			else if(br.contains("firefox")) {
				
				System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
				 dr= new FirefoxDriver();
			}
			else {
				System.out.println("Undefined Browser variable "+br);
				throw new Exception("Undefined browser");
			}
		return dr;
	}

}
