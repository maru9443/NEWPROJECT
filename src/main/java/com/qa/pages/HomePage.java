package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	
	public int getHeaderCount()
	{
		int count=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li")).size();
		return count;
	}
	
	
	public List<String> getExpectedTextHeaders()
	{
		
		 List<String> expectedTextHeaders=new ArrayList<>();
		   List<WebElement> expectedHeadersList=driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));
		   
		   for(WebElement dataList:expectedHeadersList )
		   {
			   String namesList=dataList.getText();
			   System.out.println(namesList);
			   expectedTextHeaders.add(namesList);
			   
		   }
		   return expectedTextHeaders;	
	}
	
}
