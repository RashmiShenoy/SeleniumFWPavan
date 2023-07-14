package com.auto.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
	}
	
	//@FindBy(xpath = "//div[@class='rd-navbar-inner']") WebElement login;
	@FindBy(name="email") WebElement email;
	@FindBy(name="password") WebElement pass;
	@FindBy(xpath = "//div[@class='ui fluid large blue submit button']") WebElement loginbtn;
	
	public void logintoCRM(String username, String password) {
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		
		email.sendKeys(username);
		pass.sendKeys(password);
		loginbtn.click();
	}
}
