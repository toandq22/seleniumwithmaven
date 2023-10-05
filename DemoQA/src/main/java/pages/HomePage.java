package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
	// dung ham khoi tao (contrustor)

	By menuElemntXpath = By.xpath("//h5[text()='Elements']");
	By menuFormXpath = By.xpath("//*[name()='path' and contains(@d,'M17 21h-10')]");

	public ElementPage clickElements() {
		// scoll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// click vào element
		driver.findElement(menuElemntXpath).click();
		return new ElementPage(driver);
	}

	public FormsPage clickForms() {
		// scoll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// click vào element
		driver.findElement(menuFormXpath).click();
		return new FormsPage(driver);
	}

	public HomePage(WebDriver dr) {
		driver = dr;
		// TODO Auto-generated constructor stub
	}
}
