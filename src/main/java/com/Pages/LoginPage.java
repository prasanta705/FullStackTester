package com.Pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BaseTest {

	@AndroidFindBy(accessibility = "test-Username")
	public MobileElement usernameTxtFld;

	@AndroidFindBy(accessibility = "test-Password")
	public MobileElement passwordTxtFld;

	@AndroidFindBy(accessibility = "test-LOGIN")
	public MobileElement loginBtn;

	public void enterUserName(String username) {
		clear(usernameTxtFld);
		sendKeys(usernameTxtFld, username);
	}

	public void enterPassword(String password) {
		clear(passwordTxtFld);
		sendKeys(passwordTxtFld, password);
	}

	public void pressLoginBtn() {
		click(loginBtn );
	}
	
}
