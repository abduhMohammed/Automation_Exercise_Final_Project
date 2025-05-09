package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Home")
	public WebElement homeLink;
	
	@FindBy(linkText = "Cart")
	public WebElement CartLink;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement productsBTN;
 
	@FindBy(linkText = "Signup / Login")
	WebElement signUBtn;
	
	public void openCartPage() {
		CartLink.click();
	}

	public void openRegisteraionLoginPage() {
		signUBtn.click();
	}
	
	public void openPP() {
		productsBTN.click();
	}
}