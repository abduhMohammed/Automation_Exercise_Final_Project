package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class Login_negativeScenario extends TestBase {
	HomePage homeObject = new HomePage(driver);
	LoginPage loginObject = new LoginPage(driver);
	
  @Test
  public void testLogin_CorrectUsernameAndPassword() throws InterruptedException {
	  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color"));
	  homeObject.openRegisteraionLoginPage();
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("Login to your account", loginObject.loginMessage.getText());
	  
	  loginObject.userCanLogin("abdelrahmanosama7651111@gmail.com", "123456789");
	  
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("Your email or password is incorrect!", loginObject.failedMessage.getText());
  }
}