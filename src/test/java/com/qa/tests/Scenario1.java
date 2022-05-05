package com.qa.tests;

import com.Pages.ChkOutInfoPage;
import com.Pages.ConfirmationPage;
import com.Pages.LoginPage;
import com.Pages.OverviewPage;
import com.Pages.ProductsPage;
import com.Pages.YourCartPage;
import com.qa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Scenario1 extends BaseTest {
	
	LoginPage loginPage;
	InputStream details;
	JSONObject loginUsers;

	@BeforeClass
	public void beforeClass() throws Exception {
		
		details = new FileInputStream("C:\\Users\\PrasantaMukherjee\\git\\AppiumProject\\src\\test\\resources\\Data\\data.json");
		JSONTokener jsonToken = new JSONTokener(details);
		loginUsers = new JSONObject(jsonToken);
		closeApp();
		launchApp();
	}

	@BeforeMethod
	public void beforeMethod(Method m) {
		System.out.println("\n" + "****** starting test:" + m.getName() + "******" + "\n");

		loginPage = new LoginPage();

	}

	
	@Test
	public void Scenario1_Test() {
		
		loginPage.enterUserName(loginUsers.getJSONObject("User").getString("username"));
		loginPage.enterPassword(loginUsers.getJSONObject("User").getString("password"));
		loginPage.pressLoginBtn();

	
	}


	@AfterClass
	public void afterClass() throws IOException {
		details.close();
	}

	@AfterMethod
	public void afterMethod() {
		
	}
}
