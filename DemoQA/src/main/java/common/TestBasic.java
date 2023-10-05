package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasic {
	public WebDriver driver;

	public void openWebsite(String url) {
		String localDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", localDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		// driver.manage().window().maximize();

	}

	public void closeBrowser() {
		driver.quit();// dong toan bo
	}

	public void closeCrurentWindows() {
		driver.close();// dong toan bo
	}

	public void closeWindows() {
		driver.quit();
	}

	public void inputText(String text, By locator) {
		driver.findElement(locator).sendKeys(text);
	}

	public void clickRadioButtonByLabel(String radiolabel) {
		String xpath = "//*[text()='" + radiolabel + "']";
		By rdElement = By.xpath(xpath);
		driver.findElement(rdElement).click();
	}
}
