package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class cartTestRegister extends TestBase{
	HomePage homeObject = new HomePage(driver);
	CartPage cartObject = new CartPage(driver);
	LoginPage loginObject = new LoginPage(driver);
	RegisterPage RegisterObjectForCart = new RegisterPage(driver);
	
  @Test
 public void cartRegister() throws InterruptedException {
	  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color"));
	  homeObject.openCartPage();

  	Assert.assertTrue(true, "is empty!");
  	cartObject.openProductsPage();
  	Assert.assertEquals("rgba(255, 165, 0, 1)", cartObject.ProductsLink.getCssValue("color"));
  	JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
  	scrolldown.executeScript("document.evaluate('/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();\n"
  			+ "");
  	cartObject.addToCartBtn();
  	Thread.sleep(3000);
  	cartObject.viewCartBtn();
	Assert.assertEquals("Item", cartObject.cartItem.getText());
	cartObject.ItemBtn();
	Assert.assertEquals("Quantity:", cartObject.productItem.getText());
	driver.navigate().back();
	cartObject.clearCart();
	Thread.sleep(3000);
	cartObject.openProductsPage();
  	scrolldown.executeScript("document.evaluate('/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();\n"
  			+ "");
  	Thread.sleep(3000);
  	cartObject.addToCartBtn();
  	Thread.sleep(3000);
  	cartObject.viewCartBtn();
  	Thread.sleep(3000);
  	cartObject.checkOut();
  	Thread.sleep(3000);
  	cartObject.login();
  	Thread.sleep(3000);  
	Assert.assertEquals("New User Signup!", RegisterObjectForCart.newUserMessage.getText());
	RegisterObjectForCart.userCanRegister("amar","amarazzam50012@gmail.com");
	Thread.sleep(3000);
	
	RegisterObjectForCart.enterAccountInformation("123456789",25,"December","2003","Abdelrahman","Osama","Itworx","Fostat","Elsayeda zeinab","India","aaaaaa","bbbbb","17652","01013468789");
  	Thread.sleep(3000);
  	Assert.assertEquals("ACCOUNT CREATED!", RegisterObjectForCart.successMessage.getText());
	
  	RegisterObjectForCart.continueAccount();
	Thread.sleep(3000);
	
	Assert.assertTrue(RegisterObjectForCart.loggedInLink.getText().contains("Logged in as"));
	  homeObject.openCartPage();
	  Thread.sleep(2000);
	  cartObject.checkOut();
	  Thread.sleep(3000);

	  Assert.assertEquals("Address Details", cartObject.checkOut.getText());
	  scrolldown.executeScript("document.evaluate('//*[@id=\"cart_items\"]/div/div[7]/a', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.scrollIntoView();\n"
	  			+ "");
	  cartObject.placeOrder();
	  Thread.sleep(3000);
	  Assert.assertTrue(cartObject.payment.getText().contains("Payment"));
	  cartObject.cardInfo("amar" , "1234567891234567" , "123" , "07" , "2025");
	  Thread.sleep(2000);
	  Assert.assertEquals("Congratulations! Your order has been confirmed!" , cartObject.orderPlaced.getText());
	  cartObject.Continue();
	  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color"));
  }
}