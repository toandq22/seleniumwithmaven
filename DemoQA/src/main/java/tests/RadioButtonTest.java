package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementPage;
import pages.HomePage;
import pages.RadioButtonPage;

public class RadioButtonTest extends TestCase {

	@Test
	public void doTC03() {

		// click vao phan tu element
		HomePage homePage = new HomePage(testBasic.driver);
		ElementPage elementPage = homePage.clickElements();

		// click in checkboxmenu
		RadioButtonPage radioButtonPage = elementPage.clickRadioButtonMenu();
		System.out.println("ket qua " + radioButtonPage.isRadioUnchecked());
		Assert.assertTrue(radioButtonPage.isRadioUnchecked());

		radioButtonPage.clickRadido(radioButtonPage.rdYes);

		String str1 = "You have selected Yes";
		Assert.assertEquals(str1, radioButtonPage.getRadioText());
		radioButtonPage.clickRadido(radioButtonPage.rdImressive);
		String str2 = "You have selected Impressive";
		Assert.assertEquals(str2, radioButtonPage.getRadioText());

	}

}
