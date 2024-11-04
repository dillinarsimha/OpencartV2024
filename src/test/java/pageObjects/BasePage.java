package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	                                             // this webdriver as basepage used in all class 
	WebDriver driver;
	
	
	public 	BasePage(WebDriver driver)             // driver constructor 
	{ 
		this.driver = driver;                     // assigned webdriver to  driver variable  
		PageFactory.initElements(driver,this);    // assigned this driver to pagefactory approach 
	}
	
	
}
