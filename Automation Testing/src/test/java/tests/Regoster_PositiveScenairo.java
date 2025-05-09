package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.RegisterPage;

public class Regoster_PositiveScenairo extends TestBase{
	HomePage homeObject = new HomePage(driver);
	RegisterPage registerObject = new RegisterPage(driver);
    @Test
    public void testRegister_NewEmail_MandatoryAndOptional() throws InterruptedException {
    	Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color"));

    	homeObject.openRegisteraionLoginPage();
    	Thread.sleep(3000);
    	
    	Assert.assertEquals("New User Signup!", registerObject.newUserMessage.getText());
    	registerObject.userCanRegister("Abdo Mohamed","abdomohamed18558@gmail.com");
    	Thread.sleep(3000);
    	
    	Assert.assertTrue(registerObject.enterAccountMessage.getText().equalsIgnoreCase("Enter Account Information"));
    	
    	registerObject.enterAccountInformation("123456789",18,"December","2004","Abdo","Mohamed","Itworx","Fostat","Elsayeda zeinab","India","aaaaaa","bbbbb","17652","01013468789");
    	Thread.sleep(3000);
    	Assert.assertEquals("ACCOUNT CREATED!", registerObject.successMessage.getText());
    	
    	registerObject.continueAccount();
    	Thread.sleep(3000);
    	
    	Assert.assertTrue(registerObject.loggedInLink.getText().contains("Logged in as"));
    	registerObject.deleteAccount();
    	
    	Assert.assertEquals("ACCOUNT DELETED!", registerObject.deleteSucess.getText());
    	Thread.sleep(3000);
    	
    	registerObject.continueAccount();
    	Thread.sleep(3000);
    	Assert.assertEquals("rgba(255, 165, 0, 1)", homeObject.homeLink.getCssValue("color"));
    	
    }
}