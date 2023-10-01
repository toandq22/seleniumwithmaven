package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ElementPage;
import pages.HomePage;
import pages.RadioButtonPage;

public class RadioButtonTest extends TestCase {
	By rdYes = By.xpath("//label[normalize-space()='Yes']");
	By rdImressive = By.xpath("//label[normalize-space()='Impressive']");
	By rdNo = By.xpath("//label[normalize-space()='No']");

	@Test
	public void doTC03() throws InterruptedException {
		System.out.println("doquoctoan");
		openWebsite();

		// click vao phan tu element
		HomePage homePage = new HomePage(testBasic.driver);
		ElementPage elementPage = homePage.clickElements();

		// click in checkboxmenu
		RadioButtonPage radioButtonPage = elementPage.clickRadioButtonMenu();
		System.out.println("ket qua " + radioButtonPage.isLoadRadio());
		Assert.assertTrue(radioButtonPage.isLoadRadio());
		radioButtonPage.clickRadido(rdYes);
		if (radioButtonPage.getElement(rdYes).isSelected()) {
			String str1 = "You have selected Yes";
			Assert.assertEquals(str1, radioButtonPage.getResut());
		}

		Thread.sleep(1000);
		radioButtonPage.clickRadido(rdImressive);
		if (radioButtonPage.getElement(rdYes).isSelected()) {
			String str2 = "You have selected Impressive";
			Assert.assertEquals(str2, radioButtonPage.getResut());
		}

	}

}
