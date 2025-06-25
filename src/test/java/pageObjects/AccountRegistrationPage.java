package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) 
	{
		super(driver);
	
	}
	
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	WebElement txtFirstname;
	
	@FindBy(xpath="//*[@id=\"input-lastname\"]")
	WebElement txtLastname;
	
	@FindBy(xpath="//*[@id=\"input-email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	WebElement txtTelephone;
	
	@FindBy(xpath="//*[@id=\"input-password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@id=\"input-confirm\"]")
	WebElement txtConfirmPassword;
	
	@FindBy(xpath="//*[@name=\"agree\"]")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//*[@value=\"Continue\"]")
	WebElement btncontinue;
	
	@FindBy(xpath="//h1[text()=\"Your Account Has Been Created!\"]")
	WebElement msgConfirmation;
	
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
	
	public void setTelephone(String tel)
	{
		txtTelephone.sendKeys(tel);
	}
	
	public void setPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	
	public void setConfirnPassword(String cnfpsw)
	{
		txtConfirmPassword.sendKeys(cnfpsw);
	}
	
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	
	public void clickContinue()
	{
		btncontinue.click();
	}
	
	public String getConfirmationMsg()
	{
		try {
			return (msgConfirmation.getText());
		}
		catch (Exception e) {
			return (e.getMessage());
		}
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
