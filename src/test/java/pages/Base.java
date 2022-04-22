package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	private static WebDriver driver;
	private static WebDriverWait wait;
	private Actions action;
	
	/*static {
		ChromeOptions chromeOpcions = new ChromeOptions();
		driver = new ChromeDriver(chromeOpcions);
		wait = new WebDriverWait(driver, 10);
	}*/
	
	public Base(WebDriver driver) {
		this.driver = driver;
		//wait = new WebDriverWait(driver,10);
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	//Retorna un elemento web
	public WebElement find(String locator) throws InterruptedException {
		wait = new WebDriverWait(driver,10);
		Thread.sleep(500);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}
	
	//Retorna una lista de elementos web
	public List<WebElement> findElements(By locator) {
		return driver.findElements(locator);
	}
	
	//Devuelve el texto del elemento que paso como paremetro
	public String getTextElement(WebElement element) {
		return element.getText();
	}
	
	//Devuelve el texto del elemento
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	//Escribir sobre un elemento
	public void type(String inputText, String locator) throws InterruptedException {
		find(locator).sendKeys(inputText);
	}
	
	//Dar click a un elemento
	public void click(String locator) throws InterruptedException {
		find(locator).click();
	}
	
	//Pregunta si el elemneto esta visible en la pagina
	public boolean isDisplayed(String locator) throws InterruptedException {
		try {
			return find(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	//Visita una url
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	public void hoverOverElement(String locator) throws InterruptedException {
		WebElement element = find(locator);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	
}
