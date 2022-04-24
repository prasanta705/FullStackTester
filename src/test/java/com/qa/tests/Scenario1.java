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
import org.openqa.selenium.support.PageFactory;

public class Scenario1 extends BaseTest {
	
	LoginPage loginPage;
	ProductsPage productsPage;
	YourCartPage yourcartPage;
	ChkOutInfoPage chkoutInfoPage;
	OverviewPage overviewPage;
	ConfirmationPage confirmationpage;
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
		
	}

	
	@Test
	public void Scenario1_Test() {
		
		loginPage.enterUserName(loginUsers.getJSONObject("User").getString("username"));
		loginPage.enterPassword(loginUsers.getJSONObject("User").getString("password"));
		loginPage.pressLoginBtn();

		String actualProductTitle = productsPage.getTitle();
		String expectedProductTitle = "PRODUCTS";

		Assert.assertEquals(actualProductTitle, expectedProductTitle);
		
		productsPage.clickAddToCart();
		
		productsPage.clickCart();
		
		yourcartPage.clickCheckOut();
		
		Map<String, String> customerDetails = new HashMap<String, String>();
		
		customerDetails.put("Firstname", "abc");
		customerDetails.put("Lastname", "def");
		customerDetails.put("Postalcode", "400087");
		
		chkoutInfoPage.Checkout(customerDetails);

		overviewPage.scrollToFinishButton();
		
		overviewPage.clickFinish();
		
		String actualConfirmationText = confirmationpage.confirmationMsg.getText();
		String expectedConfirmationText = "THANK YOU FOR YOU ORDER";

		Assert.assertEquals(actualConfirmationText, expectedConfirmationText);
	
	}

	@AfterClass
	public void afterClass() throws IOException {
		details.close();
	}

	@AfterMethod
	public void afterMethod() {
		
	}
}
