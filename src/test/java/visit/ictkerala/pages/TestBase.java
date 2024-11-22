package visit.ictkerala.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {

	WebDriver driver;
	Properties proType;

	/* Before test and browser setting */
	@BeforeTest
	public void setBrowser() {
		String url = "https://dev.visit.ictkerala.org/";

		// ChromeDriver
		driver = new ChromeDriver();

		// Browser view mode setting
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
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
	
	/* After test and browser close */
	@AfterTest
	public void browserQuit() {
		driver.close();
	}

}
