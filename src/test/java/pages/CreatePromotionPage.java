package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreatePromotionPage extends Base{
	
	private WebDriver driver;
	
	private By promotionLocator = new By.ByXPath("//div[@id='dropMenuForm:j_id11_span']");
	private By newPromotionLocator = new By.ByXPath("//span[@id='dropMenuForm:j_id12:anchor']");
	private By createPromotionPage = new By.ByXPath("//div[@id='promotionTemplatePanel_header']");
	
	public CreatePromotionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void goToNewPromotion() throws InterruptedException {
		hoverOverElement(promotionLocator);
		//WebDriverWait ewait = new WebDriverWait(driver, 2);
		//ewait.until(ExpectedConditions.visibilityOfElementLocated(newPromotionLocator)).click();
		//Thread.sleep(2000);
		click(newPromotionLocator);
	}
	
	public boolean isCreatePromotionPage(){
		return isDisplayed(createPromotionPage);
	}	
	
	public void createPromotion() {
		
	}
	
	

}
