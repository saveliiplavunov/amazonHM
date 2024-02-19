package step_defenitions;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AmazonHomePage;
import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;

public class AmazonSearchTest {

	AmazonHomePage amazon = new AmazonHomePage();
	
	BrowserUtils utils = new BrowserUtils();
	
	@Given("the user is on the amazon home page")
	public void the_user_is_on_the_amazon_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   Driver.getDriver().get(DataReader.getProperty("amazon_url"));
	   
	}

	@When("user entres coffee mug")
	public void user_entres_coffee_mug() {
	    // Write code here that turns the phrase above into concrete actions
	  utils.waitForElementToBeVisible(amazon.amazonSearchBox);
	  amazon.amazonSearchBox.sendKeys("coffe mug");
	}

	@When("user click search button")
	public void user_click_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   amazon.searchBtn.click();
	}

	@Then("user should view search results")
	public void user_should_view_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	Assert.assertTrue(amazon.coffeMugSearch.isDisplayed());
	}

	@When("user entres pretty coffe mug")
	public void user_entres_pretty_coffe_mug() {
	    // Write code here that turns the phrase above into concrete actions
	   utils.waitForElementToBeVisible(amazon.amazonSearchBox);
	   amazon.amazonSearchBox.sendKeys("pretty cofee mug");
	}
	@Then("user should view search results as a pretty cofee mug")
	public void user_should_view_search_results_as_a_pretty_cofee_mug() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(amazon.prettyCoffeMugSearch.isDisplayed());
	}

	@When("user entres cool coffe mug")
	public void user_entres_cool_coffe_mug() {
	    // Write code here that turns the phrase above into concrete actions
		utils.waitForElementToBeVisible(amazon.amazonSearchBox);
		amazon.amazonSearchBox.sendKeys("cool coffee mug");
	}
	@Then("user should view search results as a cool cofee mug")
	public void user_should_view_search_results_as_a_cool_cofee_mug() {
	    // Write code here that turns the phrase above into concrete actions
	   assertTrue(amazon.coolCoffeMugSearch.isDisplayed());
	}

	@When("user entres cute cofffe mug")
	public void user_entres_cute_cofffe_mug() {
	    // Write code here that turns the phrase above into concrete actions
	  utils.waitForElementToBeVisible(amazon.amazonSearchBox);
	  amazon.amazonSearchBox.sendKeys("cute coffe mug");
	  }
	  
	  @Then("user should view search results as a cute coffe mug")
	  public void user_should_view_search_results_as_a_cute_coffe_mug() {
	      // Write code here that turns the phrase above into concrete actions
	      Assert.assertTrue(amazon.cuteCoffeMugSearch.isDisplayed());
	  
	}
}
