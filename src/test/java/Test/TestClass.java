package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Library_file.Angel1.BaseClass;
import Module_Page.Pom1;

public class TestClass extends BaseClass 
{

	
	
	Pom1 p1;
	@BeforeClass
	public void OpenBrowser()
	{
		Intialized();
		
		p1=new Pom1(driver);
		
	}
	@BeforeMethod
	public void Login()
	{
		
	}
	@Test
	public void TC1() throws InterruptedException
	{
		p1.ScrollDown(driver);
		Thread.sleep(2000);
		p1.Search();
		Thread.sleep(2000);
		p1.EnterSearch("adanipower");
		Thread.sleep(2000);
		p1.ClickStocks();
		p1.Closed();
	}
	@AfterMethod
	public void Logout()
	{
		
	}
	@AfterClass()
	public void Closed()
	{
		
	}
}
