package com.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.openqa.selenium.WebElement;

public class CompletePage {
	@SuppressWarnings("unused")
	private WebDriver driver;

	public CompletePage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
	
	
	public void Validate_headermsg() {
		
		String expectedheadernmessage = "THANK YOU FOR YOUR ORDER";
		String headernmessage = driver.findElement(By.xpath("//div[@class='checkout_complete_container']//h2")).getText();
		
		if(expectedheadernmessage.equalsIgnoreCase(headernmessage))
	      	System.out.println("The expected heading is same as actual heading --- "+ headernmessage);
		else
	      	System.out.println("The expected heading doesn't match the actual heading --- "+ headernmessage);
	}
	
	public void Validate_orderconfirmationmsg() {
		
		String expectedconfirmationmessage = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String orderconfirmationmessage = driver.findElement(By.xpath("//div[@class='complete-text']")).getText();
		
		if(expectedconfirmationmessage.equalsIgnoreCase(expectedconfirmationmessage))
	      	System.out.println("The order confirmation message is same as actual message --- "+ orderconfirmationmessage);
		else
	      	System.out.println("The order confirmation message doesn't match the actual message  --- "+ orderconfirmationmessage);
	}
}
