package com.banking.testCases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.banking.pageObjects.AddCustomerPage;
import com.banking.pageObjects.LoginPage;

import net.bytebuddy.utility.RandomString;

public class TC_AddCustomerTest_003 extends BaseClass
{
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided");
		lp.setPassword(password);
		logger.info("Password is provided");
		lp.clickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		addcust.clickAddNewCustomer();
		logger.info("Providing customer details....");
		
		addcust.custName("Rash");
		addcust.custgender("female");
		addcust.custdob("10", "10", "2020");
		
		Thread.sleep(3000);
		
		addcust.custAddress("INDIA");
		addcust.custcity("BLR");
		addcust.custState("KAR");
		addcust.custpinno("560001");
		addcust.custtelephoneno("987890091");
		
		String email = randomstring()+"@gmail.com";
		addcust.custemailid(email);
		
		//addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation started....");
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("Testcase is passed");
		}
		else
		{
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
			logger.info("Testcase is failed");
		}
		
	}
	
	public String randomstring() {
		//To generate email
		String generatedstring = RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomNum() {
		String generatedNum = RandomStringUtils.randomNumeric(4);
		return(generatedNum);
	}
	
}
