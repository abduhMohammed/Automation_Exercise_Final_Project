package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {
  	JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
  	
	public CartPage(WebDriver driver) {
		super(driver);
	
	}
	
	@FindBy(xpath="//*[@id=\"empty_cart\"]/p/b")
	public WebElement CartMessage;	
	
	@FindBy(xpath = "//*[@id=\"empty_cart\"]/p/a/u")
	public WebElement HereBtn;
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	public WebElement ProductsLink;
	
	@FindBy(xpath = "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
	public WebElement addToCart;
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[3]/button")
	public WebElement continueShopping;
	
	@FindBy(xpath = "//*[@id=\"product-1\"]/td[2]/h4/a")
	public WebElement productName;
	
	@FindBy(xpath = "//*[@id=\"cart_info_table\"]/thead/tr/td[1]")
	public WebElement cartItem;	
	
	@FindBy(xpath = "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a/u")
	public WebElement viewCart;
	
	@FindBy(xpath = "//*[@id=\"product-1\"]/td[2]/h4/a")
	public WebElement Item;
	
	@FindBy(xpath = "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/label")
	public WebElement productItem;	
	
	@FindBy(xpath = "//*[@id=\"product-1\"]/td[6]/a")
	public WebElement clearCartBtn;
	
	@FindBy(xpath = "//*[@id=\"do_action\"]/div[1]/div/div/a")
	public WebElement CheckOutBtn;
	
	@FindBy(xpath = "//*[@id=\"checkoutModal\"]/div/div/div[2]/p[2]/a/u")
	public WebElement loginBtn;
	
	@FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[2]/h2")
	public WebElement checkOut;
	
	@FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[7]/a")
	public WebElement placeOrderBtn;
	
	@FindBy(xpath = "//*[@id=\"cart_items\"]/div/div[2]/h2")
	public WebElement payment;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[1]/div/input")
	public WebElement NameonCardTxt;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[2]/div/input")
	public WebElement cardNumberTxt;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[1]/input")
	public WebElement CVCTxt;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[2]/input")
	public WebElement MonthTxt;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[3]/input")
	public WebElement YearTxt;
	
	@FindBy(id = "submit")
	public WebElement confirmBtn;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/p")
	public WebElement orderPlaced;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
	public WebElement ContinueBtn;
	

	public void openProductsPage() {
		HereBtn.click();
	}
	
	public void addToCartBtn() {
		addToCart.click();
	}
	
	public void continueShoppingBtn() {
		continueShopping.click();
	}
	
	public void viewCartBtn() {
		viewCart.click();
	}
	
	public void productName() {
		productName.click();
	}
	
	public void ItemBtn() {
		Item.click();
	}
	
	public void clearCart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", clearCartBtn);
	}
	
	public void checkOut() {
		CheckOutBtn.click();
	}
	
	public void login() {
		loginBtn.click();
	}
	
	public void placeOrder() {
		placeOrderBtn.click();
	}
	
	public void cardInfo(String name ,String number ,String cvc ,String month ,String year) {
		NameonCardTxt.sendKeys(name);
		cardNumberTxt.sendKeys(number);
		CVCTxt.sendKeys(cvc);
		MonthTxt.sendKeys(month);
		YearTxt.sendKeys(year);
		scrolldown.executeScript("document.evaluate('//*[@id=\"submit\"]', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();\n"
	  			+ "");
		confirmBtn.click();
	}
	
	public void Continue() {
		ContinueBtn.click();
	}
	
}
