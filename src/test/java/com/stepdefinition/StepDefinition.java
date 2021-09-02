package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.amazon.test.BaseClass;
import com.amazon.test.POMamazonLogin;
import com.amazon.test.POMamazonMobile;
import com.helper.FileReadManager;
import com.runner.RunTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class StepDefinition extends BaseClass{

	public static WebDriver driver = RunTest.driver;
	
	POMamazonLogin login = new POMamazonLogin(driver);
	POMamazonMobile mob = new POMamazonMobile(driver);
	
	@Given("^when user lanuch the application$")
	public void when_user_lanuch_the_application() throws Throwable {
	   String url = FileReadManager.getInstanceFR().getInstanceCR().getUrl(); 
	   BrowserUrlLaunch(url);
	}

	@When("^user click the signIn button$")
	public void user_click_the_signIn_button() throws Throwable {
		javascriptsClick(login.getSignIn());
	}

	@Then("^user pass the user mail ID or mobile number$")
	public void user_pass_the_user_mail_ID_or_mobile_number() throws Throwable {
	    passtheValues(login.getUserName(), "9976704161");
	}

	@Then("^click on the continue button$")
	public void click_on_the_continue_button() throws Throwable {
	    clickthelement(login.getContinueBut());
	}

	@Then("^user pass the password$")
	public void user_pass_the_password() throws Throwable {
	   passtheValues(login.getPassword(), "Vishal*0321");
	}

	@Then("^click the signIN button$")
	public void click_the_signIN_button() throws Throwable {
	   clickthelement(login.getSignINBut());
	}

	@When("^user pass the model of the mobile in the search box$")
	public void user_pass_the_model_of_the_mobile_in_the_search_box() throws Throwable {
	    passtheValues(mob.getSearchBox(), "samsung m51 mobile phone");
	}

	@When("^click the search button$")
	public void click_the_search_button() throws Throwable {
	    clickthelement(mob.getSearchBut());
	}

	@Then("^select the mobile of user intrest$")
	public void select_the_mobile_of_user_intrest() throws Throwable {
	    clickthelement(mob.getMobileSel());
	}

}
