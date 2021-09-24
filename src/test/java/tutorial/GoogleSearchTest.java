package tutorial;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class GoogleSearchTest {
	private WebDriver driver;

	By videoLinkLocator = By.cssSelector("a[href='https://www.youtube.com/watch?v=R_hh3jAqn8M']");

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		this.driver = (WebDriver) new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.get("https://www.google.com/");
	}

	@Test
	public void testGooglePage() {
		WebElement searchbox = this.driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys(new CharSequence[] { "quality-stream Introduccia la Automatizacide Pruebas de Software" });
		searchbox.submit();
		FluentWait fluentWait = (new FluentWait(this.driver)).withTimeout(10L, TimeUnit.SECONDS)
				.pollingEvery(2L, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		Assert.assertTrue(this.driver.findElement(this.videoLinkLocator).isDisplayed());
		System.out.println(this.driver.getTitle());
		Assert.assertEquals("quality-stream Introduccia la Automatizacide Pruebas de Software - Buscar con Google",
				this.driver.getTitle());
	}

	@After
	public void tearDown() {
		this.driver.quit();
	}

}
