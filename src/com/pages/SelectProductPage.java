package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class SelectProductPage {
	@SuppressWarnings("unused")
	private WebDriver driver;

	public SelectProductPage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//button[contains(@id, 'add-to-cart-sauce-labs-backpack')]")
	public WebElement Backpack;	
	
	@FindBy(xpath = "//button[contains(@id, 'add-to-cart-sauce-labs-bolt-t-shirt')]")
	public WebElement Tshirt;	
	
	@FindBy(xpath = "//button[contains(@id, 'add-to-cart-sauce-labs-bike-light')]")
	public WebElement Bikelight;	
	
	@FindBy(xpath = "//div[(@id= 'shopping_cart_container')]")
	public WebElement Cart;	

	public void select_Backpack() {
	
		Backpack.click();
	}
	
	public void select_Tshirt() {
		
		Tshirt.click();
	}
	
	public void select_Bikelight() {
		
		Bikelight.click();
	}


	public void click_Cart() {
		
		Cart.click();
	}
}
