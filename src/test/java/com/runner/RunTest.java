package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.amazon.test.BaseClass;
import com.helper.FileReadManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",
					glue="com.stepdefinition",
					monochrome = true,
					plugin = {"pretty"})


public class RunTest {

	public static WebDriver driver;
	
	@BeforeClass
	public static void stepup() throws Throwable{
		String browser = FileReadManager.getInstanceFR().getInstanceCR().getBrowser();
		driver = BaseClass.BrowserLaunch(browser);
	}
	
	@AfterClass
	public static void Teardown() {
		driver.close();
	}
	
}
