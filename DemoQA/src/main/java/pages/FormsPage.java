package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormsPage extends Page {
	By menuPracticeForm = By.xpath("//span[normalize-space()='Practice Form']");

	public FormsPage(WebDriver dr) {
		driver = dr;
		// TODO Auto-generated constructor stub
	}

	public PracticeFormsPage clickPracticeFormsPage() {
		driver.findElement(menuPracticeForm).click();
		return new PracticeFormsPage(driver);
	}
}
