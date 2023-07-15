package com.banking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void loginTest() {
				
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered Username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		if (driver.getTitle().equals(homeTitle)) 
		{
		Assert.assertTrue(true);
		logger.info("Login test failed");
		}
		else 
		{
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
