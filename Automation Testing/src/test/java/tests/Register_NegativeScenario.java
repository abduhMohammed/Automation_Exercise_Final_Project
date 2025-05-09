package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

public class Register_NegativeScenario extends TestBase {
	HomePage homeObject = new HomePage(driver);
	RegisterPage registerObject = new RegisterPage(driver);
  @Test (priority = 2)
  public void Register_ExistEmail() throws InterruptedException {
	  Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color"));

  	homeObject.openRegisteraionLoginPage();
  	Thread.sleep(3000);
  	
  	Assert.assertEquals("New User Signup!", registerObject.newUserMessage.getText());
  	registerObject.userCanRegister("Abdo Mohamed","abdomohamed188@gmail.com");
  	Thread.sleep(3000);
  	
  	Assert.assertEquals("Email Address already exist!", registerObject.failedMessaee.getText());
  }
}