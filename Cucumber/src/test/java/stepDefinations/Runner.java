package stepDefinations;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Resources",glue= "stepdefination.java",
plugin = { "pretty", "html:target/cucumber-reports" })

public class Runner {



}
