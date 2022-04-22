package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.*;

public class LoginTest {
	
	private WebDriver driver;
	private LoginPage login;
	
	@Before
	public void setUp() throws Exception {
		login = new LoginPage(driver);
		driver = login.chromeDriverConnection();
		//System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		//login.("http://10.42.76.34:8090/geopromotion-jsf-ui/index.xhtml");
		//login.chromeDriverConnection();
		
		login.navigateTo("http://10.42.76.34:8090/geopromotion-jsf-ui/index.xhtml");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void testLogin() throws InterruptedException {
		login.signIn();	
		assertTrue(login.isHomePage());		 
	}
	
}
