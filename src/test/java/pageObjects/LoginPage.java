package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	@FindBy(xpath="//*[@name=\"email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//*[@name=\"password\"]")
	WebElement txtPassword;
	
	@FindBy(xpath="//*[@value=\"Login\"]")
	WebElement clickLogin;
	
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);	
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);	
	}
	
	public void clickButton() {
		clickLogin.click();	
	}
	
}
