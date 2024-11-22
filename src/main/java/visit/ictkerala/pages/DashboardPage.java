package visit.ictkerala.pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	public boolean showDashboardlabel() {
		boolean isdisplayed;
		WebElement _displaylabel = driver.findElement(By.xpath("//h3[normalize-space()='Dashboard']"));
		isdisplayed = _displaylabel.isDisplayed();
		return isdisplayed;
	}

	public String showDashboard_TotalVisits() {

		String _totalvalue;
		WebElement _displaylabel = driver.findElement(By.xpath("//h2[normalize-space()='Total Visits']"));
		_displaylabel.isDisplayed();

		WebElement _readValue = driver.findElement(By.cssSelector(
				"body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > main:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(2)"));
		_totalvalue = _readValue.getText();
		return _totalvalue;
	}

	public String showDashboard_UpcomingVisits() {

		String _upvalue;
		WebElement _displaylabel = driver.findElement(
				By.xpath("//h2[@class='text-gray-600 text-[1.2rem]'][normalize-space()='Upcoming Visits']"));
		_displaylabel.isDisplayed();

		WebElement _readValue = driver.findElement(By.cssSelector(
				"body > div:nth-child(2) > div:nth-child(1) > div:nth-child(3) > main:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > h2:nth-child(2)"));
		_upvalue = _readValue.getText();
		return _upvalue;
	}

	public boolean showDashboard_OrgStatistics() {
		boolean _isdisplaylabel;
		WebElement _displaylabel = driver.findElement(By.xpath("//h2[normalize-space()='Organization Statistics']"));
		_isdisplaylabel = _displaylabel.isDisplayed();
		return _isdisplaylabel;
	}

	public boolean showDashboard_VisitView() {
		boolean _isdisplaylabel;
		WebElement _displaylabel = driver.findElement(By.xpath("//h2[normalize-space()='Visit View']"));
		_isdisplaylabel = _displaylabel.isDisplayed();
		return _isdisplaylabel;
	}

	public void showTable_UpcomingVisits_Table() {
		boolean _isUpcomingVisitsAvailable;
		String readvalue;
		WebElement _displaylabel = driver.findElement(By.xpath(
				"//div[@class='relative w-full overflow-x-auto rounded-lg bg-gradient-to-tr from-gray-50 to-gray-100 p-6 shadow-lg']"));
		_isUpcomingVisitsAvailable = _displaylabel.isEnabled();
		readvalue = _displaylabel.getText();
		readvalue.contains("INSTITUTIONS");
		System.out.println("\t --- Value of Tables are --> " + readvalue);
	}

	public void postValidateDashboard_ColumnRow_Intitutions() {

		boolean co1, co2, co3, co4, co5;
		WebElement _InstituteName = driver.findElement(By.xpath("//th[normalize-space()='Institutions']"));
		WebElement _InstituteType = driver.findElement(By.xpath("//th[normalize-space()='Institutions Type']"));
		WebElement _Date = driver.findElement(By.xpath("//th[normalize-space()='Date']"));
		WebElement _EmployeeName = driver.findElement(By.xpath("//th[normalize-space()='Employee Name']"));
		WebElement _ContactPerson = driver.findElement(By.xpath("//th[normalize-space()='Contact Person']"));

		co1 = _InstituteName.isEnabled();
		co2 = _InstituteType.isEnabled();
		co3 = _Date.isEnabled();
		co4 = _EmployeeName.isEnabled();
		co5 = _ContactPerson.isEnabled();

		if (co1 == true && co2 == true && co3 == true == co4 == true && co5 == true) {
			List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
			if (rows.isEmpty()) {
				System.out.println("No rows found in the table.");
				return;
			}

			for (WebElement row : rows) {
				List<WebElement> columns = row.findElements(By.xpath("td"));
				if (columns.isEmpty()) {
					System.out.println("No columns found in this row.");
					continue;
				}
				String firstColumnText = columns.get(0).getText();
				System.out.println("Table Data---> " + firstColumnText);

			}

		}

	}

}
