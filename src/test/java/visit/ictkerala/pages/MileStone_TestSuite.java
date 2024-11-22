package visit.ictkerala.pages;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import visit.ictkerala.pages.DashboardPage;
import visit.ictkerala.pages.HomePage;
import visit.ictkerala.pages.ProfilePage;

public class MileStone_TestSuite extends TestBase {

	MileStoneFrame mileStoneObj;

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
	}

	@Test(priority = 1, alwaysRun = false)
	public void post_MileStoneAvailable() {
		postUserLoginLogout_Manager();

		boolean _validMileStoneFrame;
		MileStoneFrame mileStoneObj = new MileStoneFrame(driver);
		_validMileStoneFrame = mileStoneObj.showMileStoneFrame();
		Assert.assertTrue(_validMileStoneFrame);
	}

	@Test(priority = 2, alwaysRun = false)
	public void select_OrganisationType() {
		MileStoneFrame mileStoneObj = new MileStoneFrame(driver);
		mileStoneObj.select_OrganisationType();
	}

	@Test(priority = 3, alwaysRun = false)
	public void select_Organisation() {
		MileStoneFrame mileStoneObj = new MileStoneFrame(driver);
		mileStoneObj.select_Organisation();
	}

	@Test(priority = 4, alwaysRun = false)
	public void click_GoButton() {
		MileStoneFrame mileStoneObj = new MileStoneFrame(driver);
		mileStoneObj.click_GoButton();
	}

	@Test(priority = 5, alwaysRun = false)
	public void MileStoneResult_validation() {
		boolean milestonecheck;
		MileStoneFrame mileStoneObj = new MileStoneFrame(driver);

		milestonecheck = mileStoneObj.MileStoneResult_validation();
		if (milestonecheck == true) {
			Assert.assertTrue(milestonecheck);
		} else {
			Assert.fail();
		}

	}

}
