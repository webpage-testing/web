package org.ictkerala.visit.tests;

import java.time.Duration;

import org.ictkerala.visit.pages.VisitPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class VistLogsTest extends TestBase {
	@BeforeClass
	public void getVisitLogsPage() {
		VisitPage visitPage = new VisitPage(driver);
		visitPage.visitClick();
		
		
	}
	@Test
	public void testVisitLogsTableExsists() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement table = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table")));

		Assert.assertTrue(table.isDisplayed(), "table is not open.");
		
		
	}

}
 