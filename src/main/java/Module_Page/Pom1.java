package Module_Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 
{

	
	@FindBy(xpath="//button[@id='educational_editors_picks']") private WebElement Educational;
	@FindBy(xpath="//button[contains(@class,'tv-header-search-container ')]") private WebElement Search;
	@FindBy(xpath="//input[@class='input-S8y5mpjr']") private WebElement EnterSearch;
    
    @FindBy(xpath="(//div[@class='itemInfoCell-DPHbT8fH cell-DPHbT8fH'])[1]") private WebElement Share;
    @FindBy(xpath="//div[@class='tv-dialog__close close-nS7I_pxJ dialog-close-nS7I_pxJ js-dialog__close']")private WebElement Closed; 
	public Pom1(WebDriver driver)
	{
		//PageFactory.initElements(driver, this);
	}
	
	public void ScrollDown(WebDriver driver) 
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",Educational);
	}
	
	public void Search()
	{
		Search.click();
		
		
	}
	public void EnterSearch(String Value)
	{
		EnterSearch.sendKeys(Value);
	}
	
	public void ClickStocks()
	{
		Share.click();
		
		
	}
	
	public void Closed()
	{
		Closed.click();
	}
	
}
