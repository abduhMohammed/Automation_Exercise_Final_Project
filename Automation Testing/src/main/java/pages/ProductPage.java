package pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase {

	public ProductPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Home")
	public WebElement homeBTN;
	
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/h2")
	public WebElement allProductsTxt;
	
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div")
	public WebElement productsList;
	
	@FindBy(linkText="View Product")
	public List<WebElement> viewProductLink;
	
	@FindBy(className="product-information")
	public WebElement productInfo;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/h2")
	public WebElement productName;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[1]")
	public WebElement productCategory;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/span")
	public WebElement productPrice;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]")
	public WebElement productAvailability;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[3]")
	public WebElement productCondition;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[4]")
	public WebElement productBrand;
	
	@FindBy(id="search_product")
	public WebElement searchInput;
	
	@FindBy(id="submit_search")
	public WebElement searchBtn;
	
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div/h2")
	public WebElement searchedProductsTxt;
	
	@FindBy(xpath="/html/body/section[2]/div/div/div[2]/div")
	public List<WebElement> searchedProductsList;
	
	@FindBy(id="accordian")
	public WebElement Categories;
	
	@FindBy(xpath="//*[@id=\"accordian\"]/div[1]/div[1]/h4/a")
	public WebElement womenCategory;
	
	@FindBy(xpath="//*[@id=\"Women\"]/div/ul/li[1]/a")
	public WebElement dressCategory;
	
	@FindBy(xpath="/html/body/section/div/div[2]/div[2]/div/h2")
	public WebElement WDCTxt;
	
	@FindBy(xpath="//*[@id=\"accordian\"]/div[2]/div[1]/h4/a/span")
	public WebElement menCategory;
	
	@FindBy(xpath="//*[@id=\"Men\"]/div/ul/li[2]/a")
	public WebElement jeansCategory;
	
	@FindBy(xpath="/html/body/section/div/div[2]/div[2]/div/h2")
	public WebElement MJCTxt;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[3]/div[1]/ul/li/a")
	public WebElement reviewTxt;
	
	@FindBy(id="name")
	public WebElement RNInput;
	
	@FindBy(id="email")
	public WebElement REInput;
	
	@FindBy(id="review")
	public WebElement reviewInput;
	
	@FindBy(id="button-review")
	public WebElement submitBTN;
	
	@FindBy(xpath="//*[@id=\"review-section\"]/div/div")
	public WebElement THXTXT;
	
	
	public void openPD(int index) {
		
		JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
	  	scrolldown.executeScript("window.scrollBy(0, 300)", "");
		
		viewProductLink.get(index).click();
	}
	
	public void typeSearch(String productName) {
		searchInput.sendKeys(productName);
	}
	
	public void search() {
		searchBtn.click();
	}
	
	public void openWC() {
		womenCategory.click();
	}
	
	
	public void openWDC() {
		dressCategory.click();
	}
	
	public void openMC() {
		menCategory.click();
	}
	
	public void openMJC() {
		jeansCategory.click();
	}
	
	public void addReview(String name, String email, String review) {
		RNInput.sendKeys(name);
		REInput.sendKeys(email);
		reviewInput.sendKeys(review);
	}
	
	public void submitReview() {
		submitBTN.click();
	}
	
	public void openHP() {
		homeBTN.click();
	}
}