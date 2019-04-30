package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import mavenUtility.Log;

public class LineChartAjaxobjects {

	private static WebElement element = null;

	public static WebElement DefaultElement(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='btn-group theme']/a[1]"));

		Log.info("tooltip not  found");
		return element;

	}

	public static WebElement Tooltip(WebDriver driver) {

		element = driver.findElement(By.xpath(
				"//*[name()='svg']/*[name()='g'and  @class='highcharts-series-group']/*[name()='g'][4]/*[name()='path'][20]"));

		Log.info("element not found");
		return element;

	}

	public static WebElement informationtext(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@class='highslide-maincontent']"));

		Log.info("pop up not found");
		return element;

	}

	public static WebElement okelement(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='CybotCookiebotDialogBodyLevelButtonAcceptWrapper']"));
		return element;
	}

}
