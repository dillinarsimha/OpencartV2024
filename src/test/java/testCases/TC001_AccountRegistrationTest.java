package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import dev.failsafe.internal.util.Durations;
import jdk.internal.net.http.common.Log;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass  {


	
	
	@Test(groups={"Master", "Regression","sanity"})
	public void verify_account_registration()
	{
		
		logger.info("*****Starting of TC001_AccountRegistrationTest *******");
		// create an homepage object  
		try
		{
		HomePage hp = new HomePage(driver);
			hp.clickmyaccount();
			hp.clickregistration();
			
			// registration page
		AccountRegistrationPage regpage= new AccountRegistrationPage(driver);
		
				
		// random test data
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		regpage.setTelephone(randomeNumber());
		
		// random alphanumbers for password
		
		String password = randomAlphaNumeric();
		// to create ramdon password first need to create password variable bcz evey line of execution its generate data"password" randomly 
		regpage.setPassword(password);
		regpage.confirmapassword(password);
		
		
		regpage.setprivacypolicy();
		regpage.continuebutton();
		
		logger.info("*****validating expected message *******");

		String confrmg = regpage.getConfirmationmsg();
		
		if(confrmg.equals("Your Account Has Been Created!"))
		{
			logger.error("Test failed");
			logger.debug("Debug logs");
			Assert.assertTrue(true);
		
		}
		else
		{
			Assert.fail();
		}
		
		}
		
		catch(Exception e)
		{
			
			Assert.fail();
		}
	
		logger.info("*****Finiehsed  TC001_AccountRegistrationTest *******");

		
				
//		===============================================================	
		 /*	static test data can register only once
		regpage.setFirstName("Dilli");
		regpage.setLastName("Narsimha");
		regpage.setEmail("dillinarsimha23@gmail.com");
		regpage.setTelephone("7095255956");
		regpage.setPassword("123456abc");
		regpage.confirmapassword("123456abc");
		regpage.setprivacypolicy();
		regpage.continuebutton();
		
		String confrmg = regpage.getConfirmationmsg();
		
		Assert.assertEquals(confrmg, "Your Account Has Been Created!"); */


	
	
	}
	
	

}
