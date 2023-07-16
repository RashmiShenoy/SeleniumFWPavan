package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@CacheLookup 
	@FindBy(how = How.XPATH, using = "//a[normalize-space()='New Customer']")
	WebElement btnAddNewCustomer;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "name")
	WebElement txtCustomerName;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "rad1")
	WebElement rdGender;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "dob")
	WebElement txtDob;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "addr")
	WebElement txtAddress;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "city")
	WebElement txtCity;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "state")
	WebElement txtState;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "pinno")
	WebElement txtPin;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "telephoneno")
	WebElement txtTelephone;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "emailid")
	WebElement txtEmail;
	
	@CacheLookup
	@FindBy(how = How.NAME, using = "password")
	WebElement txtpassword;
	
	@CacheLookup 
	@FindBy(how = How.NAME, using = "sub")
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		btnAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender) {
		rdGender.click();
	}
	
	public void custdob(String mm, String dd, String yy) {
		txtDob.sendKeys(mm);
		txtDob.sendKeys(dd);
		txtDob.sendKeys(yy);
	}
	
	public void custAddress(String caddress) {
		txtAddress.sendKeys(caddress);
	}
	
	public void custcity(String ccity) {
		txtCity.sendKeys(ccity);
	}
	
	public void custState(String cstate) {
		txtState.sendKeys(cstate);
	}
	
	public void custpinno(String cpinno) {
		txtPin.sendKeys(String.valueOf(cpinno));
	}
	
	public void custtelephoneno(String ctelno) {
		txtTelephone.sendKeys(ctelno);
	}
	
	public void custemailid(String cemail) {
		txtEmail.sendKeys(cemail);
	}
	
	public void custpassword(String cpassword) {
		txtpassword.sendKeys(cpassword);
	}
	
	public void custsubmit() {
		btnSubmit.click();
	}

}
