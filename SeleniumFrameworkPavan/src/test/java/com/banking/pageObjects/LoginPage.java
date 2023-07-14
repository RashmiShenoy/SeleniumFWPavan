package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		rdriver.manage().window().maximize();
	}
	
	@FindBy(name = "uid") WebElement username;
	@FindBy(name = "password") WebElement password;
	@FindBy(name = "btnLogin") WebElement btnLogin;
	
	public void setUserName(String uname) {
		username.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickSubmit() {
		btnLogin.click();
	}
}

