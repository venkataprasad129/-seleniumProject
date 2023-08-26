package Chapter_03;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium_practice.actions_1;

public class WebDriver_Utility
{
	private WebDriver driver;
	
	
	public WebDriver launchBrowser(String browser)
	{
		switch(browser) 
		{
		case"chrome":
			
			driver= new ChromeDriver();
			break;
		case"firefox":
			driver= new FirefoxDriver();
			break;
		case"Edge":
			driver= new EdgeDriver();
			break;
			default:
				System.out.println("invalid browser info");
			
		}
		return driver;
	}
	public void maximizeBrowser() 
	{
		driver.manage().window().maximize();
	}
	
	
	public WebElement explicitlyWait(long time,WebElement element) 
	{
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.visibilityOf(element));
	}
	public boolean explicitlyWait(String title ,long time) 
	{

 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(time));
		return wait.until(ExpectedConditions.titleContains(title));

}
	public void mouseHover(WebElement element) 
	{
		Actions action =new Actions(driver);
		action.moveToElement(element).perform();
	}
	public void rightClick(WebElement element) 
	{
		Actions action =new Actions(driver);
		action.contextClick(element).perform();
	}
	public void doubleClickOnElement(WebElement element) 
	{
		Actions action =new Actions(driver);
		action.doubleClick(element).perform();
	}
	public void dragAndDrop(WebElement element ,WebElement target) 
	{
		Actions action =new Actions(driver);
		action.dragAndDrop(element, target).perform();
}
	public void selectFromDropdown(WebElement element,int index)
	{
		Select select= new Select(element);
		select.selectByIndex(index);
	}
	public void selectFromDropdown(WebElement element,String value)
	{
		Select select= new Select(element);
		select.selectByValue(value);
	}
	public void selectFromDropdown(String visibleText ,WebElement element)
	{
		Select select= new Select(element);
		select.selectByVisibleText(visibleText);
	}
	public void switchToFrame(int index) 
	{
		driver.switchTo().frame(index);
	}
	public void switchToFrame(String idOrName) 
	{
		driver.switchTo().frame(idOrName);
	}
	public void switchToFrame() 
	{
		driver.switchTo().defaultContent();
	}
	
	public String takeScreenshot (String ClassName, java_utility jutil)
	{
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screendhot/"+ClassName+"_"+jutil.getCurrentTime()+".png");
		try
		{
			FileUtils.copyFile(src, dest);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return dest.getAbsolutePath();
	}
	public String takeScreenshot()
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		return ts.getScreenshotAs(OutputType.BASE64);
	}
	public void scrollToElement(WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public void handleAlert(String status)
	{
		Alert alert= driver.switchTo().alert();
		if(status.equalsIgnoreCase("ok"))
			alert.accept();
		else
			alert.dismiss();
	}
	public void switchToChildWindow()
	{
		Set<String>set=driver.getWindowHandles();
		for(String window:set)
		{
			driver.switchTo().window(window);
		}
	}
	public void switchToWindow(String windowID)
	{
		driver.switchTo().window(windowID);
	}
	public String getParentwindowID()
	{
		return driver.getWindowHandle();
	}
	public void closeCurrentWindow()
	{
		driver.close();
	}
	public void quitAllTheWindows()
	{
		driver.quit();
	}
}
