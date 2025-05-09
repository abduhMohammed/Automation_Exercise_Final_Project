package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductPage;

public class ProductTest extends TestBase {
	
	
	HomePage homeObj = new HomePage(driver);
	ProductPage productsObj = new ProductPage(driver);
	
  @Test (priority = 1)
  public void TPD() throws InterruptedException {
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)",homeObj.homeLink.getCssValue("color"));
	  
	  homeObj.openPP();
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("ALL PRODUCTS", productsObj.allProductsTxt.getText());
	  Assert.assertTrue(productsObj.productsList.isDisplayed());
	  
	  productsObj.openPD(0);
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(productsObj.productInfo.isDisplayed());
	  Assert.assertTrue(productsObj.productName.isDisplayed());
	  Assert.assertTrue(productsObj.productCategory.isDisplayed());
	  Assert.assertTrue(productsObj.productPrice.isDisplayed());
	  Assert.assertTrue(productsObj.productAvailability.isDisplayed());
	  Assert.assertTrue(productsObj.productCondition.isDisplayed());
	  Assert.assertTrue(productsObj.productBrand.isDisplayed());
	  
	  productsObj.openHP();
	  
  }
  
  @Test (priority = 2)
  public void TPS() throws InterruptedException {
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)",homeObj.homeLink.getCssValue("color"));
	  
	  homeObj.openPP();
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("ALL PRODUCTS", productsObj.allProductsTxt.getText());
	  Assert.assertTrue(productsObj.productsList.isDisplayed());
	  
	  productsObj.typeSearch("Blue Top");
	  productsObj.search();
	  
	  Thread.sleep(3000);
	  
	  JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
	  	scrolldown.executeScript("window.scrollBy(0, 300)", "");
	  
	  Assert.assertEquals("SEARCHED PRODUCTS", productsObj.searchedProductsTxt.getText());
	  
	    for (WebElement product : productsObj.searchedProductsList) {
	        Assert.assertTrue(product.isDisplayed());
	        Assert.assertTrue(product.getText().contains("Blue Top"));
	    }
	    
	    productsObj.openHP();

  }
  
  @Test (priority = 4)
  public void TPC() throws InterruptedException {
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)",homeObj.homeLink.getCssValue("color"));
	  
	  homeObj.openPP();
	  Thread.sleep(3000);
	  
	  Assert.assertTrue(productsObj.Categories.isDisplayed());
	  
	  productsObj.openWC();
	  Thread.sleep(3000);
	  
	  productsObj.openWDC();
	  
	  Assert.assertEquals("WOMEN -  DRESS PRODUCTS", productsObj.WDCTxt.getText());
	  
	  productsObj.openMC();
	  Thread.sleep(3000);
	  
	  productsObj.openMJC();
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("MEN -  JEANS PRODUCTS", productsObj.MJCTxt.getText());
	  
	  productsObj.openHP();
	  
  }
  
  @Test (priority = 3)
  public void TPR() throws InterruptedException {
	  
	  Assert.assertEquals("rgba(255, 165, 0, 1)",homeObj.homeLink.getCssValue("color"));
	  
	  homeObj.openPP();
	  Thread.sleep(3000);
	  
	  Assert.assertEquals("ALL PRODUCTS", productsObj.allProductsTxt.getText());
	  
	  productsObj.openPD(0);
	  Thread.sleep(3000);
	  
	  JavascriptExecutor scrolldown = (JavascriptExecutor) driver;
	  	scrolldown.executeScript("window.scrollBy(0, 300)", "");
	  
	  Assert.assertTrue(productsObj.reviewTxt.isDisplayed());
	  
	  productsObj.addReview("Toni", "Toni@bnu.edu", "Great product");
	  Thread.sleep(3000);
	  
	  productsObj.submitReview();
	  Assert.assertTrue(productsObj.THXTXT.isDisplayed());
	  
	  productsObj.openHP();
	  
  }
  
}