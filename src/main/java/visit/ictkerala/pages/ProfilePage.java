package visit.ictkerala.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfilePage {

	WebDriver driver;

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}

	/* Method to Profile Icon */
	public void show_profileIcon() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions action = new Actions(driver);
		WebElement _displayProfileIcon = driver.findElement(By.cssSelector("img[class='w-full h-full ']"));
		action.moveToElement(_displayProfileIcon).perform();
		action.click(_displayProfileIcon).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	/* Method to Profile Logout */
	public void show_profileLogOut() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		Actions action = new Actions(driver);
		WebElement _profileLogout = driver
				.findElement(By.xpath("//div[@class='absolute right-0 w-48 bg-white shadow-md rounded mt-2 py-2']"));
		action.moveToElement(_profileLogout).perform();
		action.click(_profileLogout).perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	}
}
