package stepDefinations;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModules.Actionsclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import mavenUtility.Constants;
import mavenUtility.Csvutility;
import mavenUtility.ExcelUtils;
import mavenUtility.Utils;
import pageObjects.LineChartAjaxobjects;

public class StepDefination {
	public static WebDriver driver;
	public static String getsessionwindowtext;
	public static String tooltipsession;

	// TODO Auto-generated method stub

	@Given("^User is on LineCharts AjaxLoaded data clickable points page$")
	public void user_is_on_LineCharts_AjaxLoaded_data_clickable_points_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		ExcelUtils.setExcelfile(Constants.Path_TestData + Constants.File_TestData, "Sheet1");
		String BrowserName = ExcelUtils.getcelldata(Constants.Row_Browser, Constants.Col_Browser);
		System.out.println(BrowserName);
		driver = Utils.openBrowser(BrowserName);

	}

	@When("^User mouse over tooltip element and get text of Tooltip$")
	public void user_mouse_over_tooltip_element_and_get_text_of_Tooltip() throws Throwable {
		WebDriverWait waitfordefault = new WebDriverWait(driver, 20);
		waitfordefault.until(ExpectedConditions.visibilityOf(LineChartAjaxobjects.DefaultElement(driver)));
		waitfordefault.until(ExpectedConditions.elementToBeClickable(LineChartAjaxobjects.DefaultElement(driver)));
		Actionsclass.Clickonacceptcookie(driver);
		waitfordefault.until(ExpectedConditions.visibilityOf(LineChartAjaxobjects.Tooltip(driver)));
		waitfordefault.until(ExpectedConditions.elementToBeClickable(LineChartAjaxobjects.Tooltip(driver)));
		Actionsclass.moveandclickonTooltip(driver);
		String datevalueupdated = mavenUtility.ExcelUtils.getcelldata(Constants.Row_Browser, Constants.Col_datevalue);
		System.out.println(datevalueupdated);
		tooltipsession = Csvutility.getSessionstooltip(Constants.path, datevalueupdated);
		System.out.println(tooltipsession);
		// throw new cucumber.api.PendingException();

	}

	@When("^User click on element and session will be highlighted$")
	public void user_click_on_element_and_session_will_be_highlighted() throws Throwable {
		String getsessionwindowtextone = Actionsclass.clickonsessions(driver);
		int firstpos = getsessionwindowtextone.indexOf("4");
		int secondpos = getsessionwindowtextone.indexOf("6");
		getsessionwindowtext = getsessionwindowtextone.substring(firstpos, secondpos + 1);
		System.out.println(getsessionwindowtext);

	}

	@Then("^Compare text between tooltip and highlighted window Session values$")
	public void compare_text_between_tooltip_and_highlighted_window_Session_values() throws Throwable {
		Assert.assertEquals(tooltipsession, getsessionwindowtext);
		System.out.println("Both values are same");

		throw new cucumber.api.PendingException();

	}

}
