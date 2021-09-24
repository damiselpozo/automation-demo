package ejemplo.plataforma;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class LoginTest {
	private WebDriver driver;
	  
	  LoginPage loginPage;
	  
	  @Before
	  public void setUp() throws Exception {
	    this.loginPage = new LoginPage(this.driver);
	    this.driver = this.loginPage.chromeDriverConnection();
	    this.driver.manage().window().maximize();
	    this.loginPage.visit("http://dnz01.dynamizeit.com/login");
	  }
	  
	  @After
	  public void tearDown() throws Exception {}
	  
	  @Test
	  public void login() throws InterruptedException {
	    this.loginPage.loginUser();
	    Thread.sleep(2000L);
	    Assert.assertTrue(this.loginPage.isHomePageDisplayed());
	  }

}
