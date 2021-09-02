package com.amazon.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POMamazonMobile {

	public static WebDriver driver;
	
	public POMamazonMobile(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
				}

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBut() {
		return SearchBut;
	}

	public WebElement getMobileSel() {
		return MobileSel;
	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBox;
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span")
	private WebElement SearchBut;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")
	private WebElement MobileSel;
	
}
