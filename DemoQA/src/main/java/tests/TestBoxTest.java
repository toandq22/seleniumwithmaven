package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementPage;
import pages.HomePage;
import pages.Page;
import pages.TextboxPage;

public class TestBoxTest extends TestCase {
	public static void main(String[] args) {
		TestBoxTest tc1 = new TestBoxTest();
		tc1.doTC01();
	}
	

	/**
	 * TextBox-TC01
	 */
	@Test
	public void doTC01() {
		// open homepage
        openWebsite();
		// click vao phan tu element
		HomePage homePage = new HomePage(testBasic.driver);

		ElementPage elementPage = homePage.clickElements();
		TextboxPage textboxPage = elementPage.clickTextBoxmenu();
		String inputFullName = "dana";
		String inputEmail = "toan@gmail.com";
		String inputCurrentAddress = "Ha Noi";
		String inputPermanentAddress = "Ha Noi";
		textboxPage.inputFullName(inputFullName);
		textboxPage.inputEmail(inputEmail);
		textboxPage.inputCurrentAddress(inputCurrentAddress);
		textboxPage.scrollToElement(textboxPage.findElementByLocator(textboxPage.btnSubmit));
		textboxPage.inputPermanentAddress(inputPermanentAddress);
		textboxPage.clickOnSubmit();
		textboxPage.scrollToElement(textboxPage.findElementByLocator(textboxPage.lbPermanentAddress));
		String actuaFullName = textboxPage.getTextResult(textboxPage.lbName);
		String actuaEmail = textboxPage.getTextResult(textboxPage.lbEmail);
		String actuaCurrentAddress = textboxPage.getTextResult(textboxPage.lbCurrentAdress);
		String actuaPermanentAddress = textboxPage.getTextResult(textboxPage.lbPermanentAddress);

		Assert.assertEquals(actuaFullName, inputFullName);// chon thu vien testng
		Assert.assertEquals(actuaEmail, inputEmail);
		Assert.assertEquals(actuaCurrentAddress, inputCurrentAddress);
		Assert.assertEquals(actuaPermanentAddress, inputPermanentAddress);

	}
}
