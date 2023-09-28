package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementPage extends Page {
	By menuTextBox = By.xpath("//span[text()='Text Box']");
	By menuCheckBox = By.xpath("//span[text()='Check Box']");

	public TextboxPage clickTextBoxmenu() {
		driver.findElement(menuTextBox).click();
		return new TextboxPage(driver);

	}

	public CheckBoxPage clickCheckBoxMenu() {
		driver.findElement(menuCheckBox).click();
		return new CheckBoxPage(driver);

	}

	public ElementPage(WebDriver dr) {
		driver = dr;
		// TODO Auto-generated constructor stub
	}
}
