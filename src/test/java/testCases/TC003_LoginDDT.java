package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC003_LoginDDT extends BaseClass {
	
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="DataDriven")
	public void verify_loginDDT(String email, String pwd, String exp) {
		
		logger.info("*** Started TC_003_LoginDDT *** " );
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		LoginPage lp = new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickButton();
		
		
		MyAccountPage ap = new MyAccountPage(driver);
		boolean targetPage = ap.isMyPageExist();
		
		logger.info("Validation started");
		
		
		{
			if(targetPage==true)
			{
				ap.clickLogout();
				logger.info("pass");
				Assert.assertTrue(true);
				
			}
			else
			{
				logger.info("fail");
				Assert.assertTrue(false);
			}
			
		}
		if(exp.equalsIgnoreCase("Invalid")) 
		{
			if(targetPage==true)
			{
				ap.clickLogout();
				logger.info("fail");

				Assert.assertTrue(false);	

			}
			else
			{
				logger.info("pass");
				Assert.assertTrue(true);

			} 
		}
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		 
		logger.info("*** Finised TC_003_LoginDDT *** " );
	}

	}
	
