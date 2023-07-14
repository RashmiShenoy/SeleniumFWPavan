package com.auto.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.auto.pages.BaseClass;
import com.auto.pages.LoginPage;

public class LoginTestCRM extends BaseClass {

	@Test
	public void loginApp() {

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		loginPage.logintoCRM("Selenium_50", "Abcd@123456");

	}

	

}
