package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Home")
	public WebElement homeLink;
	
	@FindBy(linkText = "Signup / Login")
	WebElement SignUpBtn;
	
	@FindBy(linkText = "Cart")
	public WebElement CartLink;
	
	public void openRegisteraionLoginPage() {
		SignUpBtn.click();
	}
	
	public void openHomePage() {
		homeLink.click();
	}
	
	public void openCartPage() {
		CartLink.click();
	}
}