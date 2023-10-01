package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBasic {
	public WebDriver driver;

	public void openWebsite(String url) {
		String localDir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", localDir + "\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
	}

	public void closeBrowser() {
		driver.quit();// colse toan bo cua so( all tab)
	}

	public void closeCurrentWindows() {
		driver.close();
	}
}
