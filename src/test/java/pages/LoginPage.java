package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{
	
	private By userLocator = new By.ByXPath("//input[@id='j_username']");
	private By passLocator = new By.ByXPath("//input[@id='j_password']");
	private By loginBtnLocator = new By.ByXPath("//input[@id='loginButton']");
	private By linkCloseSessionLocator = new By.ByXPath("//tbody/tr[4]/td[1]/a[1]");
	private By imgHomeLocator = new By.ByXPath("//tbody/tr[1]/td[1]/img[1]");

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	public void signIn() {
		
		if(isDisplayed(userLocator)) {
			type("geocom", userLocator);
			type("geocom", passLocator);
			click(loginBtnLocator);
			if(isDisplayed(linkCloseSessionLocator)) {
				click(linkCloseSessionLocator);
				type("geocom", userLocator);
				type("geocom", passLocator);
				click(loginBtnLocator);
			}
			
		}else {
			System.out.println("username textbox not present");
			}
		}
	
	public boolean isHomePage(){
		return isDisplayed(imgHomeLocator);
	}	

}
