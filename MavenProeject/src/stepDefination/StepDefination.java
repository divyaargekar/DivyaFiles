package stepDefination;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import appModules.Actionsclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import mavenUtility.AssertCustomized;
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
		public void user_is_on_Home_Page() throws Throwable {
			 ExcelUtils.setExcelfile(Constants.Path_TestData + Constants.File_TestData,"Sheet1");
			 String BrowserName=ExcelUtils.getcelldata(Constants.Row_Browser, Constants.Col_Browser);
			 System.out.println(BrowserName);
	 driver=		 Utils.openBrowser(BrowserName);
			}
		
		@When("^User mouse over tooltip element and get text of Tooltip$")
		 public void user_get_tooltip() throws Throwable {
			WebDriverWait waitfordefault=new WebDriverWait(driver,20);
			waitfordefault.until(ExpectedConditions.visibilityOf(LineChartAjaxobjects.DefaultElement(driver)));
			Actionsclass.moveandclickonTooltip(driver);
			String datevalueupdated=mavenUtility.ExcelUtils.getcelldata(Constants.Row_Browser, Constants.Col_datevalue);
	      tooltipsession=   Csvutility.getSessionstooltip(Constants.path, datevalueupdated);
	        
			
		
		
		 }
		 
		 @When("^User click on element and session will be highlighted ")
		 public void Highlighte_window_session() throws Throwable {
		     getsessionwindowtext=  Actionsclass.clickonsessions(driver);
		    System.out.println(getsessionwindowtext);
		 }
		 
		 @Then("^Compare text between tooltip and highlighted window Session values$")
		 public void message_displayed_Login_Successfully() throws Throwable {
		Assert.assertEquals(tooltipsession, getsessionwindowtext);
		System.out.println("Both values are same");
//			 AssertCustomized.softAssert(tooltipsession, getsessionwindowtext);
			 
			  
		 }

	}

}
