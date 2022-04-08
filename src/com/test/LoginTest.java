package com.test;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.base.BaseClass;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.RegistrationPages.RegistrationPage;
import com.pages.RegistrationPages.RegistrationSuccess;

public class LoginTest extends BaseClass {

	@Test
	public void login_of_user() {
		
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		//RegistrationPage reg = PageFactory.initElements(driver, RegistrationPage.class);
		//RegistrationSuccess regSuccess = PageFactory.initElements(driver, RegistrationSuccess.class);
		
		Map<String, String> userDetails = new HashMap<String, String>();
		
		userDetails.put("UserName", "standard_user");
		userDetails.put("Password", "secret_sauce");
		login.login_user(userDetails);
		
		Assert.assertEquals(driver.getTitle(),"Swag Labs");
		
		 //Assert.assertTrue(regSuccess.successMessage.isDisplayed());
		//Assert.assertTrue(false);
		//
	}

}
