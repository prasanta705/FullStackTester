package com.Pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class YourCartPage extends BaseTest{
	TestUtils utils = new TestUtils();
	
	@AndroidFindBy(accessibility = "test-CHECKOUT")
	public MobileElement checkOut;
	

public void clickCheckOut() {
	click(checkOut);
}


}
