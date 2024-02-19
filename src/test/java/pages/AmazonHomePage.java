package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class AmazonHomePage {

	public AmazonHomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	public WebElement amazonSearchBox;
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	public WebElement searchBtn;
	
	@FindBy(xpath="//span[text()=\"coffe mug\"]")
	public WebElement coffeMugSearch;
	
	@FindBy(xpath="//span[text()=\"pretty coffee mug\"]")
	public WebElement prettyCoffeMugSearch;
	
	@FindBy(xpath="//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[3]")
	public WebElement coolCoffeMugSearch;
	
	@FindBy(xpath="//span[text()=\"cute coffe mug\"]")
	public WebElement cuteCoffeMugSearch;
}
