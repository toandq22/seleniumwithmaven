package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CheckBoxPage;
import pages.ElementPage;
import pages.HomePage;

public class CheckBoxTest extends TestCase {
	@Test
	public void doTC02() {
		System.out.println("doquoctoan");
		openWebsite();

		// click vao phan tu element
		HomePage homePage = new HomePage(testBasic.driver);
		ElementPage elementPage = homePage.clickElements();

		// click in checkboxmenu
		CheckBoxPage checkBoxPage = elementPage.clickCheckBoxMenu();
		Assert.assertTrue(checkBoxPage.isCheckBoxUnchecked(checkBoxPage.cbHome));
		checkBoxPage.clickOnHomeCheckBox();
		String expectedHomeStr = "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile";
		String actuaHomeStr = checkBoxPage.getHomeStr();
		Assert.assertEquals(actuaHomeStr, expectedHomeStr);

	}
}
