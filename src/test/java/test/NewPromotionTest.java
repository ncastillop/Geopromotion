package test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.CreatePromotionPage;
import pages.LoginPage;

public class NewPromotionTest {

	private WebDriver driver;
	private CreatePromotionPage create;
	private LoginPage login;
	
	
	@Before
	public void setUp() throws Exception {
		create = new CreatePromotionPage(driver);
		driver = create.chromeDriverConnection();
		//login.("http://10.42.76.34:8090/geopromotion-jsf-ui/index.xhtml");
		
		create.navigateTo("http://10.42.76.34:8090/geopromotion-jsf-ui/index.xhtml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {	
		login = new LoginPage(driver);
		login.signIn();
		create.goToNewPromotion();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		create.createPromotion();
		
		//assertTrue(create.isCreatePromotionPage());
	}

}
