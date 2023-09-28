package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class TextboxPage extends Page {
	By txtFullName = By.id("userName");
	By txtEmail = By.id("userEmail");
	By txtCurrentAddress = By.id("currentAddress");
	By txtPermanentAddress = By.id("permanentAddress");
	public By btnSubmit = By.id("submit");

	public By lbName = By.id("name");
	public By lbEmail = By.id("email");
	public By lbCurrentAdress = By.xpath("//p[@id='currentAddress']");
	public By lbPermanentAddress = By.xpath("//p[@id='permanentAddress']");

	public TextboxPage(WebDriver dr) {
		driver = dr;
	}

	public void inputFullName(String fullName) {
		driver.findElement(txtFullName).sendKeys(fullName);
	}

	public void inputEmail(String email) {
		driver.findElement(txtEmail).sendKeys(email);
	}

	public void inputCurrentAddress(String currentAddress) {
		driver.findElement(txtCurrentAddress).sendKeys(currentAddress);
	}

	public void inputPermanentAddress(String permanentAddress) {
		driver.findElement(txtPermanentAddress).sendKeys(permanentAddress);
	}

	public void clickOnSubmit() {
//		driver.manage().window().fullscreen();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		driver.findElement(btnSubmit).click();
	}

	public String getTextResult(By element) {
		String result = "";
		String text = driver.findElement(element).getText();
		result = text.substring(text.indexOf(":") + 1);
		return result;
	}

}
