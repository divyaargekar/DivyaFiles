package mavenUtility;

import java.io.File;


import java.util.concurrent.TimeUnit;


import org.apache.poi.ss.formula.EvaluationWorkbook.ExternalSheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class Utils {

	 public static WebDriver driver = null;
	  protected static DesiredCapabilities dCaps;
	    public static WebDriver openBrowser(String   BrowserName ) throws Exception
	    {


	    



	
	        if(BrowserName.equals("Chrome")){


	        	String driverPath = "E:\\6.others\\DivyaFiles\\Cucumber\\drivers";

	        	System.setProperty("webdriver.chrome.driver", driverPath + "\\chromedriver.exe");

	        	driver = new ChromeDriver();
	        	  
	            Log.info("New driver instantiated");

	            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	          driver.manage().window().maximize();

	            Log.info("Implicit wait applied on the driver for 10 seconds");

	            driver.get(Constants.URL);


	            Log.info("Web application launched successfully");
	            return driver;

	            }



	        else if(BrowserName.equals("Mozilla"))
	        {
	            String driverPath = "E:\\6.others\\DivyaFiles\\Cucumber\\drivers";

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

	        	File file = new File("E:\\6.others\\DivyaFiles\\Cucumber\\drivers\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");

	   		 String driverPath = "D:\\REST-API Qspiders\\MavenProeject\\drivers";

	  	System.setProperty("phantomjs.binary.path", driverPath + "\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	       // System.setProperty("phantomjs.binary.path", file.getAbsolutePath());		
	  
	          dCaps = new DesiredCapabilities();
	    	  dCaps.setJavascriptEnabled(true);
	    	  dCaps.setCapability("takesScreenshot", false);
	    	  WebDriver driver = new PhantomJSDriver(dCaps);	

	            driver.get(Constants.URL);

	            Log.info("Web application launched successfully");
	            return driver;
	        }
	        }
}

