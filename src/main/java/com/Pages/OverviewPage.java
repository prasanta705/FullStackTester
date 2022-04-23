package com.Pages;

import com.qa.BaseTest;
import com.qa.utils.TestUtils;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OverviewPage extends BaseTest{
	TestUtils utils = new TestUtils();
	
	
	@AndroidFindBy (xpath = "//android.view.ViewGroup[@content-desc=\"test-FINISH\"]")
	public MobileElement finish;
	

	public void clickFinish() {
		click(finish);
	}
	
	public void scrollToFinishButton() {
		 scrollToElement();
	}
	


}
