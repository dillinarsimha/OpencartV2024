package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	
	// locators
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtemail;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
		
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	
	// action methods
	
	public void setemail(String email)
	{
		txtemail.sendKeys(email);
	}
	
	public void setpassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void clicklogin()
	{
		btnLogin.click();
	}
	
	
	
	
	

}
