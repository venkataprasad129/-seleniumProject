package crossBrowserparallelExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.beust.jcommander.Parameter;

public class BaseClass 
{
	protected WebDriver driver ;
	
	@BeforeClass
	public void classSetup(String browser)
	{
		switch (browser)
		{
		case "chrome":
			driver = new ChromeDriver();
		case "firefox":
			driver = new FirefoxDriver();
		case "edge":
			driver = new EdgeDriver();
			break;
			default:
			System.out.println("invalid browser info");
		}
		driver.manage().window().maximize();
	}
	@AfterClass
	public void classTearDown()
	{
		driver.quit();
	}

}
