package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class ProductCheckout {
	WebDriver dr;
	
	Actions action; 
	
	// Web Elements for this class	
	
	@FindBy(xpath="(//a[@href='/electronics'])[1]")
			WebElement Electronics;
	
	@FindBy(xpath="(//a[@href='/cell-phones'][contains(.,'Cell phones')])[1]")
	WebElement Cellphones;
	
	@FindBy(xpath="//h1[contains(.,'Cell phones')]")
	WebElement findcellpage;
	
	@FindBy(xpath="(//input[@type='button'])[2]")
	WebElement ClickCart;
	
	@FindBy(xpath="//span[contains(.,'Shopping cart')]")
	WebElement Shoppingcart;
	
	@FindBy(xpath="//button[@id='checkout']")
	WebElement Checkout;
	
	@FindBy(xpath="//*[@class='ui-dialog-title']")
	WebElement VerifyTermService;
	
	@FindBy(xpath="//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
	WebElement ClosexMArrk;
	
	@FindBy(xpath="(//*[@type='checkbox'])[2]")
	WebElement CheckboxAgree;
	
	
	public ProductCheckout(WebDriver driver) {
		this.dr = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions for this class
	public void HoverElectronics() {
		action = new Actions(dr);
		action.moveToElement(Electronics).perform();
		
	}
	
	public void ClickCellphones() {
		Cellphones.click();
	}
		public String verifycellpage() {
			return findcellpage.getText();
			
		}
		
		public void ClickaddCart() {
			ClickCart.click();
		}
		
//		public void verifyshoppingcart() {
//			Shoppingcart.findElement((By)Shoppingcart);
//		}
		public void  ClickShoppingcart() {
			Shoppingcart.click();
					}
		public void ClickCheckout() {
			Checkout.click();
		}
		public String VerifyTermService() {
			String abc =  VerifyTermService.getText();	
			return abc;
		}
		
		public void CloseXmark() {
			ClosexMArrk.click();
		}
		
		public void SelectCheckmark() {
			CheckboxAgree.click();
		}
	}
