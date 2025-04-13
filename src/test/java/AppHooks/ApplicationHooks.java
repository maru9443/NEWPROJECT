package AppHooks;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	 public Properties prop;
	 WebDriver driver;
	
	@Before(order=0)
	public void getProperty() throws IOException
	{
		ConfigReader config=new ConfigReader();
		prop=config.initProp();
	}
	
	@Before(order=1)
	public void launchBrowser()
	{
		String browserName=prop.getProperty("browser");
		DriverFactory factory=new DriverFactory();
		driver=factory.initBrowser(browserName);
		
		
	}
	
	
	@After(order=0)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@After(order=1)
	public void tearDown(Scenario scenario) throws IOException
	{
		if(scenario.isFailed())
		{
		String screenshotName=scenario.getName().replaceAll(" ", "_");
		
		File sourcePath1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcePath1, new File("C:\\KKK\\"+screenshotName+".png"));
		
		
		byte[] sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(sourcePath, "img/png",screenshotName);
		}	
		
	}
}
