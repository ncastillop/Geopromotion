package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	//Retorna un elemento web
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
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
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	//Dar click a un elemento
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	//Pregunta si el elemneto esta visible en la pagina
	public boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	//Visita una url
	public void navigateTo(String url) {
		driver.get(url);
	}
	
	public void hoverOverElement(By locator) {
		WebElement element = driver.findElement(locator);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	
}
