package StepDefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.ScenarioOutlinePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

public class ScenarioOutlineSteps {
	
	ScenarioOutlinePage scPage=new ScenarioOutlinePage(DriverFactory.getDriver());
	List<String> expectedFootersList;
	String email;
	String password;

	@Given("user in the login page")
	public void user_in_the_login_page() {
		
		DriverFactory.getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println("user is on the loginpage is sucess");
	    
	}

	@When("user enters the username as {string} and password as {string}")
	public void user_enters_the_username_as_and_password_as(String string, String string2) {
		scPage.enterUserName(string);
		scPage.enterPassword(string2);
		
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("user clicked on the button");
		scPage.clickLoginButton();
	}

	@Then("login page title should be {string}")
	public void login_page_title_should_be(String string) {
		String title=scPage.getTitle();
		Assert.assertEquals(title, string);
	}
	
	@When("User gets the login page footers list")
	public void user_gets_the_login_page_footers_list() {
		 expectedFootersList=scPage.getFootersList();
	}

	@Then("Footers list should contain {string}")
	public void footers_list_should_contain(String string) {
	   System.out.println(expectedFootersList.contains(string));
	}
	
	

@When("User gets the Email Address and Password fileds placeholders")
public void user_gets_the_email_address_and_password_fileds_placeholders() {
	 email=scPage.getEmailHeader();
	 password=scPage.getPasswordHeader();
}

@Then("Email address and Password placeholder values should be {string} and {string}")
public void email_address_and_password_placeholder_values_should_be_and(String string, String string2) {
    Assert.assertEquals(email, string);
    Assert.assertEquals(password, string2);
}

	
	
	
	
	
	
	
	
	



	
	
	
	
	
	

}


