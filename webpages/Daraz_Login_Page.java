package webpages;

import org.openqa.selenium.By;

public class Daraz_Login_Page extends Base_Page{
	
	private By EMAIL = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	private By PASSWORD = By.xpath("//input[@placeholder='Please enter your password']");
	private By LOGIN = By.xpath("//button[@type='submit']");
	
	public void enterEmail(String email) {
		
		writeText(EMAIL, email);
		
	}
	
	public void enterPassword(String password) {
		
		writeText(PASSWORD, password);
	}
	
    public void cliONLoginButton() {
		
		clickOnElement(LOGIN);
	}
    
    public void doLogin(String email, String password) {
    	
    	writeText(EMAIL, email);
    	writeText(PASSWORD, password);
    	cliONLoginButton();
    	   	
    	
    } 
	
}
