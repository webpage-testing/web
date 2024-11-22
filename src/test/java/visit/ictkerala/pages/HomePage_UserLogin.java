package visit.ictkerala.pages;

import visit.ictkerala.pages.HomePage;
import visit.ictkerala.pages.ProfilePage;

import org.testng.Assert;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class HomePage_UserLogin extends TestBase {

	HomePage homePageObj;
	ProfilePage profilePageObj;

	/* Method for User Login - Manager */
	@Test(priority = 1, alwaysRun = false)
	public void postUserLoginLogout_Manager() {
		boolean isShowUserid, isShowPassword, isbuttonlogin;

		HomePage homePageObj = new HomePage(driver);

		isShowUserid = homePageObj.showtextBox_UserID();
		Assert.assertTrue(isShowUserid);

		isShowPassword = homePageObj.showtextBox_Password();
		Assert.assertTrue(isShowPassword);

		homePageObj.postLogin_UserManagerID();

		isbuttonlogin = homePageObj.button_ClickSignIn();
		Assert.assertTrue(isbuttonlogin);

		ProfilePage profilePageObj = new ProfilePage(driver);
		profilePageObj.show_profileIcon();
		profilePageObj.show_profileLogOut();
	}

	/* Method for User Logout - Associate One */
	@Test(priority = 2, alwaysRun = false)
	public void postUserLoginLogout_Associate_One() {
		boolean isShowUserid, isShowPassword, isbuttonlogin;

		HomePage homePageObj = new HomePage(driver);

		isShowUserid = homePageObj.showtextBox_UserID();
		Assert.assertTrue(isShowUserid);

		isShowPassword = homePageObj.showtextBox_Password();
		Assert.assertTrue(isShowPassword);

		homePageObj.postLogin_UserAssociateOneID();

		isbuttonlogin = homePageObj.button_ClickSignIn();
		Assert.assertTrue(isbuttonlogin);

		ProfilePage profilePageObj = new ProfilePage(driver);
		profilePageObj.show_profileIcon();
		profilePageObj.show_profileLogOut();
	}

	@Test(priority = 3, alwaysRun = false)
	public void postUserLoginLogout_Associate_Two() {
		boolean isShowUserid, isShowPassword, isbuttonlogin;

		HomePage homePageObj = new HomePage(driver);

		isShowUserid = homePageObj.showtextBox_UserID();
		Assert.assertTrue(isShowUserid);

		isShowPassword = homePageObj.showtextBox_Password();
		Assert.assertTrue(isShowPassword);

		homePageObj.postLogin_UserAssociateTwoID();

		isbuttonlogin = homePageObj.button_ClickSignIn();
		Assert.assertTrue(isbuttonlogin);

		ProfilePage profilePageObj = new ProfilePage(driver);
		profilePageObj.show_profileIcon();
		profilePageObj.show_profileLogOut();
	}

}
