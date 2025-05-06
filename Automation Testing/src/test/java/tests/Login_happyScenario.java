package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class Login_happyScenario extends TestBase {
	HomePage homeObject = new HomePage(driver);
	LoginPage loginObject = new LoginPage(driver);
	
  @Test
  public void testLogin_CorrectUsernameAndPassword() throws InterruptedException {
	  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color"));
	  homeObject.openRegisteraionLoginPage();
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("Login to your account", loginObject.loginMessage.getText());
	  
	  loginObject.userCanLogin("amarazzam500@gmail.com", "123");
	  
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(loginObject.loggedInLink.getText().contains("Logged in as"));
	  
	  loginObject.userCanLogout();
	  Thread.sleep(3000);
  }
}