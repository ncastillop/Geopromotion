package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CreatePromotionPage extends Base{
	
	private WebDriver driver;
	private WebDriverWait wait; 
	
	private String promotionLocator = ("//div[@id='dropMenuForm:j_id11_span']");
	private String newPromotionLocator = ("//span[@id='dropMenuForm:j_id12:anchor']");
	private String createPromotionPage = ("//div[@id='promotionTemplatePanel_header']");

	private String namePromotionLocator = ("//body[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/center[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]");
	private String descriptionPromotionLocator = ("//body[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/center[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/textarea[1]");
	private String termsPromotionsLocator = ("//td[@id='mainPromotionForm:conditionsTab_lbl']");
	private String conditionFieldsLocator = ("//img[@id='mainPromotionForm:conditionFields:conditionsTree:rootElement:0::j_id465:handle:img:collapsed']");
	private String addFilterLocator = ("//input[@id='mainPromotionForm:conditionFields:addFilterButton']");
	private String clientLocator = ("//td[@id='mainPromotionForm:conditionFields:conditionsTree:rootElement:0:elements:0::j_id467:text']");
	private String addConditionLocator = ("//input[@id='mainPromotionForm:conditionFields:conditionButton']");
	private String valueProductLocator = ("//input[@id='mainPromotionForm:conditionFields:valueUI']");
	private String productLocator = ("//td[@id='mainPromotionForm:conditionFields:conditionsTree:rootElement:0:elements:1::j_id467:text']");
		
	public CreatePromotionPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void goToNewPromotion() throws InterruptedException {
		hoverOverElement(promotionLocator);
		click(newPromotionLocator);
	}
	
	public boolean isCreatePromotionPage() throws InterruptedException{
		return isDisplayed(createPromotionPage);
	}	
	
	public void createPromotion() throws InterruptedException {
		type("Promo Robot", namePromotionLocator);
		type("Promo Robot", descriptionPromotionLocator);
		click(termsPromotionsLocator);	
		click(conditionFieldsLocator);	
		click(clientLocator);
		click(addConditionLocator);	
		click(productLocator);
		type("4848", valueProductLocator);
		click(addFilterLocator);
		Thread.sleep(4000);
		click(addConditionLocator);
	}
	
	

}
