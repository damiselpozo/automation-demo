package ejemplo.plataforma;

import org.openqa.selenium.WebDriver;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SalesFlowTraditionalConsumerLoans extends Base {

	By userLocator = By.name("userName");

	By passLocator = By.xpath("//input[@name='password']");

	By loginBtnLocator = By.xpath("//button[@color ='primary']");

	By homeLoginLocator = By.xpath("//h4");

	By loginSucessLocator = By.xpath("//a[@type='button']");

	By comertialOffertLocator = By
			.xpath("/html/body/app-root/div/div[2]/div/div[1]/icon-side-navbar/div/div[4]/div/img");

	By homeSalesLocator = By.xpath("//th[text()='Nombre']");

	By salesTraditConsuLocator = By.xpath("//div[text()='Produbanco Crédito Consumo Tradicional' and @class=\"link\"]");

	By creditAmountLocator = By.xpath("//input[@placeholder='Monto del crand @id='mat-input-0']");

	By creditFeeLocator = By.xpath("//input[@placeholder='Cuota del Crand @id='mat-input-1']");

	By dateBirthLocator = By.xpath("//input[@placeholder='Fecha de Nacimiento' and @id='mat-input-2']");

	By planTypeLocator = By.xpath("//*[@id='mat-select-0']");

	By planTypeTitularOpcionLocator = By.xpath("//*[@id='mat-option-0']/span");

	By monthsTermLocator = By.xpath("//*[@id='mat-select-1']");

	By monthsTerm24OpcionLocator = By.xpath("//*[@id='mat-option-578']/span");

	By quoteBtnLocator = By.xpath("//button[text()=' Cotizar ']");

	By selectQuoteLocator = By.xpath("//*[@id=\"grdResults\"]/div/div/table/tbody/tr/td[1]/div");

	By nexBtnLocator = By.xpath("//button[text()=' Siguiente ']");

	By datasecuredLocator = By.xpath("//label[text()='Captura de Información']");

	By documenttypeLocator = By.xpath("//*[@id='mat-select-2']");

	By documentTypeOpcionLocator = By.xpath("//*[@id=\"mat-option-2\"]/span");

	By documentLocator = By.xpath("//input[@id='mat-input-3']");

	By lastNameLocator = By.xpath("//input[@id='mat-input-4']");

	By lastName2Locator = By.xpath("//input[@id='mat-input-5']");

	By firstNameLocator = By.xpath("//input[@id='mat-input-6']");

	By secondNameLocator = By.xpath("//input[@id='mat-input-7']");

	By phoneLocator = By.xpath("//input[@id='mat-input-8']");

	By mobileLocator = By.xpath("//input[@id='mat-input-9']");

	By emailLocator = By.xpath("//input[@id='mat-input-10']");

	By sexLocator = By.xpath("//*[@id='mat-select-3']");

	By sexOpcionLocator = By.xpath("//*[@id=\"mat-option-4\"]/span");

	By civilStatusLocator = By.xpath("//*[@id='mat-select-4']");

	By civilStatusOpcionLocator = By.xpath("//span[text()=' SOLTERO ']");

	By professionLocator = By.xpath("//*[@id='mat-select-5']");

	By professionOpcionLocator = By.xpath("//span[text()=' ANALISTA PROGRAMADOR  ']");

	By nationalityLocator = By.xpath("//*[@id='mat-select-7']");

	By nationalityOpcionLocator = By.xpath("//span[text()=' Ecuador ']");

	By provinceLocator = By.xpath("//*[@id='mat-select-8']");

	By provincePichinchaOpcionLocator = By.xpath("//*[@id=\"mat-option-1101\"]/span");

	By cityLocator = By.xpath("//*[@id='mat-select-9']");

	By cityQuitoOpcionLocator = By.xpath("//*[@id=\"mat-option-1113\"]/span");

	By mainStreetLocator = By.xpath("//input[@id='mat-input-13']");

	By numberLocator = By.xpath("//input[@id='mat-input-14']");

	By secondaryStreetLocator = By.xpath("//input[@id='mat-input-15']");

	By IdProcedureLocator = By.xpath("//input[@id='mat-input-16']");

	By next2BtnLocator = By.xpath("//button[text()=' Siguiente ']");

	By suredBillingLocator = By.xpath("//*[@id='mat-select-11']");

	By selectSuredBillingLocator = By.xpath("//*[@id=\"mat-option-1118\"]/span");

	By confirmationPageLocator = By.xpath("//label[text()='Detalles del producto']");

	By sendBtnLocator = By.xpath("//button[text()=' Enviar ']");

	By resultsPageLocator = By.xpath("//label[text()='Documentos emitidos']");

	By exitBntLacator = By.xpath("//button[text()=' Salir ']");

	public SalesFlowTraditionalConsumerLoans(WebDriver driver) {
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

	public void step1CommercialOffersFlow() throws InterruptedException {
		if (isDisplayed(this.loginSucessLocator).booleanValue()) {
			findElement(this.comertialOffertLocator).click();
		} else {
			System.out.print("Register pages was not found");
		}
	}

	public void step2GoSalesProd() throws InterruptedException {
		if (isDisplayed(this.homeSalesLocator).booleanValue()) {
			findElement(this.salesTraditConsuLocator).click();
		} else {
			System.out.print("pages was not found");
		}
	}

	public void step3Quote() {
		type("10000", this.creditAmountLocator);
		type("120", this.creditFeeLocator);
		type("30/03/1986", this.dateBirthLocator);
		findElement(this.planTypeLocator).click();
		findElement(this.planTypeTitularOpcionLocator).click();
		findElement(this.monthsTermLocator).click();
		findElement(this.monthsTerm24OpcionLocator).click();
		findElement(this.quoteBtnLocator).click();
	}

	public void step4SelectQuote() {
		findElement(this.selectQuoteLocator).click();
		findElement(this.nexBtnLocator).click();
	}

	public void step5DataSecured() throws InterruptedException {
		if (isDisplayed(this.datasecuredLocator).booleanValue()) {
			findElement(this.documenttypeLocator).click();
			findElement(this.documentTypeOpcionLocator).click();
			type("1713707246", this.documentLocator);
			WebElement element = findElement(this.documentLocator);
			element.sendKeys(new CharSequence[] { (CharSequence) Keys.TAB });
		} else {
			System.out.print("Date secured pages was not found");
		}
	}

	public void step6DataSecured() throws InterruptedException {
		String lastNameValue = getValue(this.lastNameLocator);
		if (lastNameValue == null || lastNameValue.trim() == "") {
			type("Pozo", this.lastNameLocator);
			type("Pozo", this.lastName2Locator);
			type("Damisel", this.firstNameLocator);
			type("Ina", this.secondNameLocator);
			type("2222222", this.phoneLocator);
			type("0998101365", this.mobileLocator);
			type("dpozo@equivida.com", this.emailLocator);
			findElement(this.sexLocator).click();
			findElement(this.sexOpcionLocator).click();
			findElement(this.civilStatusLocator).click();
			findElement(this.civilStatusOpcionLocator).click();
			findElement(this.professionLocator).click();
			findElement(this.professionOpcionLocator).click();
			findElement(this.nationalityLocator).click();
			findElement(this.nationalityOpcionLocator).click();
			Thread.sleep(2000L);
			findElement(this.provinceLocator).click();
			findElement(this.provincePichinchaOpcionLocator).click();
			Thread.sleep(2000L);
			findElement(this.cityLocator).click();
			findElement(this.cityQuitoOpcionLocator).click();
			type("calle principal", this.mainStreetLocator);
			type("N123", this.numberLocator);
			type("calle secundaria", this.secondaryStreetLocator);
			goToStep7();
		} else {
			findElement(this.professionLocator).click();
			findElement(this.professionOpcionLocator).click();
			goToStep7();
		}
	}

	private void goToStep7() {
		long saleId = (new Date()).getTime();
		type(String.valueOf(saleId), this.IdProcedureLocator);
		WebElement element = findElement(this.IdProcedureLocator);
		element.sendKeys(new CharSequence[] { (CharSequence) Keys.TAB });
		List<WebElement> next = findElements(this.next2BtnLocator);
		((WebElement) next.get(1)).click();
	}

	public void step7StatementInsurability() {
		List<WebElement> next = findElements(this.next2BtnLocator);
		((WebElement) next.get(2)).click();
	}

	public void step8Billing() throws InterruptedException {
		findElement(this.suredBillingLocator).click();
		findElement(this.selectSuredBillingLocator).click();
		List<WebElement> next = findElements(this.next2BtnLocator);
		((WebElement) next.get(3)).click();
	}

	public void step9Confirmation() {
		if (isDisplayed(this.confirmationPageLocator).booleanValue()) {
			findElement(this.sendBtnLocator).click();
		} else {
			System.out.print("Confirmation pages was not found");
		}
	}

	public void step10Results() {
		if (isDisplayed(this.resultsPageLocator).booleanValue()) {
			System.out.println("ingreso");
		} else {
			System.out.print("Results pages was not found");
		}
	}

}
