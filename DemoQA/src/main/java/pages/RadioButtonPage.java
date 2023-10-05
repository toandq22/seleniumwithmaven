package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage extends Page {
	public By rdYes = By.xpath("//label[normalize-space()='Yes']");
	public By rdImressive = By.xpath("//label[normalize-space()='Impressive']");
	public By rdNo = By.xpath("//label[normalize-space()='No']");

	By strLike = By.xpath("//p[@class='mt-3']");

	public RadioButtonPage(WebDriver dr) {
		driver = dr;
	}

	public boolean isRadioUnchecked() {
		if (!driver.findElement(rdYes).isSelected() && !driver.findElement(rdImressive).isSelected()
				&& driver.findElement(rdNo).isDisplayed()) {
			return true;
		}
		return false;
	}

	public void clickRadido(By loacator) {
		driver.findElement(loacator).click();

	}

	public String getRadioText() {
		return driver.findElement(strLike).getText();
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

}
