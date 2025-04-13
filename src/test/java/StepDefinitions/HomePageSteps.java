package StepDefinitions;

import com.qa.factory.DriverFactory;
import com.qa.pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import org.junit.Assert;

public class HomePageSteps {
	
	HomePage homePage=new HomePage(DriverFactory.getDriver());
	String title;
	Integer count1;
	List<String> expectedHeadersList;
	
	
	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
		
		DriverFactory.getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	    
	}

	@When("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
		
		 title=homePage.getTitle();
	    
	}

	@Then("title of the page should be {string}")
	public void title_of_the_page_should_be(String string) {
		
		Assert.assertEquals(title, string);
	    
	}
	
	
	@Given("User is on the home page")
	public void user_is_on_the_home_page_for_count() {
		DriverFactory.getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	     
	}

	@When("User gets the count of the header bar")
	public void user_gets_the_count_of_the_header_bar() {
	    
		 int count=homePage.getHeaderCount();
		  count1=Integer.valueOf(count);
	}

	@Then("Header count must be {int}")
	public void header_count_must_be(Integer int1) {
	    
		Assert.assertEquals(count1,int1);
	}

	
	@When("User gets the elements texts of headers")
	public void user_gets_the_elements_texts_of_headers() {
		 expectedHeadersList=homePage.getExpectedTextHeaders();
	}

	@Then("texts of the headers should be")
	public void texts_of_the_headers_should_be(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> actualHeadersList=dataTable.asList();
		Assert.assertEquals(expectedHeadersList,actualHeadersList);
		
	}






}
