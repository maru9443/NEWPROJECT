package com.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScenarioOutlinePage {

	WebDriver driver;
	
	public ScenarioOutlinePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUserName(String username)
	{
		driver.findElement(By.id("input-email")).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(By.id("input-password")).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public List<String> getFootersList()
	{
	

		 List<String> expectedFooters=new ArrayList<>();
		   List<WebElement> expectedFootersList=driver.findElements(By.xpath("//div[@class='row']//div[@class='col-sm-3']/ul/li"));
		   
		   for(WebElement dataList:expectedFootersList )
		   {
			   String namesList=dataList.getText();
			   System.out.println(namesList);
			   expectedFooters.add(namesList);
			   
		   }
		   System.out.println("Expected footers count is: "+expectedFootersList.size());
		   return expectedFooters;	
	}
	
	
	public String getEmailHeader()
	{
		return driver.findElement(By.id("input-email")).getAttribute("placeholder");
	}
	
	public String getPasswordHeader()
	{
		return driver.findElement(By.id("input-password")).getAttribute("placeholder");
	}
	
	
	
}
