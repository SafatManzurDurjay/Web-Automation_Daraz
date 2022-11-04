package webpages;

import org.openqa.selenium.By;

public class Daraz_Home_Page extends Base_Page {
	
   private By SIGNUPLOGINBUTTON = By.xpath("//a[normalize-space()='Signup / Login']");
	
	public Daraz_Login_Page clickONLoginButton() {
		
		clickOnElement(SIGNUPLOGINBUTTON);
		
		return new Daraz_Login_Page();
			
	}
	
	
	

}
