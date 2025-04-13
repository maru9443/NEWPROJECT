package com.qa.factory;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();

	public WebDriver initBrowser(String browser)
	{
		System.out.println("Initializing the browser");
		
		if(browser.equals("chrome"))
		{
			driver=WebDriverManager.chromedriver().create();
			tlDriver.set(driver);
			
		}
		
		else if(browser.equals("firefox"))
		{
			driver=WebDriverManager.firefoxdriver().create();
			tlDriver.set(driver);
			
		}
		
		
		else if(browser.equals("edge"))
		{
			driver=WebDriverManager.edgedriver().create();
			tlDriver.set(driver);
			
		}
		
		else
		{
			System.out.println("please pass the right browser value: "+browser);
		}
		
		if(browser.equals("safari"))
		{
			driver=WebDriverManager.safaridriver().create();
			tlDriver.set(driver);
			
		}
		
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();
		return getDriver();
		
	
	}	
		
		public static WebDriver getDriver()
		{
			return tlDriver.get();
		}

}
