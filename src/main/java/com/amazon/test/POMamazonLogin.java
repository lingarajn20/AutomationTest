package com.amazon.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMamazonLogin {
	
	public static WebDriver driver;
	

	@FindBy(xpath = "/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[1]/div/a/span")
	private WebElement SignIn;
	
	
	public POMamazonLogin(WebDriver driver2) {
		POMamazonLogin.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getUserName() {
		return UserName;
	}

	public WebElement getContinueBut() {
		return ContinueBut;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignINBut() {
		return signINBut;
	}

	@FindBy(xpath = "//input[@type='email']")
	private WebElement UserName;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement ContinueBut;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signINBut;
	
	
}
