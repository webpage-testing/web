package visit.ictkerala.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	/* Method description of message "Welcome to VisitApp" */
	public boolean showWelcomeTemplate() {
		boolean _welcomevalue;
		WebElement displayWelcomeTemplate = driver.findElement(By.xpath("//h2[normalize-space()='Welcome To']"));
		_welcomevalue = displayWelcomeTemplate.isDisplayed();
		return _welcomevalue;
	}

	/* Method showing brandLogo" */
	public boolean showBrandLogo() {
		boolean _logovalue;
		WebElement displayBrandLogo = driver.findElement(By.xpath("//img[@class='object-contain w-full']"));
		_logovalue = displayBrandLogo.isDisplayed();
		return _logovalue;
	}

	/* Method showing text welcome back" */
	public boolean showWelcomeBackMsg() {
		boolean isshowWelcomeBackMsg;
		WebElement txtDisplay_welcomeback = driver.findElement(By.xpath("//h2[normalize-space()='Welcome Back!']"));
		isshowWelcomeBackMsg = txtDisplay_welcomeback.isEnabled();
		return isshowWelcomeBackMsg;
	}

	/* Method User-Id text box */
	public boolean showtextBox_UserID() {
		boolean useridValue;
		WebElement txtbox_userId = driver.findElement(By.xpath("//input[@placeholder='User Id']"));
		useridValue = txtbox_userId.isEnabled();
		return useridValue;
	}

	/* Method passWord text box */
	public boolean showtextBox_Password() {
		boolean istxtbox_passWord;
		WebElement txtbox_passWord = driver.findElement(By.xpath("//input[@name='password']"));
		istxtbox_passWord = txtbox_passWord.isEnabled();
		return istxtbox_passWord;
	}

	/* Method for forgot Password link */
	public boolean showForgotPassword() {
		boolean isshowForgotPassword;
		WebElement _forgotPasswordLink = driver.findElement(
				By.xpath("(//p[@class='text-[15px] text-[#32b1dc] hover:opacity-65 active:underline'])[1]"));
		_forgotPasswordLink.isDisplayed();
		isshowForgotPassword = _forgotPasswordLink.isEnabled();
		return isshowForgotPassword;
	}

	/* Method signIn Button */
	public boolean button_ClickSignIn() {
		boolean isloginbutton;
		WebElement btnsignIn = driver.findElement(By.xpath("//button[normalize-space()='Sign In']"));
		isloginbutton = btnsignIn.isDisplayed();
		btnsignIn.isEnabled();
		btnsignIn.click();
		return isloginbutton;
	}

	/* Method for error message of Invalid UserID check */
	public void errortext_InvalidUserID() {
		WebElement _invalidUserIDText = driver
				.findElement(By.xpath("//p[normalize-space()='Please enter the user id']"));
		_invalidUserIDText.isDisplayed();
	}

	/* Method for error message of Invalid UserID check */
	public void errortext_InvalidPassword() {
		WebElement _invalidPassWordText = driver
				.findElement(By.xpath("//p[normalize-space()='Please enter the password']"));
		_invalidPassWordText.isDisplayed();
	}

	/* Method to show Invalid Credentials Window */
	public void showContainer_InvalidCredentials() {
		WebElement _invalidCredentialsWindow = driver
				.findElement(By.xpath("//div[contains(text(),'Invalid user Credentials')]"));
		_invalidCredentialsWindow.isEnabled();
		_invalidCredentialsWindow.isDisplayed();
	}

	/* Method to read User Id */
	public void postLogin_UserManagerID() {
		WebElement txtbox_userId = driver.findElement(By.xpath("//input[@placeholder='User Id']"));
		txtbox_userId.sendKeys("manager1@ictkerala.org");
		WebElement txtbox_passWord = driver.findElement(By.xpath("//input[@name='password']"));
		txtbox_passWord.sendKeys("@manager#952");
	}

	public void postLogin_UserAssociateOneID() {
		WebElement txtbox_userId = driver.findElement(By.xpath("//input[@placeholder='User Id']"));
		txtbox_userId.sendKeys("test2@ictkerala.org");
		WebElement txtbox_passWord = driver.findElement(By.xpath("//input[@name='password']"));
		txtbox_passWord.sendKeys("@test#952");
	}

	public void postLogin_UserAssociateTwoID() {
		WebElement txtbox_userId = driver.findElement(By.xpath("//input[@placeholder='User Id']"));
		txtbox_userId.sendKeys("test1@ictkerala.org");
		WebElement txtbox_passWord = driver.findElement(By.xpath("//input[@name='password']"));
		txtbox_passWord.sendKeys("@test#951");
	}
}