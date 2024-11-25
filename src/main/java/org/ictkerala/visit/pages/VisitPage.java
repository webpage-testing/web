package org.ictkerala.visit.pages;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author sherin
 */
public class VisitPage {
	WebDriver driver;

	public VisitPage(WebDriver driver2) {
		this.driver = driver2;

	}

	public void visitClick() {
		WebElement visitLink = driver.findElement(By.xpath("//a[@href='/visitlogs']"));
		visitLink.click();
	}

	public void addVisitClick() {
		WebElement addVisitButton = driver.findElement(By.xpath("//button[text()='Add Visit']"));
		addVisitButton.click();
	}

	public void addInstitutionsClick() {
		WebElement addInstitutionsButton = driver.findElement(By.xpath("//button[text()='Add Institutions']"));
		addInstitutionsButton.click();
	}

	/**
	 * @throws InterruptedException
	 * 
	 */
	public void setVisitData() throws InterruptedException {

		// Institution
		WebElement instDropdown = driver.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[2]/div"));
		instDropdown.click();
		
		WebElement selectedInstOption = driver.findElement(By.xpath("//div[contains(text(), 'ITI vadakara')]"));
		selectedInstOption.click();
		
		Thread.sleep(2000);
		
		// Employee
		WebElement empDropdown = driver.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[3]"));
		empDropdown.click();

		WebElement selectedEmpOption = driver.findElement(By.xpath("//div[contains(text(), 'Manager 1')]"));
		selectedEmpOption.click();
		
		Thread.sleep(2000);

		WebElement dateField = driver.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[4]/div/input"));
		LocalDateTime dateTime = LocalDateTime.of(2052, 05, 22, 11, 30);

		String jsScript = String.format("arguments[0].value = '%s';"
				+ "const event = new Event('change', { bubbles: true });" + "arguments[0].dispatchEvent(event);",
				dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		((JavascriptExecutor) driver).executeScript(jsScript, dateField);

		Thread.sleep(2000);

		// Purpose
		WebElement purpose = driver.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[5]/div/input"));
		purpose.clear();
		purpose.sendKeys("Test Purpose");

		Thread.sleep(2000);
		
		// Contact Person
		WebElement contactPerson = driver.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[6]"));
		contactPerson.click();
		WebElement contactPersonOption = driver.findElement(By.xpath("//div[contains(text(), 'Aisha (HoD)')]"));
		contactPersonOption.click();
		
		Thread.sleep(2000);
		
		// Note
		WebElement note = driver.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[7]/div/input"));
		note.clear();
		note.sendKeys("Test Note");
		
		Thread.sleep(2000);

		// Discussion Topic
		WebElement discussionTopic = driver
				.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[8]/div/input"));
		discussionTopic.clear();
		discussionTopic.sendKeys("Test discussion topic");
	}

	public void addVisitSubmit() {

		WebElement addVisitSubmitButton = driver
				.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[11]/button[1]"));
		addVisitSubmitButton.click();
	}

	public void addVisitSuccessClose() {

		WebElement closeButton = driver.findElement(By.xpath("/html/body/div/div/div[9]/div/div[2]/button"));

		closeButton.click();
	}

	public void addInstnData() throws InterruptedException {

		// Institution Type
		WebElement instTypeDropdown = driver.findElement(By.xpath("/html/body/div/div/div[13]/div[1]/div/div[2]/div"));
		instTypeDropdown.click();
		WebElement selectedInstTypeOption = driver.findElement(By.xpath("//div[contains(text(), 'PUBLIC')]"));
		selectedInstTypeOption.click();
		
		Thread.sleep(2000);

		// Intn Name
		WebElement name = driver.findElement(By.xpath("//*[@id='organizationName']"));
		name.clear();
		name.sendKeys("Testing Name anyyyyy");
		
		Thread.sleep(2000);


		// Intn Email
		WebElement email = driver.findElement(By.xpath("/html/body/div/div/div[13]/div[1]/div/div[4]/div/input"));
		email.clear();
		email.sendKeys("Testhdhbbhjah@gmail.com");
		Thread.sleep(2000);


		// Intn Place
		WebElement place = driver.findElement(By.xpath("/html/body/div/div/div[13]/div[1]/div/div[5]/div/input"));
		place.clear();
		place.sendKeys("Testswffggss bavn ss");
		Thread.sleep(2000);


		// Institution State
		WebElement instStateDropdown = driver.findElement(By.xpath("/html/body/div/div/div[13]/div[1]/div/div[6]/div"));
		instStateDropdown.click();
		WebElement selectedInstStateOption = driver.findElement(By.xpath("//div[contains(text(), 'Kerala')]"));
		selectedInstStateOption.click();
		Thread.sleep(2000);


		// Institution District
		WebElement instDistrictDropdown = driver
				.findElement(By.xpath("/html/body/div/div/div[13]/div[1]/div/div[7]/div"));
		instDistrictDropdown.click();
		WebElement selectedInstDistrictOption = driver.findElement(By.xpath("//div[contains(text(), 'Ernakulam')]"));
		selectedInstDistrictOption.click();

	}

	public void addIntsnSuccessClose() {

		WebElement closeButton = driver.findElement(By.xpath("/html/body/div/div/div[12]/div/div[2]/button"));

		closeButton.click();

	}

	public void addInstitutionSubmit() {

		WebElement addInstitutionSubmitButton = driver
				.findElement(By.xpath("/html/body/div/div/div[13]/div[1]/div/div[8]/button[1]"));
		addInstitutionSubmitButton.click();
	}

	public void followUpOpen() {
		WebElement followUpButton = driver
				.findElement(By.xpath("/html/body/div/div/div[4]/div/table/tbody/tr[1]/td[8]/button[4]"));
		followUpButton.click();
	}

	public void addFollowUpData() throws InterruptedException {

		// Action Details
		WebElement actionDetail = driver.findElement(By.xpath("//*[@id=\"actionDetails\"]"));
		actionDetail.clear();
		actionDetail.sendKeys("Testing Action Detail");

		Thread.sleep(2000);

		// Action Description
		WebElement actionDescription = driver.findElement(By.xpath("//*[@id=\"actionDescription\"]"));
		actionDescription.clear();
		actionDescription.sendKeys("Test Action Description");

		Thread.sleep(2000);

		// Date

		WebElement followupDateField = driver.findElement(By.xpath("//*[@id=\"actionDueDate\"]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = arguments[1];", followupDateField, "2037-11-23");
		js.executeScript("arguments[0].dispatchEvent(new Event('change'));", followupDateField);
		followupDateField.sendKeys(Keys.TAB);

		// Status
		WebElement followUpStatusDropdown = driver
				.findElement(By.xpath("/html/body/div/div/div[8]/div/div/div[2]/div[3]/div[1]/div[4]/div/div"));
		followUpStatusDropdown.click();
		WebElement followUpStatusDropdownOption = driver
				.findElement(By.xpath("//div[contains(text(), 'Action Needed')]"));
		followUpStatusDropdownOption.click();

	}
	
	public void followUpSubmit() {

		WebElement followUpSubmitButton = driver
				.findElement(By.xpath("/html/body/div/div/div[8]/div/div/div[2]/div[3]/div[2]/button[1]"));
		followUpSubmitButton.click();

	}

	public void followUpClose() {

		WebElement closeButton = driver
				.findElement(By.xpath("/html/body/div/div/div[8]/div/div/div[2]/div[3]/div[2]/button[2]"));

		closeButton.click();

	}

}