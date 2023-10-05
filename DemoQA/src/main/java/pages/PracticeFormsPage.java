package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeFormsPage extends Page {
	public By pbFistName = By.id("fistName");
	public By pbLastName = By.id("lastName");
	public By pbEmail = By.id("userEmail");
	public By pbNumber = By.id("userNumber");
	public By pbDOB = By.id("dateOfBirthInput");
	public By pbSubject = By.id("subjectContainer");
	public By btnChooseFile = By.id("uploadPicture");
	public By btnCurrentAddress = By.id("currentAdress");

	String selectMonth = "//option[text()='@params']";
	String selectDay = "//div[text()='@params']";
	String selectYear = "//option[text()='@params']";

	public void selectYear(String year) {
		String xpathYear = selectYear.replace("@params", year);
		driver.findElement(By.xpath(xpathYear)).click();
	}

	public void selectDay(String day) {
		String xpathDay = selectDay.replace("@params", day);
		driver.findElement(By.xpath(xpathDay)).click();
	}

	public void selectMonth(String month) {
		String xpathMonth = selectMonth.replace("@params", month);
		driver.findElement(By.xpath(xpathMonth)).click();
	}

	public PracticeFormsPage(WebDriver dr) {
		driver = dr;
	}

}
