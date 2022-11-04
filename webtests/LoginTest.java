package webtests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import io.qameta.allure.Description;
import utilities.DriverSetup;
import webpages.Daraz_Home_Page;
import webpages.Daraz_Login_Page;

public class LoginTest extends DriverSetup{
	
	Daraz_Home_Page daraz_Home_Page;
	
	Daraz_Login_Page daraz_Login_Page;
	
	@Test(priority = 0, description = "Home Page Loading Test with base URL")
	
	@Description("Test Description: Load website with base URL and maximize the window")
	
	public void TestHomePageUrl() {
		
		daraz_Home_Page = new Daraz_Home_Page();
		getDriver().get("https://www.daraz.com.bd/");
		assertEquals(getDriver().getCurrentUrl(), "https://www.daraz.com.bd/");
		daraz_Home_Page.takescreenshot("Home Page");
		
	}
	@Test
	public void TestHomePageTitle() {
		
		daraz_Home_Page = new Daraz_Home_Page();
		getDriver().get("https://www.daraz.com.bd/");
		assertEquals(getDriver().getTitle(), "Online Shopping in Bangladesh: Order Now from Daraz.com.bd");
		daraz_Home_Page.takescreenshot("Home Page1");
	}
		
	@Test
	public void loginTest() {
		
		getDriver().get("https://www.daraz.com.bd/");
		daraz_Login_Page = daraz_Home_Page.clickONLoginButton();
		//daraz_Login_Page.enterEmail("safatmanzur@gmail.com");
		//daraz_Login_Page.enterPassword("1234114477");
		daraz_Login_Page.doLogin("safatmanzur@gmail.com", "12341144");
		daraz_Login_Page.cliONLoginButton();
		assertEquals(getDriver().getTitle(), "Daraz.com.bd: Online Shopping Bangladesh - Mobiles, Tablets, Home Appliances, TV, Audio &amp; More");
		daraz_Login_Page.takescreenshot("LoginPage");
		
	}
	
}
