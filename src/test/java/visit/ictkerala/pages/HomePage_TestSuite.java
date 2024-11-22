package visit.ictkerala.pages;

import visit.ictkerala.pages.HomePage;

import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class HomePage_TestSuite extends TestBase {

	HomePage homePageObj;

	@Test(priority = 1, alwaysRun = false)
	public void postValidateUrl() {
		String _currenturl, _givenurl = "https://dev.visit.ictkerala.org/";
		HomePage homePageObj = new HomePage(driver);
		_currenturl = homePageObj.driver.getCurrentUrl();
		Assert.assertEquals(_currenturl, _givenurl);
	}

	@Test(priority = 2, alwaysRun = false)
	public void postValidateWelcomeHomePage() {

		boolean isWelcomeframeshow;

		HomePage homePageObj = new HomePage(driver);

		isWelcomeframeshow = homePageObj.showWelcomeTemplate();
		Assert.assertTrue(isWelcomeframeshow);
	}

	@Test(priority = 3, alwaysRun = false)
	public void postValidateIctkLogo() {
		boolean isBrandLogo;

		HomePage homePageObj = new HomePage(driver);

		isBrandLogo = homePageObj.showBrandLogo();
		Assert.assertTrue(isBrandLogo);
	}

	@Test(priority = 4, alwaysRun = false)
	public void postValidateWelcomeBackMsg() {
		boolean isshowWelcomeBackMsg;

		HomePage homePageObj = new HomePage(driver);

		isshowWelcomeBackMsg = homePageObj.showWelcomeBackMsg();
		Assert.assertTrue(isshowWelcomeBackMsg);
	}

	@Test(priority = 5, alwaysRun = false)
	public void postValidateUserID() {
		boolean isUserId;

		HomePage homePageObj = new HomePage(driver);

		isUserId = homePageObj.showtextBox_UserID();
		Assert.assertTrue(isUserId);
	}

	@Test(priority = 6, alwaysRun = false)
	public void postValidatePassword() {
		boolean isPassword;

		HomePage homePageObj = new HomePage(driver);

		isPassword = homePageObj.showtextBox_Password();
		Assert.assertTrue(isPassword);
	}

	@Test(priority = 7, alwaysRun = false)
	public void postValidateForgotPasswordLink() {
		boolean isforgetlink;

		HomePage homePageObj = new HomePage(driver);

		isforgetlink = homePageObj.showForgotPassword();
		Assert.assertTrue(isforgetlink);
	}

	@Test(priority = 8, alwaysRun = false)
	public void postValidateLoginbutton() {
		boolean isbuttonlogin;

		HomePage homePageObj = new HomePage(driver);

		isbuttonlogin = homePageObj.button_ClickSignIn();
		Assert.assertTrue(isbuttonlogin);
	}

}