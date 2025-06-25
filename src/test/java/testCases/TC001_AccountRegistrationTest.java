package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC001_AccountRegistrationTest extends BaseClass {
	
	@Test(groups={"Regression","Master"})
	public void verify_Registration() {
		
		logger.info("*** Started TC_001 ***");
		
		try
		{
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on My  Account");
		
		hp.clickRegister();
		logger.info("Clicked on Register link");
		
		AccountRegistrationPage arp = new AccountRegistrationPage(driver);
		logger.info("Providing customer details");
		arp.setFirstName(randomString().toUpperCase());
		arp.setLastName(randomString().toUpperCase());
		arp.setEmail(randomString()+"@gmail.com");
		arp.setTelephone(randomNumber());
		
		String password = randomPassword();
		arp.setPassword(password);
		arp.setConfirnPassword(password);
		
		arp.setPrivacyPolicy();
		arp.clickContinue();
		
		String confmsg = arp.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!");
		}
		catch(Exception e)
		{
			logger.error("Test Failed");
			logger.debug("Debug Logs");
			Assert.fail();
		}
		logger.info("*** End TC_001 ***");
	
		}
	
	
	
	
}
