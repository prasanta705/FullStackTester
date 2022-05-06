package com.Pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ConfirmationPage extends BaseTest{
	TestUtils utils = new TestUtils();
	
	
	@AndroidFindBy (xpath = "//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]")
	public MobileElement confirmationMsg;
	

}
