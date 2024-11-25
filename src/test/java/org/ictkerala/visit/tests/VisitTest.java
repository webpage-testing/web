package org.ictkerala.visit.tests;

import java.time.Duration;

import org.ictkerala.visit.pages.VisitPage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Add Visits Tests
 * 
 * @author Sherin
 */
public class VisitTest extends TestBase {

	@Test(priority = 1)

	public void testVisitLogsTable() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement visitLogsTable = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[4]/div/table")));

		Assert.assertTrue(visitLogsTable.isDisplayed(), "Visit Logs table is not open.");

	}

	@Test(priority = 2)

	public void testVisitLogsIconsExist() {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement visitLogsDeleteButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div/div/div[4]/div/table/tbody/tr[1]/td[8]/button[2]/div/div")));

		Assert.assertTrue(visitLogsDeleteButton.isDisplayed(), "Visit Logs Delete Button is not displayed.");

		WebElement visitLogsViewDetailsButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div/div/div[4]/div/table/tbody/tr[1]/td[8]/button[1]")));

		Assert.assertTrue(visitLogsViewDetailsButton.isDisplayed(), "Visit Logs View Details Button is not displayed.");

		WebElement visitLogsUpdateButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div/div/div[4]/div/table/tbody/tr[1]/td[8]/button[3]")));

		Assert.assertTrue(visitLogsUpdateButton.isDisplayed(), "Visit Logs Update Button is not displayed.");

		WebElement visitLogsFollowUpButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html/body/div/div/div[4]/div/table/tbody/tr[1]/td[8]/button[4]")));

		Assert.assertTrue(visitLogsFollowUpButton.isDisplayed(), "Visit Logs Update Button is not displayed.");

	}

	@Test(priority = 3)
	public void testAddVisitModalOpen() throws InterruptedException {

		VisitPage visitPage = new VisitPage(driver);

		visitPage.addVisitClick();
		Thread.sleep(2000);

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement modal = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Add Visits']")));

		Assert.assertTrue(modal.isDisplayed(), "Modal is not open.");
	}

	@Test(priority = 4)

	public void testAddVisitSubmit() throws InterruptedException {
		VisitPage visitPage = new VisitPage(driver);
		visitPage.setVisitData();
		visitPage.addVisitSubmit();

		WebDriverWait alertWait = new WebDriverWait(driver, Duration.ofSeconds(100));
		alertWait.until(ExpectedConditions.alertIsPresent());

		Alert alert = driver.switchTo().alert();

		System.out.println("Alert text: " + alert.getText());

		alert.dismiss(); // Use alert.dismiss() to cancel the alert

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement successModal = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[9]")));
		Assert.assertTrue(successModal.isDisplayed(), "Success modal is not displayed");

		visitPage.addVisitSuccessClose();

	}

//	@Test(priority = 3)
//	public void testAddVisitFormSubmitValidation() throws InterruptedException {
//		VisitPage visitPage = new VisitPage(driver);
//		visitPage.addVisitSubmit();
//
//		Thread.sleep(2000);
//
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
//
//		WebElement instErrMsg = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[10]/div/div/div[2]/div/div/span")));
//
//		Assert.assertTrue(instErrMsg.isDisplayed(), "Error message not Displayed");
//
//	}

	@Test(priority = 5)
	public void testAddVisitClose() throws InterruptedException {

		VisitPage visitPage = new VisitPage(driver);
		visitPage.addVisitClick();

		WebElement closeButton = driver.findElement(By.xpath("/html/body/div/div/div[10]/div/div/div[11]/button[2]"));

		Thread.sleep(2000);

		closeButton.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		Assert.assertTrue(
				wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h3[text()='Add Visits']"))));
	}

	@Test(priority = 6)
	public void testAddInstitutionsModalOpen() throws InterruptedException {
		VisitPage visitPage = new VisitPage(driver);
		visitPage.addInstitutionsClick();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement modal = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Add Institution']")));

		Assert.assertTrue(modal.isDisplayed(), "Modal is not open.");

	}

	@Test(priority = 7)
	public void testAddInstitutionSubmit() throws InterruptedException {
		VisitPage visitPage = new VisitPage(driver);
		visitPage.addInstnData();
		visitPage.addInstitutionSubmit();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement successInstnModal = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div[12]/div/div[2]")));
		Assert.assertTrue(successInstnModal.isDisplayed(), "Success Institution modal is not displayed");

		visitPage.addIntsnSuccessClose();

	}

	@Test(priority = 8)
	public void testAddInstitutionsModalClose() throws InterruptedException {
		visitPage.addInstitutionsClick();
		WebElement closeButton = driver.findElement(By.xpath("/html/body/div/div/div[13]/div[1]/div/div[8]/button[2]"));

		closeButton.click();
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		Assert.assertTrue(wait
				.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h3[text()='Add Institution']"))));
	}

	@Test(priority = 9)
	public void testFollowUpSubmit() throws InterruptedException {

		VisitPage visitPage = new VisitPage(driver);

		visitPage.followUpOpen();
		visitPage.addFollowUpData();
		visitPage.followUpClose();

	}

}
