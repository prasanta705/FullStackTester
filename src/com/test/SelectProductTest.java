package com.test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.SelectProductPage;
import com.pages.RegistrationPages.RegistrationPage;
import com.pages.RegistrationPages.RegistrationSuccess;

public class SelectProductTest extends BaseClass {

	@Test
	public void select_product() {
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		SelectProductPage selectproduct = PageFactory.initElements(driver, SelectProductPage.class);
		
		Map<String, String> userDetails = new HashMap<String, String>();
		
		userDetails.put("UserName", "standard_user");
		userDetails.put("Password", "secret_sauce");
		login.login_user(userDetails);
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		selectproduct.select_Backpack();
		
		selectproduct.click_Cart();
		
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		 //Assert.assertTrue(regSuccess.successMessage.isDisplayed());
		//Assert.assertTrue(false);
		//
	}

}
