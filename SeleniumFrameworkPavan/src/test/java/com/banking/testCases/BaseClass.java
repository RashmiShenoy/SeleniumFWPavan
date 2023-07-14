package com.banking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL = "https://demo.guru99.com/V1/index.php";
	public String username = "mngr515024";
	public String password = "EdArAhy";
	public String homeTitle = "GTPL Bank Manager HomePage";
	
	public static WebDriver driver;
	
	public static Logger logger;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	} 
	
}
