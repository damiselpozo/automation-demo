package ejemplo.plataforma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ejemplo.plataforma.Base;


public class LoginPage extends Base{
	
	  By userLocator = By.xpath("//input[@name='userName']");
	  
	  By passLocator = By.xpath("//input[@name='password']");
	  
	  By loginBtnLocator = By.xpath("//button[@color ='primary']");
	  
	  By homeLoginLocator = By.xpath("//h4");
	  
	  By loginSucessLocator = By.xpath("//a[@type='button']");
	  
	  By comertialOffertLocator = By.xpath("/html/body/app-root/div/div[2]/div/div[1]/icon-side-navbar/div/div[4]/div/img");

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	 public void loginUser() throws InterruptedException {
		    if (isDisplayed(this.homeLoginLocator).booleanValue()) {
		      type("juanvazq@gmail.com", this.userLocator);
		      type("Test1234", this.passLocator);
		      click(this.loginBtnLocator);
		    } else {
		      System.out.print("username textbox was not present");
		    } 
		  }
		  
		  public boolean isHomePageDisplayed() {
		    return isDisplayed(this.loginSucessLocator).booleanValue();
		  }
		


}
