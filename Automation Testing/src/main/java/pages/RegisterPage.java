package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase{

	public RegisterPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(name="name")
	WebElement nameTxt;
	
	@FindBy(name="email")
	List<WebElement> emails;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signUpBtn;
	
	@FindBy(id="id_gender1")
	WebElement maleGenderRadioBtn;
	
	@FindBy(id="password")
	WebElement passwordTxt;
	
	@FindBy(id="days")
	WebElement daysList;
	
	@FindBy(id="months")
	WebElement monthsList;
	
	@FindBy(id="years")
	WebElement yearsList;
	
	@FindBy(id="newsletter")
	WebElement newsLetterCheckBox;
	
	@FindBy(id="optin")
	WebElement specialOfferCheckBox;
	
	@FindBy(id="first_name")
	WebElement firstNameTxt;
	
	@FindBy(id="last_name")
	WebElement lastNameTxt;
	
	@FindBy(id="company")
	WebElement companyTxt;
	
	@FindBy(id="address1")
	WebElement addressTxt1;
	
	@FindBy(id="address2")
	WebElement addressTxt2;
	
	@FindBy(id="country")
	WebElement countryList;
	
	@FindBy(id="state")
	WebElement stateTxt;
	
	@FindBy(id="city")
	WebElement cityTxt;
	
	@FindBy(id="mobile_number")
	WebElement mobileNumberTxt;
	
	@FindBy(id="zipcode")
	WebElement zipcodeTxt;
	
	@FindBy(css="#form > div > div > div > div.login-form > form > button")
	WebElement createAccountBtn;
	
	@FindBy(css="#form > div > div > div:nth-child(3) > div > h2")
	public WebElement newUserMessage;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
	public WebElement enterAccountMessage;
	
	@FindBy(css="#form > div > div > div > h2 > b")
	public WebElement successMessage;
	
	@FindBy(linkText = "Continue")
	WebElement continueBtn;
	
	@FindBy(partialLinkText = "Logged in")
	public WebElement loggedInLink;
	
	@FindBy(tagName = "li")
	List<WebElement> navBarLinks;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/h2/b")
	public WebElement deleteSucess;
	
	@FindBy(css="#form > div > div > div:nth-child(3) > div > form > p")
	public WebElement failedMessaee;
	
	public void openRegisteraionPage(String name , String email) {
		nameTxt.sendKeys(name);
		emails.get(1).sendKeys(email);
		
		signUpBtn.click();
	}
	
	public void enterAccountInformation(String password,int day,String month,
			String year,String firstName,String lastName,
			String company,String address1,String address2,
			String country,String state,String city,String zipCode,
			String mobileNumber) {
		
		maleGenderRadioBtn.click();
		passwordTxt.sendKeys(password);
		
		Select makeDaysList = new Select(daysList);
		Select makeMonthsList = new Select(monthsList);
		Select makeYearsList = new Select(yearsList);
		Select makeCountryList = new Select(countryList);
		
		makeDaysList.selectByIndex(day);
		makeMonthsList.selectByVisibleText(month);
		makeYearsList.selectByValue(year);
		
		newsLetterCheckBox.click();
		specialOfferCheckBox.click();
		
		firstNameTxt.sendKeys(firstName);
		lastNameTxt.sendKeys(lastName);
		companyTxt.sendKeys(company);
		
		addressTxt1.sendKeys(address1);
		addressTxt2.sendKeys(address2);
		
		makeCountryList.selectByVisibleText(country);
		
		stateTxt.sendKeys(state);
		
		cityTxt.sendKeys(city);
		zipcodeTxt.sendKeys(zipCode);
		
		mobileNumberTxt.sendKeys(mobileNumber);
		
		createAccountBtn.click();
		
	}
	
	public void continueAccount()
	{
		continueBtn.click();
	}
	
	public void deleteAccount() {
		navBarLinks.get(4).click();
	}
}