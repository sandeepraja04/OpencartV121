package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="//*[@id=\"content\"]//h2[1]")
	WebElement msgHeading;
	
	@FindBy(xpath="//aside[@id=\"column-right\"]//*[text()=\"Logout\"]")
	WebElement logoutBtn;

	public boolean isMyPageExist() {
		try {
			return msgHeading.isDisplayed();
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void clickLogout() {
		logoutBtn.click();
	}
}
