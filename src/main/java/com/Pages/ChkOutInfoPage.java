package com.Pages;

import java.util.Map;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChkOutInfoPage extends BaseTest{
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy (xpath = "//android.widget.EditText[@content-desc=\"test-First Name\"]")
	public MobileElement firstName;
	
	@AndroidFindBy (xpath = "//android.widget.EditText[@content-desc=\"test-Last Name\"]")
	public MobileElement lasttName;
	
	@AndroidFindBy (xpath = "//android.widget.EditText[@content-desc=\"test-Zip/Postal Code\"]")
	public MobileElement zipCode;
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-CONTINUE\"]")
	public MobileElement continueButton;
	
	public void Checkout(Map<String,String> customerDetails) {
		
		clear(firstName);
		sendKeys(firstName, customerDetails.get("Firstname"));
		
		clear(lasttName);
		sendKeys(lasttName, customerDetails.get("Lastname"));
		
		clear(zipCode);
		sendKeys(zipCode, customerDetails.get("Postalcode"));
			
		click(continueButton);
		
		}

}
