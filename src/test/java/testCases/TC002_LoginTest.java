package testCases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test(groups={"Sanity","Master","Regression"})
	public void verify_login()
	{
		
		logger.info("******Starting TC002_LoginTest****");
		
		 try {
		// Homepage
		logger.info("******clicking on my account & login ****");
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount(); // clicking on my account
		hp.clicklogin();     // clicking on login
		
		// login
		LoginPage lp = new LoginPage(driver);
		lp.setemail(p.getProperty("email"));
		lp.setpassword(p.getProperty("password"));
		lp.clicklogin();
		
		// my account 
		
		MyAccountPage macc = new MyAccountPage(driver); 
		boolean target =macc.ismyaccountPageExists();

		
		Assert.assertTrue(target); // 
		 }catch (Exception e)
		 {
			 Assert.fail();
		  }
			logger.info("******Starting TC002_LoginTest****");
			

	}   

}
