package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class ChkOutOverviewPage {
	@SuppressWarnings("unused")
	private WebDriver driver;

	public ChkOutOverviewPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[@id='finish']")
	public WebElement Finish;
	
	
	
	
	public void clickOnFinish() {
		Finish.click();
		
	}




}
