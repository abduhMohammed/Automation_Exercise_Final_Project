package tests;

//import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestBase {
	WebDriver driver = new ChromeDriver();
	String baseURL = "https://automationexercise.com/";
	@BeforeTest
	public void openBrowser() {
		driver.manage().window().maximize();
		driver.navigate().to(baseURL);
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}