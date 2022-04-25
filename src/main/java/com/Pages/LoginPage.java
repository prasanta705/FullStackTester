package com.Pages;

import com.qa.BaseTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage {

	@AndroidFindBy(accessibility = "test-Username")
	public MobileElement usernameTxtFld;

	@AndroidFindBy(accessibility = "test-Password")
	public MobileElement passwordTxtFld;

	@AndroidFindBy(accessibility = "test-LOGIN")
	public MobileElement loginBtn;

	public void enterUserName(String username) {
		usernameTxtFld.clear();
		usernameTxtFld.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordTxtFld.clear();
		passwordTxtFld.sendKeys(password);
	}

	public void pressLoginBtn() {
		loginBtn.click();;
	}
	
}
