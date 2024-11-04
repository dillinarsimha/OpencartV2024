package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	// constructor
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
		
	// Locators 
	
	 @FindBy(xpath="//span[normalize-space()='My Account']")
	 WebElement lnkmyaccount;
	 
	 @FindBy(xpath="//a[normalize-space()='Register']")
	 WebElement lynregister;
	 
	 @FindBy(xpath="//a[normalize-space()='Login']")
	 WebElement linklogin;
	 
	 
	 
	 // action methods
	 
	 
	 public void clickmyaccount()
	 {
		 lnkmyaccount.click(); 
	 }
	 
	 public void clickregistration()
	 {
		 lynregister.click();
	 }
	 
	 public void clicklogin()
	 {
		linklogin.click();
	 }
	 
	 
	
	
	

	
	
	
	
	
	
	
	

	
	
}
