package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;

import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DataTableSteps {
	
	
	
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	    
		DriverFactory.getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}

	@When("user enters the personal details")
	public void user_enters_the_personal_details(io.cucumber.datatable.DataTable dataTable) {
		
		List<List<String>>userList=dataTable.cells();
		
		DriverFactory.getDriver().findElement(By.id("input-firstname")).sendKeys(userList.get(0).get(0));
		DriverFactory.getDriver().findElement(By.id("input-lastname")).sendKeys(userList.get(0).get(1));
		DriverFactory.getDriver().findElement(By.id("input-email")).sendKeys(userList.get(0).get(2));
		DriverFactory.getDriver().findElement(By.id("input-telephone")).sendKeys(userList.get(0).get(3));
		DriverFactory.getDriver().findElement(By.id("input-password")).sendKeys(userList.get(0).get(4));
		DriverFactory.getDriver().findElement(By.id("input-confirm")).sendKeys(userList.get(0).get(5));
	    
	}
	
	@When("User selects and accepts privacy policy")
	public void user_selects_and_accepts_privacy_policy() {
	    
		DriverFactory.getDriver().findElement(By.xpath("//input[@type='checkbox']")).click();
	}

	@When("User clicks on the continue button")
	public void user_clicks_on_the_continue_button() {
		
		DriverFactory.getDriver().findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	@Then("sucessful message displays as {string}")
	public void sucessful_message_displays_as(String string) {
		
		String sucessText=DriverFactory.getDriver().findElement(By.xpath("//h1[text()='Your Account Has Been Created!']")).getText();
	    Assert.assertEquals(sucessText,string);
	}
	
	





}
