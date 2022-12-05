package Library_file.Angel1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	
	public void Intialized()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Roshan\\eclipse-workspace\\MAHESH_JAVA_SELENIUM_MAVEN_TestNG\\Angel1\\Browser\\chromedriver.exe");
	
	  driver=new ChromeDriver();
	 
	 
	  driver.get("https://www.tradingview.com");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  driver.manage().window().maximize();
	  
	  
	}
	
	
	
}
