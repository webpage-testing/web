package visit.ictkerala.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

public class Add_New_Visit_Pages {

	WebDriver driver;

	public Add_New_Visit_Pages(WebDriver driver) {
		this.driver = driver;
	}

	public static void highlightElement(WebDriver driver, WebElement element) {
		// Save the original background color (so we can reset it later)
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String originalStyle = element.getAttribute("style");

		// Apply a temporary highlight style (e.g., yellow background with red border)
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"background-color: yellow; border: 2px solid red;");

		// Optionally, reset the style back to its original state after a delay (e.g., 2
		// seconds)
		try {
			Thread.sleep(1000); // Wait for 1 second to view the highlight
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Reset the element's style back to its original state
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element, originalStyle);
	}

	public boolean show_AddNewVisitButton() {
		boolean _isAddNewVisit;
		WebElement _addNewVisit = driver.findElement(By.xpath("//h1[normalize-space()='Add New Visit']"));
		_isAddNewVisit = _addNewVisit.isDisplayed();
		return _isAddNewVisit;
	}

	public boolean click_AddNewVisitButton() {
		boolean _addVisit;
		WebElement _addNewVisit = driver.findElement(By.xpath("//h1[normalize-space()='Add New Visit']"));
		_addNewVisit.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement _addNewVisitWindow = driver
				.findElement(By.xpath("//div[@class='relative bg-white rounded-lg shadow-2xl']"));
		_addVisit = _addNewVisitWindow.isDisplayed();
		return _addVisit;
	}

	public void addVisit_Page() throws InterruptedException {

		WebElement _addVisitFrame = driver.findElement(By.xpath(
				"		//body/div[@id='root']/div/div[@class='p-4']/main[@class='flex flex-col p-5 bg-gray-100 mt-16 sm:ml-64']/div[4]"));
		_addVisitFrame.isDisplayed();
		_addVisitFrame.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		_addVisitFrame.sendKeys(Keys.TAB);
		WebElement _addVisitInnerFrame = driver.findElement(By.xpath("//h3[normalize-space()='Add Visits']"));
		_addVisitInnerFrame.isDisplayed();
		_addVisitInnerFrame.click();

		WebElement _addVisitInnerFrame_HeaderInst = driver.findElement(By.xpath(
				"//body/div[@id='root']/div/div[@class='p-4']/main[@class='flex flex-col p-5 bg-gray-100 mt-16 sm:ml-64']/div[@id='static-modal']/div[@class='relative p-4 w-full max-w-2xl max-h-full']/div[@class='relative bg-white rounded-lg shadow-2xl']/div[2]"));
		_addVisitInnerFrame_HeaderInst.isDisplayed();
		_addVisitInnerFrame_HeaderInst.click();
		WebElement option1 = driver.findElement(By.xpath("//div[contains(text(), 'ITI vadakara')]"));
		option1.click();

		WebElement _addVisitInnerFrame_HeaderEmp = driver.findElement(By.xpath(
				"//body/div[@id='root']/div/div[@class='p-4']/main[@class='flex flex-col p-5 bg-gray-100 mt-16 sm:ml-64']/div[@id='static-modal']/div[@class='relative p-4 w-full max-w-2xl max-h-full']/div[@class='relative bg-white rounded-lg shadow-2xl']/div[3]"));
		_addVisitInnerFrame_HeaderEmp.isDisplayed();
		_addVisitInnerFrame_HeaderEmp.click();
		WebElement option2 = driver.findElement(By.xpath("//div[contains(text(), 'Manager 1')]"));
		option2.click();

		WebElement _addVisitInnerFrame_HeaderDate = driver.findElement(By.xpath(
				"//body/div[@id='root']/div/div[@class='p-4']/main[@class='flex flex-col p-5 bg-gray-100 mt-16 sm:ml-64']/div[@id='static-modal']/div[@class='relative p-4 w-full max-w-2xl max-h-full']/div[@class='relative bg-white rounded-lg shadow-2xl']/div[4]"));
		_addVisitInnerFrame_HeaderDate.isDisplayed();
		_addVisitInnerFrame_HeaderDate.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='2024-12-25';", _addVisitInnerFrame_HeaderDate);
		highlightElement(driver, _addVisitInnerFrame_HeaderDate);

		WebElement _addVisitInnerFrame_HeaderPurpose = driver.findElement(By.xpath(
				"//body/div[@id='root']/div/div[@class='p-4']/main[@class='flex flex-col p-5 bg-gray-100 mt-16 sm:ml-64']/div[@id='static-modal']/div[@class='relative p-4 w-full max-w-2xl max-h-full']/div[@class='relative bg-white rounded-lg shadow-2xl']/div[5]"));
		_addVisitInnerFrame_HeaderPurpose.isDisplayed();
		highlightElement(driver, _addVisitInnerFrame_HeaderPurpose);

		WebElement _addVisitInnerFrame_HeaderContactPerson = driver.findElement(By.xpath(
				"//body/div[@id='root']/div/div[@class='p-4']/main[@class='flex flex-col p-5 bg-gray-100 mt-16 sm:ml-64']/div[@id='static-modal']/div[@class='relative p-4 w-full max-w-2xl max-h-full']/div[@class='relative bg-white rounded-lg shadow-2xl']/div[6]"));
		_addVisitInnerFrame_HeaderContactPerson.isDisplayed();
		_addVisitInnerFrame_HeaderContactPerson.click();
		highlightElement(driver, _addVisitInnerFrame_HeaderContactPerson);
		WebElement option3 = driver.findElement(By.xpath("//div[contains(text(), 'Aisha (HoD)')]"));
		option3.click();

		WebElement _addVisitInnerFrame_HeaderNotes = driver.findElement(By.xpath(
				"//body/div[@id='root']/div/div[@class='p-4']/main[@class='flex flex-col p-5 bg-gray-100 mt-16 sm:ml-64']/div[@id='static-modal']/div[@class='relative p-4 w-full max-w-2xl max-h-full']/div[@class='relative bg-white rounded-lg shadow-2xl']/div[7]"));
		_addVisitInnerFrame_HeaderNotes.isDisplayed();
		highlightElement(driver, _addVisitInnerFrame_HeaderNotes);

		WebElement _addVisitInnerFrame_DiscussionTopic = driver.findElement(By.xpath(
				"//body/div[@id='root']/div/div[@class='p-4']/main[@class='flex flex-col p-5 bg-gray-100 mt-16 sm:ml-64']/div[@id='static-modal']/div[@class='relative p-4 w-full max-w-2xl max-h-full']/div[@class='relative bg-white rounded-lg shadow-2xl']/div[8]"));
		_addVisitInnerFrame_DiscussionTopic.isDisplayed();
		highlightElement(driver, _addVisitInnerFrame_DiscussionTopic);

		WebElement _addVisitInnerFrame_Submitbtn = driver.findElement(By.xpath(
				"//div[@class='relative bg-white rounded-lg shadow-2xl']//button[@type='button'][normalize-space()='Submit']"));
		_addVisitInnerFrame_Submitbtn.isDisplayed();
		highlightElement(driver, _addVisitInnerFrame_Submitbtn);

		WebElement _addVisitInnerFrame_Cancelbtn = driver.findElement(By.xpath(
				"//div[@class='relative bg-white rounded-lg shadow-2xl']//button[@type='button'][normalize-space()='Cancel']"));
		_addVisitInnerFrame_Cancelbtn.isDisplayed();
		highlightElement(driver, _addVisitInnerFrame_Cancelbtn);
		_addVisitInnerFrame_Cancelbtn.click();

	}

}
