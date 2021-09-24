package ejemplo.plataforma;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	 private WebDriver driver;
	  
	  public Base(WebDriver driver) {
	    this.driver = driver;
	  }
	  
	  public WebDriver chromeDriverConnection() {
	    System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
	    this.driver = (WebDriver)new ChromeDriver();
	    return this.driver;
	  }
	  
	  public WebElement findElement(By locator) {
	    return this.driver.findElement(locator);
	  }
	  
	  public List<WebElement> findElements(By locator) {
	    return this.driver.findElements(locator);
	  }
	  
	  public String getText(WebElement element) {
	    return element.getText();
	  }
	  
	  public String getText(By locator) {
	    return findElement(locator).getText();
	  }
	  
	  public String getValue(By locator) {
	    return findElement(locator).getAttribute("value");
	  }
	  
	  public void type(String inputText, By locator) {
	    findElement(locator).sendKeys(new CharSequence[] { inputText });
	  }
	  
	  public void click(By locator) {
	    findElement(locator).click();
	  }
	  
	  public Boolean isDisplayed(By locator) {
	    try {
	      return Boolean.valueOf(findElement(locator).isDisplayed());
	    } catch (NoSuchElementException e) {
	      return Boolean.valueOf(false);
	    } 
	  }
	  
	  public void visit(String url) {
	    this.driver.get(url);
	  }
	}



