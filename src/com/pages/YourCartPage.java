package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class YourCartPage {
	@SuppressWarnings("unused")
	private WebDriver driver;

	public YourCartPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//button[(@name= 'checkout')]")
	public WebElement CheckoutButton;	
	
	@FindBy(xpath = "//Button[contains(@name, 'remove-sauce-labs')]")
	public WebElement RemoveButton;
	
	@FindBy(xpath = "//Button[(@name= 'continue-shopping')]")
	public WebElement ContinueShopping;

	public void click_Checkout() {
	
		CheckoutButton.click();
	}

	public void click_Removeitem() {
		
		RemoveButton.click();
	}
	
	public void click_ContinueShopping() {
		
		ContinueShopping.click();
	}
}
