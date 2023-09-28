package pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends Page {

	public By cbHome = By.xpath("//label[@for='tree-node-home']/span[1]/*[name()='svg']");
	By lbHomes = By.xpath("//div[@id='result']/span");

	public CheckBoxPage(WebDriver dr) {
		driver = dr;
	}

	public boolean isCheckBoxUnchecked(By locator) {
		boolean result = true;
		String cssClassvalue = driver.findElement(locator).getAttribute("class");
		if (!cssClassvalue.contains("uncheck")) {
			result = false;
		}
		return result;
	}

	public void clickOnHomeCheckBox() {
		driver.findElement(cbHome).click();
	}

	public String getHomeStr() {
		String result = "";
		List<WebElement> lbElements = driver.findElements(lbHomes);
		for (WebElement e : lbElements) {
			result = result + e.getText() + " ";
		}
		return result.trim();
	}

}
