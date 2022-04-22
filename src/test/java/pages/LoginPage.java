package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Base{
	
	private String userLocator = ("//input[@id='j_username']");
	private String passLocator = ("//input[@id='j_password']");
	private String loginBtnLocator = ("//input[@id='loginButton']");
	private String linkCloseSessionLocator = ("//tbody/tr[4]/td[1]/a[1]");
	private String imgHomeLocator = ("//tbody/tr[1]/td[1]/img[1]");

	public LoginPage(WebDriver driver) {
		super(driver);
	
	}
	
	public void signIn() throws InterruptedException {
		
		if(find(userLocator).isDisplayed()){
			type("geocom", userLocator);
			type("geocom", passLocator);
			click(loginBtnLocator);
			if(find(linkCloseSessionLocator).isDisplayed()) {
				click(linkCloseSessionLocator);
				type("geocom", userLocator);
				type("geocom", passLocator);
				click(loginBtnLocator);
			}
			
		}else {
			System.out.println("username textbox not present");
			}
		}
	
	public boolean isHomePage() throws InterruptedException{
		return isDisplayed(imgHomeLocator);
	}	

}
