package tests;

import org.testng.annotations.BeforeTest;

import common.TestBasic;

public class TestCase {
	// Innerhit has-a
	public TestBasic testBasic = new TestBasic();

	@BeforeTest
	public void openWebsite() {
		testBasic.openWebsite("https://demoqa.com/");
	}
}
