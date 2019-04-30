package appModules;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import pageObjects.LineChartAjaxobjects;

public class Actionsclass {
	
	public static void ClickonDefault(WebDriver driver)
	{
		LineChartAjaxobjects.DefaultElement(driver);
		
	}
	public static void moveandclickonTooltip(WebDriver driver)
	{
		Actions act=new Actions(driver);
	Action gettooltipele=	act.moveToElement(LineChartAjaxobjects.Tooltip(driver)).build();
	gettooltipele.perform();	
	LineChartAjaxobjects.Tooltip(driver).click();
		
	}
    public static String clickonsessions(WebDriver driver)
    {
    String informationtiptext=	LineChartAjaxobjects.informationtext(driver).getText();
    return informationtiptext;
    }
}
