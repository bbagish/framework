package Runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "StepDefs" }, dryRun = false, plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:" })
public class CukesRunner {
	@BeforeClass
	public static void setUp() {
		ExtentProperties.INSTANCE.setReportPath("./output/reports/");
	}
	@AfterClass
	public static void tearDown() {
		Reporter.loadXMLConfig(new File("./config.xml"));
	}
}
