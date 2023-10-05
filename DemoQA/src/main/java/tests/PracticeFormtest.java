package tests;

import org.testng.annotations.Test;

import pages.FormsPage;
import pages.HomePage;
import pages.PracticeFormsPage;

public class PracticeFormtest extends TestCase {
	@Test
	public void doTC01() {
		String fistName = "nana";
		HomePage homePage = new HomePage(testBasic.driver);
		FormsPage formsPage = homePage.clickForms();
		PracticeFormsPage practiceFormsPage = formsPage.clickPracticeFormsPage();

		practiceFormsPage.testBasic.inputText(fistName, practiceFormsPage.pbFistName);
		practiceFormsPage.testBasic.clickRadioButtonByLabel("Male");

	}
}
