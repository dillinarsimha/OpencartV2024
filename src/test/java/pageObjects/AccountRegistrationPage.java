package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	// page object class
	
	
	// Constructor
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//Locators
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastname;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtphonenum;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtconfirmpassword;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkdpolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirmation;
	
	
	
	// action 
	
	public void setFirstName(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	
	public void setLastName(String lname)
	{
		txtLastname.sendKeys(lname);
	}
	
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	
	public void setTelephone(String phonenumber)
	{
		txtphonenum.sendKeys(phonenumber);
	}
	
	public void setPassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	
	public void confirmapassword(String confirmpassword)
	{
		txtconfirmpassword.sendKeys(confirmpassword);
	}
	
	public void setprivacypolicy()
	{
		chkdpolicy.click();
	}
	
	public void continuebutton()
	{
		btncontinue.click();
	}
	
	
	


	// confirmation message 
	
	public String getConfirmationmsg(){
		try {
			return(msgconfirmation.getText());
		}catch (Exception e) {
			return(e.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	
	
}
