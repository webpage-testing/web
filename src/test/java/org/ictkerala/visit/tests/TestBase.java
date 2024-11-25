package org.ictkerala.visit.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.ictkerala.visit.pages.LoginPage;
import org.ictkerala.visit.pages.VisitPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author sherin
 */
public class TestBase {
	Properties prop;
	String browser;
	WebDriver driver;
	LoginPage loginPage;
	WebDriverWait wait;
	VisitPage visitPage;

	public void readProps() throws IOException {
		prop = new Properties();
		FileInputStream filenp = new FileInputStream(
				"/Users/sherin/Desktop/ICTAK/src/test/resources/config.properties");
		prop.load(filenp);

	}
	
	/**
	 * Login
	 */
	public void login() {

		loginPage = new LoginPage(driver);
		loginPage.setUsername(prop.getProperty("uname"));
		loginPage.setPassword(prop.getProperty("password"));
		loginPage.loginClick();
	}

	public void visit() {
		visitPage = new VisitPage(driver);
		visitPage.visitClick();
	}

	@BeforeTest
	public void setConfig() throws IOException {
		readProps();
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.geolocation", 1); // Allow location access

        // Set ChromeOptions
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		this.login();
		this.visit();

	}

	@AfterTest
	public void quitTest() {
		driver.quit();
	}

}
