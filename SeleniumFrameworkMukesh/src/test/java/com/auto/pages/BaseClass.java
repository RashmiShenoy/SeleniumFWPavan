package com.auto.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.auto.utilities.BrowserFactory;

public class BaseClass {
	public WebDriver driver;

	@BeforeClass
	public void setup() {
		BrowserFactory.startApplication(driver, "Chrome", "https://ui.cogmento.com/");
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
}
