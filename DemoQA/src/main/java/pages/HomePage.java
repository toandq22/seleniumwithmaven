package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class HomePage extends Page {
	// dung ham khoi tao (contrustor)

	By menuElemntXpath = By.xpath("//h5[text()='Elements']");

	public ElementPage clickElements() {
		// scoll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		// click vào element
		driver.findElement(menuElemntXpath).click();
		return new ElementPage(driver);
	}

	public HomePage(WebDriver dr) {
		driver = dr;
		// TODO Auto-generated constructor stub
	}
}
