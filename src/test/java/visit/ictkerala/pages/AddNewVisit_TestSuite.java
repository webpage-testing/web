package visit.ictkerala.pages;

import visit.ictkerala.pages.DashboardPage;
import visit.ictkerala.pages.HomePage;
import visit.ictkerala.pages.ProfilePage;
import visit.ictkerala.pages.Add_New_Visit_Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddNewVisit_TestSuite extends TestBase {

	Add_New_Visit_Pages newVisitPageObj;

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
	public void show_AddNewVisitButton() {
		postUserLoginLogout_Manager();

		boolean is_AddNewVisitButton;
		Add_New_Visit_Pages newVisitPageObj = new Add_New_Visit_Pages(driver);
		is_AddNewVisitButton = newVisitPageObj.show_AddNewVisitButton();
		Assert.assertTrue(is_AddNewVisitButton);
	}

	@Test(priority = 2, alwaysRun = false)
	public void click_AddNewVisitButton() {
		boolean _addvisitWindow;
		Add_New_Visit_Pages newVisitPageObj = new Add_New_Visit_Pages(driver);
		_addvisitWindow = newVisitPageObj.click_AddNewVisitButton();
		Assert.assertTrue(_addvisitWindow);
	}

	@Test(priority = 3, alwaysRun = false)
	public void addVisit_NewPage() throws InterruptedException {
		Add_New_Visit_Pages newVisitPageObj = new Add_New_Visit_Pages(driver);
		newVisitPageObj.addVisit_Page();
	}
}
