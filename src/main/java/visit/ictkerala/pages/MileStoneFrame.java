package visit.ictkerala.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MileStoneFrame {

	WebDriver driver;

	public MileStoneFrame(WebDriver driver) {
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

	public boolean showMileStoneFrame() {
		boolean _ismilestoneFrame;
		WebElement _mileStone = driver.findElement(
				By.xpath("//div[@class='rounded-lg bg-gradient-to-tr from-gray-200 to-gray-50 p-6 shadow-lg']"));
		_ismilestoneFrame = _mileStone.isDisplayed();
		return _ismilestoneFrame;
	}

	public void select_OrganisationType() {
		WebElement _mileStoneOrgType = driver.findElement(By.xpath("//select[1]"));
		_mileStoneOrgType.isDisplayed();
		highlightElement(driver, _mileStoneOrgType);
		_mileStoneOrgType.click();
		Select select = new Select(_mileStoneOrgType);
		select.selectByVisibleText("Government Departments");
	}

	public void select_Organisation() {
		WebElement _mileStoneOrg = driver.findElement(By.xpath("//select[2]"));
		_mileStoneOrg.isDisplayed();
		highlightElement(driver, _mileStoneOrg);
		_mileStoneOrg.click();
		Select select = new Select(_mileStoneOrg);
		select.selectByVisibleText("INFOPARK");
	}

	public void click_GoButton() {
		WebElement _mileStoneGoButton = driver.findElement(By.xpath("//button[normalize-space()='Go']"));
		_mileStoneGoButton.isDisplayed();
		highlightElement(driver, _mileStoneGoButton);
		_mileStoneGoButton.click();
	}

	public boolean MileStoneResult_validation() {
		boolean resultrecord;
		WebElement _result = driver.findElement(By.xpath(
				"//div[@class='bg-white p-4 rounded border border-slate-200 text-slate-500 shadow ml-14 md:ml-44 w-3/4']"));
		resultrecord = _result.isDisplayed();
		return resultrecord;
	}

}
