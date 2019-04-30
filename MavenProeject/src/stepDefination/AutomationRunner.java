package stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	/**
	 * Created by nishiveg on 5/29/2018.
	 */
	@RunWith(Cucumber.class)
	@CucumberOptions(features="target/features",glue= {"src/stepDefination/StepDefination"})
	public class AutomationRunner {
	


}
