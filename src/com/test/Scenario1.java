package com.test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.ChkOutOverviewPage;
import com.pages.ChkOutYourInfoPage;
import com.pages.CompletePage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SelectProductPage;
import com.pages.YourCartPage;
import com.pages.RegistrationPages.RegistrationPage;
import com.pages.RegistrationPages.RegistrationSuccess;

public class Scenario1 extends BaseClass {

	@Test
	public void select_product() {
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		SelectProductPage selectproduct = PageFactory.initElements(driver, SelectProductPage.class);
		YourCartPage yourcart = PageFactory.initElements(driver, YourCartPage.class);
		ChkOutYourInfoPage yourinfo = PageFactory.initElements(driver, ChkOutYourInfoPage.class);
		ChkOutOverviewPage overview = PageFactory.initElements(driver, ChkOutOverviewPage.class);
		CompletePage confirmation = PageFactory.initElements(driver, CompletePage.class);
		
		Map<String, String> userDetails = new HashMap<String, String>();
		
		userDetails.put("UserName", "standard_user");
		userDetails.put("Password", "secret_sauce");
		login.login_user(userDetails);
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		selectproduct.select_Backpack();
		
		selectproduct.select_Tshirt();
		
		selectproduct.click_Cart();
		
		yourcart.click_Checkout();
		
		Map<String, String> customerDetails = new HashMap<String, String>();
		
		customerDetails.put("Firstname", "abc");
		customerDetails.put("Lastname", "def");
		customerDetails.put("Postalcode", "400087");
		
		yourinfo.Checkoutinfo(customerDetails);
		
		overview.clickOnFinish();
		
		confirmation.Validate_headermsg();
		
		confirmation.Validate_orderconfirmationmsg();
		
		 //Assert.assertTrue(regSuccess.successMessage.isDisplayed());
		//Assert.assertTrue(false);
		//
	}

}
