package pages;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FetchAllLinks {
	
	WebDriver dr;

	public FetchAllLinks(WebDriver driver) {
		this.dr = driver;
	}

	public void getLinks() throws InterruptedException {
		//java.util.List<WebElement> allURLs = dr.findElements((SearchContext) By.tagName("a"));
	    //  System.out.println("Total links on the Wb Page: " + allURLs.size());
		
		 //Get list of web-elements with tagName  - a
		
		//ArrayList<WebElement> ListSet = new ArrayList<WebElement>();
		
		 List<WebElement> allLinks = dr.findElements(By.tagName("a"));
		 
		 int count= allLinks.size();
		 //Traversing through the list and printing its text along with link address
		 for(WebElement link:allLinks)
		 {
			 String tempLink = link.getAttribute("href");
			 System.out.println(tempLink );			 		
		 }
		 
//		 for(int i=0; i<count; i++) {
//			 System.out.println( allLinks.get(i).getAttribute("href").toString());
//			 try {
//				 allLinks.get(i).click();
//				 
//			 } catch(StaleElementReferenceException ste) {
//				 System.out.println(ste.getStackTrace());
//			 }
//		 }
//		 
		 

		 
		 

		 
		 
	      //We will iterate through the list and will check the elements in the list.
//	      java.util.Iterator<WebElement> iterator = allURLs.iterator();
//	      while (iterator.hasNext()) {
//	       String url = iterator.next().getText();
//	       System.out.println(url);
	      }
		// TODO Auto-generated method stub
		
	}


	
	
		
		
		
		// Pass the link name and if it matches then click on it
	

	
//public void getLinks(String linkName) {
//		
//		
//		// Pass the link name and if it matches then click on it
//	}
//
//}
