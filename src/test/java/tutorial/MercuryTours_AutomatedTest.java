package tutorial;

import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	private WebDriver driver;

	By registrerLinkLocator = By.linkText("REGISTER");

	By registerPegeLocator = By.xpath("//img[@src='images/mast_register.gif']");

	By usernameLocator = By.id("email");

	By passwordLocator = By.name("password");

	By confirmPasswordLocator = By.cssSelector("input[name='confirmPassword']");

	By registerBtnLocator = By.name("submit");

	By userLocator = By.name("userName");

	By passLocator = By.name("password");

	By signInBtnLocator = By.name("submit");

	By homePageLocator = By.xpath("//h3");

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		this.driver = (WebDriver) new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("http://demo.guru99.com/test/newtours/");
	}

	@After
	public void tearDown() throws Exception {
		 this.driver.quit();
	}

	@Test
	public void registerUser() throws InterruptedException {
		this.driver.findElement(this.registrerLinkLocator).click();
		Thread.sleep(2000L);
		if (this.driver.findElement(this.registerPegeLocator).isDisplayed()) {
			this.driver.findElement(this.usernameLocator).sendKeys(new CharSequence[] { "dpozo" });
			this.driver.findElement(this.passwordLocator).sendKeys(new CharSequence[] { "pass1" });
			this.driver.findElement(this.confirmPasswordLocator).sendKeys(new CharSequence[] { "pass1" });
			this.driver.findElement(this.registerBtnLocator).click();
		} else {
			System.out.print("Register pages was not found");
		}
		List<WebElement> fonts = this.driver.findElements(By.tagName("font"));
		Assert.assertEquals("Note: Your user name is dpozo.", ((WebElement) fonts.get(5)).getText());
	}

	@Test
	public void signIn() throws InterruptedException {
		if (this.driver.findElement(this.userLocator).isDisplayed()) {
			this.driver.findElement(this.userLocator).sendKeys(new CharSequence[] { "dpozo" });
			this.driver.findElement(this.passLocator).sendKeys(new CharSequence[] { "pass1" });
			this.driver.findElement(this.signInBtnLocator).click();
			Thread.sleep(2000L);
			Assert.assertTrue(this.driver.findElement(this.homePageLocator).isDisplayed());
		} else {
			System.out.print("username textbox was not present");
		}
	}
}
