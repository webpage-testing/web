package visit.ictkerala.pages;

import visit.ictkerala.pages.DashboardPage;
import visit.ictkerala.pages.HomePage;
import visit.ictkerala.pages.ProfilePage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboard_TestSuite extends TestBase {

	DashboardPage dashPageObj;

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
	public void postValidateDashBoard_PageHeader() {
		postUserLoginLogout_Manager();

		boolean _headerValue;
		DashboardPage dashPageObj = new DashboardPage(driver);
		_headerValue = dashPageObj.showDashboardlabel();
		Assert.assertTrue(_headerValue);
	}

	@Test(priority = 2, alwaysRun = false)
	public void postValidateDashBoard_TotalVisits() {
		String totalvisit;
		DashboardPage dashPageObj = new DashboardPage(driver);
		totalvisit = dashPageObj.showDashboard_TotalVisits();
		Assert.assertNotNull(totalvisit);
	}

	@Test(priority = 3, alwaysRun = false)
	public void postValidateDashBoard_UpcomingVisits() {
		String upVisit;
		DashboardPage dashPageObj = new DashboardPage(driver);
		upVisit = dashPageObj.showDashboard_UpcomingVisits();
		Assert.assertNotNull(upVisit);
	}

	@Test(priority = 4, alwaysRun = false)
	public void postValidateDashBoard_OrgStatistics() {
		boolean orgStatistics;
		DashboardPage dashPageObj = new DashboardPage(driver);
		orgStatistics = dashPageObj.showDashboard_OrgStatistics();
		Assert.assertTrue(orgStatistics);
	}

	@Test(priority = 5, alwaysRun = false)
	public void postValidateDashBoard_VisitView() {
		boolean orgVisitView;
		DashboardPage dashPageObj = new DashboardPage(driver);
		orgVisitView = dashPageObj.showDashboard_VisitView();
		Assert.assertTrue(orgVisitView);
	}

	@Test(priority = 6, alwaysRun = false)
	public void postValidateDashBoard_UpcomingVisit_Table() {
		boolean orgVisitView;
		DashboardPage dashPageObj = new DashboardPage(driver);
		dashPageObj.showTable_UpcomingVisits_Table();
	}

	@Test(priority = 7, alwaysRun = false)
	public void postValidateDashboard_ColumnRow_Intitutions() {
		DashboardPage dashPageObj = new DashboardPage(driver);
		dashPageObj.postValidateDashboard_ColumnRow_Intitutions();
	}

}
