package ejemplo.plataforma;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;


public class SalesFlowTraditionalConsumerLoansTest {

	 private WebDriver driver;
	  
	  SalesFlowTraditionalConsumerLoans salesFlow;
	  
	  @Before
	  public void setUp() throws Exception {
	    this.salesFlow = new SalesFlowTraditionalConsumerLoans(this.driver);
	    this.driver = this.salesFlow.chromeDriverConnection();
	    this.driver.manage().window().maximize();
	    this.salesFlow.visit("http://dnz01.dynamizeit.com/login");
	  }
	  
	  @After
	  public void tearDown() throws Exception {}
	  
	  @Test
	  public void step1CommercialOffersFlow() throws InterruptedException {
	    this.salesFlow.loginUser();
	    Thread.sleep(2000L);
	    this.salesFlow.step1CommercialOffersFlow();
	    Thread.sleep(3000L);
	    this.salesFlow.step2GoSalesProd();
	    Thread.sleep(2000L);
	    this.salesFlow.step3Quote();
	    Thread.sleep(2000L);
	    this.salesFlow.step4SelectQuote();
	    Thread.sleep(2000L);
	    this.salesFlow.step5DataSecured();
	    Thread.sleep(2000L);
	    this.salesFlow.step6DataSecured();
	    Thread.sleep(2000L);
	    this.salesFlow.step7StatementInsurability();
	    Thread.sleep(2000L);
	    this.salesFlow.step8Billing();
	    Thread.sleep(2000L);
	    this.salesFlow.step9Confirmation();
	    Thread.sleep(2000L);
	    this.salesFlow.step10Results();
	  }

}
