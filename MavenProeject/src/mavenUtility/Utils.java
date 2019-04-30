package mavenUtility;

import java.io.File;
import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.formula.EvaluationWorkbook.ExternalSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class Utils {

	 public static WebDriver driver = null;

	    public static WebDriver openBrowser(String   BrowserName ) throws Exception
	    {


	      //  String sBrowserName;



	  //      sBrowserName = ExcelUtils.getcelldata(iTestCaseRow, Constant.Col_Browser);

	        if(BrowserName.equals("Chrome")){


	        	String driverPath = "E:\\6.others\\drivers";

	        	System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");

	        	driver = new ChromeDriver();
	        	  driver.manage().deleteAllCookies();
	            Log.info("New driver instantiated");

	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	            driver.manage().deleteAllCookies();

	            Log.info("Implicit wait applied on the driver for 10 seconds");

	            driver.get(Constants.URL);


	            Log.info("Web application launched successfully");
	            return driver;

	            }



	        else if(BrowserName.equals("Mozilla"))
	        {
	            String driverPath = "E:\\6.others\\drivers";

	        	System.setProperty("webdriver.gecko.driver", driverPath + "\\geckodriver.exe");

	        	driver = new FirefoxDriver();

	            Log.info("New driver instantiated");

	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	            Log.info("Implicit wait applied on the driver for 10 seconds");

	            driver.get(Constants.URL);

	            Log.info("Web application launched successfully");
	            return driver;

	         }

	        else 

	        {  

	        	File file = new File("D:\\REST-API Qspiders\\MavenProeject\\drivers\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

	   		 String driverPath = "D:\\REST-API Qspiders\\MavenProeject\\drivers";

	        	System.setProperty("phantomjs.binary.path", driverPath + "\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	          //  System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
	            WebDriver driver = new PhantomJSDriver();	

	            driver.get(Constants.URL);

	            Log.info("Web application launched successfully");
	            return driver;
	        }
	        }
}

