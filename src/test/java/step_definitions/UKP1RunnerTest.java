package step_definitions;

import java.io.File;
import java.io.IOException;


import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import helpers.SendEmail;
import helpers.SendSMS;



/**
 * this is the runner file for running with TestNG.
 * @author vibhav.gupta
 *
 */
@CucumberOptions(
		features = "classpath:features",
		plugin = {"pretty", "html:target2/cucumber-html-report",
				   "json:target/cucumber.json",
				   "rerun:target/rerun.txt",
				   "com.cucumber.listener.ExtentCucumberFormatter:output/report.html"
		            		
		},
		tags = {"@P1"}
		)
public class UKP1RunnerTest extends AbstractTestNGCucumberTests{
	@AfterClass
    public static void teardown() throws IOException {
        Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 7");
        Reporter.setTestRunnerOutput("Output");
        SendEmail.sendEmailReport();
        SendSMS.sentOutputThroughSMS();
      
    }
}