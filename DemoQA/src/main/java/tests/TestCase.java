package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import common.TestBasic;

public class TestCase {
	// Innerhit has-a
	public TestBasic testBasic = new TestBasic();

	@BeforeMethod
	public void openWebsite() {
		testBasic.openWebsite("https://demoqa.com/");
	}

	@AfterMethod
	public void closeBrowser() {
		testBasic.closeBrowser();
	}

}
