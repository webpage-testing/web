
package org.ictkerala.visit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;

	}

	/**
	 * Function to set username
	 * 
	 * @param username
	 */

	public void setUsername(String username) {
		WebElement uname = driver.findElement(By.xpath("//input[@name='userId']"));
		uname.sendKeys(username);
	}

	/**
	 * Function to set password
	 * 
	 * @param password
	 */

	public void setPassword(String password) {
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys(password);
	}

	/**
	 * Function to submit Login Form
	 */
	public void loginClick() {

		WebElement loginClick = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div[2]/div[2]/div[4]/button"));
		loginClick.click();

	}

}
